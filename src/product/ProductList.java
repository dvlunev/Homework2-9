package product;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ProductList {

    private final Set<Product> productsList = new HashSet<>();

    public Set<Product> getProductsList() {
        return productsList;
    }

//    public void addProduct(Product product) {
//        if (productsList.contains(product)) {
//            throw new IllegalArgumentException("Товар уже есть в списке продуктов");
//        }
//        if (product.getPrice() == 0 || product.getWeight() == 0) {
//            throw new IllegalArgumentException("Заполните карточку товара полностью");
//        }
//        productsList.add(product);
//    }

    public void checkProduct(String name) {
        int i = 0;
        for (Product product : productsList) {
            if (product.getName().equals(name)) {
                System.out.println("Продукт " + name + " куплен");
                i++;
                break;
            } /*else {
                System.out.println("Продукт " + name + " не куплен");
                break;
            }*/
// В разборе было так, но это неверно, так как на первом же объекте цикл прервется и выдаст что не куплен,
// как вывести сообщение если не куплен, не могу догадаться, точнее смог, но мне кажется я по топорному сделал!?
        }
        if (i == 0) {
            System.out.println("Продукт " + name + " не куплен");
        }
    }

    public void removeProduct(Product product) {
        if (productsList.contains(product)) {
            System.out.println("Товар " + product.getName() + " удален из списка");
            productsList.remove(product);
        } else {
            System.out.println("Товара " + product.getName() + " не было в списке");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductList that = (ProductList) o;
        return Objects.equals(productsList, that.productsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsList);
    }
}
