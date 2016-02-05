package compareJSON;
/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 20/07/15
 * Time: 16:21
 * To change this template use File | Settings | File Templates.
 */

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import compareJSON.*;
public class Notification {

    private int id;
    private String message;
    private String title;
    private boolean isShowOnlyOnce;
    private boolean isEnabled;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getShowOnlyOnce() {
        return isShowOnlyOnce;
    }

    public void setShowOnlyOnce(boolean showOnlyOnce) {
        isShowOnlyOnce = showOnlyOnce;
    }

    public boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

