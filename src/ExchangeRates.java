import org.json.JSONException;

import java.io.IOException;
import java.util.Map;

public class ExchangeRates {
    private Map<String, Double> conversionRates;

    public void getCoin(String newCoin) throws IOException, InterruptedException, JSONException {
        ExchangeRatesApiClient client = new ExchangeRatesApiClient(newCoin);
        // Atribuição direta do Map
        this.conversionRates = client.getRates();
    }
    public Double getConvertionRates(String currencyCode) {
        if (conversionRates != null && conversionRates.containsKey(currencyCode)) {
            return conversionRates.get(currencyCode);
        } else {
            return 0.0; // Ou outro valor padrão
        }
    }
}

