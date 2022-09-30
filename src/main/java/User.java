public class User {
    private String name;
    private int height;
    private double weight;

    public User (String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        if (n.length() > 2 && n.length() < 20)
            name = n;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        if (h > 100 && h < 220)
            height = h;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double w) {
        if (w > 30 && w < 150)
            weight = w;
    }

}


