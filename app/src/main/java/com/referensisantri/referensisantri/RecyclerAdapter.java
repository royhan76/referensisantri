package com.referensisantri.referensisantri;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.referensisantri.referensisantri.activity.*;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder>{

    private final Context context;

    String [] name={"THOHAROH ","WUDLU","SIWAK","CEBOK","TAYAMUM","MANDI","NAJIS","SHOLAT","MENYAMAK",
            "JAMA'AH","JUM'AT","JAMA' & QOSHOR","MAYAT", "ZAKAT","PUASA","HAJI","QURBAN & AQIQOH","RUMUS FIQIH"};

    LayoutInflater inflater;

    public RecyclerAdapter(Context context) {
        this.context = context;

        inflater = LayoutInflater.from( context );
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        View v = inflater.inflate( R.layout.item_list, parent, false );

        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        holder.tv1.setOnClickListener(clickListener);
//        holder.imageView.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
//        holder.imageView.setTag(holder);

    }
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();

            int position = vholder.getPosition();

            if (position==0&&position<getItemCount()){
                Intent intent= new Intent( context, thoharohActivity.class );
                context.startActivity( intent );
            }else if (position==1&&position<getItemCount()){
                Intent intent= new Intent( context, wudlu.class );
                context.startActivity( intent );
            }else if (position==2&&position<getItemCount()){
                Intent intent= new Intent( context, siwak.class );
                context.startActivity( intent );
            }else if (position==3&&position<getItemCount()){
                Intent intent= new Intent( context, cebokActivity.class );
                context.startActivity( intent );
            }
            else if (position==4&&position<getItemCount()){
                Intent intent= new Intent( context, tayamumActivity.class );
                context.startActivity( intent );
            }
            else if (position==5&&position<getItemCount()){
                Intent intent= new Intent( context, mandiActivity.class );
                context.startActivity( intent );
            }
            else if (position==6&&position<getItemCount()){
                Intent intent= new Intent( context, najasahActivity.class );
                context.startActivity( intent );
            }
            else if (position==7&&position<getItemCount()){
                Intent intent= new Intent( context, sholatActivity.class );
                context.startActivity( intent );
            }
            else if (position==8&&position<getItemCount()){
                Intent intent= new Intent( context, nyamakActivity.class );
                context.startActivity( intent );
            }
            else if (position==9&&position<getItemCount()){
                Intent intent= new Intent( context, jamaahActivity.class );
                context.startActivity( intent );
            }
            else if (position==10&&position<getItemCount()){
                Intent intent= new Intent( context, jumatActivity.class );
                context.startActivity( intent );
            }
            else if (position==11&&position<getItemCount()){
                Intent intent= new Intent( context, jamaqosorActivity.class );
                context.startActivity( intent );
            }
            else if (position==12&&position<getItemCount()){
                Intent intent= new Intent( context, mayatActivity.class );
                context.startActivity( intent );
            }
            else if (position==13&&position<getItemCount()){
                Intent intent= new Intent( context, zakatActivity.class );
                context.startActivity( intent );
            }
            else if (position==14&&position<getItemCount()){
                Intent intent= new Intent( context, puasaActivity.class );
                context.startActivity( intent );
            }
            else if (position==15&&position<getItemCount()){
                Intent intent= new Intent( context, hajiActivity.class );
                context.startActivity( intent );
            }
            else if (position==16&&position<getItemCount()){
                Intent intent= new Intent( context, qurbanActivity.class );
                context.startActivity( intent );
            }
            else if (position==17&&position<getItemCount()){
                Intent intent= new Intent( context, rumusActivity.class );
                context.startActivity( intent );
            }
        }
    };

    @Override
    public int getItemCount() {
        return name.length;
    }
}
