package team.domain;

public class Notebook implements Equipment {
    private String model;
    private double price;

    public Notebook() {
    }

    public Notebook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return this.model + "(" + this.price + ")";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
