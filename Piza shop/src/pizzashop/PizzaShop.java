
package pizzashop;

import java.util.Scanner;

/**
 * Creates a pizza of a given type and cuts it into slices.
 */
public class PizzaShop {

   public static PizzaCutter pizzaCutter = new PizzaCutter();//only ever want one 
   // of these. 
   //A pizzas must be cut by the same cutter.
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the pizza shop");
        System.out.println("What kind of pizza do you want?");
        System.out.println("Please enter exactly cheese or pepperoni");
        String type = sc.nextLine();
        PizzaFactory pf = new PizzaFactory();
        Pizza pizza = pf.createPizza(type);
        System.out.println("how many slices would you like?");
        int numSlices = sc.nextInt();
        pizzaCutter.numSlices = numSlices;
        if (pizza!=null)
        {
            System.out.println("Great job, here is your pizza in " + numSlices + " slices");
            
        }
        else
        {
            System.out.println("Enter a valid pizza type so we can cut it next time!");
        }
        
    }//end main
    
}
