package com.orange.wvfSpike.wvfTest;

import com.couchbase.client.CouchbaseClient;
import com.google.gson.Gson;
import com.orange.wvfSpike.configConnectionDataBase.ConnectToCouchbase;
import com.orange.wvfSpike.wvf.Video;
import org.junit.Test;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by msaidi on 11/20/15.
 */
public class VideoTest {
    @Test
    public void createVideo() throws Exception {
        String[] groupeSource = new String[]{"tf1", "dailymotion", "orangeTv"};
        String[] groupeTitre = new String[]{"tf1video", "dailymotionvideo", "orangeApplication"};
        String[] groupeLien = new String[]{"wwww.tf1.fr", "www.dailymotion.fr", "wwww.orange.com"};
        CouchbaseClient client = ConnectToCouchbase.newCouchbaseClient();
        Gson gson = new Gson();
        Video video;
        String date = getDate();
        for (int i = 0; i < 10; i++) {
            video = new Video()
                    .setId(i)
                    .setSource(Arrays.toString(groupeSource))
                    .setTitre(Arrays.toString(groupeTitre))
                    .setLien(Arrays.toString(groupeLien))
                    .setDate(date);
            client.set("video" + video.getId(), gson.toJson(video));
        }
    }

    private String getDate() {
        Date date = new Date();
        return date.toString();
    }
}
