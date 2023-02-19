
import java.util.Scanner;
    
  public class noSysConverter {
 
 
    public static void main(String[] args) {
        String choices,option;
        System.out.println("==Select number system conversion=="); 
        System.out.println("Binary[a]   Octal[b]    Decimal[c]   Hexadecimal[d]   Exit[e]");
        Scanner scan = new Scanner(System.in);
        choices = scan.nextLine();
        switch(choices) {
  case "a":
        System.out.println("Convert to: ");
        System.out.println("Decimal[a] Octal[b] Hexadecimal[c] ");
        option = scan.nextLine();
          
        if(option.equals("a")){
            binaryToDecimal(); 
        }       
        if(option.equals("b")){
            binaryToOctal();
        }
        if(option.equals("c")){
            binaryToHexadecimal(); 
        }
        
     
     break;
  case "b":
        System.out.println("Convert to: ");
        System.out.println("Binary[a] Decimal[b] Hexadecimal[c] ");
        option = scan.nextLine();

        if(option.equals("a")){
            octalToBinary();
        }
        if(option.equals("b")){
            octalToDecimal();
        }
        if(option.equals("c")){
            octalToHexadecimal();
        }
        

    break;
  case "c":
        System.out.println("Convert to: ");
        System.out.println("Binary[a] Octal[b] Hexa[c] ");
        option = scan.nextLine();
        
        if(option.equals("a")){
            decimalToBinary();  
        }
        if(option.equals("b")){
            decimalToOctal();   
        }
        if(option.equals("c")){
           decimalToHexadecimal();   
        }
        
  
    break;
  case "d":
        System.out.println("Convert to: ");
        System.out.println("Binary[a] Octal[b] Decimal[c] ");
        option = scan.nextLine();

        if(option.equals("a")){ //hexa to binary

        }
        if(option.equals("b")){ //hexa  to octal

        }
        if(option.equals("c")){ //hexa to decimal

        }

    break;
  default:
    // code block
}
    }
   
    static void binaryToDecimal(){
        Scanner input = new Scanner(System.in);
             System.out.print("Enter a binary number: ");
              String binary = input.nextLine();

              int decimal = 0;
              int power = 0;

             for (int i = binary.length() - 1; i >= 0; i--) {
             int digit = Character.getNumericValue(binary.charAt(i));
            decimal += digit * Math.pow(2, power);
            power++;
        }

        System.out.println("Decimal equivalent: " + decimal);
 }   
    
    static void decimalToBinary(){
     Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        String binary = "";
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal /= 2;
        }

        System.out.println("Binary equivalent: " + binary);
    }

    static void binaryToOctal(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal equivalent: " + octal);
    }

    static void binaryToHexadecimal(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("Hexadecimal equivalent: " + hexadecimal.toUpperCase());
    }

    static void octalToBinary(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = input.nextLine();
        int decimal = Integer.parseInt(octal, 8);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary equivalent: " + binary);
    }

    static void octalToDecimal(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = input.nextLine();
        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Decimal equivalent: " + decimal);
    }

    static void octalToHexadecimal(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = input.nextLine();
        int decimal = Integer.parseInt(octal, 8);
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("Hexadecimal equivalent: " + hexadecimal.toUpperCase());

    }

    static void decimalToOctal(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal equivalent: " + octal);
    }

    static void decimalToHexadecimal(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("Hexadecimal equivalent: " + hexadecimal.toUpperCase());
    }
       
    static void hexaToBinary(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = scanner.nextLine();
        String binary = new BigInteger(hexadecimal, 16).toString(2);
        System.out.println("Binary equivalent: " + binary);
    }
}
