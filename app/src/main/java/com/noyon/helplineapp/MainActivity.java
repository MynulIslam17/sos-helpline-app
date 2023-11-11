package com.noyon.helplineapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bnView;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find id's
        bnView=findViewById(R.id.bnView);








        //set on clik event on bottom navigation item
        bnView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id=item.getItemId();

                if(id==R.id.home_nav){
                    swapFragment(new HomePage(),true);
                }
                else if(id==R.id.division_nav){
                   swapFragment(new DivisionPage(),false);
                }
                else {

                    swapFragment(new SettingPage(),false);

                }



                return true;
            }
        });



   //by default first select

        bnView.setSelectedItemId(R.id.home_nav);





    }



    //user defined method=========================\



    public void swapFragment(Fragment fragment,boolean Flag){

        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        if(Flag){
            ft.add(R.id.container,fragment);
        }
        else{
            ft.replace(R.id.container,fragment);
        }

        ft.commit();




    }













}