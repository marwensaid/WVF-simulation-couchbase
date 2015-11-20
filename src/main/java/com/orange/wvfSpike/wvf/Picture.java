package com.orange.wvfSpike.wvf;

/**
 * Created by msaidi on 11/20/15.
 */
public class Picture {
    public int id;
    public String source;
    public String titre;
    public String lien;
    public String type;
    public String date;

    public int getId() {
        return id;
    }

    public Picture setId(int id) {
        this.id = id;
        return this;
    }

    public String getSource() {
        return source;

    }

    public Picture setSource(String source) {
        this.source = source;
        return this;
    }

    public String getTitre() {
        return titre;
    }

    public Picture setTitre(String titre) {
        this.titre = titre;
        return this;
    }

    public String getLien() {
        return lien;
    }

    public Picture setLien(String lien) {
        this.lien = lien;
        return this;
    }

    public String getType() {
        return type;
    }

    public Picture setType(String type) {
        this.type = type;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Picture setDate(String date) {
        this.date = date;
        return this;
    }
}
