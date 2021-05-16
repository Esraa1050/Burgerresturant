
package burgerresturantmanager;


public class DeluxeBurger extends Burger{
   boolean chips = true;
    boolean drink = true;

    public DeluxeBurger(int price, String meat, String bread, String name) {
        setPrice(price);
        setBread(bread);
        setName(name);
        setTypeOfMeat(meat);
    }

    @Override
    public String toString() {
        return "you ordered  " + getName() + "\t the meat is " + getTypeOfMeat() + "\t the bread is " + getBread()
                + " with chips & drink "; //To change body of generated methods, choose Tools | Templates.
    }

}