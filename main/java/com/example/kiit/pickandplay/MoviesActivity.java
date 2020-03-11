package com.example.kiit.pickandplay;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

public class MoviesActivity extends AppCompatActivity {
    EditText mvname;
    Button mvbtn,topercent;
    TextView percent;
    ProgressBar pb;
    String result;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        mvname = (EditText) findViewById(R.id.mvname);
        mvbtn = (Button) findViewById(R.id.mvbtn);
        percent=(TextView)findViewById(R.id.percent);
        topercent=(Button)findViewById(R.id.topercent);

      mvbtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String x = mvname.getText().toString();
              String y = "movies";
              String sum = x + y;
              sum = sum.toLowerCase();
              int value = sum.hashCode();

              Random random = new Random(value);
              result = (random.nextInt(100) + 1) + "%";
              percent.setText(result);
          }
      });

      topercent.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent prc=new Intent(MoviesActivity.this,MovieSuggestion.class);
              startActivity(prc);
          }
      });


    }
}
