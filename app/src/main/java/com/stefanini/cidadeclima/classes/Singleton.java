package com.stefanini.cidadeclima.classes;

import java.util.ArrayList;

/**
 * Criado por Maicon Dias Castro em 20/08/2018.
 */
public class Singleton {
    private static Singleton instance = null;
    private ArrayList<Favorito> favoritos;
    private ArrayList<Cidade> cidades;

    private Singleton() {
        favoritos = new ArrayList<>();
        cidades = new ArrayList<>();
    }

    public static Singleton getInstance() {
        if(instance == null) instance = new Singleton();
        return instance;
    }

    public void setInstance(Singleton instance) {
        this.instance = instance;
    }

    public ArrayList<Favorito> getFavoritos() {
        return favoritos;
    }

    public void addFavorito(Favorito fav) {
        favoritos.add(fav);
    }

    public void setFavoritos(ArrayList<Favorito> favoritos) {
        this.favoritos = favoritos;
    }

    public ArrayList<Cidade> getCidades() {
        return cidades;
    }

    public void addCidade(Cidade cidade) {
        this.cidades.add(cidade);
    }

    public void setCidades(ArrayList<Cidade> cidades) {
        this.cidades = cidades;
    }

    public void mockFavoritos() {
        addFavorito(new Favorito(1, "Belo Horizonte", "Ensolarado", 23.9));
        addFavorito(new Favorito(2, "Maceió", "Ensolarado", 30.9));
        addFavorito(new Favorito(3, "Rio de Janeiro", "Ensolarado", 29.9));
        addFavorito(new Favorito(4, "Campo Grande", "Nublado", 21.9));
        addFavorito(new Favorito(5, "Curitiba", "Chuva", 20.9));
    }

    public void mockCidades() {
        addCidade(new Cidade(1, new ArrayList<String>(), "Brasil", "Belo Horizonte", 8));
        addCidade(new Cidade(2, new ArrayList<String>(), "Brasil", "Curitiba", 7));
    }
}
