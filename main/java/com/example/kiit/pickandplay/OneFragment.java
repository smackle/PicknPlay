package com.example.kiit.pickandplay;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class OneFragment extends Fragment{
    EditText mvname;
    Button mvbtn;
    String name;

    public OneFragment() {
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

        View rootView = inflater.inflate(R.layout.activity_one_fragment, container, false);

        mvname=(EditText)rootView.findViewById(R.id.mvname);
        mvbtn = (Button) rootView.findViewById(R.id.mvbtn);
        mvbtn.setOnClickListener(mClickListener);
        return rootView;
    }


    View.OnClickListener mClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            name=mvname.getText().toString();

          //  FragmentTransaction transection=getFragmentManager().beginTransaction();
          //  TwoFragement mfragment=new TwoFragement();
               //using Bundle to send data

            Bundle bundle=new Bundle();
            bundle.putString("name",name);

            FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

            TwoFragement twoFragement=new TwoFragement();
            twoFragement.setArguments(bundle);

            fragmentTransaction.replace(R.id.mvname,twoFragement);
            fragmentTransaction.commit();

        }

           /* String c = mvname.getText().toString();
            Intent var = new Intent(getActivity(), TwoFragement.class);
            var.putExtra("message", c);
            getActivity().startActivity(var);
            */
    };


}