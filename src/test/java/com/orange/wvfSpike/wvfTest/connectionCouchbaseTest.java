package com.orange.wvfSpike.wvfTest;

import com.couchbase.client.CouchbaseClient;
import org.junit.Assert;
import org.junit.Test;

import java.net.URI;
import java.util.ArrayList;

/**
 * Created by msaidi on 11/20/15.
 */
public class connectionCouchbaseTest {
    @Test
    public void connectToCouchbase() throws Exception {
        ArrayList<URI> uriList = new ArrayList<URI>();
        uriList.add(new URI("http://localhost:8091/pools"));
        String bucketName = "default";
        String password = "";

        CouchbaseClient client = new CouchbaseClient(uriList, bucketName, password);


        String key = "wvf_2015-11-20";
        String value = "{\n\"titre\":\"couchbase\"\n}";

        client.set(key, value);

        String result = (String) client.get(key);
        Assert.assertEquals(value, result);

    }
}
