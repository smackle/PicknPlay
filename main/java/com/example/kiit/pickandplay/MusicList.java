package com.example.kiit.pickandplay;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MusicList extends AppCompatActivity {

    public ImageButton pop,rock,hiphop,india,edm;
    public TextView tpop,trock,thiphop,tind,tedm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);

        pop=(ImageButton)findViewById(R.id.pop);
        rock=(ImageButton)findViewById(R.id.rock);
        hiphop=(ImageButton)findViewById(R.id.hiphop);
        india=(ImageButton)findViewById(R.id.india);
        edm=(ImageButton)findViewById(R.id.edm);

        tpop=(TextView)findViewById(R.id.tpop);
        trock=(TextView)findViewById(R.id.trock);
        thiphop=(TextView)findViewById(R.id.thiphop);
        tind=(TextView)findViewById(R.id.tind);
        tedm=(TextView)findViewById(R.id.tedm);



        Bundle bun2 = getIntent().getExtras();
        int val2 = bun2.getInt("VAL2");
        if(val2==1)
        {
            pop.setVisibility(View.VISIBLE);
            india.setVisibility(View.INVISIBLE);
            rock.setVisibility(View.INVISIBLE);
            hiphop.setVisibility(View.INVISIBLE);
            edm.setVisibility(View.INVISIBLE);

            tpop.setVisibility(View.VISIBLE);
            tind.setVisibility(View.INVISIBLE);
            trock.setVisibility(View.INVISIBLE);
            thiphop.setVisibility(View.INVISIBLE);
            tedm.setVisibility(View.INVISIBLE);
        }
        if(val2==2)
        {
            pop.setVisibility(View.INVISIBLE);
            india.setVisibility(View.VISIBLE);
            rock.setVisibility(View.INVISIBLE);
            hiphop.setVisibility(View.INVISIBLE);
            edm.setVisibility(View.INVISIBLE);

            tpop.setVisibility(View.INVISIBLE);
            tind.setVisibility(View.VISIBLE);
            trock.setVisibility(View.INVISIBLE);
            thiphop.setVisibility(View.INVISIBLE);
            tedm.setVisibility(View.INVISIBLE);
        }
        if(val2==3)
        {
            pop.setVisibility(View.INVISIBLE);
            india.setVisibility(View.INVISIBLE);
            rock.setVisibility(View.VISIBLE);
            hiphop.setVisibility(View.INVISIBLE);
            edm.setVisibility(View.INVISIBLE);

            tpop.setVisibility(View.INVISIBLE);
            tind.setVisibility(View.INVISIBLE);
            trock.setVisibility(View.VISIBLE);
            thiphop.setVisibility(View.INVISIBLE);
            tedm.setVisibility(View.INVISIBLE);
        }
        if(val2==4)
        {
            pop.setVisibility(View.INVISIBLE);
            india.setVisibility(View.INVISIBLE);
            rock.setVisibility(View.INVISIBLE);
            hiphop.setVisibility(View.VISIBLE);
            edm.setVisibility(View.INVISIBLE);

            tpop.setVisibility(View.INVISIBLE);
            tind.setVisibility(View.INVISIBLE);
            trock.setVisibility(View.INVISIBLE);
            thiphop.setVisibility(View.VISIBLE);
            tedm.setVisibility(View.INVISIBLE);
        }
        if(val2==5)
        {
            pop.setVisibility(View.INVISIBLE);
            india.setVisibility(View.INVISIBLE);
            rock.setVisibility(View.INVISIBLE);
            hiphop.setVisibility(View.INVISIBLE);
            edm.setVisibility(View.VISIBLE);

            tpop.setVisibility(View.INVISIBLE);
            tind.setVisibility(View.INVISIBLE);
            trock.setVisibility(View.INVISIBLE);
            thiphop.setVisibility(View.INVISIBLE);
            tedm.setVisibility(View.VISIBLE);
        }

        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent yt_play = new Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.youtube.com/channel/UCE80FOXpJydkkMo-BYoJdEg"));
                startActivity(yt_play);
            }
        });

        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yt_play2 = new Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.youtube.com/user/tseries"));
                startActivity(yt_play2);

            }
        });
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mbrowse3=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/channel/UCRZoK7sezr5KRjk7BBjmH6w"));
                startActivity(mbrowse3);
            }
        });
        hiphop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mbrowse4=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/channel/UCUnSTiCHiHgZA9NQUG6lZkQ"));
                startActivity(mbrowse4);
            }
        });

        edm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mbrowse5=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/channel/UCCIPrrom6DIftcrInjeMvsQ"));
                startActivity(mbrowse5);
            }
        });


    }
}
