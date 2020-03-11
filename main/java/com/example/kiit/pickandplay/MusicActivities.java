package com.example.kiit.pickandplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MusicActivities extends AppCompatActivity {

    EditText mcname;
    TextView msprc;
    Button mcbtn,topercent2;
    String result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_activities);

        mcname = (EditText) findViewById(R.id.mcname);
        mcbtn = (Button) findViewById(R.id.mcbtn);
        msprc=(TextView)findViewById(R.id.msprc);
        topercent2=(Button)findViewById(R.id.topercent2);

        mcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = mcname.getText().toString();
                String y = "music";
                String sum = x + y;
                sum = sum.toLowerCase();
                int value = sum.hashCode();

                Random random = new Random(value);
                result2 = (random.nextInt(100) + 1) + "%";
               msprc.setText(result2);
            }
        });

        topercent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prc2=new Intent(MusicActivities.this,MusicSuggestion.class);
                Toast.makeText(MusicActivities.this,"So its "+result2,Toast.LENGTH_LONG).show();
                startActivity(prc2);
            }
        });



    }
}
