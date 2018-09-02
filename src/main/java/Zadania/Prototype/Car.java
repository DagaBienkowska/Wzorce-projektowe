package Zadania.Prototype;

public class Car implements Cloneable {

    private String name;
    private String productionDate;
    private String color;

    public Car(String name, String productionDate, String color) {
        this.name = name;
        this.productionDate = productionDate;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", productionDate='" + productionDate + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
