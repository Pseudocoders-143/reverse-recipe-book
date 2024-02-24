/** Represents a single ingredient. */
public class Ingredient {
  private String name;

  /* TODO: add boolean fields for dietary restrictions */

  public Ingredient(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
