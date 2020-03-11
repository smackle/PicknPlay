package com.example.kiit.pickandplay;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class ChoicePick extends AppCompatActivity {

    RadioButton cbmovie;
    RadioButton cbmusic;
    RadioButton cbfriend;
    Button optionbtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_pick);

        cbmovie=(RadioButton) findViewById(R.id.cbmovie);
        cbmusic=(RadioButton) findViewById(R.id.cbmusic);
        cbfriend=(RadioButton) findViewById(R.id.cbfriend);
        optionbtn=(Button)findViewById(R.id.optionbtn);

        optionbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cbmovie.isChecked())
                {
                    Intent mov=new Intent(ChoicePick.this,MoviesActivity.class);
                    startActivity(mov);

                }

                if(cbmusic.isChecked())
                {
                    Intent mus=new Intent(ChoicePick.this,MusicActivities.class);
                    startActivity(mus);
                }
                if(cbfriend.isChecked())
                {
                    Intent frd=new Intent(ChoicePick.this,frch.class);
                    startActivity(frd);
                }
            }
        });

    }


}
