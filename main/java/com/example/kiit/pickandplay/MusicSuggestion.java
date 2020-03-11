package com.example.kiit.pickandplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MusicSuggestion extends AppCompatActivity {

    RadioButton pp1,pp2,pp3,pp4,pp5;
    Button musbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_suggestion);

        pp1=(RadioButton)findViewById(R.id.pp1);
        pp2=(RadioButton)findViewById(R.id.pp2);
        pp3=(RadioButton)findViewById(R.id.pp3);
        pp4=(RadioButton)findViewById(R.id.pp4);
        pp5=(RadioButton)findViewById(R.id.pp5);
        musbtn=(Button)findViewById(R.id.musbtn);


        musbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (pp1.isChecked())
                {
                    Intent back2= new Intent(MusicSuggestion.this, MusicList.class);
                    Toast.makeText(MusicSuggestion.this,"You Got the POP genre",Toast.LENGTH_LONG).show();
                    Bundle b2= new Bundle();
                    String VAL2 = null;
                    b2.putInt("VAL2", 1);
                    back2.putExtras(b2);
                    startActivity(back2);
                }
                if (pp2.isChecked())
                {
                    Intent back2= new Intent(MusicSuggestion.this, MusicList.class);
                    Toast.makeText(MusicSuggestion.this,"Listem some Indian hits",Toast.LENGTH_LONG).show();
                    Bundle b2= new Bundle();
                    String VAL2 = null;
                    b2.putInt("VAL2", 2);
                    back2.putExtras(b2);
                    startActivity(back2);
                }
                if (pp3.isChecked())
                {
                    Intent back2= new Intent(MusicSuggestion.this, MusicList.class);
                    Toast.makeText(MusicSuggestion.this,"You got the Rock Genre",Toast.LENGTH_LONG).show();
                    Bundle b2= new Bundle();
                    String VAL2 = null;
                    b2.putInt("VAL2", 3);
                    back2.putExtras(b2);
                    startActivity(back2);
                }
                if (pp4.isChecked())
                {
                    Intent back2= new Intent(MusicSuggestion.this, MusicList.class);
                    Toast.makeText(MusicSuggestion.this,"Hey, Its the Hip-Hop Genre",Toast.LENGTH_LONG).show();
                    Bundle b2= new Bundle();
                    String VAL2 = null;
                    b2.putInt("VAL2", 4);
                    back2.putExtras(b2);
                    startActivity(back2);
                }
                if (pp5.isChecked())
                {
                    Intent back2= new Intent(MusicSuggestion.this, MusicList.class);
                    Toast.makeText(MusicSuggestion.this,"Boost Yourself with Electronic Music",Toast.LENGTH_LONG).show();
                    Bundle b2= new Bundle();
                    String VAL2 = null;
                    b2.putInt("VAL2", 5);
                    back2.putExtras(b2);
                    startActivity(back2);
                }




            }
        });



    }
}
