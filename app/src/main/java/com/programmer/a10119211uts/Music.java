package com.programmer.a10119211uts;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Music extends AppCompatActivity {
    //(7 Mei 2022, 10119211, Badra Samsudin Ramdan N, IF-06)
    Context contextVideo, context;
    RecyclerView recyclerViewVideo, recyclerViewMusic;
    RecyclerView.Adapter recyclerViewAdapterVideo, recyclerViewAdapterMusic;
    RecyclerView.LayoutManager recylerViewLayoutManagerVideo, recylerViewLayoutManagerMusic;
    VideoView videoView;
    String[] subjectValuesVideo = {
            "If u could see me crying in my room", "AMAZING", "Losing us"
    };
    String[] subjectUrlVideo;
    String[] subjectValuesMusic = {
            "ONE IN A MILLION - Rex Orange County",
            "I Wanna Be Yours - Arctic Monkeys",
            "Stuck On You - Giveon",
            "Be My Mistake - The 1975",
            "The Most Beautiful Thing - Bruno Major",
            "This Side of Paradise - Coyote Theory",
            "Shouldn't Be - Luke Chiang",
            "Line Without a Hook - Ricky Montgomery",
            "keepyousafe - Yahya",
            "Every Summertime - NIKI",
            "Best Part (feat. Daniel Caesar) - H.E.R",
            "Die For You - The Weeknd",
            "i <3 u - Boy Pablo"
};
    DrawerLayout drawerLayout;
@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        subjectUrlVideo=new String[]{
        "android.resource://"+getPackageName()+"/"+R.raw.video,
        "android.resource://"+getPackageName()+"/"+R.raw.video2,
        "android.resource://"+getPackageName()+"/"+R.raw.video3
        };
        contextVideo=getApplicationContext();
        recyclerViewVideo=findViewById(R.id.recyclerViewVideo);
        recylerViewLayoutManagerVideo=new LinearLayoutManager(this);
        //context,LinearLayoutManager.HORIZONTAL,false
        recyclerViewVideo.setLayoutManager(recylerViewLayoutManagerVideo);
        recyclerViewAdapterVideo=new com.programmer.a10119211uts.AdapterRecycleViewVideo(subjectValuesVideo,subjectUrlVideo,this);
        recyclerViewVideo.setAdapter(recyclerViewAdapterVideo);

        context=getApplicationContext();
        recyclerViewMusic=findViewById(R.id.recyclerViewMusic);
        recylerViewLayoutManagerMusic=new LinearLayoutManager(context);
        //context,LinearLayoutManager.HORIZONTAL,false
        recyclerViewMusic.setLayoutManager(recylerViewLayoutManagerMusic);
        recyclerViewAdapterMusic=new com.programmer.a10119211uts.AdapterRecycleViewMusic(subjectValuesMusic,context);
        recyclerViewMusic.setAdapter(recyclerViewAdapterMusic);

        //ass
        drawerLayout=findViewById(R.id.DrawerLayout);
        }
public void ClickMenu(View view){
        //Open drawer
        com.programmer.a10119211uts.HomeActivity.openDrawer(drawerLayout);

        }
public void ClickLogo(View view){
        com.programmer.a10119211uts.HomeActivity.closeDrawer(drawerLayout);
        }
public void ClickHome(View view){
        //redirect to home
        com.programmer.a10119211uts.HomeActivity.redirectActivity(this, com.programmer.a10119211uts.HomeActivity.class);
        }
public void ClickGallery(View view){
        //redirect to gallery
        com.programmer.a10119211uts.HomeActivity.redirectActivity(this, com.programmer.a10119211uts.Gallery.class);
        }

public void ClickDaily(View view){
        //redirect to gallery
        com.programmer.a10119211uts.HomeActivity.redirectActivity(this, com.programmer.a10119211uts.Daily.class);
        }
public void ClickMusic(View view){

        //recreate
        recreate();
        }
public void ClickProfile(View view){
        //redirect to profile
        com.programmer.a10119211uts.HomeActivity.redirectActivity(this, com.programmer.a10119211uts.Profile.class);
        }
public void ClickLogout(View view){
        //close
        com.programmer.a10119211uts.HomeActivity.logout(this);
        }

@Override
protected void onPause(){
        super.onPause();
        //close drawer
        com.programmer.a10119211uts.HomeActivity.closeDrawer(drawerLayout);
        }
        }