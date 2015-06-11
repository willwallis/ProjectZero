package com.knewto.www.projectzero;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** When the user clicks a button show toast with the app name, placeholder until apps built
     * Have left TestView in place in case required for future testing. Would remove from final app.
     * */
    public void launchApp(View view) {
        // Initiate Toast
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
//        TextView testTextView = (TextView) findViewById(R.id.TestText);
        String viewName = "Secret";
        // Identify which app has been selected
        switch (view.getId()) {
            case R.id.SpotifyStreamer:
                viewName = "Spotify Streamer";
                break;
            case R.id.ScoresApp:
                viewName = "Scores";
                break;
            case R.id.LibraryApp:
                viewName = "Library";
                break;
            case R.id.BuildItBigger:
                viewName = "Build IT Bigger";
                break;
            case R.id.XyzReader:
                viewName = "XYZ Reader";
                break;
            case R.id.Capstone:
                viewName = "Capstone";
                break;
        }
//        testTextView.setText(viewName);
        // Create string and toast it!
        String toastText = "This button will launch my " + viewName + " app!";
        Toast toast = Toast.makeText(context, toastText, duration);
        toast.show();
    }
}
