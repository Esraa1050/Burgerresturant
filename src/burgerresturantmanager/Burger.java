
package burgerresturantmanager;


public class Burger {
    
private String name;
 private String typeOfMeat;
 private String bread;
 private int price;
 boolean cheese;
 boolean tomato;
 boolean letuce;
 boolean cucumbers;

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public boolean isLetuce() {
        return letuce;
    }

    public void setLetuce(boolean letuce) {
        this.letuce = letuce;
    }

    public boolean isCucumbers() {
        return cucumbers;
    }

    public void setCucumbers(boolean cucumbers) {
        this.cucumbers = cucumbers;
    }


    public Burger(boolean cheese,boolean tomato, boolean letuce, boolean cucumbers) {
       this.cheese=cheese; 
       this.tomato=tomato;
       this.letuce=letuce;
       this.cucumbers=cucumbers;
    }
     public Burger(boolean cheese,boolean tomato) {
       this.cheese=cheese; 
       this.tomato=tomato;  
    }

    public Burger() {
    }
     
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfMeat() {
        return typeOfMeat;
    }

    public void setTypeOfMeat(String typeOfMeat) {
        this.typeOfMeat = typeOfMeat;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}