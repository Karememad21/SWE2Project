
import java.util.TimerTask;
import java.util.Random;

public class ProductDetails extends TimerTask  {
		public String ProductName;
		public String Category;
		public String BrandName;
		public String Location;
		public String Price;
		public String offer;
		public String Type;
		public String  Amount;
		public String Shippingaddresse;
                public String BrandCategory;
                public String StoreName;
                
               

    public String getProductName() {
        return ProductName;
    }
    public String getStoreName() {
        return StoreName;
    }
     public String getBrandCategory() {
        return BrandCategory;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public String getLocation() {
        return Location;
    }
    public String getoffer() {
        return offer;
    }

    public void setoffer(String offer) {
        this.offer = offer;
    }
    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }
    public String getShippingAddresse() {
        return Shippingaddresse;
    }

    public void setShippingAddresse(String ShippingAddresse) {
        this.Shippingaddresse = ShippingAddresse;
    }
    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    
 

    @Override
    public void run() {
      Random rand = new Random(); 
  
      
        int rand_int1 = rand.nextInt(10); 
        int rand_int2 = rand.nextInt(14);
         int rand_int3 = rand.nextInt(12);
         int rand_int4=rand.nextInt(17);
        System.out.println("The most ordered products : \n" +rand_int1); 
        System.out.println("The most ordered brands : "+rand_int2); 
         System.out.println("Number of user buy products in stores : "+rand_int3);
        System.out.println("Number of users explore his products : "+rand_int4);

    }
}