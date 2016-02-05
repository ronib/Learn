package Inter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 10/25/15
 * Time: 1:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class IterationWays {

    public static void main(String[] args) {
        HashMap<String, String> loans = new HashMap<String, String>();
        loans.put("home loan", "citibank");
        loans.put("personal loan", "Wells Fargo");

        // 4 ways

        for (Map.Entry<String,String> loan : loans.entrySet()){
            System.out.println(loan.getKey() + " " + loan.getValue());
        }

        for (String key : loans.keySet()){
            System.out.println(key + " " + loans.get(key));
        }

        Iterator loansIter = loans.keySet().iterator();
        while (loansIter.hasNext()){
            String key = loansIter.next().toString();
            System.out.println(key + loans.get(key));
        }

        for (String value : loans.values()){
            System.out.println(value + " " + loans.get(value));
        }

    }



}
