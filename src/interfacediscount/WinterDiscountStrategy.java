package interfacediscount;

public class WinterDiscountStrategy implements DiscountStrategy {

    @Override
    public long priceByDiscount(Clothing clothing) {
        long newPrice = clothing.getBasePrice();

        if (clothing.getSeason().equals(Season.FALL)) {
            newPrice = (long)(newPrice * 0.6) ;
        }

        if (clothing.getSeason().equals(Season.WINTER)) {
            newPrice = (long)(newPrice * 0.50);
        }

        if (clothing.getSeason().equals(Season.SUMMER)) {
            newPrice = (long)(newPrice * 0.75);
        }

        if (clothing instanceof Jacket) {
            newPrice = (long)(newPrice * 0.90);
        }
    return newPrice ;
    }
}
