	/**
	 * Program as an answer to OOPS assissment
	 * Allow user to select from a pre defined list & how to sort filenames in ascending or descending order
	 * All Rights Reserved
	 * Version 1.0
	 * 10/21/2012
	 * Done by Hamed Al Eidy
	 */

import java.util.Scanner;
import java.io.File;  
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assis {
    public static void main(String[] args) {
    	master();
        String[] arr = {"1. Sort the files names in ascenting order.",
						"2. Manipulate files",
						"3. Close the Application"};
        Scanner input = new Scanner(System.in);
        System.out.println("Type the service you want to do: ");
        int n = input.nextInt();
        	if (n > arr.length || n < arr.length - arr.length+1) {
        		System.out.println("Invalide selection, please select 1, 2 or 3");
        	}
        		switch (n) {
        			case 1: {
        				System.out.println("1. Sorting file names in ascending order?\n"
        						 + "2. Sorting file names in descending order?\n");
        		Sortfiles();
        		break;
        			}
        		case 2: {
        			System.out.println("Do you want to:\n"
        						 + "1. Add a file.\n"
        						 + "2. Delete a file.\n"
        						 + "3. Search for a file\n"
        						 + "4. Go to previous selections.\n"
        						 + "Please type which action.\n");
        		manipSelection();
        		break;
        		}
        		case 3: {
        			closeApp();
        		break;
        		}
        		}
    }
    
			private static void Sortfiles() {
				String[] sort= {"1. Asecendingly","2. Desendingly"};
				Scanner s1 = new Scanner(System.in);
				int ss = s1.nextInt();
				if ( ss > 0 && ss < 3) {
					switch (ss) {
					case 1:{
						File fileDir = new File("C:\\Users\\212397697\\Box Sync\\Programming\\Assis");
						List listFile = Arrays.asList(fileDir.list());
						System.out.println("Listing files unsorted");
						Collections.sort(listFile);
						System.out.println("---------------------------------------");
						System.out.println("Sorting by filename in ascending order");
							} break;		
					case 2:{
						File fileDir2 = new File("C:\\Users\\212397697\\Box Sync\\Programming\\Assis");
						List listFile2 = Arrays.asList(fileDir2.list());
						System.out.println("Listing files unsorted");
						System.out.println("---------------------------------------");
						System.out.println("Sorting by filename in descending order");
						Collections.sort(listFile2,Collections.reverseOrder());
						break;
					}
					}
				} else {
					System.out.println("Invalid Entery, please select 1 or 2.");
					}
			}
			
    		private static void manipSelection() {
    			String[] maniparray={"1. Add a file." , 
    								 "2. Delete a file.", 
    								 "3. Search for a file", 
    						 		 "4. Go to previous selections."};
    			Scanner m1 = new Scanner(System.in);
    			int m = m1.nextInt();
    			
    			if (m < 5 && m > 0) {
    				switch (m) {
    				case 1:{
    				    File file = new File("C:\\Users\\212397697\\Box Sync\\Programming\\Assis\\new text.txt");  
    					boolean result;  
    					try   {  
    					result = file.createNewFile();  //creates a new file  
    						if(result) {     // test if successfully created a new file  
    							System.out.println("file created "+file.getCanonicalPath()); //returns the path string  
    						} else  {  
    							System.out.println("File already exist at location: "+file.getCanonicalPath());  
    							}  
    					}   
    						catch (IOException e)   
    					{  
    					e.printStackTrace();    //prints exception if any  
    					}  break;
    				}
    				case 2:{
    					File f= new File("C:\\Users\\212397697\\Box Sync\\Programming\\Assis\\new text.txt");           //file to be delete  
    						if(f.delete()) {                     //returns Boolean value   
    							System.out.println(f.getName() + " deleted");   //getting and printing the file name  
    					} else {  
    							System.out.println("failed");  
    					}  break;
    				}
    				case 3:{
    					File dir = new File("C:\\Users\\212397697\\Box Sync\\Programming\\Assis");
    				      String[] children = dir.list();
    				      
    				      if (children == null) {
    				         System.out.println("does not exist or is not a directory");
    				      } else {
    				         for (int i = 0; i < children.length; i++) {
    				            String filename = children[i];
    				            System.out.println(filename);
    				         }}   
    					break;
    				}
    				case 4:{
    					master();
    					break;
    				}}
    				} else 
    				System.out.println("Invalid entery");	
    			}
    		private static void closeApp() {
				System.out.println("Closing your application... \nThank you!");
    }
    		public static void master() {
            System.out.println("\n**************************************\n");
            System.out.println("\tWelcome to LockedMe.com \n");
            System.out.println("**************************************");
            System.out.println("\nKindly select the service you want to do:\n"
            					+ "1. Sort the files names in ascenting order.\n"
            					+ "2. Manipulate files.\n"
            					+ "3. Close the Application.\n");
            }
}