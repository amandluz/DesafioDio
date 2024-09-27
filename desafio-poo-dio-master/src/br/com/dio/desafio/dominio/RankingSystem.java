package br.com.dio.desafio.dominio;

import java.util.*;

public class RankingSystem {
    private List<Dev> devs;

    public RankingSystem() {
        this.devs = new ArrayList<>();
    }

    public void addDev(Dev dev) {
        devs.add(dev);
    }

    public List<Dev> getRanking() {
        devs.sort((dev1, dev2) -> Double.compare(dev2.calcularTotalXp(), dev1.calcularTotalXp()));
        return devs;
    }

    public void printRanking() {
        List<Dev> ranking = getRanking();
        System.out.println("=== Ranking de Desenvolvedores ===");
        for (int i = 0; i < ranking.size(); i++) {
            Dev dev = ranking.get(i);
            System.out.printf("%d. %s - XP: %.2f%n", i + 1, dev.getNome(), dev.calcularTotalXp());
        }
    }
}