import java.util.Scanner;

public class Prob4  {
  public static void main(String[] args){
    
  Scanner scan = new scanner (System.in);

  System.out.println("What is the temperature? ");

  double temp = scan.nextDouble();

  if (temp > 99 || > 102)
  {
    System.out.println("Warning!");
  }

  else
  {
    System.out.println("The temperature is ok.");
  }
    
  }
}
