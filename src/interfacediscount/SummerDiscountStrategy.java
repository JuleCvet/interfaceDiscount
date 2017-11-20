package interfacediscount;

public class SummerDiscountStrategy implements DiscountStrategy{

    @Override
    public long priceByDiscount(Clothing clothing) {
        long newPrice = clothing.getBasePrice();
       
        if(clothing.getSeason().equals(Season.SPRING)){
                newPrice = (long)(newPrice * 0.6);//plakame 60% od starata cena 0.6*100= 60%
        }else if
         (clothing.getSeason().equals(Season.SUMMER)){
         newPrice = (long)(newPrice * 0.5);//0.5 *100 = 50%
        }else if
         (clothing.getSeason().equals(Season.WINTER)){
                newPrice = (long)(newPrice * 0.7);  
        }
          return newPrice;
       }       
 }

