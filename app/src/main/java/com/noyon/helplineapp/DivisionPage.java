package com.noyon.helplineapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class DivisionPage extends Fragment {

   View myView ;

    HashMap<String,String>map;
    ArrayList<HashMap<String,String>> divisionList=new ArrayList<>();







    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView= inflater.inflate(R.layout.fragment_division_page, container, false);

        GridView gView=myView.findViewById(R.id.gView);

        //call divison add  method
        addDivision();



        MyAdapter adapter = new MyAdapter();
        gView.setAdapter(adapter);





        return myView;
    }



    // adapter class

    public class MyAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return divisionList.size();
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

            LayoutInflater layInfflatere= (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View myView=layInfflatere.inflate(R.layout.item_div,viewGroup,false);
            //find id's
            TextView tvDivName=myView.findViewById(R.id.tvDivNmae);
            CardView itemDiv=myView.findViewById(R.id.itemDiv);


            //get Hasmap from  arraylist
             HashMap<String,String> map= divisionList.get(i);

            //get string from hasmap
            String divName=map.get("Division");

            tvDivName.setText(divName);


            //set click event on div item

            itemDiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(i==0){
                        MainActivity2.MainDistrictList=HomePage.dhakaDis;
                        Intent myIntent=new Intent(getActivity(),MainActivity2.class);
                        startActivity(myIntent);

                    }
                    else if(i==1){
                        MainActivity2.MainDistrictList=HomePage.barishalDis;
                        Intent myIntent=new Intent(getActivity(),MainActivity2.class);
                        startActivity(myIntent);


                    }

                    else if(i==2){

                        MainActivity2.MainDistrictList=HomePage.chitagongDis;
                        Intent myIntent=new Intent(getActivity(),MainActivity2.class);
                        startActivity(myIntent);


                    }

                    else if (i==3) {


                        MainActivity2.MainDistrictList=HomePage.khulnaDis;
                        Intent myIntent=new Intent(getActivity(),MainActivity2.class);
                        startActivity(myIntent);

                    } else if (i==4) {
                        MainActivity2.MainDistrictList=HomePage.rajshahiDis;
                        Intent myIntent=new Intent(getActivity(),MainActivity2.class);
                        startActivity(myIntent);
                    }

                    else if (i==5) {
                        MainActivity2.MainDistrictList=HomePage.rangpurDis;
                        Intent myIntent=new Intent(getActivity(),MainActivity2.class);
                        startActivity(myIntent);
                    }

                    else if(i==6){

                        MainActivity2.MainDistrictList=HomePage.shyletDis;
                        Intent myIntent=new Intent(getActivity(),MainActivity2.class);
                        startActivity(myIntent);
                    }


                }
            });


            return myView;
        }
    }




    //user define method for division name

    public void addDivision(){

        map=new HashMap<>();
        map.put("Division","Dhaka");
        divisionList.add(map);

        map=new HashMap<>();
        map.put("Division","Barisal");
        divisionList.add(map);


        map=new HashMap<>();
        map.put("Division","Chittagong");
        divisionList.add(map);

        map=new HashMap<>();
        map.put("Division","Khulna");
        divisionList.add(map);

        map=new HashMap<>();
        map.put("Division","Rajshahi");
        divisionList.add(map);

        map=new HashMap<>();
        map.put("Division","Rangpur");
        divisionList.add(map);

        map=new HashMap<>();
        map.put("Division","Sylhet");
        divisionList.add(map);



    }








}