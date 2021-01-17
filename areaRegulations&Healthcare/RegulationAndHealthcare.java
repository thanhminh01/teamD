package function_app;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RegulationAndHealthcare {

	public static void main(String[] args) throws IOException {
		System.out.println("Local area regulations and healthcare advice");
	    System.out.print("Please choose 1.Local area regulations or 2.healthcare advice :");
	    Boolean flag = true;
		
	    while (flag) {
	      	Scanner input = new Scanner(System.in);
	      	String info = input.next();
	      	if (info.equals("1")) {
	      	  System.out.println("Local area regulations");
	      	  String filePath = "D:/Frankfurt.txt";
	          FileInputStream fin = new FileInputStream(filePath);
	          InputStreamReader reader = new InputStreamReader(fin);
	          BufferedReader buffReader = new BufferedReader(reader);
	          String strTmp = "";
	          while((strTmp = buffReader.readLine())!=null){
	              System.out.println(strTmp);
	          }
	          buffReader.close();		
	      	  flag = false;
	      	}else if (info.equals("2")) {
	      		System.out.println("Healthcare advice");
	      		String filePath = "D:/Healthcare advice.txt";
		        FileInputStream fin = new FileInputStream(filePath);
		        InputStreamReader reader = new InputStreamReader(fin);
		        BufferedReader buffReader = new BufferedReader(reader);
		        String strTmp = "";
		        while((strTmp = buffReader.readLine())!=null){
		           System.out.println(strTmp);
		        }
		          buffReader.close();			
	    			flag = false;
	      	    	} else {
	      	    		System.out.println("Please input again");
	      	    	}
	      	}

	}

}
