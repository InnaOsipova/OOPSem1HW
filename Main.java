import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Prodact> list = new ArrayList<Prodact>( 
            Arrays.asList(
            new Prodact("Mars", 10.5),
            new Prodact("Twix", 20.00)));
        Machine machine = new Machine(list);

        String key = "Mars";
        System.out.println(machine.getProduckt(key));

        List<Prodact> listBottle = new ArrayList<Prodact>( 
            Arrays.asList(
                new Bottle("Coca Cola", 1.5, 1.00),
                new Bottle("Sprite", 20.00, 1.00)));
       

        Machine botllMachine = new BottleMachine(listBottle);

        String ke = "Sprite";
        System.out.println(botllMachine.getProduckt(ke));

        List<Prodact> hotDrinc = new ArrayList<Prodact>( 
            Arrays.asList(
                new HotDrink("Coffe", 200.00, 0.200, 50),
                new HotDrink("Tee", 150.00, 0.30, 50)));
        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine(hotDrinc);
        String name = "Coffe";
        double volume = 0.200;
        int temperature = 50;
        System.out.println(hotDrinkMachine.getProduct(name, volume, temperature));

    }
}
