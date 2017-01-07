package leo.example.menu;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String package_name = getApplication().getPackageName();
        Resources resources = getApplication().getResources();
        setContentView(resources.getIdentifier("activity_main", "layout", package_name));
        //setContentView(R.layout.activity_main);
    }
}
