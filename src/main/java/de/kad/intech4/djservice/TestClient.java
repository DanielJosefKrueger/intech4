package de.kad.intech4.djservice;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TestClient for performing HTTP Requests for debugging the REST API
 */
public class TestClient {




    public static void main(String[] args) throws IOException {
        getRequest("http://localhost:8081/rest/intech/djs");
        postRequest("http://localhost:8081/rest/intech/pl", "DJ Key");

    }




    public static String getRequest(String getUrl) throws IOException {
        HttpGet get = new HttpGet(getUrl);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        String responseString = new BasicResponseHandler().handleResponse(response);
        System.out.println(responseString);
        return "";
    }



    public static String postRequest(String getUrl, String postContent) throws IOException {
        HttpPost post = new HttpPost(getUrl);
        post.setEntity(new StringEntity(postContent));
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(post);


        String responseString = new BasicResponseHandler().handleResponse(response);
        System.out.println(responseString);
        return "";
    }


}
