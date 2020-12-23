package com.example.bttuan42.dathang.phobien;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bttuan42.R;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {

    Context context;
    ArrayList<ProductModel> productData;
    LayoutInflater layoutInflater;
    ProductModel productModel;

    public ProductAdapter(Context context, ArrayList<ProductModel> productData) {
        this.context = context;
        this.productData = productData;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return productData.size();
    }

    @Override
    public Object getItem(int i) {
        return productData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return productData.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1=view;
        if(view1==null){
            view1=layoutInflater.inflate(R.layout.row_data_grid_phobien,null,true);
        }
        TextView name=view1.findViewById(R.id.namegrid);
        ImageView img=view1.findViewById(R.id.imggrid);
        TextView gia=view1.findViewById(R.id.giagrid);

        productModel = productData.get(i);

        name.setText(productModel.getNamesp());
        img.setImageResource(productModel.getImage());
        gia.setText(productModel.getGiasp());

        return view1;
    }
}
