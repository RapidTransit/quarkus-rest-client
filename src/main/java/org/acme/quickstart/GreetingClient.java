package org.acme.quickstart;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;

@SuppressWarnings("CdiManagedBeanInconsistencyInspection")
@RegisterRestClient
public interface GreetingClient {

    @GET
    String get();
}
