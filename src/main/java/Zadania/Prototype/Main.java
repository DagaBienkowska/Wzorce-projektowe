package Zadania.Prototype;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Audi", "20-05-2010", "red");
        Car car2;

        System.out.println(car);
        {
            try {
                car2 = car.clone();
                car2.setProductionDate("09-12-2009");
                System.out.println(car2);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        try {
            Car car3 = car.clone();
            car3.setProductionDate("23-11-2013");
            System.out.println(car3);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
