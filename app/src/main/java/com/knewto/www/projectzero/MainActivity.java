package com.knewto.www.projectzero;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


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

    /** Called when the user clicks a button */
    public void launchApp(View view) {
        // Do something in response to button click
        TextView testTextView = (TextView) findViewById(R.id.TestText);
        String viewName = "Button Not Recognised";
        switch (view.getId()) {
            case R.id.SpotifyStreamer:
                viewName = "Spotify Streamer";
                break;
            case R.id.ScoresApp:
                viewName = "Scores App";
                break;
            case R.id.LibraryApp:
                viewName = "Library App";
                break;
            case R.id.BuildItBigger:
                viewName = "Build IT Bigger";
                break;
            case R.id.XyzReader:
                viewName = "XYZ Reader";
                break;
            case R.id.Capstone:
                viewName = "Capstone: My Own App";
                break;
        }
        testTextView.setText(viewName);
    }
}
