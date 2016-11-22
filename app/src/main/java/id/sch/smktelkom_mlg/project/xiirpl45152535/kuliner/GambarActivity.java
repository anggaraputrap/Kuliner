package id.sch.smktelkom_mlg.project.xiirpl45152535.kuliner;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl45152535.kuliner.adapter.FoodAdapter;
import id.sch.smktelkom_mlg.project.xiirpl45152535.kuliner.model.Food;

public class GambarActivity extends AppCompatActivity {
    ArrayList<Food> mList = new ArrayList<>();
    FoodAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gambar);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new FoodAdapter(mList);
        recyclerView.setAdapter(mAdapter);

        fillData();

    }

    private void fillData()
    {
        Resources resources = getResources();
        String [] arJudul = resources.getStringArray(R.array.foods);
        String [] arDeskripsi = resources.getStringArray(R.array.food_desc);
        TypedArray a = resources.obtainTypedArray(R.array.foods_picture);
        Drawable[] arFoto = new Drawable[a.length()];

        for (int i = 0; i < arFoto.length; i++)
        {
            arFoto[i] = a.getDrawable(i);
        }

        a.recycle();

        for (int i = 0; i < arJudul.length; i++)
        {
            mList.add(new Food(arJudul[i],arDeskripsi[i],arFoto[i]));
        }
        mAdapter.notifyDataSetChanged();
    }
}
