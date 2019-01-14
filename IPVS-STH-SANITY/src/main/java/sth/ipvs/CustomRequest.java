package sth.ipvs;

import sth.http.client.Request;
import sth.http.client.RequestExecutor;
import sth.http.client.RequestFactory;
import sth.http.client.Response;
import sth.json.JSON;
import sth.xml.XML;

import javax.inject.Inject;

public abstract class CustomRequest {

    @Inject
    protected IPVSProperties props;

    protected Request request;

    @Inject
    private void postInitCustom(RequestExecutor executor) {
        this.request = RequestFactory.noAuth(baseUrl()).executor(executor);
    }

    protected abstract String baseUrl();

    public Request unwrap() {
        return request;
    }

    public IPVSResponse get() {
        Response response = request.get();
        return new IPVSResponse(request, response);
    }

    public JSON getJson() {
        Response response = request.get();
        if (response.status().isError()) {
            throw new RuntimeException("error getting json data from " + request.uri() + ":\n" + response);
        }
        return response.as(JSON.class);
    }

    public XML getXml() {
        Response response = request.get();
        if (response.status().isError()) {
            throw new RuntimeException("error getting xml data from " + request.uri() + ":\n" + response);
        }
        return response.as(XML.class);
    }

    public IPVSResponse post() {
        Response response = request.post();
        return new IPVSResponse(request, response);
    }

    public IPVSResponse post(XML xml) {
        request.body(xml.serialize());
        request.header("Content-Type", "application/xml");
        Response response = request.post();
        return new IPVSResponse(request, response);
    }

    public IPVSResponse post(JSON json) {
        request.body(json.serialize());
        request.header("Content-Type", "application/json");
        Response response = request.post();
        return new IPVSResponse(request, response);
    }

    public IPVSResponse post(byte[] data) {
        request.body(data);
        Response response = request.post();
        return new IPVSResponse(request, response);
    }

}
