package com.example.kiit.pickandplay;

import android.content.Intent;
import android.content.SearchRecentSuggestionsProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class TwoFragement extends Fragment{

    TextView prcntmv,mname;
    public TwoFragement() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_two_fragement, container, false);

       prcntmv=(TextView)rootView.findViewById(R.id.prcntmv);

        mname=(TextView)rootView.findViewById(R.id.mname);


        //retrieving data using bundle
        Bundle bundle=getArguments();

        String yname=bundle.getString("name");

        mname.setText(yname);
       /* if (bundle != null)
        {
             mname.setText(String.valueOf(bundle.getString("name")));

        }
*/        //mname.setText(String.valueOf(bundle.getString("name")));

        return rootView;














        /*Intent rcv=getActivity().getIntent();
        String msg=rcv.getStringExtra("message");

        String sum=msg;

        int value=sum.hashCode();

        Random random=new Random(value);
        result=(random.nextInt(100)+1)+"%";
        prcntmv.setText(result);

*/

      //  return inflater.inflate(R.layout.activity_two_fragement, container, false);
    }






}