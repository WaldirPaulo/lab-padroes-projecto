package designPatterns.strategy.operadorasDeFrete;

import designPatterns.strategy.Frete;

public class CorreiosDeAngola implements Frete {
    public double calcula(double peso) {
        return peso * 2;
    }
}
