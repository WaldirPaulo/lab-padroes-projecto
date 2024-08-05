package designPatterns.singleton;

import designPatterns.singleton.products.Produto;
import designPatterns.singleton.products.Produto1;
import designPatterns.singleton.products.Produto2;

public enum SingletonEnum {
    INSTANCE;

    public Produto produto(int produto) {
        return switch (produto) {
            case 1 -> new Produto1();
            case 2 -> new Produto2();
            default -> throw new IllegalStateException("Produto inválido: " + produto);
        };
    }
}
