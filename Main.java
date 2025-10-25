public class Main {
    public static void main(String[] args) {
       
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2020, "Red", 25000.0, "A123BC"),
            new Car(2, "Ford", "Focus", 2018, "Blue", 18000.0, "B456DE"),
            new Car(3, "Toyota", "Corolla", 2021, "White", 22000.0, "C789FG"),
            new Car(4, "Toyota", "RAV4", 2019, "Black", 27000.0, "D012EF")
        };
        
        Car[] toyotas = getCarByBrend(cars, "Toyota");
        System.out.println("Найдено машин Toyota: " + toyotas.length);
        
        Car[] oldToyotas = getCarByBrendAndYearOperational(cars, "Toyota", 4);
        System.out.println("Toyota старше 4 лет: " + oldToyotas.length);
    }

    public static Car[] getCarByBrend(Car[] cars, String brand) {
        if (cars == null || brand == null) {
            return new Car[0];
        }

        int count = 0;
        for (Car car : cars) {
            if (car != null && brand.equals(car.getBrand())) {
                count++;
            }
        }

        Car[] result = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (car != null && brand.equals(car.getBrand())) {
                result[index++] = car;
            }
        }

        return result;
    }

   
    public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brand, int years) {
        if (cars == null || brand == null || years < 0) {
            return new Car[0];
        }

        int currentYear = java.time.Year.now().getValue();
        int oldestAllowedYear = currentYear - years;

        int count = 0;
        for (Car car : cars) {
            if (car != null && brand.equals(car.getBrand()) && car.getYear() <= oldestAllowedYear) {
                count++;
            }
        }

        Car[] result = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (car != null && brand.equals(car.getBrand()) && car.getYear() <= oldestAllowedYear) {
                result[index++] = car;
            }
        }

        return result;
    }
}
