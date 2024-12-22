package Normal;

public class NumberPalindrome{

  public static boolean isPalindrome(int x){

    String num = Integer.toString(x);
    String[] texts = num.split("");
    String newText = "";
    
    int length =texts.length - 1;
    for(int i = 0; i < texts.length; i++){
      newText += texts[length];
      length--;
    }

    if(num.equals(newText)){
      return true;
    }

    return false;
  }
  
  public static void main(String[] args){

    int num = 121; // Case 1 - success
    // int num = -121; // Case 2 - success
    // int num = 10; // Case 3 - success


    System.out.print(isPalindrome(num));

  }

}