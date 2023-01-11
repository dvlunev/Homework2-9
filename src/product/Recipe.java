package product;

import java.util.*;

public class Recipe {

    private final Map<Product, Double> recipe = new HashMap<>();
    private double sumPrice;
    private final String name;
    private static int number = 1;

    public Recipe(String name) {
        if (StringUtils.isNullOrEmptyOrBlank(name)) {
            name = "Рецепт " + number;
            number++;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addProductToRecipe(Product product, double weight) {
//        if (recipe.contains(product)) {
//                throw new IllegalArgumentException("Рецепт " + name + " уже содержит продукт " + product.getName());
//            }
//        if (product.getPrice() == 0 || product.getWeight() == 0) {
//            throw new IllegalArgumentException("Заполните карточку продукта " + product.getName() + " полностью");
//        }
        if (weight <= 0) {
            weight = 1.00;
        }
        recipe.put(product, weight);
        calcSumPrice();
    }

    public void addProductToRecipe(Product product) {
        recipe.put(product, 1.00);
        calcSumPrice();
    }

    public double getSumPrice() {
        return sumPrice;
    }

    public void calcSumPrice() {
        double sumPrice = 0;
        for (Map.Entry<Product, Double> product : recipe.entrySet()) {
            sumPrice = sumPrice + product.getKey().getPrice() * product.getValue();
        }
        this.sumPrice = sumPrice;
    }

    public void printRecipe() {
        System.out.println("Рецепт: " + name);
        for (Map.Entry<Product, Double> product : recipe.entrySet()) {
            System.out.println("Ингридиенты: " + product.getKey() + " необходимое количество " + product.getValue());
        }
        System.out.println("Суммарная стоимость: " + String.format("%.2f",sumPrice) + " руб.");
    }

//    @Override
//    public String toString() {
//        return "\nРецепт: " + name +
//                "\nИнгридиенты: " + recipe +
//                "\nСуммарная стоимость: " + String.format("%.2f",sumPrice) + " руб.";
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
