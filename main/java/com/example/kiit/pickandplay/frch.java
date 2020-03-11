package com.example.kiit.pickandplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class frch extends AppCompatActivity {
    TextView tview;
    EditText yname;
    EditText fname;
    Button fndbtn;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frch);
        tview=findViewById(R.id.tview);
        fname=findViewById(R.id.fname);
        yname=findViewById(R.id.yname);
        fndbtn=(Button)findViewById(R.id.fndbtn);

       fndbtn.setOnClickListener(new View.OnClickListener() {
       @Override
        public void onClick(View view) {
        String x=yname.getText().toString();
        String y=fname.getText().toString();
        String sum=x+y;
        sum=sum.toLowerCase();
        int value=sum.hashCode();

        Random random=new Random(value);
        result=(random.nextInt(100)+1)+"%";
        tview.setText("Friendship is "+result);


    }
});
    }
}