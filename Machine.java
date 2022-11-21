import java.util.List;

public class Machine {
    protected final List <Prodact> list;
    

    public Machine (List<Prodact> list){
        this.list = list;
    }

    public Prodact getProduckt ( Object name){
        for (Prodact prodact : this.list) {
            if (name.equals(prodact.getName())){
                return prodact;
            }
        }
        throw new IllegalStateException("Product not found");
    }

  }
