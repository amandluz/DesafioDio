package one.digitalinnovation.gof.strategy;

public class Robo {
    private String nome;
    private int energia;
    private Comportamento comportamento;

    public Robo(String nome) {
        this.nome = nome;
        this.energia = 100;
        this.comportamento = new ComportamentoNormal(); // Comportamento padrão
    }

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        if (energia > 0) {
            System.out.print(nome + ": ");
            comportamento.mover();
            energia -= 10;
        } else {
            System.out.println(nome + " está sem energia para se mover!");
        }
    }

    public void recarregar() {
        energia = Math.min(energia + 30, 100);
        System.out.println(nome + " recarregou. Energia atual: " + energia);
    }

    public void status() {
        System.out.println(nome + " - Energia: " + energia + " - Comportamento: " + comportamento.getClass().getSimpleName());
    }
}
