package View;

import java.util.Scanner;

public class MoviesApp {
    public static void main(String[] args) throws Exception {
        
        boolean exit=false;
        Scanner console = new Scanner(System.in);
        //TODO add implement interface
        
        while(!exit){
            try{
                displayMenu();
                //TODO add runOptions method
    
            }
            catch(Exception e){
                System.out.println("An error has occur: " + e.getMessage());
            }
            System.out.println();   //sout just to print an empty line
        }//end while
    }


    //display menu method
    private static void displayMenu(){
        System.out.print("""
            *** Menu ***
            1. List Movies
            2. Add Movie
            3. Find Movie
            4. Exit
            Choose an option: 
            """);
    }



}
