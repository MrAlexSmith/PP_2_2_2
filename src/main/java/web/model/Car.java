package web.model;

import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Согласно заданию п.2 к данной задаче создан класс 'Car' с тремя произвольными полями:
 *  brand - бренд производителя а/м;
 *  model - наименование модели а/м;
 *  year - год выпуска а/м.
 * Переопределение методов hashCode() и equals() в классе 'Car' позволяет определить,
 * каким образом объекты этого класса будут сравниваться и идентифицироваться на основе их полей,
 * что позволяет использовать объекты этого класса в списке,
 * где равенство и идентификация объектов определяются на основе их полей.
 * Все конструкторы, геттеры, сеттеры, а также переопределённые методы построены
 * с помощью встроенных инструменов IDEA IntelliJ.
 */
public class Car {
    private String brand;
    private String model;
    private int year;

    public Car() {
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }

    @Override
    public String toString() {
        return "Car{" +
               "brand='" + brand + '\'' +
               ", model='" + model + '\'' +
               ", year=" + year +
               '}';
    }
}
