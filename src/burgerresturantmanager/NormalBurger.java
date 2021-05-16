
package burgerresturantmanager;
import java.util.Scanner;

public class NormalBurger extends HealthyBurger {
    
  Scanner sc = new Scanner(System.in);
 boolean extraLettuce;
  boolean extraCucumbers;

    public NormalBurger() {
        super.setLetuce(extralettuce());
        super.setCucumbers(extraCucumbers());
        System.out.println("enter the type of bread : brown or white ");
        String type_bread = sc.next();
        super.setBread(type_bread);
         System.out.println("enter the type of meat : beef or chicken ");
        String type_meat = sc.next();
        super.setTypeOfMeat(type_meat);
          System.out.println("for extra cheese press true \n no extra cheese plz press false");
      boolean    cheese = sc.nextBoolean();
          super.setCheese(cheese);
             System.out.println("for extra tomato press true \n no extra tomato plz press false");
    boolean      tomato = sc.nextBoolean();
    super.setTomato(tomato);
        setName("NormalBurger");
    }
  
  
   boolean extralettuce(){
         System.out.println("for extra Lettuce press true \n no extra Lettuce plz press false");
          extraLettuce = sc.nextBoolean();
         return extraLettuce;
     }
     boolean extraCucumbers(){
         System.out.println("for extra Cucumbers press true \n no extra Cucumbers plz press false");
          extraCucumbers = sc.nextBoolean();
         return extraCucumbers;
     }
   @Override
    public int getPrice() {
        int total=40;
         if(tomato){
         total += 5;
     }
       if(cheese){
            total+= 5;
        }
       if(extraCucumbers){
            total+= 5;
        }
       if(extraLettuce){
            total+= 5;
        }
   
     
        return total; 
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
        if(extraCucumbers){
            result+=" with extra cucumbers ";
        }
        if(extraLettuce){
            result+=" with extra lettuce";
        }
      
        return result;
        
             
    }

    
    
  
    
}
