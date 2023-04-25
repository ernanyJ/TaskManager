package com.ernany.entities;

public class Endereco {
    String rua;
    String pais;
    int number;

    public Endereco(String rua, String pais, int number) {
        this.rua = rua;
        this.pais = pais;
        this.number = number;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "País: " + getPais() + ", Rua: " + getRua() + ", Número: " + getNumber();
    }
}
