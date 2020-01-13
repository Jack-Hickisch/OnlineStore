class Item
{
    private String name;
    private String id;
    private int price; // cents

    public Item(String name, String id, int price)
    {
        this.name = name;
        while (this.name.length() <= 16)
        {
            this.name += " ";
        }

        this.id = id;

        this.price = price;
        // while (getPriceLength() <= 16)
        // {
        //     this.price += " ";
        // }  Fix this
    }

    public String getName() 
    {
        return name;
    }

    public String getId() 
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

    public void setId(String id) 
    {
        this.id = id;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }

    // public int getPriceLength() Fix this
    // {
    //     String priceString = (String)price;
    //     return priceString.length();
    // }
}