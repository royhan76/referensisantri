package com.referensisantri.referensisantri.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.referensisantri.referensisantri.R;

public class dliyauLamiActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_dliyau_lami );

        MobileAds.initialize(this, "ca-app-pub-1045901976964837~2170527373");
        AdView adView =(AdView)findViewById( R.id.adsView1 );
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd( adRequest );

        pdfView = (PDFView)findViewById( R.id.viewDiba );
        pdfView.fromAsset( "maulidaddhiyaullami.pdf" ).load();
    }
}
