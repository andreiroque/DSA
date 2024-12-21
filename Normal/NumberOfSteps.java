package Normal;

public class NumberOfSteps {
  
  public static int numberOfStepsToReduceANumberToZero(int num){
    int steps = 0;

    while(num != 0){
      if(num % 2 == 0){
        num /= 2;
      }else{
        num--;
      }
      steps++;
    }

    return steps;
  }
  
  public static void main(String[] args){
    
    int num = 14; // Case 1 - success
    // int num = 8; // Case 2 - success
    // int num = 123; // Case 3 - success

    System.out.println("Number of Steps: " + numberOfStepsToReduceANumberToZero(num));

  }

}
