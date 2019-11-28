import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Customer extends User  {
public void BuyProduct(String ProductName,String amount ,String Shippingaddresse) throws IOException {
	FileReader read1=new FileReader("Aproducts.txt");
	BufferedReader file1=null;
	file1=new BufferedReader(read1);
	String line1 =file1.readLine();
	ArrayList<String>BuyProducts=new ArrayList<>();
	while(line1 !=null)
	{
		BuyProducts.add(line1);
		line1=file1.readLine();
	}
	file1.close();
	FileReader read =new FileReader("Amounts.txt");
	BufferedReader file=null;
	file = new BufferedReader (read);
	String line =file.readLine();
	ArrayList<String>AmountFile= new ArrayList<>();
	while(line !=null) {
		AmountFile.add(line);
		line = file.readLine();
		
	}
	file.close();
	int j=0;
	for(int i=0;i<BuyProducts.size();i=i+3) {
		if(ProductName.equals(BuyProducts.get(i))&&Integer.parseInt(amount)<=Integer.parseInt(AmountFile.get(j))) {
			FileWriter fw=new FileWriter("BuyProducts.txt",true);
			BufferedWriter fwrite= new BufferedWriter(fw);
			fwrite.newLine();
			fwrite.write(ProductName);
			fwrite.newLine();
			fwrite.write(amount);
			fwrite.newLine();
			fwrite.write(Shippingaddresse);
			fwrite.close();
			int NewAmount=Integer.parseInt(AmountFile.get(i))-Integer.parseInt(amount);
		String Amount =Integer.toString(NewAmount);
		AmountFile.set(i, Amount);
		fw=new FileWriter("Amounts");
		fwrite=new BufferedWriter(fw);
		for(int k=0;k<AmountFile.size();k++) {
			fwrite.write(AmountFile.get(k));
			fwrite.newLine();
		}
		fwrite.close();
		System.out.println("Receipt is ");
		System.out.println("Product Name is : "+ProductName+" Amount is : "+Amount+" The Shipping Addresse is : "+Shippingaddresse);
		System.exit(1);
		}
		else {System.out.println("Not found");}
		j++;
		
	}
}
	
public void viewproduct () throws FileNotFoundException, IOException
{
    File file = new File("Aproducts.txt"); 
  
  BufferedReader br = new BufferedReader(new FileReader(file)); 
  
  String st; 
  while ((st = br.readLine()) != null) 
    System.out.println(st); 
    }
  public void viewStore() throws FileNotFoundException, IOException{
       File file = new File("Sproducts.txt"); 
  
  BufferedReader br = new BufferedReader(new FileReader(file)); 
   String st; 
  while ((st = br.readLine()) != null) 
    System.out.println(st); 
    }
}