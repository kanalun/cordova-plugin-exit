package im.ckk.cordova.exit;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.widget.Toast;
import android.app.Activity;

public class Exit extends CordovaPlugin {
    protected void pluginInitialize() {}

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        /*
         * Finishes the activity provided by CordovaInterface.
         */
		Activity activity = this.cordova.getActivity();
		Toast.makeText(activity.getApplicationContext(), "This is a Toast", Toast.LENGTH_SHORT).show();
        if (action.equals("exit")) {
            try {
               
                activity.finish();
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, 0));
            } catch (Exception e) {
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, 1));
            }
            return true;
        }
        return false;
    }
}
