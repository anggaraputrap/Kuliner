package id.sch.smktelkom_mlg.project.xiirpl45152535.kuliner.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl45152535.kuliner.R;
import id.sch.smktelkom_mlg.project.xiirpl45152535.kuliner.model.Hotel;

/**
 * Created by asus on 11/21/2016.
 */
public class HotelAdapter {
    ArrayList<Hotel> hotelList;

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        Hotel hotel = hotelList.get(position);
        holder.tvJudul.setText(hotel.judul);
        holder.tvDeskripsi.setText(hotel.deskripsi);
        holder.ivFoto.setImageDrawable(hotel.foto);
    }

    public int getItemCount() {
        if (hotelList!=null)
            return hotelList.size();
        return 0;
    }

    public void notifyDataSetChanged() {

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

    public HotelAdapter(ArrayList<Hotel> hotelList){
        this.hotelList = hotelList;
    }
}