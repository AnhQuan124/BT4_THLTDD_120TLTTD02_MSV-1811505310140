package com.example.bttuan42.dathang;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bttuan42.R;
import com.example.bttuan42.dathang.doan.DoAnFrag;
import com.example.bttuan42.dathang.phobien.PhoBienFrag;
import com.example.bttuan42.dathang.thucuong.ThucUongFrag;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;


public class DatHangFrag extends Fragment {

    View root;
    ViewPager viewPager;
    TabLayout tabLayout;

    public DatHangFrag(){
    }
    public static DatHangFrag getInstance(){
        return new DatHangFrag();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_dat_hang, container, false);

        viewPager=root.findViewById(R.id.viewPager);
        tabLayout=root.findViewById(R.id.tabLayout);

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    public void setUpViewPager(ViewPager viewPager){
        SectionPagerAdapter adapter=new SectionPagerAdapter(getChildFragmentManager());

        adapter.addFragment(new PhoBienFrag(),"Phổ biến");
        adapter.addFragment(new ThucUongFrag(),"Thức uống");
        adapter.addFragment(new DoAnFrag(),"Đồ ăn");
        viewPager.setAdapter(adapter);
    }
}