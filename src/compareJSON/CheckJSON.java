package compareJSON;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import compareJSON.Notification;
import compareJSON.TraceJSON;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 20/07/15
 * Time: 12:40
 * To change this template use File | Settings | File Templates.
 */
public class CheckJSON {
    public static void main(String[] args){
        System.out.println("start");

        Gson gson = new Gson();
        JsonParser parser = new JsonParser();

//        for (int i = 0; i < Tests.testCases.length; i++){
//
//            try{
//                String test = Tests.testCases[i];
//                JsonElement elem = parser.parse(test);
//                TraceJSON.logJsonsToFile(Tests.testNames[i], elem);
//
//            }catch (Exception e){
//                System.out.println("Error in test " + i + " " + Tests.testNames[i] + ". " + e.getMessage());
//            }
//
//        }

        Notification notif = new Notification();
        notif.setEnabled(true);
        notif.setId(1);
        notif.setMessage("msg");
        notif.setShowOnlyOnce(false);
        //notif.setTitle(null);

        TraceJSON.logJsonsToFile(notif.getClass().getSimpleName(), notif);
    }
}
