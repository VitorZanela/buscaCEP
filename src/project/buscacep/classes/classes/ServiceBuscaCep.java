package project.buscacep.classes.classes;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServiceBuscaCep {
    public BuscaCep buscar(String cep) throws IOException, InterruptedException {
        try {
            String url = "https://viacep.com.br/ws/" + cep + "/json/";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 400) {
                return null;
            } else if (response.body().contains("erro")) {
                return null;
            }
            return new Gson().fromJson(response.body(), BuscaCep.class);
        }catch (Exception e){
            return null;
        }
    }

}
