package com.noyon.helplineapp;

import static com.thekhaeng.pushdownanim.PushDownAnim.MODE_STATIC_DP;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.thekhaeng.pushdownanim.PushDownAnim;

import java.util.ArrayList;
import java.util.HashMap;

import pl.bclogic.pulsator4droid.library.PulsatorLayout;


public class HomePage extends Fragment {

    Animation circle_anim;
    View myView;


   public static final int Call_Code=11;

   HashMap<String,String> map;
    // this is for District
  public static  ArrayList<HashMap<String,String>> dhakaDis=new ArrayList<>();
   public static ArrayList<HashMap<String,String>> barishalDis=new ArrayList<>();
   public  static  ArrayList<HashMap<String,String>> rajshahiDis=new ArrayList<>();

   public static  ArrayList<HashMap<String,String>> rangpurDis=new ArrayList<>();
   public static ArrayList<HashMap<String,String>> khulnaDis=new ArrayList<>();
   public static ArrayList<HashMap<String,String>> chitagongDis=new ArrayList<>();

   public static ArrayList<HashMap<String,String>> shyletDis=new ArrayList<>();





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView= inflater.inflate(R.layout.fragment_home_page, container, false);

        //find id's part
        TextView tvSeeAll=myView.findViewById(R.id.tvSeeAll);
        CardView HelpLine=myView.findViewById(R.id.HelpLine);
        TextView tvEmergencyNum=myView.findViewById(R.id.tvEmergencyNum);
        LinearLayout helpLay=myView.findViewById(R.id.helpLay);
        CardView divDhaka=myView.findViewById(R.id.divDhaka);
        CardView divBarishal=myView.findViewById(R.id.divBarisal);
        CardView divRajshahi= myView.findViewById(R.id.divRajshahi);
        CardView divRanpur=myView.findViewById(R.id.divRangpur);
        CardView divChitagong=myView.findViewById(R.id.divChittagong);
        CardView divKhulna=myView.findViewById(R.id.divKhulna);
        CardView divSylhet=myView.findViewById(R.id.divSylhet);

        //Calling District add list mathod=========================================================
         addDis();


        //set circle pulse animaton from github
        PulsatorLayout pulsator =  myView.findViewById(R.id.pulsator);
        pulsator.start();

        //set jump animation on helPLay
        Animation jumpAnim=AnimationUtils.loadAnimation(getActivity(),R.anim.text_jumb_anim);
        helpLay.setAnimation(jumpAnim);


        //give the rounded cadview an animation from anim
        circle_anim= AnimationUtils.loadAnimation(getActivity(),R.anim.circle_anim);
        HelpLine.setAnimation(circle_anim);


      //set a Push Animation to Emergency number card view
        PushDownAnim.setPushDownAnimTo(HelpLine,divChitagong,divBarishal,divDhaka,divRajshahi,divRanpur,divSylhet,divKhulna)
                .setScale( MODE_STATIC_DP, 12  );





   //tvSeeAll click event

        tvSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm=getActivity().getSupportFragmentManager();
                FragmentTransaction ft= fm.beginTransaction();
                ft.replace(R.id.container,new DivisionPage());
                ft.commit();


            }
        });


    // click event on emergency helpLine number
        HelpLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String emNum= tvEmergencyNum.getText().toString();

            //check permission givien or not
                if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {

                    doCall(emNum);

                }

                //if permission not granted or for the first time execute this
                else{

                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE},Call_Code);

                }


            }
        });


        //click event on dhaka div
        divDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity2.MainDistrictList=dhakaDis;
                Intent myIntent= new Intent(getActivity(),MainActivity2.class);
                startActivity(myIntent);


            }
        });

        //click event on barishal div

        divBarishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                MainActivity2.MainDistrictList=barishalDis;
                Intent myIntent= new Intent(getActivity(),MainActivity2.class);
                startActivity(myIntent);


            }
        });



        //clik event on rajshashi div
        divRajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity2.MainDistrictList=rajshahiDis;
                Intent myIntent= new Intent(getActivity(),MainActivity2.class);
                startActivity(myIntent);
            }
        });


        //clik event on chitagong div
        divChitagong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity2.MainDistrictList=chitagongDis;
                Intent myIntent= new Intent(getActivity(),MainActivity2.class);
                startActivity(myIntent);
            }
        });


        //clik event on rangpur div
        divRanpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity2.MainDistrictList=rangpurDis;
                Intent myIntent= new Intent(getActivity(),MainActivity2.class);
                startActivity(myIntent);
            }
        });

        //clik event on khulna div
        divKhulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity2.MainDistrictList=khulnaDis;
                Intent myIntent= new Intent(getActivity(),MainActivity2.class);
                startActivity(myIntent);
            }
        });

        //click event on sylhet div

        //clik event on sylhet div
        divSylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity2.MainDistrictList=shyletDis;
                Intent myIntent= new Intent(getActivity(),MainActivity2.class);
                startActivity(myIntent);
            }
        });





        return myView;
    }


    //Calling mathod
    public void doCall(String emNum){

        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + emNum));
        startActivity(intent);


    }

//call back mehot for if permision granted or not exexution will come to this section


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);


         if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED && Call_Code==11){
             doCall("999");

         }

    }


    //add Division  list method ================================================
    public void addDis(){

        //=============== add dhaka dis=====================

        map = new HashMap<>();
        map.put("district", "Dhaka");
        dhakaDis.add(map);

        map = new HashMap<>();
        map.put("district", "Faridpur");
        dhakaDis.add(map);

        map = new HashMap<>();
        map.put("district", "Gazipur");
        dhakaDis.add(map);


        map = new HashMap<>();
        map.put("district", "Gopalganj");
        dhakaDis.add(map);


        map = new HashMap<>();
        map.put("district", "Kishoreganj");
        dhakaDis.add(map);


        map = new HashMap<>();
        map.put("district", "Narayanganj ");
        dhakaDis.add(map);


        map = new HashMap<>();
        map.put("district", "Norshingdi");
        dhakaDis.add(map);


        //===============add khulna dis list
        map= new HashMap<>();
        map.put("district","Bagerhat");
        khulnaDis.add(map);


        map=new HashMap<>();
        map.put("district","Chuadanga");
        khulnaDis.add(map);


        map=new HashMap<>();
        map.put("district"," Jessore");
        khulnaDis.add(map);


        map=new HashMap<>();
        map.put("district","Khulna ");
        khulnaDis.add(map);

        map=new HashMap<>();
        map.put("district","Kushtia ");
        khulnaDis.add(map);

        map=new HashMap<>();
        map.put("district","Magura ");
        khulnaDis.add(map);



        map=new HashMap<>();
        map.put("district","Narail ");
        khulnaDis.add(map);


        //Rajshahi dis list add

        map=new HashMap<>();
        map.put("district","Bogra");
        rajshahiDis.add(map);

        map=new HashMap<>();
        map.put("district","Chapai Nawabganj");
        rajshahiDis.add(map);

        map=new HashMap<>();
        map.put("district","Joypurhat");
        rajshahiDis.add(map);

        map=new HashMap<>();
        map.put("district","Naogaon");
        rajshahiDis.add(map);

        map=new HashMap<>();
        map.put("district","Natore");
        rajshahiDis.add(map);

        map=new HashMap<>();
        map.put("district","Pabna");
        rajshahiDis.add(map);

        map=new HashMap<>();
        map.put("district","Rajshahi");
        rajshahiDis.add(map);
        

        //Sylhet dis list add

        map=new HashMap<>();
        map.put("district","Habiganj");
        shyletDis.add(map);

        map=new HashMap<>();
        map.put("district","Moulvibazar");
        shyletDis.add(map);

        map=new HashMap<>();
        map.put("district","Sunamganj");
        shyletDis.add(map);

        map=new HashMap<>();
        map.put("district","Sylhet");
        shyletDis.add(map);

        //Barisal  dis list

        map= new HashMap<>();
        map.put("district","Barguna");
        barishalDis.add(map);

        map= new HashMap<>();
        map.put("district","Bhola");
        barishalDis.add(map);

        map= new HashMap<>();
        map.put("district","Jhalokathi");
        barishalDis.add(map);

        map= new HashMap<>();
        map.put("district","Patuakhali");
        barishalDis.add(map);

        map= new HashMap<>();
        map.put("district","Perojpur");
        barishalDis.add(map);


        map= new HashMap<>();
        map.put("district","Barisal");
        barishalDis.add(map);


        //Chittagong  dis list

        map= new HashMap<>();
        map.put("district","Bandarban");
        chitagongDis.add(map);


        map= new HashMap<>();
        map.put("district","Chandpur");
        chitagongDis.add(map);

        map= new HashMap<>();
        map.put("district","Chittagong");
        chitagongDis.add(map);

        map= new HashMap<>();
        map.put("district","Comilla");
        chitagongDis.add(map);

        map= new HashMap<>();
        map.put("district","Cox's Bazar");
        chitagongDis.add(map);

        map= new HashMap<>();
        map.put("district","Feni");
        chitagongDis.add(map);


        map= new HashMap<>();
        map.put("district","Noakhali");
        chitagongDis.add(map);


        map= new HashMap<>();
        map.put("district","Rangamati ");
        chitagongDis.add(map);


        // Rangpur dis list

        map=new HashMap<>();
        map.put("district","Dinajpur");
        rangpurDis.add(map);

        map=new HashMap<>();
        map.put("district","Gaibandha");
        rangpurDis.add(map);


        map=new HashMap<>();
        map.put("district","Lalmonirhat");
        rangpurDis.add(map);

        map=new HashMap<>();
        map.put("district","Nilphamari ");
        rangpurDis.add(map);

        map=new HashMap<>();
        map.put("district","Panchagarh");
        rangpurDis.add(map);

        map=new HashMap<>();
        map.put("district","Rangpur");
        rangpurDis.add(map);

        map=new HashMap<>();
        map.put("district","Thakurgaon");
        rangpurDis.add(map);








    }



}