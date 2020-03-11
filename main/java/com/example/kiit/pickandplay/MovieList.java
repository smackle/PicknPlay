package com.example.kiit.pickandplay;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MovieList extends AppCompatActivity {

  public  ImageButton comedy,horror,romance,fantasy,superhero;
  public TextView tcom,thor,trom,tfan,tsup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        comedy=(ImageButton)findViewById(R.id.comedy);
        romance=(ImageButton)findViewById(R.id.romance);
        horror=(ImageButton)findViewById(R.id.horror);
        fantasy=(ImageButton)findViewById(R.id.fantasy);
        superhero=(ImageButton)findViewById(R.id.superhero);

        tcom=(TextView)findViewById(R.id.tcom);
        thor=(TextView)findViewById(R.id.thor);
        trom=(TextView)findViewById(R.id.trom);
        tfan=(TextView)findViewById(R.id.tfan);
        tsup=(TextView)findViewById(R.id.tsup);



        Bundle bun1 = getIntent().getExtras();
        int val1 = bun1.getInt("VAL1");
        if(val1==1)
        {
            comedy.setVisibility(View.VISIBLE);
            horror.setVisibility(View.INVISIBLE);
            fantasy.setVisibility(View.INVISIBLE);
            romance.setVisibility(View.INVISIBLE);
            superhero.setVisibility(View.INVISIBLE);

            tcom.setVisibility(View.VISIBLE);
            thor.setVisibility(View.INVISIBLE);
            trom.setVisibility(View.INVISIBLE);
            tfan.setVisibility(View.INVISIBLE);
            tsup.setVisibility(View.INVISIBLE);
        }
          if(val1==2)
        {
            comedy.setVisibility(View.INVISIBLE);
            horror.setVisibility(View.VISIBLE);
            fantasy.setVisibility(View.INVISIBLE);
            romance.setVisibility(View.INVISIBLE);
            superhero.setVisibility(View.INVISIBLE);

            tcom.setVisibility(View.INVISIBLE);
            thor.setVisibility(View.VISIBLE);
            trom.setVisibility(View.INVISIBLE);
            tfan.setVisibility(View.INVISIBLE);
            tsup.setVisibility(View.INVISIBLE);
        }
        if(val1==3)
        {
            comedy.setVisibility(View.INVISIBLE);
            horror.setVisibility(View.INVISIBLE);
            fantasy.setVisibility(View.INVISIBLE);
            romance.setVisibility(View.VISIBLE);
            superhero.setVisibility(View.INVISIBLE);

            tcom.setVisibility(View.INVISIBLE);
            thor.setVisibility(View.INVISIBLE);
            trom.setVisibility(View.VISIBLE);
            tfan.setVisibility(View.INVISIBLE);
            tsup.setVisibility(View.INVISIBLE);
        }
        if(val1==4)
        {
            comedy.setVisibility(View.INVISIBLE);
            horror.setVisibility(View.INVISIBLE);
            fantasy.setVisibility(View.VISIBLE);
            romance.setVisibility(View.INVISIBLE);
            superhero.setVisibility(View.INVISIBLE);

            tcom.setVisibility(View.INVISIBLE);
            thor.setVisibility(View.INVISIBLE);
            trom.setVisibility(View.INVISIBLE);
            tfan.setVisibility(View.VISIBLE);
            tsup.setVisibility(View.INVISIBLE);
        }
        if(val1==5)
        {
            comedy.setVisibility(View.INVISIBLE);
            horror.setVisibility(View.INVISIBLE);
            fantasy.setVisibility(View.INVISIBLE);
            romance.setVisibility(View.INVISIBLE);
            superhero.setVisibility(View.VISIBLE);

            tcom.setVisibility(View.INVISIBLE);
            thor.setVisibility(View.INVISIBLE);
            trom.setVisibility(View.INVISIBLE);
            tfan.setVisibility(View.INVISIBLE);
            tsup.setVisibility(View.VISIBLE);
        }

        comedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browse=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/search/title?genres=comedy&title_type=feature&explore=genres"));
                startActivity(browse);
            }
        });

        horror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browse2=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.imdb.com/list/ls000009468/"));
                startActivity(browse2);
            }
        });
        romance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browse3=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.imdb.com/list/ls003649855/"));
                startActivity(browse3);
            }
        });
        fantasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browse4=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.imdb.com/list/ls062154765/"));
                startActivity(browse4);
            }
        });

        superhero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browse5=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.imdb.com/list/ls032971261/"));
                startActivity(browse5);
            }
        });


    }
}
