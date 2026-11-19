package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Gerencia os Autobots da base.
 */
public class GerenciadorAutobots {
    final int NUMERO_REPARO = 100;
    final int NUMERO_ELITE = 500;
    final int NUMERO_PADRAO = 200;

    private List<Autobot> lista = new ArrayList<>();

    public void adicionar(Autobot a) {
        lista.add(a);
    }

    public double calcularEnergonTotal() {
        double total = 0;

        for (Autobot autobot : lista) {
            total += autobot.getEnergon();
        }
        return total;
    }

    public Autobot buscar(String nome) {

        for (Autobot a : lista) {
            if (Objects.equals(a.getNome(), nome)) {
                return a;
            }
        }

        return null;
    }

    public void reparar(Autobot a) {
        try {
            if (a.getEnergon() < 0) {
                throw new Exception("Energon negativo");
            }
            a.aumentaEnergon(NUMERO_REPARO);
        } catch (Exception ex) {
        a.setEnergon(NUMERO_REPARO);
        }
    }

    public String classificar(Autobot a) {
        if (a.getEnergon() > NUMERO_ELITE) {
            return "ELITE";
        } else if (a.getEnergon() > NUMERO_PADRAO) {
            return "PADRAO";
        } else {
            return "RESERVA";
        }
    }
}