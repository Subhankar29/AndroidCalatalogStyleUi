package com.example.subhankar29.seenitdemo.view;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.subhankar29.seenitdemo.R;

import androidx.recyclerview.widget.RecyclerView;

public class CatalogViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView catalogItem;
    public ImageView catalogPhoto;

    public CatalogViewHolders(View itemView) {
        super(itemView);
        init();
        itemView.setOnClickListener(this);
    }

    private void init() {
        catalogItem = (TextView) itemView.findViewById(R.id.catalog_name);
        catalogPhoto = (ImageView) itemView.findViewById(R.id.catalog_photo);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}
