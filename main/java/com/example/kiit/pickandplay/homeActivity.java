package com.example.kiit.pickandplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class homeActivity extends AppCompatActivity {

    Button cout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cout=(Button)findViewById(R.id.cout);

        cout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nxt=new Intent(homeActivity.this,ChoicePick.class);
                startActivity(nxt);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        switch(id){
            case R.id.action_abt:
                Toast.makeText(this,"Android Studio Settings",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_exit:
                finish();


                break;
        }
        return super.onOptionsItemSelected(item);
    }
  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        switch(id){
            case R.id.action_abt:

              AlertDialog alertDialog = new AlertDialog.Builder(
                        ChoicePick.this).create();

                alertDialog.setTitle("Alert Dialog");

                alertDialog.setMessage("Welcome to AndroidHive.info");

                alertDialog.show();
                break;


            case R.id.action_exit:
                finish();


                break;
        }
        return super.onOptionsItemSelected(item);
    }
*/
}
