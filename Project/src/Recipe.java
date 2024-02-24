import java.util.ArrayList;
import java.util.HashMap;

/**
 * Constructs a recipe object with a name, description, ingredients, and instructions. The
 * ingredients are stored in a HashMap with the ingredient as the key and the amount as the value.
 */
public class Recipe {
  private String name;
  /* Hashmap<Ingredient name, the quantity> */
  private ArrayList<IngredientQuantity> ingredients;
  private ArrayList<String> instructions; // Preformatted instructions.
  private String description;

  /*
   * Constructs a recipe from the given inputs.
   */
  public Recipe(String name, HashMap<Ingredient, Integer> ingredients, String instructions) {
    this.name = name;
    this.ingredients = ingredients;
    this.instructions = instructions;
  }

  /*
   * Returns the recipe name.
   */
  public String getName() {
    return "";
  }

  /*
   * Returns a Hashmap of the ingredients, quantities, and units.
   *
   * HashMap<Ingredient, ArrayList to store [quantity, units]>
   */
  public HashMap<String, IngredientQuantity> getIngredients() {
    return this.ingredients;
  }

  /*
   * Returns the recipe instructions.
   */
  public String getInstructions() {
    return "";
  }
}
