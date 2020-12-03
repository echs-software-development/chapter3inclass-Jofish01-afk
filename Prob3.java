import java.util.Scanner;

public class Prob3  {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);

  System.out.println("Enter an integer 0-4: ");

  int grade = scan.nextInt();

  if (grade == 4)
  {
    System.out.println("Grade: A");
  } 
  else if (grade == 3)
  {  
    System.out.println("Grade: B");
  }
  else if (grade == 2)
  {  
    System.out.println("Grade: C");
  }
  else if (grade == 1)
  {  
    System.out.println("Grade: D");
  }
  else
  { 
    System.out.println("Grade: F");
  }

    
  }
}
