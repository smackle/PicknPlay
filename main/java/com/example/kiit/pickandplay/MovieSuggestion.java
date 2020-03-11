package com.example.kiit.pickandplay;

import android.content.Intent;
import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MovieSuggestion extends AppCompatActivity {

    RadioButton p1,p2,p3,p4,p5;
    Button mbt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_suggestion);

        mbt=(Button)findViewById(R.id.mbt);
        p1=(RadioButton)findViewById(R.id.p1);
        p2=(RadioButton)findViewById(R.id.p2);
        p3=(RadioButton)findViewById(R.id.p3);
        p4=(RadioButton)findViewById(R.id.p4);
        p5=(RadioButton)findViewById(R.id.p5);


        mbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (p1.isChecked())
                {
                    Intent back1= new Intent(MovieSuggestion.this, MovieList.class);
                    Toast.makeText(MovieSuggestion.this,"Hey, Its the Comedy Genre",Toast.LENGTH_LONG).show();
                    Bundle b1= new Bundle();
                    String VAL1 = null;
                    b1.putInt("VAL1", 1);
                    back1.putExtras(b1);
                    startActivity(back1);

                }

                if (p2.isChecked())
                {
                    Intent back1= new Intent(MovieSuggestion.this, MovieList.class);
                    Toast.makeText(MovieSuggestion.this,"Hey, Its the Horror Genre",Toast.LENGTH_LONG).show();
                    Bundle b1= new Bundle();
                    String VAL1 = null;
                    b1.putInt("VAL1", 2);
                    back1.putExtras(b1);
                    startActivity(back1);
                }

                if (p3.isChecked())
                {
                    Intent back1= new Intent(MovieSuggestion.this, MovieList.class);
                    Toast.makeText(MovieSuggestion.this,"Hey, Its the Romance Genre",Toast.LENGTH_LONG).show();
                    Bundle b1= new Bundle();
                    String VAL1 = null;
                    b1.putInt("VAL1", 3);
                    back1.putExtras(b1);
                    startActivity(back1);
                }

                if (p4.isChecked())
                {
                    Intent back1= new Intent(MovieSuggestion.this, MovieList.class);
                    Toast.makeText(MovieSuggestion.this,"Hey, Its the fantasy Genre",Toast.LENGTH_LONG).show();
                    Bundle b1= new Bundle();
                    String VAL1 = null;
                    b1.putInt("VAL1", 4);
                    back1.putExtras(b1);
                    startActivity(back1);
                }

                if (p5.isChecked())
                {
                    Intent back1= new Intent(MovieSuggestion.this, MovieList.class);
                    Toast.makeText(MovieSuggestion.this,"Hey, Its the Superhero Genre",Toast.LENGTH_LONG).show();
                    Bundle b1= new Bundle();
                    String VAL1 = null;
                    b1.putInt("VAL1", 5);
                    back1.putExtras(b1);
                    startActivity(back1);

                }



            }
        });


    }
}
