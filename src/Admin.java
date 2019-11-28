import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin implements Product{
    ProductDetails obj2;
    public void Get_product_details() {
       String ProductName=  obj2.getProductName();
        String category = obj2.getCategory();
      String price =obj2.getPrice();
      String offer=obj2.getoffer();
    }
    
    /**
     *
     * @param ProductName
     * @param category
     * @param price
     * @throws IOException
     */
   
    public void addItems(String ProductName , String category , String price,String offer  ) {
        
        try {
            int counter=0;
            File file1 = new File("Aproducts.txt");
            FileWriter writeer;
             writeer = new FileWriter(file1, true); 
             File file2 = new File("Offers.txt");
             FileWriter writeerr;
              writeerr = new FileWriter(file2, true); 
            System.out.println("Product Name");
            Scanner input1 = new Scanner(System.in);
            ProductName = input1.next();
            System.out.println("Product category");
            Scanner input2 = new Scanner(System.in);
            category = input2.next();
            System.out.println("Product price");
            Scanner input3 = new Scanner(System.in);
            price = input3.next();
            System.out.println("Product offer");
            Scanner input4 = new Scanner(System.in);
            offer = input4.next();
            try {
                writeer.write(ProductName);
            } catch (IOException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                writeer.write("\n");
            } catch (IOException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            writeer.write(category);
            writeer.write("\n");
            writeer.write( price );
            writeer.write("\n");
          
            System.out.println("Product Is Added Successfuly");
            writeer.close();
            writeerr.write("\n");
            writeerr.write( offer );
            
            writeerr.close();
            FileReader read;
            BufferedReader file;
            String line;
            read =new FileReader("Aproducts.txt");    
            file=null;
            file=new BufferedReader(read);
            ArrayList<String>numbers=new ArrayList<>();
            line=file.readLine();
            while(line!=null) {
            	numbers.add(line);
            	line=file.readLine();
            	
            }
            file.close();
            
            System.out.println("Current Products : ");
            
            for(int k=0;k<numbers.size();k=k+3)
            {
            	counter++;
				System.out.println(numbers.get(k));
            	System.out.println("|");
            }            		
            System.out.println("");
            System.out.println("Total Products = "+counter);
            read =new FileReader("Offers.txt");    
            file=null;
            file=new BufferedReader(read);
            ArrayList<String>offers=new ArrayList<>();
            line=file.readLine();
            while(line!=null) {
            	offers.add(line);
            	line=file.readLine();
            	
            }
            file.close();
            
            System.out.println("Current Products offers : ");
            int k=0;

            for(int i=0;i<offers.size();i++)
            {
            	counter++;
				System.out.println("Product "+numbers.get(k)+" has "+offers.get(i));
				k=k+3;
            }            		
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        }
 public boolean verify() throws IOException{
        
   
       String filePath = "Aproducts.txt";
         /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your productName: ");
        String  pname = scanner.nextLine();
        System.out.println("Enter your category : ");
        String  cat  = scanner.nextLine();
        System.out.println("Enter price : ");
        String  price = scanner.nextLine(); */
        
      BufferedReader bufferedReader;
       
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line1;
            String line2;
            String line3;
         
            
            boolean pnameExists = false;
            boolean catExists = false;
            boolean PriceExists=false;
          
           
            
            while((line1 = bufferedReader.readLine()) != null ) {
                 line2= bufferedReader.readLine();
                 line3= bufferedReader.readLine();
                
       
                if (line1.equals(line1) && line2.equals(line2) && line3.equals(line3)) {
                    pnameExists = true;
                    catExists = true;
                    PriceExists=true;
                   
                  
                    break;
                }

            }
           
    
		
	
if (pnameExists && catExists &&PriceExists  ) {
                return true;
                
            } else {
               return false;

    }}
public void addNewBrand(String BrandName , String BrandCategory) {
    	
    	 try {
             System.out.println("Brand Name");
             Scanner input5 = new Scanner(System.in);
             BrandName = input5.next();
             
             System.out.println("Brand category");
             Scanner input6 = new Scanner(System.in);
             BrandCategory = input6.next();
         
             File file3 = new File("AddBrands.txt");
             FileWriter h = new FileWriter(file3, true);
             
             h.write(BrandName);
             h.write("\n");
             h.write(BrandCategory);
             h.write("\n");
           
             System.out.println("Brand Is Added Successfuly");
             h.close();
         } catch (IOException ex) {
             Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
         }
}
} 	