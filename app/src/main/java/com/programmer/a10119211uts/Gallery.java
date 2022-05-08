package com.programmer.a10119211uts;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Gallery extends AppCompatActivity {
    //(7 Mei 2022, 10119211, Badra Samsudin Ramdan N, IF-06)
    Context contextGallery;
    RecyclerView recyclerViewGallery;
    RecyclerView.Adapter recyclerViewAdapterGallery;
    RecyclerView.LayoutManager recylerViewLayoutManagerGallery;
    String[] subjectsGallery = {
            "Poto1", "Poto2", "Poto3","Poto4", "Poto5", "Poto6","Poto7", "Poto8", "Poto9"
    };
    int[] subjectImageGallery={
            R.drawable.pic1,R.drawable.pic2,
            R.drawable.pic3,

            R.drawable.pic4,R.drawable.pic5,
            R.drawable.pic6,

            R.drawable.pic7,R.drawable.pic8,
            R.drawable.pic9
    };
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gallery);
        contextGallery = getApplicationContext();
        recyclerViewGallery = findViewById(R.id.recyclerViewGallery);
        recylerViewLayoutManagerGallery = new GridLayoutManager( contextGallery, 2);
        //context,LinearLayoutManager.HORIZONTAL,false
        recyclerViewGallery.setLayoutManager(recylerViewLayoutManagerGallery);
        recyclerViewAdapterGallery = new AdapterRecyclerViewGallery(subjectsGallery, subjectImageGallery,contextGallery );
        recyclerViewGallery.setAdapter(recyclerViewAdapterGallery);
        //ass
        drawerLayout = findViewById(R.id.DrawerLayout);
    }
    public void ClickMenu(View view){
        //Open drawer
        HomeActivity.openDrawer(drawerLayout);

    }
    public void ClickLogo(View view){
        HomeActivity.closeDrawer(drawerLayout);
    }
    public void ClickHome(View view){
        //redirect to home
        HomeActivity.redirectActivity(this,HomeActivity.class);
    }
    public void ClickGallery(View view){
        //recreate
        recreate();
    }

    public void ClickDaily(View view){
        //redirect to gallery
        HomeActivity.redirectActivity(this,Daily.class);
    }
    public void ClickMusic(View view){
        //redirect to music
        HomeActivity.redirectActivity(this,Music.class);
    }
    public void ClickProfile(View view){
        //redirect to profile
        HomeActivity.redirectActivity(this,Profile.class);
    }
    public void ClickLogout(View view){
        //close
        HomeActivity.logout(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //close drawer
        HomeActivity.closeDrawer(drawerLayout);
    }
}