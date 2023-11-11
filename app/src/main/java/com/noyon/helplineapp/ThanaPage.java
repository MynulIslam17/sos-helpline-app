package com.noyon.helplineapp;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;


public class ThanaPage extends Fragment {

    public static ArrayList<HashMap<String,String>> MainThanaList=new ArrayList<>();
    HashMap<String,String> map;

    public static final int Call_Code=1;


  ListView lView2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
          View myView1= inflater.inflate(R.layout.fragment_thana_page, container, false);

          lView2=myView1.findViewById(R.id.lView2);


          MyAdapter adapter = new MyAdapter();
          lView2.setAdapter(adapter);




          return myView1;
    }


    //create a class adapter

    public class MyAdapter extends BaseAdapter{



        @Override
        public int getCount() {
            return MainThanaList.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            LayoutInflater layInflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View myView=layInflater.inflate(R.layout.thana_item,viewGroup,false);
            //find id's
            TextView thanaName=myView.findViewById(R.id.thanaName);
            CardView thanaItem=myView.findViewById(R.id.thanaItem);


            //get hashmap from arraylist
            HashMap<String,String> map=MainThanaList.get(i);
            //get String from hashmap
            String ThanaName=map.get("thana");
             String PhoneNo=map.get("number");



            //thana item click event
            thanaItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                       //condition is for check if i have permision or not
                     if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                         doCall(PhoneNo);

                    }

                 else{

                     // this line will show a aleart box allow permission
                        ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.CALL_PHONE},Call_Code);


                    }


                }
            });




            //show it on listView
            thanaName.setText(ThanaName);




            return myView;
        }
    }



    // method for calling
    public void doCall(String phoneNo){

        Intent myIntent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+phoneNo));
        startActivity(myIntent);


    }




}