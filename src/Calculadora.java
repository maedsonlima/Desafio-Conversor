import com.google.gson.Gson;

public class Calculadora extends ApiRequisicao{

    void converter () {
        System.out.println("Digite o valor que deseja converter:");
        double valorOriginal = scanner.nextDouble();
        double valorConvertido;
        double valorFinal;

        switch (getOpcaoEscolhida()) {

            case 1:
                valorConvertido = resposta.getConversionRates().get("ARS");
                valorFinal = valorOriginal * valorConvertido;
                System.out.println("Valor " + valorOriginal + " Corresponde ao valor final de >> " + valorFinal);
                break;
            case 2:
                valorConvertido = resposta.getConversionRates().get("USD");
                valorFinal = valorOriginal * valorConvertido;
                System.out.println("Valor " + valorOriginal + " Corresponde ao valor final de >> " + valorFinal);
                break;
            case 3:
                valorConvertido = resposta.getConversionRates().get("BRL");
                valorFinal = valorOriginal * valorConvertido;
                System.out.println("Valor " + valorOriginal + " Corresponde ao valor final de >> " + valorFinal);
                break;
            case 4:
                valorConvertido = resposta.getConversionRates().get("USD");
                valorFinal = valorOriginal * valorConvertido;
                System.out.println("Valor " + valorOriginal + " Corresponde ao valor final de >> " + valorFinal);
                break;
            case 5:
                valorConvertido = resposta.getConversionRates().get("COP");
                valorFinal = valorOriginal * valorConvertido;
                System.out.println("Valor " + valorOriginal + " Corresponde ao valor final de >> " + valorFinal);
                break;
            case 6:
                valorConvertido = resposta.getConversionRates().get("USD");
                valorFinal = valorOriginal * valorConvertido;
                System.out.println("Valor " + valorOriginal + " Corresponde ao valor final de >> " + valorFinal);
                break;
        }
    };


}
