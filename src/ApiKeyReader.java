import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ApiKeyReader {
    private String apiKey;

    public ApiKeyReader() {
        this.apiKey = readApiKeyFromFile("api_key.txt");
    }
    private String readApiKeyFromFile(String filename) {
        StringBuilder apiKeyBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                apiKeyBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return apiKeyBuilder.toString();
    }
    public String getApiKey() {
        return apiKey;
    }
}
