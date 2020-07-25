package com.referensisantri.referensisantri;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.referensisantri.referensisantri.activity.*;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    RecyclerView recyclerView, recyclerView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        recyclerView= (RecyclerView) findViewById(R.id.recycler_view);
//        recyclerView2 =(RecyclerView)findViewById( R.id.recycler_view_maulid );

//        FragmentRecyclerAdapter fragmentRecyclerAdapter = new FragmentRecyclerAdapter( this );

        RecyclerAdapter adapter=new RecyclerAdapter(this);
        //membuat adapter baru untuk reyclerview
        recyclerView.setAdapter(adapter);

        //menset nilai dari adapter
        recyclerView.setHasFixedSize(true);
        //menset setukuran
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //menset layoutmanager dan menampilkan daftar/list
        //dalam bentuk linearlayoutmanager pada class saat ini

        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

//        FloatingActionButton fab = (FloatingActionButton) findViewById( R.id.fab );
//        fab.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make( view, "Replace with your own action", Snackbar.LENGTH_LONG )
//                        .setAction( "Action", null ).show();
//            }
//        } );

        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener( toggle );
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById( R.id.nav_view );
        navigationView.setNavigationItemSelectedListener( this );
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        if (drawer.isDrawerOpen( GravityCompat.START )) {
            drawer.closeDrawer( GravityCompat.START );
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.main, menu );
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
            Intent intent = new Intent( this, klikplaystoreActivity.class );
            startActivity( intent );
//            return true;
        }

        return super.onOptionsItemSelected( item );
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace( R.id.frame4fragment, new referensiSnFragment())
                    .addToBackStack( "fragment1" )
                    .commit();
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace( R.id.frame4fragment, new MaulidFragment())
                    .addToBackStack( "fragment1" )
                    .commit();

        } else if (id == R.id.nav_slideshow) {
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace( R.id.frame4fragment, new manaqibFragment())
                    .addToBackStack( "fragment1" )
                    .commit();

        }
//        else if (id == R.id.nav_manage) {
//
////        }
////        else if (id == R.id.nav_share) {
//////            Intent intent = new Intent( Intent.ACTION_VIEW );
//////            Uri.Builder uriBuilder = Uri.parse( "https://play.google.com/store/apps/details?id=com.beensholih.jean.alfiyahmp3offline" )
//////                    .buildUpon()
//////                    .appendQueryParameter("id", "com.beensholih.jean.alfiyahmp3offline" )
//////                    .appendQueryParameter( "lauch", "true" );
//////
//////            intent.setData( uriBuilder.build() );
//////            intent.setPackage( "com.beensholih.jean.alfiyahmp3offline" );
//////            startActivity( intent );
////
////        }
////        else if (id == R.id.nav_send) {
////
//        }

        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        drawer.closeDrawer( GravityCompat.START );
        return true;
    }
}
