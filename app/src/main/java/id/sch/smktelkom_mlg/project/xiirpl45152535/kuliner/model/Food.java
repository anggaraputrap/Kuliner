package id.sch.smktelkom_mlg.project.xiirpl45152535.kuliner.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Acer on 11/22/2016.
 */

public class Food {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Food(String judul, String deskripsi, Drawable foto)
    {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
