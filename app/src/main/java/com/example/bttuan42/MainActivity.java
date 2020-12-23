package com.example.bttuan42;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.bttuan42.dathang.DatHangFrag;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNav=findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new TinTucFrag()).commit();
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment= null;
            switch (item.getItemId()){
                case R.id.navigation_tintuc:
                    selectedFragment=new TinTucFrag();
                    break;
                case R.id.navigation_dathang:
                    selectedFragment=new DatHangFrag();
                    break;
                case R.id.navigation_cuahang:
                    selectedFragment=new CuaHangFrag();
                    break;
                case R.id.navigation_taikhoan:
                    selectedFragment=new TaiKhoanFrag();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
            return true;
        }
    };
}