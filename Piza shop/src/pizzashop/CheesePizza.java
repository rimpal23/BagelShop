
package pizzashop;

/**
 * A class to model pizzas that only have cheese on them
 */
public class CheesePizza extends Pizza
{
    public CheesePizza()
    {
        super();
        super.addTopping("cheese");
        super.getTemp();
    }
   /** public void bake(int temp)
    {
        super.getTemp();
        //do some baking here
    }*/
}
