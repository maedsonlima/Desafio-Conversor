import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ApiRequisicao extends Moeda {

    protected RespostaApi resposta; //visível na classe Calculadora também
    Scanner scanner = new Scanner(System.in);

    void requistar() throws IOException, InterruptedException {

        System.out.println();
        setOpcaoEscolhida(scanner.nextInt());

        switch (getOpcaoEscolhida()) {

            case 1:
                setOpcaoConvertida("USD");
                break;
            case 2:
                setOpcaoConvertida("ARS");
                break;
            case 3:
                setOpcaoConvertida("USD");
                break;
            case 4:
                setOpcaoConvertida("BRL");
                break;
            case 5:
                setOpcaoConvertida("USD");
                break;
            case 6:
                setOpcaoConvertida("COP");
                break;
        }

        String site = "https://v6.exchangerate-api.com/v6/7e2b881ed244ebef049d4523/latest/" + getOpcaoConvertida();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(site))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();
        resposta = gson.fromJson(json, RespostaApi.class);
    }

}
