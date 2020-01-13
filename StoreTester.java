class StoreTester
{
    public static void main(String[] args)
    {
        Item[] items = new Item[10]; 

        items[0] = new Item("thing", "00", 1000);
        items[1] = new Item("other thing", "01", 1);
        items[2] = new Item("A", "02", 300);
        items[3] = new Item("cheeseburger", "03", 4059829);
        items[4] = new Item("computer", "04", 2);
        items[5] = new Item("bin", "05", 31415);
        items[6] = new Item("burrito", "06", 5);
        items[7] = new Item("zipper", "07", 88);
        items[8] = new Item("flag", "08", 0);
        items[9] = new Item("ui", "09", 9);

        Customer bob = new Customer("bob", "bob@gmail.com");

        Order order0 = new Order(bob, items);

        bob.setOrder(order0);

        order0.createTable();
    }
}