import java.util.*;

class Item
{
    private String name;
    private int id;
    private int price; // cents
    

    public Item(String name, int price)
    {
        this.name = name;
        while (this.name.length() <= 16)
        {
            this.name += " ";
        }

        id = SKUCreator();

        this.price = price;
    }

    public String getName() 
    {
        return name;
    }

    public int getId() 
    {
        return id;
    }

    public int getPrice() 
    {
        return price;
    }

    public double getPriceDollars()
    {
        return price / 100.0;
    }

    public void setName(String str) 
    {
        name = str;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }

    public String getPriceAndSpaces()
    {

        String priceString = Double.toString(getPriceDollars());

        while (priceString.length() <= 15)
        {
            priceString += " ";
        }

        return priceString;
    }

    public static int SKUCreator()
    {
        int startSKU = 0;
        startSKU += 1;
        return startSKU;
    }
}

//test hghghcvgvghvghvghvghvghvgh