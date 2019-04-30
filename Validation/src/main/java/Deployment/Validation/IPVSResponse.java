package Deployment.Validation;

import org.testng.Assert;
import sth.http.client.Request;
import sth.http.client.Response;
import sth.json.JSON;
import sth.xml.XML;

public class IPVSResponse {
    private Request request;
    private Response response;

    public IPVSResponse (Request request, Response response) {
        this.request = request;
        this.response = response;
    }

    /**
     * Get the {@link Request} object that was executed to create the {@link Response}
     */
    public Request request() {
        return request;
    }

    /**
     * Get the underlying {@link Response} object
     */
    public Response response() {
        return response;
    }

    /**
     * True if the response status code is in the success range (200-299)
     */
    public boolean isSuccess() {
        return response.status().isSuccess();
    }

    /**
     * Assert that the response status code was in the success range (200-299)
     */
    public IPVSResponse assertSuccess() {
        Assert.assertTrue(isSuccess(), "request to " + request.uri() + " failed:\n" + response);
        return this;
    }

    /**
     * True if the response status code is in the error range (>=400)
     */
    public boolean isError() {
        return response.status().isError();
    }

    /**
     * Parse the response body to a JSON object
     */
    public JSON json() {
        return response.as(JSON.class);
    }

    /**
     * Parse the response body to an XML object
     */
    public XML xml() {
        return response.as(XML.class);
    }

    /**
     * Get the response body as a String
     */
    public String responseString() {
        return response.as(String.class);
    }

    /**
     * Get the HTTP status code of the response
     */
    public int statusCode() {
        return response.status().code();
    }

    /**
     * Get the request URI that was executed
     */
    public String uri() {
        return request.uri().toString();
    }

    /**
     * Get a response header
     */
    public String header(String headerName) {
        return response.header(headerName);
    }

    @Override
    public String toString() {
        String contentType = response.header("content-type");
        if (contentType.contains("json")) {
            return json().toString(3);
        } else if (contentType.contains("xml")) {
            return xml().toString(3);
        } else {
            return responseString();
        }
    }
}
