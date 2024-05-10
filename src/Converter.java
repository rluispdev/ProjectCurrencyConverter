import org.json.JSONException;
import java.io.IOException;
import java.util.Scanner;

public class Converter {
    private Double arsToUsdRate;
    private String currencyCode;

    ExchangeRates exchangeRates = new ExchangeRates();

    public Converter(String newCoin, String currencyCode) throws JSONException, IOException, InterruptedException {
        exchangeRates.getCoin(newCoin);
        this.arsToUsdRate = exchangeRates.getConvertionRates(currencyCode);
    }
    @Override
    public String toString() {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o valor que deseja converter:");
        double value = read.nextDouble();
        System.out.println("Valor inserido para conversão: " + value);
        String formattedArsToUsdRate = String.format("%.2f", arsToUsdRate);
        System.out.println("Câmbio atual da moeda: " + formattedArsToUsdRate);
        double result = value * arsToUsdRate;
        String formattedResult = String.format("%.2f", result);
        return String.valueOf(formattedResult);
    }
}

