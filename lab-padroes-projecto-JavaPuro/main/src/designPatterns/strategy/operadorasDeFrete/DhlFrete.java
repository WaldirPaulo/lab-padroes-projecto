package designPatterns.strategy.operadorasDeFrete;

import designPatterns.strategy.Frete;

public class DhlFrete implements Frete {
    public double calcula(double peso) {
        return peso * 1.2;
    }
}