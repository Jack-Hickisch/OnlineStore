class Order
{
    Customer customer;
    Item[] items = new Item[10];
    private double total = 0.0;
    final double TAX = 1.08;

    public Order(Customer customer, Item[] items)
    {
        this.customer = customer;
        this.items = items;
    }

    public double getTotalPrice()
    {
        for (Item item : items)
        {
            total += item.getPrice();
        }

        return (total / 100.0) * TAX; // convet to $ and add sales tax
    }

    public void createTable()
    {
        System.out.println("name = " + customer.getName() + "email = " + customer.getEmail());
        System.out.println("item names: \t price: \t id: \t");

        for (Item item : items)
        {
            System.out.println(item.getName() + "\t" + item.getPrice() + "\t" + item.getId());
        }
         
        System.out.println("price before tax: " + getTotalPrice() / TAX);
        System.out.println("tax: " + (getTotalPrice()) - (getTotalPrice() / TAX));
        System.out.println("price after tax" + getTotalPrice());
    }
}