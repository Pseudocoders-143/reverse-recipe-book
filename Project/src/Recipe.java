import java.util.HashMap;

public class Recipe {
  private String name;
  private HashMap<Ingredient, Integer> ingredients;
  private String instructions;

  public Recipe(String name, HashMap<Ingredient, Integer> ingredients, String instructions) {
    this.name = name;
    this.ingredients = ingredients;
    this.instructions = instructions;
  }

  public String getName() {
    return "";
  }

  public HashMap<Ingredient, Integer> getIngredients() {
    return this.ingredients;
  }

  public String getInstructions() {
    return "";
  }
}
