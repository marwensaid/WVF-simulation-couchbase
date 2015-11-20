package com.orange.wvfSpike.wvfTest;

import com.couchbase.client.CouchbaseClient;
import com.google.gson.Gson;
import com.orange.wvfSpike.configConnectionDataBase.ConnectToCouchbase;
import com.orange.wvfSpike.wvf.Book;
import org.junit.Test;

import java.util.Arrays;
import java.util.Date;


/**
 * Created by msaidi on 11/20/15.
 */
public class BooksTest {
    @Test
    public void createBooks() throws Exception {
        String[] groupeTitre = new String[]{"orange", "meta", "wvf", "tram"};
        String[] groupeAuteur = new String[]{"marwen", "pascal", "christian", "christophe"};
        String[] groupeEditeur = new String[]{"orangeDfy", "orangeMfy", "OAB", "OBS"};
        CouchbaseClient client = ConnectToCouchbase.newCouchbaseClient();
        Gson gson = new Gson();
        String date = getDate();
        Book book;

        for (int i = 0; i < 10; i++) {
            book = new Book()
                    .setId(i)
                    .setTitre(Arrays.toString(groupeTitre))
                    .setAuteur(Arrays.toString(groupeAuteur))
                    .setEditeur(Arrays.toString(groupeEditeur))
                    .setDate(date);
            client.set("book" + book.getId(), gson.toJson(book));
        }

    }

    private String getDate() {
        Date date = new Date();
        return date.toString();
    }
}
