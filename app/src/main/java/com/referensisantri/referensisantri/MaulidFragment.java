package com.referensisantri.referensisantri;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.referensisantri.referensisantri.activity.*;


/**
 * A simple {@link Fragment} subclass.
 */
public class MaulidFragment extends Fragment implements View.OnClickListener {


    public MaulidFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View FragmenMaulid = inflater.inflate( R.layout.fragment_maulid, container, false );

        Button button1 = (Button)FragmenMaulid.findViewById( R.id.btn1 );
        button1.setOnClickListener( this );
        Button button2 = (Button)FragmenMaulid.findViewById( R.id.btn2 );
        button2.setOnClickListener( this );
        Button button3 = (Button)FragmenMaulid.findViewById( R.id.btn3 );
        button3.setOnClickListener( this );
        Button button4 = (Button)FragmenMaulid.findViewById( R.id.btn4 );
        button4.setOnClickListener( this );



        return FragmenMaulid;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                Intent intent = new Intent( getContext(), dibaActivity.class);
                startActivity( intent );
                break;

            case R.id.btn2:
                intent = new Intent( getContext(),barzanjiActivity.class );
                startActivity( intent );
                break;

            case R.id.btn4:
                intent = new Intent( getContext(), dliyauLamiActivity.class );
                startActivity( intent );
                break;
            case R.id.btn3:
                intent = new Intent( getContext(), simtuddurorActivity.class );
                startActivity( intent );
                break;
        }
    }
}
