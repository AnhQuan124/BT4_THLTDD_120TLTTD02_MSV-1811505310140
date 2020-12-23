package com.example.bttuan42.dathang.phobien;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.bttuan42.R;

import java.util.ArrayList;


public class PhoBienFrag extends Fragment {


    GridView gridView;
    Context context;
    RelativeLayout gridviewdata;
    ArrayList<ProductModel> productData;
    ProductAdapter productAdapter;
    ProductModel productModel;

    @SuppressLint("WrongViewCast")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater,container,savedInstanceState);
        context=getActivity();
        View root=inflater.inflate(R.layout.fragment_pho_bien, container, false);

        gridView=root.findViewById(R.id.gridview);
        gridviewdata=root.findViewById(R.id.gridviewdata);
        productData=new ArrayList<>();

        productdatasp();
        productAdapter=new ProductAdapter(context,productData);
        gridView.setAdapter(productAdapter);
        registerForContextMenu(gridView);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(context,productData.get(i).getNamesp(),Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }

    private void productdatasp(){

        productModel=new ProductModel();
        productModel.setId(1);
        productModel.setNamesp("Cà phê lúa mạch đá");
        productModel.setImage(R.drawable.capheluamachda);
        productModel.setGiasp("69.000 đ");
        productData.add(productModel);

        productModel=new ProductModel();
        productModel.setId(2);
        productModel.setNamesp("Cà phê lúa mạch nóng");
        productModel.setImage(R.drawable.capheluamachnong);
        productModel.setGiasp("69.000 đ");
        productData.add(productModel);

        productModel=new ProductModel();
        productModel.setId(3);
        productModel.setNamesp("Socola lúa mạch đá xay");
        productModel.setImage(R.drawable.socolaluamachda);
        productModel.setGiasp("69.000 đ");
        productData.add(productModel);

        productModel=new ProductModel();
        productModel.setId(4);
        productModel.setNamesp("Macca phủ socola");
        productModel.setImage(R.drawable.capheluamachda);
        productModel.setGiasp("45.000 đ");
        productData.add(productModel);

        productModel=new ProductModel();
        productModel.setId(5);
        productModel.setNamesp("Cà phê sữa đá");
        productModel.setImage(R.drawable.caphesuada);
        productModel.setGiasp("32.000 đ");
        productData.add(productModel);

        productModel=new ProductModel();
        productModel.setId(6);
        productModel.setNamesp("Trà sữa Mắc ca trân châu trắng");
        productModel.setImage(R.drawable.trasuamaccatranchautrang);
        productModel.setGiasp("45.000 đ");
        productData.add(productModel);

        productModel=new ProductModel();
        productModel.setId(7);
        productModel.setNamesp("Trà đào cam sả đá");
        productModel.setImage(R.drawable.tradaocamsada);
        productModel.setGiasp("45.000 đ");
        productData.add(productModel);

        productModel=new ProductModel();
        productModel.setId(8);
        productModel.setNamesp("Olong hạt sen đá");
        productModel.setImage(R.drawable.olonghatsenda);
        productModel.setGiasp("45.000 đ");
        productData.add(productModel);

    }
}