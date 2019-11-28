
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.time.Clock.system;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StoreOwner extends User implements Product{

    ProductDetails obj3;
    
   

    @Override
    public void Get_product_details() {
        String Category=obj3.getCategory();
        String ProductName=obj3.getProductName();
        String BrandName=obj3.getBrandName();
        String Location=obj3.getLocation();
        String Price=obj3.getPrice();
        String Type=obj3.getType();
        String BrandCategory=obj3.getBrandCategory();
        String StoreName=obj3.getStoreName();
      
    }

    @Override
    public void addItems(String ProductName, String category, String price,String offer) {
          
    
   
         
            try {
           
            System.out.println("Product Name");
            Scanner input1 = new Scanner(System.in);
            ProductName = input1.next();
            System.out.println("Product category");
            Scanner input2 = new Scanner(System.in);
            category = input2.next();
            System.out.println("Product price");
            Scanner input3 = new Scanner(System.in);
            price = input3.next();
            Admin admin2 = new Admin();
            if (admin2.verify()==true){
                
             File file1 = new File("Sproducts.txt");
            FileWriter writeer = new FileWriter(file1, true);
            writeer.write(ProductName);
            writeer.write("\n");
            writeer.write(category);
            writeer.write("\n");
            writeer.write( price );
            writeer.write("\n");
            System.out.println("Product Is Added Successfuly");
            writeer.close();
            }
            else
                
            {
            System.out.println("product didn't get verified yet");
            }
            } catch (IOException ex) {
            Logger.getLogger(StoreOwner.class.getName()).log(Level.SEVERE, null, ex);
            }}

 
 
 public  void addNewStore(String StoreName,String Location,String Type) throws IOException {
       
       File file2 = new File("AddStores.txt");
	FileWriter writeer = new FileWriter(file2, true);

   System.out.println("Storename : ");
Scanner input5 = new Scanner(System.in);
StoreName = input5.next();
    
    System.out.println("Location : ");
Scanner input6 = new Scanner(System.in);
Location = input6.next();
   
   System.out.println("Type : ");
Scanner input7 = new Scanner(System.in);
Type = input7.next();
   
	writeer.write(StoreName);
	writeer.write("\n");
	writeer.write(Location);
	writeer.write("\n");
        writeer.write(Type);
	writeer.write("\n");       
	System.out.println("your Store is created ");
	writeer.close();
        
	}
 
    	}