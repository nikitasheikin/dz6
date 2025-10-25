public class Main {
    public static void main(String[] args) {
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2020, "Red", 25000.0, "A123BC"),
            new Car(2, "Ford", "Focus", 2018, "Blue", 18000.0, "B456DE"),
            new Car(3, "Toyota", "Corolla", 2021, "White", 22000.0, "C789FG")
        };

        Car[] toyotas = getCarByBrend(cars, "Toyota");
        System.out.println("Найдено машин Toyota: " + toyotas.length);
    }

    public static Car[] getCarByBrend(Car[] cars, String brand) {
        int count = 0;
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                count++;
            }
        }

        Car[] result = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                result[index++] = car;
            }
        }

        return result;
    }
}
