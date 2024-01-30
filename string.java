import java.util.*;
public class INT2STRING {
// PROGRAMM TO CONVERT INTEGER VALUE INTO STRING VALUE 
    public static void main(String args[]){


      String number_0to19[] = {"one","two","three","four","five","six","seven","eight","nine","elevan","twelve","therteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

      String number_decad[] = {"ten","twenty","therty","fourty","fifty","sixty","seventy","eighty","ninety"};

      String number_century[] = {"one hundrad","two hundrad","three hundrad","four hundrad","five hundrad","six hundrad","seven hundrad","eight hundrad","nine hundrad"};

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a integer number to convert into String value : ");
      int number = sc.nextInt();
      
      if(number<20){
         switch(number){
         case 1: System.out.println("one");
         break;
        
         case 2: System.out.println("two");
         break;
         
         case 3:System.out.println("three");
         break;
        
         case 4:System.out.println("four");
         break;
         
         case 5:System.out.println("five");
         break;
         
         case 6:System.out.println("six");
         break;
        
         case 7:System.out.println("sevan");
         break;
         
         case 8:System.out.println("eight");
         break;
         
         case 9:System.out.println("Nine");
         break;
         
         case 10:System.out.println("ten");
          break;
         
         case 11:System.out.println("Elevan");
         break;

         case 12:System.out.println("twalve");
         break;

         case 13: System.out.println("therteen");
         break;
         
         case 14: System.out.println("fourteen");
         break;
         
         case 15: System.out.println("fifteen");
         break;
         
         case 16:  System.out.println("sixteen");
         break;
         
         case 17:System.out.println("seventeen");
         break;
         
         case 18:System.out.println("Eighteen");
         break;
      
         case 19: System.out.println("Nineteen");
         break;
          
         default: System.out.println("service error");
   
      }
      
      }
      else if(number>19 && number<=99){
          int firstDigit = number/10;
          int lastDigit = (number%10);
          for(int i=0; i<number_decad.length; i++){
            for(int j=0; j<number_0to19.length; j++){
              if(firstDigit == i+1 && lastDigit == j+1){
                System.out.print(number_decad[i] + " " + number_0to19[j]);
              }
            }
          }
          System.out.println();
        }
       else if(number>=100 &&  number<=999){
        int firstDigit = number/100;
        int  secondDigit = number%100;
        secondDigit /= 10; 
        int lastDigit = (number%10);
        for(int i=0; i<number_century.length; i++){
          for(int j=0; j<number_decad.length; j++){
            for(int k=0; k<number_0to19.length; k++){
              if(firstDigit == i+1 && secondDigit == j+1 && lastDigit == k+1 ){
                System.out.print(number_century[i] + " " + number_decad[j]+" "+number_0to19[k]);
              }
            }
          }
        }
        
       }
    }

      
}
