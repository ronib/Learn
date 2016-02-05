/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 18/07/15
 * Time: 20:18
 * To change this template use File | Settings | File Templates.
 */

package compareJSON;
import com.google.gson.JsonElement;
import net.minidev.json.JSONValue;
import net.sf.json.*;
import com.google.gson.Gson;
import net.sf.json.JSON;
import java.io.PrintWriter;
import java.util.Random;

public class TraceJSON {

    public static void logJsonsToFile(String methodName, Object value){

        try{
            Random rand = new Random();
            int randomNum = rand.nextInt((9999 - 1000) ) + 1000;
            String filename = "";
            String jsonStr = "";

            // google json
            Gson gson = new Gson();
            filename = getFileName(methodName, randomNum, "gson");
            jsonStr = gson.toJson(value);
            write(filename, jsonStr);

            // jboss json
            filename = getFileName(methodName, randomNum, "netsf");
            JSON netSfJson;
            if (value instanceof JsonElement){
                netSfJson = JSONSerializer.toJSON(value.toString());
            }else{
                // classes that don't have toString() method. like notification
                netSfJson = JSONSerializer.toJSON(value);
            }
            jsonStr = netSfJson.toString();
            write(filename, jsonStr);

            // smart json
            filename = getFileName(methodName, randomNum, "minidev");
            jsonStr = JSONValue.toJSONString(value);
            write(filename, jsonStr);

        }catch (Exception e){
            System.out.println("***************************************************************");
            System.out.println("***** ERROR ****************** " + e.getMessage() + "**********");
            System.out.println("***************************************************************");
        }

    }

    private static void write(String filename, String str) {

        PrintWriter writer = null;

        try {
            writer = new PrintWriter(filename, "UTF-8");
            writer.write(str);
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        writer.close();
    }

    private static String getFileName(String methodName, int randomNum, String jsonLib) {
        return "c:\\temp\\json3\\" + randomNum + "_" + jsonLib + "_" + methodName + ".txt";
    }

}
