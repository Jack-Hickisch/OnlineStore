class Customer
{
    private String name;
    private String email;
    private Order order;

    public Customer(String name, String email)
    {
        this.name = name;
        this.email = email;
    }
    public Customer(String name, String email, Order order)
    {
        this.name = name;
        this.email = email;
        this.order = order;
    }

    public String getName() 
    {
        return name;
    }

    public String getEmail() 
    {
        return email;
    }

    public Order getOrder() 
    {
        return order;
    }

    public void setName(String str) 
    {
        name = str;
    }

    public void setEmail(String str) 
    {
        email = str;
    }

    public void setOrder(Order ord) 
    {
        order = ord;
    }
} 