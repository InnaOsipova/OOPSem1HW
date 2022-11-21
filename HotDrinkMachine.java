import java.util.List;

public class HotDrinkMachine extends Machine {
    //otected final List <HotDrink> listHotDrinks;

    public HotDrinkMachine(List <Prodact> list) {
        
        super(list);
    }

    @Override
    public Prodact getProduckt(Object name) {
        // TODO Auto-generated method stub
        return super.getProduckt(name);
    }

    public HotDrink getProduct(Object name, double volume, int temperature){
        for(Prodact product: list){
            if(product instanceof HotDrink){
                if(product.getName().equalsIgnoreCase((String) name) && ((HotDrink) product).getVolume() == volume && ((HotDrink) product).getTempriche() == temperature){
                
                    return (HotDrink) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }    

}
