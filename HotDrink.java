public class HotDrink extends Bottle{
    private int tempriche;
    
    public HotDrink(String name, Double cost, double volume, int tempriche) {
        super(name, cost, volume);
        this.tempriche = tempriche;
        //TODO Auto-generated constructor stub
    }
    
    public int getTempriche() {
        return tempriche;
    }
    public void setTempriche(int tempriche) {
        this.tempriche = tempriche;
    }
    
    @Override
    public String toString() {
        
        return String.format("name: %s cost: %f volume: %f temperature: %d", super.getName(), super.getCost(), super.getVolume(), this.tempriche);
    }
}
