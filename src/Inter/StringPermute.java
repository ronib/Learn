package Inter;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 12/26/15
 * Time: 11:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringPermute {

    public static void  main(String[] args){

        permute("", "abc");

    }

    private static void permute(String prefix, String str) {

        if (str.length() == 0){ // stop condition
            System.out.println(prefix);
        }else{
            // recuresion
            for (int i=0; i < str.length(); i++){
                String newPre = String.valueOf(str.charAt(i));
                String newStr = str.substring(0,i) + str.substring(i+1, str.length());
                permute(prefix + newPre, newStr);
            }

        }
    }
}
