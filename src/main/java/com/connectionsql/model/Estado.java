package com.connectionsql.model;

public class Estado {
    private Long id;
    private String nome;
    private String uf;
    private RegiaoGeografica regiaoGeografica;
    private int areaKm2;
    private int populacao ;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getUf() {
        return uf;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    public RegiaoGeografica getRegiaoGeografica() {
        return regiaoGeografica;
    }
    
    public void setRegiaoGeografica(RegiaoGeografica regiaoGeografica) {
        this.regiaoGeografica = regiaoGeografica;
    }
    
    public int getAreaKm2() {
        return areaKm2;
    }
    
    public void setAreaKm2(int areaKm2) {
        this.areaKm2 = areaKm2;
    }
    
    public int getPopulacao() {
        return populacao;
    }
    
    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public String toString() {
        return "Estado: " + nome + " Id: " + id + " UF: " + uf;
    }
}