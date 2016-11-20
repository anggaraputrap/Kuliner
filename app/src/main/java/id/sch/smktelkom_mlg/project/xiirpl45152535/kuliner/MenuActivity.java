package id.sch.smktelkom_mlg.project.xiirpl45152535.kuliner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

/**
 * Created by Nirmala Ainun on 20/11/2016.
 */

public class MenuActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);

        btn1 = (Button) findViewById(R.id.buttonList);
        btn2 = (Button)findViewById(R.id.buttonGambar);
        btn3 = (Button)findViewById(R.id.buttonPeta);
        btn4 = (Button)findViewById(R.id.buttonInfo);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animTranslate);
                Intent pindah = new Intent(MenuActivity.this,ListActivity.class);
                startActivity(pindah);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animTranslate);
                Intent pindah = new Intent(MenuActivity.this,GambarActivity.class);
                startActivity(pindah);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animTranslate);
                Intent pindah = new Intent(MenuActivity.this,PetaActivity.class);
                startActivity(pindah);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animTranslate);
                Intent pindah = new Intent(MenuActivity.this,InfoActivity.class);
                startActivity(pindah);
            }
        });


        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the MenuActivity; this adds items to the action bar if it is present.
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
}
