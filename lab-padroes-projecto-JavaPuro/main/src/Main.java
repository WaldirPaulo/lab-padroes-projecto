import designPatterns.facade.Facade;
import designPatterns.strategy.FreteCliente;
import designPatterns.strategy.operadorasDeFrete.AirmexFrete;
import designPatterns.strategy.operadorasDeFrete.CorreiosDeAngola;
import designPatterns.strategy.operadorasDeFrete.DhlFrete;
import designPatterns.strategy.operadorasDeFrete.FedExFrete;

/**
 * Java Design Patterns - Singleton
 *
 * @author Waldir Teixeira Paulo
 */

public class Main {
    public static void main(String[] args) {

        /*Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonEnum.INSTANCE.produto(1).nome();
        SingletonEnum.INSTANCE.produto(2).nome();
        */

        /*Strategy
        AirmexFrete airmexFrete = new AirmexFrete();
        DhlFrete dhlFrete = new DhlFrete();
        FedExFrete fedexFrete = new FedExFrete();
        CorreiosDeAngola caFrete = new CorreiosDeAngola();

        System.out.printf("Airmex \nKilos: 10kg\nPreço: %.2f$%n-------------------%n", (new FreteCliente(airmexFrete).calcula(10)));
        System.out.printf("DHL \nKilos: 10kg\nPreço: %.2f$%n----------------------%n", (new FreteCliente(dhlFrete).calcula(10)));
        System.out.printf("FedEx \nKilos: 10kg\nPreço: %.2f$%n--------------------%n", (new FreteCliente(fedexFrete).calcula(10)));
        System.out.printf("Correios de Angola \nKilos: 10kg\nPreço: %.2f$%n--------------------%n",(new FreteCliente(caFrete).calcula(10)));

         */

        /*Facade*/
        Facade facade = new Facade();
        facade.migrarCliente("Waldir", "1000029");

    }
}