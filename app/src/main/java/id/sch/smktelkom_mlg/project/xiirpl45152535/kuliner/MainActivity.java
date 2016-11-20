package id.sch.smktelkom_mlg.project.xiirpl45152535.kuliner;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

        private static int SPLASH_Time_out = 3000;

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    Intent homeIntent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(homeIntent);
                    finish();
                }
            }, SPLASH_Time_out);

        }
    }


