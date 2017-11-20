
package interfacediscount;

import java.util.ArrayList;

public class Main {
      
    public static void main(String[] args) {
       
    Clothing jacket = new Jacket("Jacket", Season.SPRING, 1000); 
    jacket.setDiscountStrategy(new SummerDiscountStrategy());
    System.out.println("Jacket has summer discount: " + jacket.getPrice());
    System.out.println("Jacket has base price: " +jacket.getBasePrice());
      
    Jacket jacket1 = new Jacket("Linen coat", Season.FALL, 3900);//nov objekt
    jacket1.setDiscountStrategy(new WinterDiscountStrategy());//mu setirame zimski popust so kreiranje
    //na nov objekt od winterStrategy klasata za da go presmetame zimskiot popust
    System.out.println("Jacket has winter discount: " + jacket1.getPrice());
        
    Socks socks3 = new Socks("Linen Socks", Season.WINTER, 500);//nov objekt
    System.out.println("Socks3 has base price: " + socks3.getBasePrice());
    socks3.setDiscountStrategy(new BlackFridayDiscountStrategy());
    System.out.println("Socks3 has Black Friday Discount price: " + socks3.getPrice() );
    
    Shirt Shirt1 = new Shirt("Linen Shirt", Season.SUMMER, 1700);   
        
//  Jacket LinenCoat4 = new Jacket("Linen coat", Season.FALL, 3900);  
//  Jacket LinenCoat2 = new Jacket("Linen coat", Season.SUMMER, 3600);   
//  Pants  pants1= new Pants("Linen Pants", Season.SPRING, 1200);
//  Pants pants2 = new Pants("Linen Pants", Season.WINTER, 1500);
//  Socks socks1 = new Socks("Linen Socks", Season.FALL, 700);
//  Shirt Shirt2 = new Shirt("Linen Shirt", Season.FALL, 1200);
//  Shirt Shirt3 = new Shirt("Linen Shirt", Season.SPRING, 1100);

    }
}
