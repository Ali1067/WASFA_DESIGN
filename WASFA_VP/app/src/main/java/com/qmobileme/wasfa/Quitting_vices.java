package com.qmobileme.wasfa;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class Quitting_vices extends AppCompatActivity {

    LinearLayout ll_back;
    VideoView videoView;
    TextView tv_start;
    String video_url = "https://www.youtube.com/watch?v=0gGMqjeeiJY";
    MediaController mediaControler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().
                setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_quitting_vices);
        getSupportActionBar().hide();
        actionbar();
        initialize();
        view_cliks();

    }

    public void initialize()
    {
        ll_back = findViewById(R.id.ll_back);
        videoView = findViewById(R.id.vv_videoview);
        tv_start = findViewById(R.id.tv_start);


        Uri uri = Uri.parse("https://www.youtube.com/watch?v=0gGMqjeeiJY");
//        VideoView simpleVideoView = (VideoView) findViewById(R.id.vid); // initiate a video view
        videoView.setVideoURI(uri);
        videoView.start();

//        mediaControler = new MediaController(this);
//        mediaControler.setAnchorView(videoView);
//        videoView.setMediaController(mediaControler);
//        videoView.requestFocus();
//        videoView.getDuration();
//        videoView.setVideoPath(video_url);
//        videoView.start();



//        videoView.setVideoPath("https://www.youtube.com/watch?v=97MLKZnQqP8");
//        videoView.start();
    }


    public void view_cliks()
    {
        tv_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quitting_vices.this, QuitSmokingActivity.class);
                startActivity(intent);
//                finish();
            }
        });

    }

    public void actionbar()
    {
            getSupportActionBar().setDisplayOptions(android.support.v7.app.ActionBar.DISPLAY_SHOW_CUSTOM);
            getSupportActionBar().setCustomView(R.layout.health_quitting_extra);
            ll_back = findViewById(R.id.ll_back);

            ll_back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(Quitting_vices.this, "Clicked: ", Toast.LENGTH_SHORT).show();
        }
    });
}

    
}
