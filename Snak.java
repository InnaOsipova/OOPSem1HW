public class  Snak extends Prodact{
    private double weight;
    
    public Snak(String name, Double cost, double weight) {
        super(name, cost);
        this.weight = weight;
        
    }
    public void setWeight (double weight){
        this.weight = weight;
    }
    public double getWaight (){
        return this.weight;
    }
    
}
