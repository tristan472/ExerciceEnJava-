public class Main {

    public static void main(String[] args){
        Item item1 = new Item("corn flakes", 501, 1000);
        Item item2 = new Item("caviar", 50000, 500);
        Item item3 = new Item("water", 500, 500.0);
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        // cart.addItem(item3);     // lève java.lang.IllegalStateException
        cart.removeItem(new Item("eau", 500, 5000));
        // cart.addItem(item3);     // lève java.lang.IllegalStateException
        cart.removeItem(new Item("water", 500, 5000));
        cart.addItem(item3);        // ajout possible!
    }
}



