import java.util.Scanner;
import java.util.Random;

public class Jar { 
  int numberToGuess;
  int maxItemsAllowed;
  int maxNumberInput;
  boolean isRightGuess = false;
  
//constructor for the jar class, method to get value for maximum input  
      public Jar(String maxNumberInput) {
       maxNumberInput = maxNumberInput;
       
       
      }
  
  
public int randomNumberGenerator () {
    Random random = new Random();
    int maxItemsAllowed = maxNumberInput;
    int someNumber = random.nextInt(maxItemsAllowed);
    System.out.printf("The random number is %d.%n", someNumber);
    return someNumber;
  }
      public int fill (int someNumber) {
        numberToGuess = someNumber;
        this.maxItemsAllowed = maxItemsAllowed;
        return maxItemsAllowed;
         
}  

  
  //This block is to get the type of item in a jar and also the max number of items in the jar.    
      public String promptForNumber() {
        Scanner scanner = new Scanner(System.in);
      
        System.out.printf("Enter a type of item to be put in jar. ");
        String itemInJar = scanner.nextLine();
    
        System.out.printf("Enter a maximum number of %s to put in jar. ", itemInJar);
        String maxNumberInputAsAString = scanner.nextLine();
        int maxNumberInput = Integer.parseInt(maxNumberInputAsAString);
      
        return itemInJar;
    
  
  }
      public void promptForGuess () {
       String phraseForGuess = String.format("How many jellybeans are in the jar, pick a number between 1 and %d. ", maxItemsAllowed);
       System.out.println(phraseForGuess);         
       do {
       System.out.println("Enter a number that is your guess as to how many are in the jar.");
      
       
        
       
        } while (! isRightGuess); {

    }
   } 
}
