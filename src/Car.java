import java.util.Objects;

public class Car {
    String brand = null;
    String model = null;
    double engineVolume = 0;
    String color = null;
    int year = 0;
    String country = null;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand == "") {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model == "") {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color == "") {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country == "") {
            this.country = "default";
        } else {
            this.country = country;
        }
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume +
                ", цвет кузова: " + color + ", год выпуска " + year + ", страна сборки: " + country + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && year == car.year && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(country, car.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country);
    }
}
