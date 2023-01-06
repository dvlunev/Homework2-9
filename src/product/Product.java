package product;

import java.util.Objects;
import java.util.regex.Pattern;

public class Product {

    private String name;
    private double price;
    //private double weight;

    public Product(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (StringUtils.isNullOrEmptyOrBlank(name)) {
            throw new IllegalArgumentException("Укажите наименование товара");
        }
        if (!Pattern.matches("[а-яА-Я ]*$", name)) {
            throw new IllegalArgumentException("Наименование товара должно быть на русском языке");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            price = 100.00;
        }
        this.price = price;
    }

//    public double getWeight() {
//        return weight;
//    }
//
//    public void setWeight(double weight) {
//        if (weight <= 0) {
//            weight = 1.00;
//        }
//        this.weight = weight;
//    }

    @Override
    public String toString() {
        return name +
                ", цена " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
