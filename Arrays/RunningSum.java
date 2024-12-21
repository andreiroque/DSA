package Arrays;

public class RunningSum {


  public static int[] runningSum(int[] nums){
    int[] newArr = new int[nums.length];

    int prev = 0;

    for(int i = 0; i < nums.length; i++){
      prev += nums[i];
      newArr[i] = prev;
    }
  
    return newArr;
  }


  public static void main(String[] args){

    int[] arr = {1,2,3,4}; // Case 1 - success
    // int[] arr = {1,1,1,1,1}; // Case 2 - success
    // int[] arr = {3,1,2,10,1}; // Case 3 - success

    int[] result = runningSum(arr);
    for(int i = 0; i < result.length; i++){
      System.out.print(result[i] + " ");
    }

  }

}
