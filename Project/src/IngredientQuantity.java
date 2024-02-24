/** Represents a single ingredient. */
public class IngredientQuantity {
  private String name;
  private String unit;
  private int quantity;

  /* TODO: add boolean fields for dietary restrictions */

  /*
   * Constructs IngredientQuantity object.
   */
  public IngredientQuantity(String unit, int quantity) {
    this.unit = unit;
    this.quantity = quantity;
  }

  /*
   * Returns the unit.
   */
  public String getUnit() {
    return unit;
  }

  /*
   * Sets the unit.
   */
  public void setUnit(String unit) {
    this.unit = unit;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getName() {
    return this.name;
  }
}
