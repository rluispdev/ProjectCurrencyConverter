import org.json.JSONException;
import java.io.IOException;

public class HandleConversion {
    public void handleConversion(int option) throws JSONException, IOException, InterruptedException {
        switch (option) {
            case 1:
                var dollarArs = new Converter("USD", "ARS");
                System.out.println("Valor convertido: $ " + dollarArs + " ARS");
                break;

            case 2:
                var arsDollar = new Converter("ARS", "USD");
                System.out.println("Valor convertido: $ " + arsDollar + " USD" );
                break;

            case 3:
                var dollarReal = new Converter("USD", "BRL");
                System.out.println("Valor convertido: R$ " + dollarReal + " BRL" );
                break;

            case 4:

                var realDolar = new Converter("BRL", "USD");
                System.out.println("Valor convertido: $ " + realDolar + " USD");
                break;

            case 5:
                var dollarCop = new Converter("USD", "COP");
                System.out.println("Valor convertido: $ " + dollarCop + " COP");
                break;

            case 6:
                var copDollar = new Converter("COP", "USD");
                System.out.println("Valor convertido: $ " + copDollar + " USD");
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }
}
