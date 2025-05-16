import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ApiRequisicao {
    private String Moeda;
    private int opcaoEscolhida;
    private String opcaoConvertida;


    public void setOpcaoConvertida(String opcaoConvertida) {
        this.opcaoConvertida = opcaoConvertida;
    }

    public int getOpcaoEscolhida() {
        return opcaoEscolhida;
    }

    public void setOpcaoEscolhida(int opcaoEscolhida) {
        this.opcaoEscolhida = opcaoEscolhida;
    }

    public String getOpcaoConvertida() {
        return opcaoConvertida;
    }

    Scanner scanner = new Scanner (System.in);

    void requistar() throws IOException, InterruptedException {

        System.out.println();
        setOpcaoEscolhida (scanner.nextInt());

        switch (getOpcaoEscolhida()) {

            case 1: setOpcaoConvertida("USD");
                break;
            case 2: setOpcaoConvertida("ARS");
                break;
            case 3: setOpcaoConvertida("USD");
                break;
            case 4: setOpcaoConvertida("BRL");
                break;
            case 5: setOpcaoConvertida("USD");
                break;
            case 6: setOpcaoConvertida("COP");
                break;
        }
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/7e2b881ed244ebef049d4523/latest/"+ getOpcaoConvertida()))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }

    ;


}
