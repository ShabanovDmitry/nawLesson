import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.*;

import java.io.IOException;

public class RequestSender {

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final String API_KEY = "g0KN1EE1YHKRV2WVHyJdnLV8X0n8Xs4k";

    static public String sendCityIdRequest(String cityName) throws IOException {

        String cityId = null;

        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("locations")
                .addPathSegment("v1")
                .addPathSegment("cities")
                .addPathSegment("search")
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("q", cityName)
                .build();

        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();

        String responseJson = response.body().string();

        JsonNode cityIdNode = objectMapper
                .readTree(responseJson)
                .at("/0/Key");

        cityId =cityIdNode.asText();

        return cityId;

        //return responseJson;
    }

    //домашнее задание
    static public String sendTempIdRequest(String cityId) throws IOException {

        String date = null;
        String weather = null;
        String temperatureMin = null;
        String temperatureMax = null;


        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("1day")
                .addPathSegment("294021")
                //.addPathSegment(cityId)
                .addQueryParameter("apikey", API_KEY)
                .build();

        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();

        String responseJson = response.body().string();
        JsonNode dateNode = objectMapper
                .readTree(responseJson)
                .at("/DailyForecasts/0/Date");

        JsonNode weatherNode = objectMapper
                .readTree(responseJson)
                .at("/DailyForecasts/0/Day/IconPhrase");

        JsonNode temperatureMinNode = objectMapper
                .readTree(responseJson)
                .at("/DailyForecasts/0/Temperature/Minimum/Value");

        JsonNode temperatureMaxNode = objectMapper
                .readTree(responseJson)
                .at("/DailyForecasts/0/Temperature/Maximum/Value");

        
        date = dateNode.asText();
        weather = weatherNode.asText();
        temperatureMin = temperatureMinNode.asText();
        temperatureMax = temperatureMaxNode.asText();

        return  date + " will be "+ weather
                + ". Minimum temperature: " + temperatureMin
                + "℃, maximum temperature: " + temperatureMax + "℃";

    }


}
