package com.crisspian.fragment_guide_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.crisspian.fragment_guide_01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());

        bind.btButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            showFragment();


            }
        });

    }

    private void showFragment(){
        FirstFragment firstFragment = FirstFragment.newInstance("",""); //Se genera la instancia del fragmento
        FragmentManager fragmentManager = getSupportFragmentManager(); //Obtenemos
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.frameLayout,firstFragment).addToBackStack(null).commit();

    }


}