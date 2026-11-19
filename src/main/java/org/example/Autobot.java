package org.example;

// n e e nao sao nada descritivos
// atributos estavam publicos nao tinha getter e setter
// metodo aumenta energon
// nome do numero de reparo
// catch que n faz nada, botei pra caso tenha energia negativa,nao reparar, ele deixa com o numero de reparo
// for quebrando o codigo, mudei para :
// ratchet.getEnergon(), antes tava pegando o nome dele

public class Autobot {
    private String nome;
    private double energon;
    private int nivel;

    public Autobot(String nome, double energon, int nivel) {
        this.nome = nome;
        this.energon = energon;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getEnergon() {
        return energon;
    }

    public void setEnergon(double energon) {
        this.energon = energon;
    }

    public int getNivel() {
        return nivel;
    }

    public void aumentaEnergon(int quantidade){
        energon = energon + quantidade;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
