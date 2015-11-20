package com.orange.wvfSpike.wvf;

/**
 * Created by msaidi on 11/20/15.
 */
public class Book {
    public int id;
    public String titre;
    public String auteur;
    public String editeur;
    public String date;

    public int getId() {
        return id;
    }

    public Book setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitre() {
        return titre;
    }

    public Book setTitre(String titre) {
        this.titre = titre;
        return this;
    }

    public String getAuteur() {
        return auteur;
    }

    public Book setAuteur(String auteur) {
        this.auteur = auteur;
        return this;
    }

    public String getEditeur() {
        return editeur;
    }

    public Book setEditeur(String editeur) {
        this.editeur = editeur;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Book setDate(String date) {
        this.date = date;
        return this;
    }
}
