import org.json.JSONException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, JSONException {

        Scanner read = new Scanner(System.in);

        System.out.println(" Seja bem vindo ao conversor de Moedas:");
        String menu = """
            
                1) Dólar -> Para peso argentino
                2) Peso Argentino -> Para Dólar
                3) Dólar -> Para Real Brasileiro
                4) Real Brasileiro -> Para Dólar
                5) Dólar -> Para Peso Colombiano
                6) Peso Colombiano -> Para Dólar
                7) Sair

                Escolha uma opção válida:
                """;

        try {
            while (true) {
                HandleConversion handleConversion = new HandleConversion();
                System.out.println(menu);
                int option = read.nextInt();
                if (option == 7){
                    System.out.println("Programa finalizado com sucesso.");
                    break;
                }
                else if(option <= 6){
                    handleConversion.handleConversion(option);
                    System.out.println("-------------------------------------------------------");
                    System.out.println(" 1 - Voltar ao menu inicial.  2 - Fechar o programa.");
                    option = read.nextInt();

                    if (option == 1){
                        continue;
                    }  else if (option == 2 ) {
                        System.out.println("Obrigado por usar nossos serviços. Programa finalizado.");
                        break;
                    }

                } else {
                    var message = """
                    ________________________________
                    Opção inválida.
                    - Escolha um números de 1 ao 7.
                    
                    Retornando ao menu pricipal...
                    ________________________________
                    """;
                    System.out.println(message);
                    continue;
                }

            }

        } catch (Exception e){
            var message = """
           
           A entrada deve ser um número inteiro.
            _________________________________________________________________________________________
            Dicas:
            Voçê deve escolher apenas números inteiros.
            Você deve usar  .(ponto) , ao inves de , (virgula)  para separação dos centavos da moeda.
            Ex:
             Formatação correta -> 29.90
              _________________________________________________________________________________________
            
            Execute o programa e tente novamente!
            
            Programa finalizado.
            """;
            System.out.println(message);
        }
    }
}
