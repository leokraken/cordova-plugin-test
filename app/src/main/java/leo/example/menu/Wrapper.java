package leo.example.menu;

import android.content.Context;
import android.content.Intent;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Wrapper extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {

            String name = data.getString(0);
            String message = "Hello, " + name;
            callbackContext.success(message);

            Context context=this.cordova.getActivity().getApplicationContext();
            Intent intent = new Intent(context, MainActivity.class);
            context.startActivity(intent);
            return true;

        } else {

            return false;

        }
    }
}