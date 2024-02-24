import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * The collection of Recipe objects.
 *
 * <p>Generates a collection of recipe objects from the text file/database of recipes.
 */
public class RecipeBook {

  /* Map<Recipe name, Recipe object> */
  private Map<String, Recipe> recipes; // All recipes.

  /*
   * Constructs the RecipeBook.
   */
  public RecipeBook() {}

  /*
   * Adds a recipe to the RecipeBook and saves the recipe to the recipe database.
   */
  public static void addRecipe(Recipe recipe) {}

  /*
   * Deletes a recipe from the RecipeBook and removes the recipe from the recipe database.
   */
  public static void deleteRecipe() {}

  /*
   * Edits a recipe in the RecipeBook and updates the recipe in the recipe database.
   */
  public static void editRecipe() {}

  /*
   * Returns a list of all matching recipes based on the specified ingredients.
   */
  public List<Recipe> suggestRecipes(List<String> availableIngredients) {
    List<Recipe> suggestedRecipes = new ArrayList<>();

    for (Recipe recipe : this.recipes) {
      boolean allIngredientsAvailable = true;

      for (String ingredient : recipe.getIngredients()) {
        if (!availableIngredients.contains(ingredient)) {
          allIngredientsAvailable = false;
          break;
        }
      }

      if (allIngredientsAvailable) {
        suggestedRecipes.add(recipe);
      }
    }

    return suggestedRecipes;
  }

  /*
   * Displays a recipe.
   */
  public static void displayRecipe() {}

  /*
   * Searches for a recipe.
   */
  public static void searchRecipe() {}
}
