package com.orange.wvfSpike.configConnectionDataBase;


import com.couchbase.client.CouchbaseClient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

/**
 * Created by msaidi on 11/20/15.
 */
public class ConnectToCouchbase {
    public static CouchbaseClient newCouchbaseClient() throws URISyntaxException, IOException {
        ArrayList<URI> uriList = new ArrayList<URI>();
        uriList.add(new URI("http://localhost:8091/pools"));
        String bucketName = "default";
        String password = "";
        return new CouchbaseClient(uriList, bucketName, password);
    }

}
