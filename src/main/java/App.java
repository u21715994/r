public class App {
  public int Compute(String type, String name, String beverage, String size, String dessert, String dsize,
      String coffee) {
    return new Meal(Type.valueOf(type), name, beverage, Size.valueOf(size), dessert, DessertType.valueOf(dsize),
        coffee.equals("yes")).price;
  }
}