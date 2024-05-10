![Template rluipdev](https://github.com/rluispdev/ProjectCurrencyConverter/blob/main/Template/rluispdev.png)
# Conversor de Moedas

Este projeto implementa um conversor de moedas que utiliza a API ExchangeRate-API para obter taxas de conversão atualizadas e realizar cálculos de conversão entre diferentes moedas.


## 🔨 Etapas do Projeto

 

``Configuração Inicial``
- Cadastro na API ExchangeRate-API e obtenção da chave de API.
- Criação do arquivo .gitignore para proteger a chave de API.
- Importação da biblioteca Gson para trabalhar com JSON.

``Desenvolvimento das Classes``
- ExchangeRatesApiClient: Responsável por interagir com a API e obter dados em formato JSON.
- ExchangeRates: Gerencia as taxas de conversão obtidas da API.
- Converter: Simplifica a conversão entre duas moedas.
- HandleConversion (Switch): Implementa um menu interativo para o usuário 
escolher a moeda de conversão.
- Main: Contém o loop principal do programa e a lógica de interação com o usuário.

``Implementação da Lógica:``

- Criação de um menu interativo para o usuário escolher as moedas de origem e destino.
- Obtenção da taxa de conversão utilizando as classes ExchangeRates e ExchangeRatesApiClient.
- Cálculo do valor convertido e apresentação do resultado ao usuário.
- Implementação de tratamento de erros básico.



## ✔️ Técnicas e Tecnologias Utilizadas

 - Linguagem de Programação: Java
 - API: ExchangeRate-API
 - Biblioteca: Gson
 - IDE: IntelliJ IDEA (ou outra IDE de sua preferência)
 - Controle de Versão: Git
## 💻 Como Executar o Projeto

- ``1``: Clone o repositório.
- ``2``: Configure o ambiente Java e a IDE.
- ``3``: Importe o projeto na IDE.
- ``4``: Obtenha uma chave de API da ExchangeRate-API e configure-a no código.
- ``5``: Execute a classe Main.

## 📈 Melhorias Futuras

- Implementar uma interface gráfica de usuário (GUI) para facilitar a interação.
- Adicionar tratamento de erros mais robusto.
- Implementar armazenamento em cache para taxas de conversão.
- Permitir a conversão para múltiplas moedas simultaneamente.
- Implementar um histórico de conversões.

## 📝 Licença

- Este projeto está sob a licença [MIT](https://github.com/rluispdev/ProjectCurrencyConverter/blob/main/READMELicence.md).
