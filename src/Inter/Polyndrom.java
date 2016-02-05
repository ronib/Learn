package Inter;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 10/09/15
 * Time: 15:34
 * To change this template use File | Settings | File Templates.
 */
public class Polyndrom {

    public  static void main(String[] args){
        System.out.println("start");

        int original = 234;

        String str = Integer.toString(original);
        String newStr = "";
        for (int i=str.length()-1; i>=0; i--){
            newStr += str.toCharArray()[i];
        }

        if (newStr.equals(str)){
            System.out.println("poly");
        }else{
            System.out.println("not poly");
        }

        int digit;
        int tempNumber = original;
        int newNumber = 0;
        while (tempNumber > 0){
            digit = tempNumber % 10;
            newNumber = newNumber * 10 + digit;

            tempNumber = tempNumber / 10;
            System.out.println(digit + " " + tempNumber + " " + newNumber);
        }

        if(newNumber == original)
            System.out.println("Palindrome");
        else
            System.out.println(" not");


    }



}
