package one.digitalinnovation.gof;

import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {
    public static void main(String[] args) {
        // Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo("R2-D2");

        robo.status();
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.status();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.status();
        robo.mover();
        robo.mover();
        robo.mover();
		robo.status();

        robo.recarregar();
        robo.status();

        robo.setComportamento(normal);
        robo.mover();
        robo.status();
		

	}

}
