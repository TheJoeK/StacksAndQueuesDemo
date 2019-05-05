
package kellyjstacksandqueues;

import java.util.Stack;

public class KellyJStacksAndQueues {

    
    public static void main(String[] args) {
        
        String HomerJSimpson="Racecar";
        String MoeSzyslak = "Tacocat";
        String TroyMcClure = "A man a plan a canal Panama";
        String CMontgomeryBurns = "This is not a palindrome";
        
        
        System.out.println("Is it a Palindrome?\n");
        palindromeDetector(HomerJSimpson);
        palindromeDetector(MoeSzyslak);
        palindromeDetector(TroyMcClure);
        palindromeDetector(CMontgomeryBurns);
        
        
        
       
    }
    public static void palindromeDetector (String otto){
        Stack stack = new Stack<>();
        String validate = otto.toUpperCase();
        var charArr = validate.toCharArray();
        int count = 0;
        int tally = 0;
        boolean isItPalindrome = false;
        
        for (char x : charArr) {
            if (x!=' '){
                stack.push(x);
                count++;
            }
        } 
        
        for(int i=0; i<count/2; i++){
            if(stack.peek() == stack.get(tally)){
                isItPalindrome=true;
            }
            stack.pop();
            tally++;
        }
        if (isItPalindrome == true){
            System.out.println('"'+otto+'"'+" is a palindrome.");
        }
        else{
            System.out.println('"'+otto+'"'+" is not a palindrome.");
        }
    }
    
    
}
