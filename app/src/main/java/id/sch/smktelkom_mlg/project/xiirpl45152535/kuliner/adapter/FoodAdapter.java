package id.sch.smktelkom_mlg.project.xiirpl45152535.kuliner.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl45152535.kuliner.R;
import id.sch.smktelkom_mlg.project.xiirpl45152535.kuliner.model.Food;

/**
 * Created by Acer on 11/22/2016.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
    ArrayList<Food> foodList;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        FoodAdapter.ViewHolder vh = new FoodAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Food food = foodList.get(position);
        holder.tvJudul.setText(food.judul);
        holder.tvDeskripsi.setText(food.deskripsi);
        holder.ivFoto.setImageDrawable(food.foto);
    }

    @Override
    public int getItemCount() {
        if (foodList!=null)
            return foodList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;
        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
        }
    }

    public FoodAdapter(ArrayList<Food> foodList){
        this.foodList = foodList;
    }
}
