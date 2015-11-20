package com.orange.wvfSpike.wvf;

/**
 * Created by msaidi on 11/20/15.
 */
public class Video {
    public int id;
    public String source;
    public String titre;
    public String lien;
    public String date;

    public int getId() {
        return id;
    }

    public Video setId(int id) {
        this.id = id;
        return this;
    }

    public String getSource() {
        return source;
    }

    public Video setSource(String source) {
        this.source = source;
        return this;
    }

    public String getTitre() {
        return titre;
    }

    public Video setTitre(String titre) {
        this.titre = titre;
        return this;
    }

    public String getLien() {
        return lien;
    }

    public Video setLien(String lien) {
        this.lien = lien;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Video setDate(String date) {
        this.date = date;
        return this;
    }
}
