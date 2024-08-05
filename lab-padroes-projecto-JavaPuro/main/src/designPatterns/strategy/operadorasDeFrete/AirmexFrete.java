package designPatterns.strategy.operadorasDeFrete;

import designPatterns.strategy.Frete;

public class AirmexFrete implements Frete {
    public double calcula(double peso) {
        return peso * 1.3;
    }
}
