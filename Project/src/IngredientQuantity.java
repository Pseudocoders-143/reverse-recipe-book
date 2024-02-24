/**
 * This class represents a quantity of an ingredient for a specific recipe, including the unit and
 * the amount in that unit.
 */
public class IngredientQuantity {
  private String unit;
  private int quantity;

  /**
   * Constructs a new IngredientQuantity with the specified unit and quantity.
   *
   * @param unit The unit of the ingredient, such as "cups" or "grams".
   * @param quantity The quantity of the ingredient in the specified unit.
   */
  public IngredientQuantity(String unit, int quantity) {
    this.unit = unit;
    this.quantity = quantity;
  }

  /**
   * Returns the unit of this IngredientQuantity.
   *
   * @return The unit of this IngredientQuantity.
   */
  public String getUnit() {
    return unit;
  }

  /**
   * Sets the unit of this IngredientQuantity.
   *
   * @param unit The new unit of this IngredientQuantity.
   */
  public void setUnit(String unit) {
    this.unit = unit;
  }

  /**
   * Returns the quantity of this IngredientQuantity.
   *
   * @return The quantity of this IngredientQuantity.
   */
  public int getQuantity() {
    return quantity;
  }

  /**
   * Sets the quantity of this IngredientQuantity.
   *
   * @param quantity The new quantity of this IngredientQuantity.
   */
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
