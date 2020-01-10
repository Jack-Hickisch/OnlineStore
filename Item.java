class Item
{
    private String name;
    private String id;
    private int price; // cents

    public Item(String name, String id, int price)
    {
        this.name = name;
        this.id = id;
        this.price = price;
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

    public int getPriceDollars()
    {
        return price / 100.0;
    }

    public void setName(String str) 
    {
        name = str;
    }

    public void setId(String id) 
    {
        id = str;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }
}