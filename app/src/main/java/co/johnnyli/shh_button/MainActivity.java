package co.johnnyli.shh_button;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity {

    private Intent settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        settings = new Intent(this, Settings.class);
        ImageView Button1 = (ImageView) findViewById(R.id.button1);
        Button1.setImageResource(R.drawable.yellow_face);
        ImageView Button2 = (ImageView) findViewById(R.id.button2);
        Button2.setImageResource(R.drawable.green_face);
        ImageView Button3 = (ImageView) findViewById(R.id.button3);
        Button3.setImageResource(R.drawable.red_face);
        ImageView Settings = (ImageView) findViewById(R.id.settings);
        Settings.setImageResource(R.drawable.the_settings);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.shhh2);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.quiet);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.cough);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mp1.isPlaying()) {
                    mp1.start();
                }
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mp2.isPlaying()) {
                    mp2.start();
                }
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mp3.isPlaying()) {
                    mp3.start();
                }
            }
        });
        Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(settings);
            }
        });
    }
}
