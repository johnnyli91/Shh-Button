package co.johnnyli.shh_button;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView Button1 = (ImageView) findViewById(R.id.button1);
        Button1.setImageResource(R.drawable.yellow_face);
        ImageView Button2 = (ImageView) findViewById(R.id.button2);
        Button2.setImageResource(R.drawable.green_face);
        ImageView Button3 = (ImageView) findViewById(R.id.button3);
        Button3.setImageResource(R.drawable.red_face);
        ImageView Settings = (ImageView) findViewById(R.id.settings);
        Settings.setImageResource(R.drawable.the_settings);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.test);
        Button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!mp.isPlaying()) {
                    mp.start();
                }
            }
        });
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
////            Intent settings = new Intent(this, SettingsActivity.class);
////            startActivity(settings);
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
