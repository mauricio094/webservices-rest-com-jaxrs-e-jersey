package br.com.alura.loja.modelo;

import com.thoughtworks.xstream.XStream;

/**
 * Created by macau on 09/07/17.
 */
public class Projeto {

    private String nome;
    private long id;
    int anoDeInicio;

    public Projeto() {
    }

    public Projeto(long id, String nome, int anoDeInicio) {
        this.id = id;
        this.nome = nome;
        this.anoDeInicio = anoDeInicio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAnoDeInicio() {
        return anoDeInicio;
    }

    public void setAnoDeInicio(int anoDeInicio) {
        this.anoDeInicio = anoDeInicio;
    }


    public String toXML() {
        return new XStream().toXML(this);
    }
}
