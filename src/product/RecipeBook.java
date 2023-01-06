package product;

import java.util.HashSet;
import java.util.Set;

public class RecipeBook {

    private final Set<Recipe> recipeBook = new HashSet<>();

    public void addRecipeToBook(Recipe recipe) {
        if (recipeBook.contains(recipe)) {
            throw new IllegalArgumentException("Рецепт " + recipe.getName() + " уже есть в книге рецептов");
        }
        recipeBook.add(recipe);
    }

    public void printRecipeBook() {
        System.out.println("Книга рецептов:");
        for (Recipe recipe : recipeBook) {
            recipe.printRecipe();
            System.out.println();
        }
    }

//    @Override
//    public String toString() {
//        return "Книга рецептов: \n" + recipeBook;
//    }
}
