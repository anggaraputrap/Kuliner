package id.sch.smktelkom_mlg.project.xiirpl45152535.kuliner;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class MainActivity extends ActionBarActivity {

    private Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.buttonMenu);
        btn2 = (Button)findViewById(R.id.buttonMap);
        btn3 = (Button)findViewById(R.id.buttonInfo);
        btn4 = (Button)findViewById(R.id.buttonExit);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,MenuActivity.class);
                startActivity(pindah);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,MapActivity.class);
                startActivity(pindah);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,VersiActivity.class);
                startActivity(pindah);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });


        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
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
}

