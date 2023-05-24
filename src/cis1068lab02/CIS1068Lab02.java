/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis1068lab02;

/**
 *
 * @author tugsbilegkhaliunbat
 */
public class CIS1068Lab02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        squaresOfNums(10);
        fibonacci(12);
        spaceAndNumbers(5);
        
        
        // prints ASCII art
        line(); 
        downwardV(2);
        line();
        upwardV(2);
        line();
        
      
        
        
        
         
        
    }
    public static void line() {
        System.out.println("+------+");
    }
    public static void downwardV(int n) {
        for(int l=0; l<n; l++) {
            for(int i=3; i>0; i--) {
                System.out.print("|");
                for(int j=0; j<i-1; j++)
                    System.out.print("-");
                System.out.print("^");
                for(int j=0; j<3-i; j++)
                    System.out.print("-");
                for(int j=0; j<3-i; j++)
                    System.out.print("-");
                System.out.print("^");
                for(int j=0; j<i-1; j++)
                    System.out.print("-");
                System.out.println("|");
            }
        }
        
    }
    public static void upwardV(int n) {
        for(int l=0; l<n; l++){
            for(int i=3; i>0; i--) {
                System.out.print("|");
                for(int j=0; j<3-i; j++)
                    System.out.print("-");
                System.out.print("v");
                for(int j=0; j<i-1; j++)
                    System.out.print("-");
                for(int j=0; j<i-1; j++)
                    System.out.print("-");
                System.out.print("v");
                for(int j=0; j<3-i; j++)
                    System.out.print("-");
                System.out.println("|");
            }
        }
    }
    public static void squaresOfNums(int x) {
        /*for(int i=1; i<=x; i++)
            System.out.print(i*i);*/
        int j = 0;
        for(int i=1; i<=(2*x+1); i=i+2){
            System.out.print(j + " ");
            j+=i;
        }
        System.out.println("");
    }   
    public static void fibonacci(int n) {
        int x = 0;
        int y = 1; 
        int z = 1;
        for(int i=1; i<=n; i++) {
            System.out.print(z +" ");
            z = x+y;
            x = y;
            y = z;
                    
        }
        System.out.println("");
                    
    }
    public static void spaceAndNumbers(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=n-i; j>0; j--)
                System.out.print(" ");
            for(int j=i; j>0; j--) 
                System.out.print(i);
            System.out.println("");
            
        }
        
        
    }
    
    

}
    
    

