public class Item {
    private String name;
    private String price;
    private int weight;

    public Item(String pName) {
        name = pName;
    }

    public Item(String pPrice) {
        price = pPrice;
        String.format("%d.%02d", this.price / 100, this.price % 100)
    }

    public Item(String pWeight)
        weight = pWeight;
}


