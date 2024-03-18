import java.util.List;
import java.util.Map;

/**
 * Constructs a recipe object with a name, description, ingredients, and instructions. The
 * ingredients are stored in a HashMap with the ingredient as the key and the amount as the value.
 */
public class Recipe {
  private String name; // The name of this recipe.

  /*
   * TODO: data structure to hold each IngredientQuantity for this recipe CSV
   *
   * [https://www.reddit.com/r/javahelp/comments/z2pow0/newbie_looking_for_help_with_csv_database/](Reddit example)
   * [https://www.guru99.com/buffered-reader-in-java.html](Using java to read CSV and split each line)
   * [https://acho.io/blogs/how-to-build-a-database-with-csv-files](SQL example of formatting a CSV like a database)
   */

  // The ingredient for this specific recipe.
  private Map<Ingredient, IngredientQuantity> ingredients;
  private List<String> instructions; // The instructions as an ordered list.
  private String description; // A short blurb describing this recipe.

  /*
   * Constructs a recipe from the given inputs.
   */
  public Recipe(
      final String name,
      final Map<Ingredient, IngredientQuantity> ingredients,
      final List<String> instructions) {
    /* TODO: add logic to scan CSV and load this recipe into fields */
    this.name = name;
    this.ingredients = ingredients;
    this.instructions = instructions;
  }

  /*
   * Returns the recipe name.
   */
  public String getName() {
    return this.name;
  }

  /*
   * Returns a Hashmap of the ingredients, quantities, and units.
   *
   * HashMap<Ingredient name, the units and measurement of this ingredient ArrayList to store [quantity, units]>
   */
  public Map<Ingredient, IngredientQuantity> getIngredients() {
    return this.ingredients;
  }

  /*
   * Returns the recipe instructions.
   */
  public List<String> getInstructions() {
    /* TODO: return order list of instructions */
    return this.instructions;
  }
}
