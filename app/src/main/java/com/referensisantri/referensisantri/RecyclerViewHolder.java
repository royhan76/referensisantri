package com.referensisantri.referensisantri;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

   TextView tv1,tv2; //deklarasi textview
    ImageView imageView;  //deklarasi imageview

    public RecyclerViewHolder(@NonNull View itemView) {
        super( itemView );

        tv1= (TextView) itemView.findViewById(R.id.daftar_judul);
    }
}
