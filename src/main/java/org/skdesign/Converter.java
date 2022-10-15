package org.skdesign;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.util.Currency;

/**
 * Calls Currency data api using okhttp3 client and prints out response data
 */
public class Converter {

    public static double converter(Currency from, Currency to, Double amount) throws IOException, InterruptedException {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        JSONParser parser = new JSONParser();
        double exchange = 0d;
        String apiKey = "yEamvmdfR3JeuF65oaKDNEbAScEagYYN";  /**Get API Key from apilayer.com */
        Request request = new Request.Builder()   /**request to be made with api key using okhttp3 client */
                .url("https://api.apilayer.com/currency_data/convert?to=" + to + "&from=" + from + "&amount=" + amount)
                .addHeader("apikey", apiKey)
                .method("GET", null).build();
        Response response = client.newCall(request).execute();
        assert response.body() != null;
        String res = response.body().string();
        try {
            JSONObject json = (JSONObject) parser.parse(res);
            exchange = Double.parseDouble(String.valueOf(json.get("result")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(exchange);
        response.body().close();
        return exchange;


    }
}
