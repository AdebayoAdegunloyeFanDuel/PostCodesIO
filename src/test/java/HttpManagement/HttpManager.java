package HttpManagement;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpManager {
    private final HttpClient client;
    private final HttpGet httpGet;
    private HttpResponse httpResponse;

    public HttpManager(String urlString) {
        this.client = HttpClientBuilder.create().build();
        this.httpGet = new HttpGet(urlString);
    }

    public void makeUrlCall(){
        try {
            httpResponse = client.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getResponseBody(){
        try {
            return EntityUtils.toString(httpResponse.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Header[] getResponseHeaders(){
        return httpResponse.getAllHeaders();
    }

}
