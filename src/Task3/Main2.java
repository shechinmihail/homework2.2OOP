package Task3;

public class Main2 {
    public static void main(String[] args) {

        Car lada = new Car("Lada","Grande",1.7, "yellow", 2015,"Russia");
        Car audi = new Car("Audi", "A8 50L TDI quattro",3.0,"black", 2020, "Germany");
        Car bmw = new Car("BMW", "Z8", 3.0, "black", 2021,"Germany");
        Car kia = new Car("KIA", "Sportage 4",2.4,"red",2018,"South Korea");
        Car hyundai = new Car("Hyundai", "Avant", 1.6,"orange",2016,"South Korea");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);


    }
}