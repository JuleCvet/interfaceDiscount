package interfacediscount;

public abstract class Clothing {

    private String name;
    private Season season;
    private long basePrice;
    private long newPrice;

    public Clothing(String name, Season season, long basePrice) {
        this.name = name;
        this.season = season;
        this.basePrice = basePrice;
    }

    public long getPrice() {
        
        if (newPrice != 0) {
            return newPrice;
        } else {
            return basePrice;
        }
    }
  
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        newPrice = discountStrategy.priceByDiscount(this);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public long getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(long basePrice) {
        this.basePrice = basePrice;
    }
}
