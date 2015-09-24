/*
 * Repeatedly prompt the user to enter a grade.
 * 
 * The grade must be between 0 and 100; or it can be equal to -1.
 * Entering a -1 means the user has finished entering grades.
 * 
 * Output to the user
 * - How many grades the user entered
 * - The average of the grades
 * - Error messages when appropriate
 * 
 * Sample interaction:
 * 
 * Enter a grade: 70
 * Enter a grade: 75
 * Enter a grade: 101
 * Error. Grade must be between 0 and 100; or -1 to finish
 * Enter a grade: -1
 * 
 * You entered 2 grades. The average is 72.5
 */

public class Grades {
  public static void main(String[] args) {
    int count;
        float sum = 0;
        float grade;
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Enter number of grades: ");
        count = scan.nextInt();
        while (0 != (count = input.nextInt())) {
            count ++; 
        
            grade = scan.nextFloat();
            sum += grade;

        System.out.println("The average of the grades is: " + sum/count);
    
      
    }
  
  } 
    
  }

}
