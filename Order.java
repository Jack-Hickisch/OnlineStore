import java.util.*;

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
            total += item.getPriceDollars();
        }

        total *= TAX;
        return total; // convet to $ and add sales tax
    }

    public void createTable()
    {
        System.out.println("name = " + customer.getName() + "  email = " + customer.getEmail());
        System.out.println("item names: \t price: \t id:");

        for (Item item : items)
        {
            System.out.println(item.getName() + "" + item.getPriceAndSpaces() + "" + item.getId());
        }

        double priceBeforeTax = getTotalPrice() / TAX;
        double taxInChart = Math.round((total - (total / TAX) ) * 100.0) / 100.0;
         
        System.out.println("price before tax: " + priceBeforeTax);
        System.out.println("tax: " + taxInChart);
        System.out.println("price after tax: " + (taxInChart + priceBeforeTax));
    }
}