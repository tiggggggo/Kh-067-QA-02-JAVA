package bean;

public abstract class Product {
    private String name;
    private int weight;

    public Product(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight (int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "name = " + name  +
                ", weight = " + weight + " grams ";
    }
}


