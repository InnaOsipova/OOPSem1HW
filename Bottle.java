public class Bottle extends Prodact {
    private Double volume;
    
    public Bottle(String name, Double cost, double volume) {
        super(name, cost);
        this.volume = volume;
        //TODO Auto-generated constructor stub
    }
    public Double getVolume(){
        return volume;
    }

    public void setVolume (Double volume){
        this.volume = volume;
    }
    
    @Override
    public String toString() {
        
        return String.format("name: %s cost: %f volume: %f ", super.getName(), super.getCost(), volume);
    }
}
