
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class User {
     
               
                public String Username ;
                public String password;
                public String Login_stat;
                public String Fname;
                public String email;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin_stat() {
        return Login_stat;
    }

    public void setLogin_stat(String Login_stat) {
        this.Login_stat = Login_stat;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
                
   public  void RegisterSO(String Username,String password,String Login_stat,String Fname,String email) throws IOException {
       int Count=0;
       BufferedReader bufferedReader;
       bufferedReader = new BufferedReader(new FileReader("storeownernumbers.txt"));
       String line1;
       line1 = bufferedReader.readLine();
       Count= Integer.parseInt(line1);
   
               File file1 = new File("users.txt");
		FileWriter writeer = new FileWriter(file1, true);
    
               System.out.println("Enter Fname : ");
                Scanner input4 = new Scanner(System.in);
		String name = input4.next();
                
  
           System.out.println("Username : ");
	    Scanner input1 = new Scanner(System.in);
	    Username = input1.next();
            
            System.out.println("Password : ");
	    Scanner input2 = new Scanner(System.in);
	   password = input2.next();
           
           System.out.println("Login ststus : ");
	    Scanner input3 = new Scanner(System.in);
	   Login_stat = input3.next();
           
                
		System.out.println("Enter email : ");
		Scanner input8 = new Scanner(System.in);
                   email = input8.next();
      
		
		writeer.write(Username);
		writeer.write("\n");
		writeer.write(password);
		writeer.write("\n");
        writeer.write(Login_stat);
		writeer.write("\n");
		writeer.write(email);
		writeer.write("\n");        
		System.out.println("your account is created ");
		writeer.close();
        
		Count++;
		String s=Integer.toString(Count);
	    File file2 = new File("storeownernumbers.txt");
	    writeer = new FileWriter(file2);
		writeer.write(s);
		writeer.close();
		}
    
   public  void RegisterCust(String Username,String password,String Login_stat,String Fname,String email) throws IOException {
	   int Counter=0;
       BufferedReader bufferedReader;
       bufferedReader = new BufferedReader(new FileReader("Customersnumbers.txt"));
       String line3;
       line3 = bufferedReader.readLine();
       Counter= Integer.parseInt(line3);
       
       File file1 = new File("Customer.txt");
FileWriter writeer = new FileWriter(file1, true);

       System.out.println("Enter Fname : ");
        Scanner input4 = new Scanner(System.in);
String name = input4.next();
        

   System.out.println("Username : ");
Scanner input1 = new Scanner(System.in);
Username = input1.next();
    
    System.out.println("Password : ");
Scanner input2 = new Scanner(System.in);
password = input2.next();
   
   System.out.println("Login ststus : ");
Scanner input3 = new Scanner(System.in);
Login_stat = input3.next();
   
        
System.out.println("Enter email : ");
Scanner input8 = new Scanner(System.in);
           email = input8.next();
        


writeer.write(Username);
writeer.write("\n");
writeer.write(password);
writeer.write("\n");
writeer.write(Login_stat);
writeer.write("\n");
writeer.write(email);
writeer.write("\n");        
System.out.println("your account is created ");
writeer.close();
Counter++;
String x=Integer.toString(Counter);
File file2 = new File("Customersnumbers.txt");
writeer = new FileWriter(file2);
writeer.write(x);
writeer.close();

   }

   
    public void login_verify ( String Username , String password , String Login_stat) throws FileNotFoundException {
        
 
String filePath = "users.txt";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String  username = scanner.nextLine();
        System.out.println("Enter your password : ");
        String  pass  = scanner.nextLine();
        System.out.println("Enter your login status : ");
        String  ls = scanner.nextLine();
        
        
        System.out.println("Checking to see if username exists & matches password");
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line1;
            String line2;
            String line3;
            
            boolean usernameExists = false;
            boolean passExists = false;
            boolean lsexists=false;
            
            while((line1 = bufferedReader.readLine()) != null ) {
                 line2= bufferedReader.readLine();
                 line3 =bufferedReader.readLine();
                if (line1.equals(username) && line2.equals(pass)) {
                    usernameExists = true;
                    passExists = true;
                    lsexists=true;
                    break;
                }
            }
            if (usernameExists && passExists && lsexists) {
                System.out.println("Welcome.");
                
            } else {
                System.out.println("Unable to login");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }}


