public class Prodact {
    private String name;
    private Double cost;

    public Prodact (String name, Double cost){
        this.name = name;
        this.cost = cost;

    }
    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return this.name;
    }

    public void setCost (Double cost){
        this.cost = cost;
    }
    public Double getCost (){
        return this.cost;
    }

    @Override
    public String toString() {
        
        return String.format("name: %s cost: %f ", name, cost);
    }
}
