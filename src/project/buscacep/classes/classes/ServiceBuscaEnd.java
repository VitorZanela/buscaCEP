package project.buscacep.classes.classes;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServiceBuscaEnd {
    public BuscaCep[] buscar(String estado, String cidade, String rua) throws InterruptedException, IOException {
        String url = "https://viacep.com.br/ws/" + estado + "/" +
                cidade.replace(" ", "%20") + "/" +
                rua.replace(" ", "%20") + "/json/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 400 || response.body().trim().equals("[]")) {
            return null;
        }
        return new Gson().fromJson(response.body(), BuscaCep[].class);
    }
}
