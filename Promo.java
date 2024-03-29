
public class Promo
{
    // instance variables - replace the example below with your own
    private int id;
    private String code;
    private int discount;
    private int minPrice;
    private boolean active;

    /**
     * Constructor for objects of class Promo
     */
    public Promo(int id, String code, int discount, int minPrice, boolean active)
    {
        this.id = id;
        this.code = code;
        this.discount = discount;
        this.minPrice = minPrice;
        this.active = active;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getCode()
    {
        return code;
    }
    
    public int getDiscount()
    {
        return discount;
    }
    
    public int getMinPrice()
    {
        return minPrice;
    }
    
    public boolean getActive()
    {
        return active;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setCode(String code)
    {
        this.code = code;
    }
    
    public void setDiscount(int discount)
    {
        this.discount = discount;
    }
    
    public void setMinPrice(int minPrice)
    {
        this.minPrice = minPrice;
    }
    
    public void setActive(boolean active)
    {
        this.active = active;
    }
    
    public void printData()
    {
      System.out.println(id);
      System.out.println(code);
      System.out.println(discount);
      System.out.println(minPrice);
      System.out.println(active);
    }
    
    public String toString()
    {
        return "==========PROMO==========\nId: "+id+"\nCode: "+code+"\nDiscount: "+discount+"\nMinPrice: "+minPrice+"\nActive Status: "+active;
        
    }
    
    
}
