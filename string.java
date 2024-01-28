import java.util.*;
public class string {
// PROGRAMM TO CONVERT INTEGER VALUE INTO STRING VALUE 
    public static void main(String args[]){

      String number_0to19[] = {"one","two","three","four","five","six","seven","eight","nine","elevan","twelve","therteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

      String number_decad[] = {"twenty","therty","fourty","fifty","sixty","seventy","eighty","ninety"};

      String number_century[] = {"hundrad","two hundrad","three hundrad","four hundrad","five hundrad","six hundrad","seven hundrad","eight hundrad","nine hundrad"};

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
         
         case 8:System.out.println("Nine");
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
        if(number>=20 && number<=29){
          int firstDigit = number/10;
          int lastDigit = (number%10);

          print_twenty(lastDigit);

        }
        else if(number>30 && number<=39){
          int firstDigit = number/10;
          int lastDigit = (number%10);

        }
        if(number>40 && number<=49){
          int firstDigit = number/10;
          int lastDigit = (number%10);

        }
        else if(number>50 && number<=59){
          int firstDigit = number/10;
          int lastDigit = (number%10);

        }
        if(number>50 && number<=59){
          int firstDigit = number/10;
          int lastDigit = (number%10);

        }
        else if(number>60 && number<=69){
          int firstDigit = number/10;
          int lastDigit = (number%10);

        }
        if(number>70 && number<=79){
          int firstDigit = number/10;
          int lastDigit = (number%10);

        }
        else if(number>80 && number<=89){
          int firstDigit = number/10;
          int lastDigit = (number%10);

        }
        if(number>90 && number<=99){
          int firstDigit = number/10;
          int lastDigit = (number%10);

        }
      }

    }

    // FUNCTION TO PRINT NUMBERS FROM 20 TO 29 IN STRING VALUES 

    public static void print_twenty(int twenty){
      switch(twenty){
        case 0:System.out.println("twenty");
        break;
        case 1:System.out.println("twenty one");
        break;
        case 2:System.out.println("twenty two");
        break;
        case 3:System.out.println("twenty three");
        break;
        case 4:System.out.println("twenty four");
        break;
        case 5:System.out.println("twenty five");
        break;
        case 6:System.out.println("twenty six");
        break;
        case 7:System.out.println("twenty seven");
        break;
        case 8:System.out.println("twenty eight");
        break;
        case 9:System.out.println("twenty nine");
        break;
      }

    }

      
}
