public class Meal {
  Type type;
  String name;
  String beverage;
  Size size;
  String dessert;
  DessertType dessertType;
  Boolean withCoffee;
  int price;

  public Meal(Type type, String name, String beverage, Size size, String dessert, DessertType dessertType,
      Boolean withCoffee) {
    this.name = name;
    this.type = type;
    this.beverage = beverage;
    this.size = size;
    this.dessert = dessert;
    this.dessertType = dessertType;
    this.withCoffee = withCoffee;
    this.price = this.type.getPrice() + this.size.getPrice();
    this.setPrice();
  }

  public void setPrice() {
    if (size == Size.petit) {
      calculPriceWithSmallSize();
    } else if (size == Size.moyen) {
      calculPriceWithMediumSize();
    } else {
      calculPriceWithBigSize();
    }
    calculPriceCoffee();
  }

  public void calculPriceWithSmallSize() {
    if (dessertType == DessertType.normal) {
      this.price += 2;
    } else {
      this.price += 4;
    }
  }

  public void calculPriceWithMediumSize() {
    if (dessertType == DessertType.normal) {
      System.out.print("Prix Formule Standard appliquée ");
    } else {
      this.price += 4;
    }
  }

  public void calculPriceWithBigSize() {
    this.price += 2;
    System.out.print("Prix Formule Max appliquée ");
  }

  public void calculPriceCoffee() {
    if (!withCoffee) {
      this.price += 1;
    } else if (type == Type.assiette && size == Size.moyen && dessertType == DessertType.normal && withCoffee) {
      System.out.print(" avec café offert!");
    }
  }
}