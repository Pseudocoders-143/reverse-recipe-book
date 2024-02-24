import java.util.List;
import java.util.Map;

public class RecipeManager {
  private RecipeBook recipeBook;

  public RecipeManager(RecipeBook recipeBook) {
    this.recipeBook = recipeBook;
  }

  public void suggestAndDisplayRecipes(Map<String, IngredientQuantity> availableIngredients) {
    // Get the suggested recipes
    List<Recipe> suggestedRecipes = recipeBook.suggestRecipes(availableIngredients);

    // Display the suggested recipes
    displaySuggestedRecipes(suggestedRecipes);
  }

  private void displaySuggestedRecipes(List<Recipe> suggestedRecipes) {

    // TODO: replace console prompts with
    System.out.println("Suggested Recipes:");
    for (Recipe recipe : suggestedRecipes) {
      System.out.println(recipe.getName());
    }
  }
}
