
package burgerresturantmanager;

import java.util.Scanner;

public class HealthyBurger extends Burger {
    Scanner sc = new Scanner(System.in);

boolean cheese=false;
boolean tomato=false;
 
 String meat;
    public HealthyBurger() {
       super.setCheese(extraCheese());
       super.setTomato(extraTomato());
        setBread("brown");
        setName("HealthyBurger");
    }

    
   

  void setTypeOfmeat() {
      System.out.println("please enter the type of meat (beef) or (chicken)");
      meat= sc.next();
      setTypeOfMeat(meat);
    }
    
    
   
    
     boolean extraCheese(){
         System.out.println("for extra cheese press true \n no extra cheese plz press false");
          cheese = sc.nextBoolean();
         return cheese;
     }
     boolean extraTomato(){
         System.out.println("for extra tomato press true \n no extra tomato plz press false");
          tomato = sc.nextBoolean();
         return tomato;
     }

    @Override
    public int getPrice() {
        int total=50;
         if(tomato&&cheese){
         total += 10;
     }
    else    if(cheese||tomato){
            total+= 5;
        }
   
     
        return total; //To change body of generated methods, choose Tools | Templates.
    }
 

    @Override
    public String toString() {
        String result="you ordered  " + getName() + "\t the meat is " + getTypeOfMeat() + "\t the bread is " + getBread();
        if(cheese){
         result += " with extra cheese";
                     
        }
        if(tomato){
          result+=" with extra tomato";  
        }
      
        return result;
        
             
    }
}   
    

