public enum Type {
  assiette(15),
  sandwich(10);

  int price;

  Type(int price) {
    this.price = price;
  }

  int getPrice() {
    return price;
  }
}