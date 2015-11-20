package com.orange.wvfSpike.wvfTest;

import com.couchbase.client.CouchbaseClient;
import com.google.gson.Gson;
import com.orange.wvfSpike.configConnectionDataBase.ConnectToCouchbase;
import com.orange.wvfSpike.wvf.Picture;
import org.junit.Test;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by msaidi on 11/20/15.
 */
public class PictureTest {
    @Test
    public void createPicture() throws Exception {
        String[] listSource = new String[]{"tf1", "dailymotion", "proxymedia"};
        String[] listTitre = new String[]{"image1", "image2", "image3"};
        String[] listLien = new String[]{"www.tf1.fr", "www.dailymotion.fr", "proxymedia@orange"};
        String[] listType = new String[]{"jpeg", "png", "gif"};
        CouchbaseClient client = ConnectToCouchbase.newCouchbaseClient();
        Gson gson = new Gson();
        String date = getDate();
        Picture picture;

        for (int i = 0; i < 10; i++) {
            picture = new Picture()
                    .setId(i)
                    .setSource(Arrays.toString(listSource))
                    .setTitre(Arrays.toString(listTitre))
                    .setLien(Arrays.toString(listLien))
                    .setType(Arrays.toString(listType))
                    .setDate(date);
            client.set("picture" + picture.getId(), gson.toJson(picture));
        }
    }

    private String getDate() {
        Date date = new Date();
        return date.toString();
    }
}
