
/**
 * Tugas APL, testing double expresso
 * 
 * @author Maulana Hizbullah (1708107010055)
 * @since 4/12/2019
 * @version 1.0
 */
public class StarbuzzCoffee {

    /**
     * @param args
     */
    public static void main(String args[]) {
        Beverage orderan = new Espresso();
        orderan = new Espresso(orderan);
        orderan = new MilkShake(orderan);
        System.out.println("order 2 " + orderan.getDescription() + " $" + orderan.cost() +"\n");

        Beverage orderan2 = new Espresso();
        orderan2 = new Espresso(orderan2);
        orderan2 = new Whip(orderan2);
        orderan2 = new Mocha(orderan2);
        System.out.println("order 2 " + orderan2.getDescription() + " $" + orderan2.cost()+"\n");

        Beverage orderan3 = new Espresso();
        orderan3 = new Espresso(orderan3);
        orderan3 = new Milk(orderan3);
        orderan3 = new Whip(orderan3);
        System.out.println("order 2 " + orderan3.getDescription() + " $" + orderan3.cost()+"\n");

        Beverage orderan4 = new Espresso();
        orderan4 = new Espresso(orderan4);
        System.out.println("order 2 " + orderan4.getDescription() + " $" + orderan4.cost()+"\n");
    }
}
