package alurachallenge.logica.Datos;



import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.*;

public class Datos {

    private String key = "04db5610cf54c1a553c4d49a/latest/";
    private String resultados(String moneda) throws IOException, InterruptedException {

        String direccion = "https://v6.exchangerate-api.com/v6/"+key+moneda;
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public double capturaMonedas(String moneda1, String moneda2) throws IOException, InterruptedException {

        try {
            JSONObject jsonObject = new JSONObject(resultados(moneda1));
            JSONObject results = jsonObject.getJSONObject("conversion_rates");
            return results.getDouble(moneda2);
        } catch (JSONException e) {
            JOptionPane.showMessageDialog(null, "Formato de valor errado");
            System.out.println(e.getCause());
            return 0.0;
        }
    }
}
