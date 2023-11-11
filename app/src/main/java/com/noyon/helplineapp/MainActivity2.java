package com.noyon.helplineapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity2 extends AppCompatActivity {

    ListView lView;

   HashMap<String,String> map;
  public static ArrayList<HashMap<String,String>> MainDistrictList=new ArrayList<>();

      //Dhaka dis thana arrayList
     ArrayList<HashMap<String,String>> dhakaThanaList=new ArrayList<>();
   ArrayList<HashMap<String,String >> gajuputThanaList=new ArrayList<>();
   ArrayList<HashMap<String,String>> narayonganjThanaList=new ArrayList<>();
   ArrayList<HashMap<String,String>> faridpurThanaList = new ArrayList<>();
   ArrayList<HashMap<String,String>> gopalganjThanaList= new ArrayList<>();
   ArrayList<HashMap<String,String>>  kishoreganjThanaList= new ArrayList<>();
   ArrayList<HashMap<String,String>> narsingdhiThanaList=new ArrayList<>();


   // chitagong dis thana  arrayList

    ArrayList<HashMap<String,String >> chiittagongThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>>  comillaThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>>  feniThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>> chandpurThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>> noakhaliThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>> rangamatiThanaList=new ArrayList<>() ;
    ArrayList<HashMap<String,String>> bandarbanThanaList=new ArrayList<>();

    ArrayList<HashMap<String,String>> coxsBazarThanaList=new ArrayList<>();


    //barishal dis thana arrylist

      ArrayList<HashMap<String,String>> bargunaThanaList=new ArrayList<>();
      ArrayList<HashMap<String,String>> bholaThanaList=new ArrayList<>();

    ArrayList<HashMap<String,String>> jhalokathiThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>> patuakhaliThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>> perojpurThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>> barishalThanaList=new ArrayList<>();


    //rangpur dis thana arrayList

    ArrayList<HashMap<String,String>> dinajpurThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>> gaibandaThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>> lalminirhatThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>> nilphamariThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>> panchagrahThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>> rangpurThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>> thakurgaonThanaList=new ArrayList<>();

   // khulna thana arrayList

    ArrayList<HashMap<String,String>>  bagerhatThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>>  chuadangaThanaList=new ArrayList<>();

    ArrayList<HashMap<String,String>>  jessoreThanaList=new ArrayList<>();

    ArrayList<HashMap<String,String>>  khulnaThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>>   norailThanaList=new ArrayList<>();


    ArrayList<HashMap<String,String>>  maguraThanaList=new ArrayList<>();

    ArrayList<HashMap<String,String>>  kushtiaThanaList=new ArrayList<>();

    // sylhet dis thana arrayList
    ArrayList<HashMap<String,String>>  hobigonjThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>>  moulvibazarThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>> shunamganjThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>>  sylhetThanaList=new ArrayList<>();

    // rajsahi dis thana arraylist
    ArrayList<HashMap<String,String>>   bograThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>>  chapaiNawabganjThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>>  joypurhattThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>>  naogaonThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>>  natoreThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>>  pabnaThanaList=new ArrayList<>();
    ArrayList<HashMap<String,String>> rajshahiThanaList=new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //find id's

        lView=findViewById(R.id.lView);

       // mathod for adding thana list
        addThana();


        MyAdapater adapater= new MyAdapater();
        lView.setAdapter(adapater);





        
    }

    //adapter method

     public class MyAdapater extends BaseAdapter{

           LayoutInflater layInflater;
         @Override
         public int getCount() {
             return MainDistrictList.size() ;
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

             layInflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
             View myViwe=layInflater.inflate(R.layout.district_item,viewGroup,false);

             //find id's
             TextView tvDisName=myViwe.findViewById(R.id.tvDisName);
             CardView itemDis= myViwe.findViewById(R.id.itemDis);

             //get hashmap from arraylist

             HashMap<String,String> map=MainDistrictList.get(i);

             //get string from hashmap
             String DisName=map.get("district");

          //showing district name in the textview;
             tvDisName.setText(DisName);


             //set on click event in distict item

             itemDis.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {

                     if(MainActivity2.MainDistrictList==HomePage.dhakaDis){

                         if(i==0){
                             ThanaPage.MainThanaList=dhakaThanaList;
                             FragmentManager fm= getSupportFragmentManager();
                             FragmentTransaction ft= fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();

                         }

                         else if(i==1){
                             ThanaPage.MainThanaList=faridpurThanaList;
                             FragmentManager fm= getSupportFragmentManager();
                             FragmentTransaction ft= fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();


                         } else if (i==2) {

                             ThanaPage.MainThanaList=gajuputThanaList;
                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft= fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();
                         }


                         else if (i==3) {

                             ThanaPage.MainThanaList=gopalganjThanaList;
                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft= fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();
                         }


                         else if (i==4) {

                             ThanaPage.MainThanaList=kishoreganjThanaList;
                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft= fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();
                         }

                         else if (i==5) {

                             ThanaPage.MainThanaList=narayonganjThanaList;
                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft= fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();
                         }


                         else {

                             ThanaPage.MainThanaList=narsingdhiThanaList;
                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft= fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();
                         }


                     }


                     else if (MainActivity2.MainDistrictList==HomePage.chitagongDis){



                         if(i==0){
                             ThanaPage.MainThanaList=bandarbanThanaList;

                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft=fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();

                         }
                         else if (i==1) {

                             ThanaPage.MainThanaList=chandpurThanaList;

                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft=fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();
                         }

                         else if(i==2){

                             ThanaPage.MainThanaList=chiittagongThanaList;
                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft=fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());;
                             ft.commit();

                         }

                         else if(i==3){
                             ThanaPage.MainThanaList=comillaThanaList;
                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft=fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();




                         }

                         else if(i==4){
                             ThanaPage.MainThanaList=coxsBazarThanaList;
                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft=fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();

                         }
                         else if(i==5){
                             ThanaPage.MainThanaList=feniThanaList;
                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft=fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();

                         }

                         else if(i==6){
                             ThanaPage.MainThanaList=noakhaliThanaList;
                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft=fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();


                         }
                         else {
                             ThanaPage.MainThanaList=rangamatiThanaList;
                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft=fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();

                         }

                     }

                   else if(MainActivity2.MainDistrictList==HomePage.barishalDis){

                         if (i == 0) {

                             ThanaPage.MainThanaList=bargunaThanaList;

                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft=fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();

                         }


                         else if(i==1){
                             ThanaPage.MainThanaList=bholaThanaList;

                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft=fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();

                         }

                         else if(i==2){
                             ThanaPage.MainThanaList=jhalokathiThanaList;

                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft=fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();

                         }




                         else if(i==3){
                             ThanaPage.MainThanaList=patuakhaliThanaList;

                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft=fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();

                         }


                         else if(i==4){
                             ThanaPage.MainThanaList=perojpurThanaList;

                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft=fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();

                         }

                         else if(i==5){
                             ThanaPage.MainThanaList=barishalThanaList;

                             FragmentManager fm=getSupportFragmentManager();
                             FragmentTransaction ft=fm.beginTransaction();
                             ft.add(R.id.Container2,new ThanaPage());
                             ft.commit();

                         }



                     }

                   else if(MainActivity2.MainDistrictList==HomePage.rangpurDis){

                       if(i==0){

                           ThanaPage.MainThanaList=dinajpurThanaList;

                           FragmentManager fm= getSupportFragmentManager();
                           FragmentTransaction ft= fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();

                       }


                       else if(i==1){
                           ThanaPage.MainThanaList=gaibandaThanaList;

                           FragmentManager fm= getSupportFragmentManager();
                           FragmentTransaction ft= fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();

                       }

                       else if(i==2){
                           ThanaPage.MainThanaList=lalminirhatThanaList;

                           FragmentManager fm= getSupportFragmentManager();
                           FragmentTransaction ft= fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();
                       }

                       else if(i==3){
                           ThanaPage.MainThanaList=nilphamariThanaList;

                           FragmentManager fm= getSupportFragmentManager();
                           FragmentTransaction ft= fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();
                       }


                       else if(i==4){
                           ThanaPage.MainThanaList=panchagrahThanaList;

                           FragmentManager fm= getSupportFragmentManager();
                           FragmentTransaction ft= fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();
                       }


                       else if(i==5){
                           ThanaPage.MainThanaList=rangpurThanaList;

                           FragmentManager fm= getSupportFragmentManager();
                           FragmentTransaction ft= fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();
                       }

                       else {
                           ThanaPage.MainThanaList=thakurgaonThanaList;

                           FragmentManager fm= getSupportFragmentManager();
                           FragmentTransaction ft= fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();
                       }





                     }

                   else if(MainActivity2.MainDistrictList==HomePage.khulnaDis){

                       if(i==0){

                           ThanaPage.MainThanaList=bagerhatThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft= fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();

                       }

                       else if(i==1){
                           ThanaPage.MainThanaList=chuadangaThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft= fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();

                       }

                       else if(i==2){
                           ThanaPage.MainThanaList=jessoreThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft= fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();

                       }


                       else if(i==3){
                           ThanaPage.MainThanaList=khulnaThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft= fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();

                       }


                       else if(i==4){
                           ThanaPage.MainThanaList=kushtiaThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft= fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();

                       }



                       else if(i==5){
                           ThanaPage.MainThanaList=maguraThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft= fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();

                       }


                       else {
                           ThanaPage.MainThanaList=norailThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft= fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();

                       }


                     }

                   else if(MainActivity2.MainDistrictList==HomePage.rajshahiDis){

                       if(i==0){

                           ThanaPage.MainThanaList=bograThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft=fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();

                       }

                       else if(i==1){


                           ThanaPage.MainThanaList=chapaiNawabganjThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft=fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();

                       }
                       else if(i==2){


                           ThanaPage.MainThanaList=joypurhattThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft=fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();

                       }


                       else if(i==3){


                           ThanaPage.MainThanaList=naogaonThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft=fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();

                       }


                       else if(i==4){


                           ThanaPage.MainThanaList=natoreThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft=fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();

                       }


                       else if(i==5){


                           ThanaPage.MainThanaList=pabnaThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft=fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();

                       }


                       else {

                           ThanaPage.MainThanaList=rajshahiThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft=fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();

                       }


                     }


                   else {

                       if(i==0){

                           ThanaPage.MainThanaList=hobigonjThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft=fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();


                       }


                       else if(i==1){

                           ThanaPage.MainThanaList=moulvibazarThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft=fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();


                       }

                       else if(i==1){

                           ThanaPage.MainThanaList=moulvibazarThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft=fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();


                       }      else if(i==1){

                           ThanaPage.MainThanaList=moulvibazarThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft=fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();


                       }


                       else if(i==2){

                           ThanaPage.MainThanaList=shunamganjThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft=fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();


                       }

                       else {

                           ThanaPage.MainThanaList=sylhetThanaList;

                           FragmentManager fm=getSupportFragmentManager();
                           FragmentTransaction ft=fm.beginTransaction();
                           ft.add(R.id.Container2,new ThanaPage());
                           ft.commit();


                       }







                     }







                 }
             });





             return myViwe;
         }
     }



    // adding information of thana

     public void addThana(){

        //dhaka thana list
        map=new HashMap<>();
        map.put("thana","Badda Thana");
        map.put("number","01867412801");
        dhakaThanaList.add(map);

        map=new HashMap<>();
         map.put("thana","Bangshal Thana");
         map.put("number","+880 2-9565700");
         dhakaThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Bimanbandar Thana");
         map.put("number","01191001166");
         dhakaThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Demra Thana");
         map.put("number","+880 1765-968112");
         dhakaThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Chakbazar Thana");
         map.put("number","+880 3128-60133");
         dhakaThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Dhanmondi Thana");
         map.put("number","+880 2-58616086");
         dhakaThanaList.add(map);

         // gajupur thana list

         map=new HashMap<>();
         map.put("thana","Gazipur Sadar Thana");
         map.put("number","01713-373356");
         gajuputThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Kaliakair Thana");
         map.put("number","01320-092300");
         gajuputThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Kapasia Thana");
         map.put("number","+880 1713-373367");
         gajuputThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Kaliganj Thana");
         map.put("number","+880 1320-092475");
         gajuputThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Sreepur Thana");
         map.put("number","01713-373366");
         gajuputThanaList.add(map);

         //narayangonj's thana

          map=new HashMap<>();
          map.put("thana","Narayanganj Sadar Thana");
          map.put("number","+880 1713-373345");
          narayonganjThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Fatullah Thana");
         map.put("number","01713373346");
         narayonganjThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Bandar Thana");
         map.put("number","01320-052898");
         narayonganjThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Siddhirganj Thana");
         map.put("number","+880 1713-373348");
         narayonganjThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Rupganj Thana");
         map.put("number","01704-000052");
         narayonganjThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Sonargaon Thana");
         map.put("number","+8801713373350");
         narayonganjThanaList.add(map);


          //foridpur thanalisst

         map=new HashMap<>();
         map.put("thana","Alfadanga Thana");
         map.put("number","+880 1320-097458");
         faridpurThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Bhanga Thana");
         map.put("number","+880 1960-581360");
         faridpurThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Boalmari Thana");
         map.put("number","01713-373558");
         faridpurThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Charbhadrasan Thana");
         map.put("number","01713-373560");
         faridpurThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Faridpur Sadar Thana");
         map.put("number","01713-373556");

         map=new HashMap<>();
         map.put("thana","Madukhali Thana");
         map.put("number","01966-577760");
         faridpurThanaList.add(map);

         //gopalgonh thana list

         map=new HashMap<>();
         map.put("thana","Kashiani Thana");
         map.put("number","01713-373574");
         gopalganjThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Kotalipara");
         map.put("number","017133735755");
         gopalganjThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Muksudpur Thana");
         map.put("number","01713-373573");
         gopalganjThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Tungipara Thana");
         map.put("number","01713-373576");
         gopalganjThanaList.add(map);

         // Kishoreganj thana list

          map=new HashMap<>();
          map.put("thana","Austagram Thana");
          map.put("number","01713-373492");
          kishoreganjThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Bajitpur Thana");
         map.put("number","01713-373485");
         kishoreganjThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Bhairab Thana");
         map.put("number","01713-373487");
         kishoreganjThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Hossainpur Thana");
         map.put("number","01713-373483");
         kishoreganjThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Katiadi Thana");
         map.put("number","01767-332233");
         kishoreganjThanaList.add(map);

  //narsindghi thana list

   map=new HashMap<>();
   map.put("thana","Belabo Thana");
   map.put("number","01320-091517");
   narsingdhiThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Monohardi Thana");
         map.put("number","+880 1798-381298");
         narsingdhiThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Narsingdi Sadar Thana");
         map.put("number","01713-373412");
         narsingdhiThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Raipura Thana");
         map.put("number","01711-320612");
         narsingdhiThanaList.add(map);

         //chittagong part

         //chittagong thanalist
         map=new HashMap<>();
         map.put("thana","Anwara thana");
         map.put("number","+888 018 752 74496");
         chiittagongThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Banshkhali");
         map.put("number","01713373639");
         chiittagongThanaList.add(map);

       map=new HashMap<>();
       map.put("thana","Boalkhali");
       map.put("nummber","01769-694521");
       chiittagongThanaList.add(map);


       map=new HashMap<>();
       map.put("thana","Fatikchhari");
       map.put("number","01713-373641");
       chiittagongThanaList.add(map);


       map=new HashMap<>();
       map.put("thana","Chandanaish");
       map.put("number","01733-354944");
       chiittagongThanaList.add(map);

       //commila thana list

         map=new HashMap<>();
         map.put("thana","Sadar South Police Station");
         map.put("number","01713-373700");
         comillaThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Nangalkot thana");
         map.put("number","01853-185026");
         comillaThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Chauddagram Police Station");
         map.put("number","01320-114022");
         comillaThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Kotwali Model Thana");
         map.put("number"," 01320103191");
         comillaThanaList.add(map);



         //feni thana list

         map=new HashMap<>();
         map.put("thana","Feni Sadar thana ");
         map.put("number","01713-373778");
         feniThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Sonagazi thana");
         map.put("number","01713-373779");
         feniThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Chhagalnaiya thana");
         map.put("number","01320-113054");
         feniThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Pashuram thana");
         map.put("number","01713-373781");
         feniThanaList.add(map);


         //candpur thana list

         map=new HashMap<>();
         map.put("thana","Chandpur Sadar thana");
         map.put("number","01713-373712");
         chandpurThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Faridganj thana");
         map.put("number","01854-426338");
         chandpurThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Haimchar thana");
         map.put("number","01713-373719");
         chandpurThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Hajiganj thana");
         map.put("number","01320-116012");
         chandpurThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Sonaimuri thana ");
         map.put("number","01741-882982");
         chandpurThanaList.add(map);

         //rangamati thana list

         map=new HashMap<>();
         map.put("thana","Rajasthali Thana");
         map.put("number","0361-81002");
         rangamatiThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Langadu Thana");
         map.put("number","01816-147955");
         rangamatiThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Kaptai thana");
         map.put("number","0361-81002");
         rangamatiThanaList.add(map);

         //bandaban thanaa

         map=new HashMap<>();
         map.put("thana","Lama thana");
         map.put("number","01320-110476");
         bandarbanThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Ruma thana");
         map.put("number","01320-110528");
         bandarbanThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Thanchi");
         map.put("number","01320-110554");
         bandarbanThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Alikodom");
         map.put("number","01320-110606");
         bandarbanThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Naikhanchori");
         map.put("number","01320-110632");
         bandarbanThanaList.add(map);


         //cox bazar

         map=new HashMap<>();
         map.put("thana","Cox's Bazar Sadar thana");
         map.put("number","01713-373663");
         coxsBazarThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Kutubdia");
         map.put("number","01713-37366");
         coxsBazarThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Ramu than");
         map.put("number","01873-214738");
         coxsBazarThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Teknaf thana");
         map.put("number","017133736");
         coxsBazarThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Maheshkhali thana");
         map.put("number","01713-373669");
         coxsBazarThanaList.add(map);

         //Noakhali  thana list

         map=new HashMap<>();
         map.put("thana","Begumganj Model Thana");
         map.put("number","01796-656274");
         noakhaliThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Senbag thana");
         map.put("number","01713-373750");
         noakhaliThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Chatkhil");
         map.put("number","01713-373753");
         noakhaliThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Hatiya thana");
         map.put("number","01713-373754");
         noakhaliThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Sonaimuri thana");
         map.put("number","01741-882982");
         noakhaliThanaList.add(map);

         //barguna thana list

         map=new HashMap<>();
         map.put("thana","Amtali thana");
         map.put("number","01320-156192");
         bargunaThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Patharghata thana");
         map.put("numbber","01713-374355");
         bargunaThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Barguna Sadar thana");
         map.put("numbber","01320-156166");
         bargunaThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Bamna thana");
         map.put("numbber","01713-374357");
         bargunaThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Betagi thana");
         map.put("numbber","01320156100");
         bargunaThanaList.add(map);

   // barishal thana list
         map=new HashMap<>();
         map.put("thana","Agailjhara thana");
         map.put("number"," 01713-374274");
         barishalThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Gournadi thana");
         map.put("number","01320-151295");
         barishalThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Barishal Sadar thana");
         map.put("number","01713374279");
         barishalThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Muladi thana");
         map.put("number","01713374260");
         barishalThanaList.add(map);


        //bhola thana list

         map=new HashMap<>();
         map.put("thana","Bhola Sadar thana");
         map.put("number","0491-61211");
         bholaThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Daulatkhan thana ");
         map.put("number","01917-234113");
         bholaThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Borhanuddin thana");
         map.put("number","01320-152264");
         bholaThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Lalmohan thana");
         map.put("number","01713374304");
         bholaThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Manpura thana");
         map.put("number","01795-236101");
         bholaThanaList.add(map);


         //jhalokathi thana list
         map=new HashMap<>();
         map.put("thana","Jhalokati Sadar thana");
         map.put("number","+880 1918-832424");
         jhalokathiThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Nalchity thana");
         map.put("number","01320-154202");
         jhalokathiThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Kathalia thana ");
         map.put("number","01320-154254");
         jhalokathiThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Rajapur thana ");
         map.put("number","01320154123");
         jhalokathiThanaList.add(map);

         //patuakhali thana list


         map=new HashMap<>();
         map.put("thana","Dumki thana");
         map.put("number","01713374322");
         patuakhaliThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Mirzaganj thana");
         map.put("number","01713374324");
         patuakhaliThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Bauphal thana ");
         map.put("number","01713374319");
         patuakhaliThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Dashmina thana");
         map.put("number","01713374321");
         patuakhaliThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Kalapara  thana");
         map.put("number","01713374323");
         patuakhaliThanaList.add(map);

         //perojpur thana list

         map=new HashMap<>();
         map.put("thana","Vitabariya thana");
         map.put("number","01713374323");
         perojpurThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Bundaria thana");
         map.put("number","01713374337");
         perojpurThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Gauripur thana");
         map.put("number","+880 1713-373434");
         perojpurThanaList.add(map);

  // dinajpur thana list

         map=new HashMap<>();
         map.put("thana","Dinajpur Sadar thana");
         map.put("number","0531-63132");
         dinajpurThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Birampur thana");
         map.put("number","01746-108039");
         dinajpurThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Nawabganj thana");
         map.put("number","01745-733204");
         dinajpurThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Ghoraghat thana");
         map.put("number","01320-136677");
         dinajpurThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Hakimpur thana");
         map.put("number","01320-136703");
         dinajpurThanaList.add(map);


         //gaibanda thana list

         map=new HashMap<>();
         map.put("thana","Gaibandha Sadar thana");
         map.put("number","01713-373892");
         gaibandaThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Gobindaganj thana");
         map.put("number","01713-373896");
         gaibandaThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Palashbari thana");
         map.put("number","01713-373895");
         gaibandaThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Phulchhari thana");
         map.put("number","01713-373895");
         gaibandaThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Saadullapu thana");
         map.put("number","01320-132402");
         gaibandaThanaList.add(map);


       //kkakminirhat


         map=new HashMap<>();
         map.put("thana","Lalmonirhat Sadar thana ");
         map.put("number","01713-373947");
         lalminirhatThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Lalmonirhat Sadar thana ");
         map.put("number","01713-373947");
         lalminirhatThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Patgram thana");
         map.put("number","01713-373950");
         lalminirhatThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Kaliganj thana ");
         map.put("number","01713-373948");
         lalminirhatThanaList.add(map);


           //nilphhamari thanaa

         map=new HashMap<>();
         map.put("thana","Nilphamari Sadar thana");
         map.put("number","01713-373909");
         nilphamariThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Domar thana");
         map.put("number","01713373912");
         nilphamariThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Domar thana");
         map.put("number","01713373912");
         nilphamariThanaList.add(map);
         map=new HashMap<>();

         map.put("thana","Dimla thana");
         map.put("number","01713-373914");
         nilphamariThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Jaldhaka thana");
         map.put("number","01713373911");
         nilphamariThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Kishoreganj thana");
         map.put("number","01713-373480");
         nilphamariThanaList.add(map);


        // panchagrah thana

         map=new HashMap<>();
         map.put("thana","Atwari thana ");
         map.put("number","01713374001");
         panchagrahThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Tentulia thana");
         map.put("number","01713-374002");
         panchagrahThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Debiganj  thana ");
         map.put("number","01713-374003");
         panchagrahThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Panchagarh  sadar thana");
         map.put("number","01713-373999");
         panchagrahThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Boda than");
         map.put("number","01713-374000");
         panchagrahThanaList.add(map);


         //rangpur thana list

         map=new HashMap<>();
         map.put("thana","Rangpur Sadar thana");
         map.put("number","01320131300");
         rangpurThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Badarganj thana");
         map.put("number","01713-373876");
         rangpurThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Kaunia thana");
         map.put("number","01713-373880");
         rangpurThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Mithapukur thana");
         map.put("number","+880 1713-373878");
         rangpurThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Taraganj thana");
         map.put("number","01713-373877");
         rangpurThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Pirganj thana");
         map.put("number","01713-373985");
         rangpurThanaList.add(map);


         //thakurgaon thana
         map=new HashMap<>();
         map.put("thana","Thakurgaon Sadar thana");
         map.put("number","01769-691251");
         thakurgaonThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Baliadangi thana");
         map.put("number","01713-373986");
         thakurgaonThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Pirganj thana");
         map.put("number","01713-373985");
         thakurgaonThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Pirganj thana");
         map.put("number","01713-373985");
         rangpurThanaList.add(map);

         map=new HashMap<>();
         map.put("thana","Ranisankail thana");
         map.put("number","01713-373987");
         thakurgaonThanaList.add(map);


         map=new HashMap<>();
         map.put("thana","Haripur thana");
         map.put("number","01892-222244");
         thakurgaonThanaList.add(map);

     //hobigang

         map =new HashMap<>();
         map.put("thana","Ajmiriganj thana");
         map.put("number","01713-374405");
         hobigonjThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Bahubal thana ");
         map.put("number","01713-374401");
         hobigonjThanaList.add(map);


         map =new HashMap<>();
         map.put("thana","Chunarughat  ");
         map.put("number","01826-790553");
         hobigonjThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Habiganj Sadar thana");
         map.put("number","01713-374398");
         hobigonjThanaList.add(map);

         //moulvibazar

         map =new HashMap<>();
         map.put("thana","Barlekha thana ");
         map.put("number","01320119905");
         moulvibazarThanaList.add(map);



         map =new HashMap<>();
         map.put("thana","Kamalganj  thana");
         map.put("number","01320119827");
         moulvibazarThanaList.add(map);


         map =new HashMap<>();
         map.put("thana","Kulaura thana");
         map.put("number","01713-374443");
         moulvibazarThanaList.add(map);

         //shunamgong

         map =new HashMap<>();
         map.put("thana","Chhatak  thana");
         map.put("number","01713-374419");
         shunamganjThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Jagannathpur thana ");
         map.put("number"," 01713-374420");
         shunamganjThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Jamalganj thana");
         map.put("number"," 01320120998");
         shunamganjThanaList.add(map);



         map =new HashMap<>();
         map.put("thana","Sunamganj Sadar");
         map.put("number","01713-374418");
         shunamganjThanaList.add(map);


         map =new HashMap<>();
         map.put("thana","Dowarabazar thana");
         map.put("number","01713-374423");
         shunamganjThanaList.add(map);

         //sylhet


         map =new HashMap<>();
         map.put("thana","Companiganj  thana");
         map.put("number","01713373652");
         sylhetThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Kanaighat  thana");
         map.put("number","01727-739213");
         sylhetThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Jaintiapur ");
         map.put("number","01320-118047");
         sylhetThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Sylhet Sadar thana");
         map.put("number","01320117700");
         sylhetThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Balaganj thana");
         map.put("number","01713-374376");
         sylhetThanaList.add(map);

       // bogra

         map =new HashMap<>();
         map.put("thana","Adamdighi thana");
         map.put("number","01713-374066");
         bograThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Bogra Sadar thana ");
         map.put("number","01713374061");
         bograThanaList.add(map);


         map =new HashMap<>();
         map.put("thana","Dhunat thana ");
         map.put("number","01713374061");
         bograThanaList.add(map);


         // chapai nawabganj

         map =new HashMap<>();
         map.put("thana","Gomastapur thana");
         map.put("number","01713-373821");
         chapaiNawabganjThanaList.add(map);

         map =new HashMap<>();
         map.put("thana"," Nachole  thana");
         map.put("number","01713-373822");
         chapaiNawabganjThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Bholahat  thana ");
         map.put("number","01713-373823");
         chapaiNawabganjThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Shibganj thana");
         map.put("number","+880 1713-374062");
         chapaiNawabganjThanaList.add(map);

       // joypurhat

         map =new HashMap<>();
         map.put("thana","Akkelpur  thana");
         map.put("number","01320-127673");
         joypurhattThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Joypurhat Sadar thana");
         map.put("number","01713-374077");
         joypurhattThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Panchbibi thana");
         map.put("number","+880 1713-374082");
         joypurhattThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Khetlal thana ");
         map.put("number","01320-127626");
         joypurhattThanaList.add(map);
          //naogaon
         map =new HashMap<>();
         map.put("thana","Dhamoirhat thana");
         map.put("number","01320-123668");
         naogaonThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Niamatpur thana");
         map.put("number","01713373743");
         naogaonThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Sapahar thana");
         map.put("number","+880 1713-778092");
         naogaonThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Raninagar thana ");
         map.put("number", "01713-373837");
         naogaonThanaList.add(map);

           // natore

         map =new HashMap<>();
         map.put("thana","Gurudaspur thana ");
         map.put("number","01713-373860");
         natoreThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Natore sadar thana");
         map.put("number","07716-6922");
         natoreThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Singra thana");
         map.put("number","01990-448697");
         natoreThanaList.add(map);

         // pabna

         map =new HashMap<>();
         map.put("thana","Ishwardi thana");
         map.put("number","01713-374017");
         pabnaThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Chatmohar thana");
         map.put("number","01722-157636");
         pabnaThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Pabna Sadar thana");
         map.put("number","0731-65080");
         pabnaThanaList.add(map);

         map =new HashMap<>();
         map.put("thana"," Bera thana ");
         map.put("number","01713-374023");
         pabnaThanaList.add(map);


         map =new HashMap<>();
         map.put("thana","Santhia thana");
         map.put("number","01320-128794");
         pabnaThanaList.add(map);
         // rajshahi

         map =new HashMap<>();
         map.put("thana","Boalia thana");
         map.put("number","0721-774134");
         rajshahiThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Matihar thana");
         map.put("number","01320-061623");
         rajshahiThanaList.add(map);


         map =new HashMap<>();
         map.put("thana","Rajpara thana");
         map.put("number","0721-776080 ");
         rajshahiThanaList.add(map);


         map =new HashMap<>();
         map.put("thana","Shah Makhdum thana");
         map.put("number","001320-061753");
         rajshahiThanaList.add(map);

       //bagerhat

         map =new HashMap<>();
         map.put("thana","Kachua  thana");
         map.put("number"," 01320-116116");
         bagerhatThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Chitalmari thana");
         map.put("number","+8801713-374125");
         bagerhatThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Bagerhat Sadar thana");
         map.put("number","01893-930574");
         bagerhatThanaList.add(map);


         map =new HashMap<>();
         map.put("thana","Mongla  thana");
         map.put("number","+8804658-73222");
         bagerhatThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Rampal thana");
         map.put("number","+8804657-56004");
         bagerhatThanaList.add(map);

         //chuadanga
         map =new HashMap<>();
         map.put("thana","Alamdanga thana");
         map.put("number","01713-374237");
         chuadangaThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Chuadanga Sadar thana");
         map.put("number","01713374236");
         chuadangaThanaList.add(map);


         map =new HashMap<>();
         map.put("thana","Jivannagar thana ");
         map.put("number"," 01713374237");
         chuadangaThanaList.add(map);


         map =new HashMap<>();
         map.put("thana","Alamdanga thana");
         map.put("number","Damurhuda  thana");
         chuadangaThanaList.add(map);

       //jessore
         map =new HashMap<>();
         map.put("thana","Abhaynagar  thana");
         map.put("number","01713-374167");
         jessoreThanaList.add(map);


         map =new HashMap<>();
         map.put("thana","Bagherpara  thana");
         map.put("number","01320-143258");
         jessoreThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Chaugachha  thana");
         map.put("number","01320-143284");
         jessoreThanaList.add(map);


         map =new HashMap<>();
         map.put("thana","Jessore Sadar thana");
         map.put("number","01320-143232");
         jessoreThanaList.add(map);

      //khulna

         map =new HashMap<>();
         map.put("thana","Batiaghat thana");
         map.put("number","01713-374106");
         khulnaThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Digalia thana");
         map.put("number","041-890014");
         khulnaThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Chalna Bazar thana");
         map.put("number","02-57313966");
         khulnaThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Khula Sadar thana");
         map.put("number","01320-058382");
         khulnaThanaList.add(map);

   // kushtia
         map =new HashMap<>();
         map.put("thana","kumarkhali thana");
         map.put("number","01320-147227");
         kushtiaThanaList.add(map);


         map =new HashMap<>();
         map.put("thana","khoksa thana");
         map.put("number","01713-374221");
         kushtiaThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","daulatpur thana");
         map.put("number"," 01713-374224");
         kushtiaThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","bheramara thana ");
         map.put("number","01713-374223");
         kushtiaThanaList.add(map);


       //  magura

         map =new HashMap<>();
         map.put("thana","Magura Sadar thana");
         map.put("number","01713-374179");
         maguraThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Shalikha  thana");
         map.put("number","01713374170");
         maguraThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","Sreepur thana");
         map.put("number","01713374171");
         maguraThanaList.add(map);

         //narail

         map =new HashMap<>();
         map.put("thana","kalia thana");
         map.put("number","01635-730967");
         norailThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","narail sadar thana");
         map.put("number","01713-374206");
         norailThanaList.add(map);

         map =new HashMap<>();
         map.put("thana","lohagara thana");
         map.put("number","01713374171");
         norailThanaList.add(map);




     }










}