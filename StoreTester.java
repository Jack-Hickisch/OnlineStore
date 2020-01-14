class StoreTester
{
    public static void main(String[] args)
    {
        Item[] items = new Item[10]; 

        items[0] = new Item("thing", 1000);
        items[1] = new Item("other thing", 1);
        items[2] = new Item("A", 300);
        items[3] = new Item("cheeseburger", 4059829);
        items[4] = new Item("computer", 2);
        items[5] = new Item("bin", 31415);
        items[6] = new Item("burrito", 5);
        items[7] = new Item("zipper", 88);
        items[8] = new Item("flag", 0);
        items[9] = new Item("g", 9);

        Customer bob = new Customer("bob", "bob@gmail.com");

        Order order0 = new Order(bob, items);

        bob.setOrder(order0);

        order0.createTable();
    }
}