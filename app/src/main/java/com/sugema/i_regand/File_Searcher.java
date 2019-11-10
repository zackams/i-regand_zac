package com.sugema.i_regand;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.app.FragmentManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

import androidx.appcompat.widget.Toolbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabItem;


import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class File_Searcher extends AppCompatActivity
    implements Fragment_src_xls.OnFragmentInteractionListener,
               Fragment_src_csv.OnFragmentInteractionListener,
               Fragment_src_txt.OnFragmentInteractionListener{
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file__searcher);

        ArrayList<String> ll = new ArrayList<>();
        ll.add("derp");
        ll.add("herp");
        ll.add("zac");
        Bundle args = new Bundle();
        Fragment_src_csv srccsv = new Fragment_src_csv();

        args.putStringArrayList("ll", ll);
        srccsv.setArguments(args);
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.your_placeholder, new Fragment_src_csv());
        fragmentTransaction.add(R.id.your_placeholder, srccsv);
        fragmentTransaction.commit();
        

        Toolbar toolbar = findViewById(R.id.toolbar_src);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        TabLayout tabLayout = findViewById(R.id.tablayout_src);
        TabItem xls = findViewById(R.id.File_xls);
        TabItem csv = findViewById(R.id.File_csv);
        TabItem txt = findViewById(R.id.File_txt);
        ViewPager viewPager = findViewById(R.id.viewPager_src);
        PageAdapter_src pageAdapter = new PageAdapter_src(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));




    }


    public void writeToParcel(Parcel dest, int flags) {

    }

    public void onFragmentInteraction(Uri uri){
        //you can leave it empty
    }
}
