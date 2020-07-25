package com.referensisantri.referensisantri.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.referensisantri.referensisantri.R;

public class nyamakActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_nyamak );

        MobileAds.initialize(this, "ca-app-pub-1045901976964837~2170527373");
        AdView adView =(AdView)findViewById( R.id.adsView1 );
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd( adRequest );

        WebView webView = (WebView)findViewById(R.id.webView);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);

        //untuk zoom
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);

        //menambahkan scroolBar

        webView.setScrollBarStyle( View.SCROLLBARS_INSIDE_OVERLAY);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/nyamak.html");
//        setContentView(webView);
    }
}
