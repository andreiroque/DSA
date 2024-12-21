package Arrays;


public class RichestCustomerWealth {

  public static int maximumWealth(int[][] accounts){
    int max = 0;
    for(int i = 0; i < accounts.length; i++){
      int total = 0;
      for(int j = 0; j < accounts[i].length; j++){
         total += accounts[i][j];
        if(total > max){
          max = total;
        }
      }
    }

    return max;
  }


  public static void main(String[] args){

    int[][] accounts = {{1,2,3}, {3,2,1}}; // Case 1 - success;
    // int[][] accounts = {{1,5}, {7,3}, {3,5}}; // Case 2 - success;
    // int[][] accounts = {{2,8,7}, {7,1,3}, {1,9,5}}; // Case 3 - success;
    int result = maximumWealth(accounts);

    System.out.print("Maximum Wealth: " + result);

  }

}
