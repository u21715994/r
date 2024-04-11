public enum Size {
  petit(2),
  moyen(3),
  grand(4);

  int price;

  Size(int price) {
    this.price = price;
  }

  int getPrice() {
    return price;
  }
}