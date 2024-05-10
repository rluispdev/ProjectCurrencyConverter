import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ExchangeRatesApiClient {
    private String apiKey;
    private String address;

    ApiKeyReader apiKeyReader = new ApiKeyReader();

    public ExchangeRatesApiClient(String coin){
        this.apiKey = apiKeyReader.getApiKey();
        this.address = "https://v6.exchangerate-api.com/v6/" + this.apiKey + "/latest/" + coin;

        if (!this.address.isEmpty()) {
            request = HttpRequest.newBuilder()
                    .uri(URI.create(this.address))
                    .build();
        }
    }
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request;

    public String getResponse() throws IOException, InterruptedException {
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        return json;
    }
    public Map<String, Double> getRates() throws IOException, InterruptedException, JSONException {
        String jsonResponse = getResponse();
        JSONObject jsonObject = new JSONObject(jsonResponse);
        JSONObject conversionRatesObject = jsonObject.getJSONObject("conversion_rates");

        Gson gson = new Gson();
        TypeToken<Map<String, Double>> mapType = new TypeToken<Map<String, Double>>() {};
        Map<String, Double> rates = gson.fromJson(conversionRatesObject.toString(), mapType.getType());
        return rates;
    }
}
