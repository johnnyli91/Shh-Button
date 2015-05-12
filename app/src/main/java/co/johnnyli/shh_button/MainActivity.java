package co.johnnyli.shh_button;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    public static int count;
    public static boolean dim;
    private CheckBox autoDim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView ShhButton = (ImageView) findViewById(R.id.button_image);
        ShhButton.setImageResource(R.drawable.angry_button);
        final TextView Counter = (TextView) findViewById(R.id.counter);
        Counter.setText("Count: " + count);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.test);
        ShhButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!mp.isPlaying()) {
                    mp.start();
                    count++;
                    Counter.setText("Count: " + count);
                }
            }
        });
        final WindowManager.LayoutParams WMLP = getWindow().getAttributes();
        autoDim = (CheckBox) findViewById(R.id.autoDim);
        autoDim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dim = autoDim.isChecked();
                if (dim) {
                    WMLP.screenBrightness = 0.0F;
                    getWindow().setAttributes(WMLP);
                } else {
                    WMLP.screenBrightness = 0.3F;
                    getWindow().setAttributes(WMLP);
                }
            }
        });
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
//            Intent settings = new Intent(this, SettingsActivity.class);
//            startActivity(settings);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
