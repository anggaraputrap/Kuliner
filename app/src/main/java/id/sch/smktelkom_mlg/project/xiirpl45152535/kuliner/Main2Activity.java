package id.sch.smktelkom_mlg.project.xiirpl45152535.kuliner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);

        btn1 = (Button) findViewById(R.id.buttonList);
        btn2 = (Button)findViewById(R.id.buttonGambar);
        btn3 = (Button)findViewById(R.id.buttonPeta);
        btn4 = (Button)findViewById(R.id.buttonInfo);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animTranslate);
                Intent pindah = new Intent(Main2Activity.this, ListActivity.class);
                startActivity(pindah);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animTranslate);
                Intent pindah = new Intent(Main2Activity.this,GambarActivity.class);
                startActivity(pindah);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animTranslate);
                Intent pindah = new Intent(Main2Activity.this,MapsActivity.class);
                startActivity(pindah);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animTranslate);
                Intent pindah = new Intent(Main2Activity.this,InfoActivity.class);
                startActivity(pindah);
            }
        });
    }

}
