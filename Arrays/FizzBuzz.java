package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  public static List<String> fizzBuzz(int n){
    List<String> li = new ArrayList<>();

    int counter = 1;

    while(counter <= n){

      if(counter % 5 == 0 && counter % 3 == 0){
        li.add("FizzBuzz");
      }else if(counter % 3 == 0){
        li.add("Fizz");
      }else if(counter % 5 == 0){
        li.add("Buzz");
      }else{
        li.add(Integer.toString(counter));
      }

      counter++;
    }

    return li;
  }

  public static void main(String[] args){

    int number = 3; // Case 1 - success
    // int number = 5; // Case 2 - success
    // int number = 15; // Case 3 - success

    System.out.print(fizzBuzz(number));

  }

}
