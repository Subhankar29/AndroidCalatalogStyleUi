package com.example.subhankar29.seenitdemo.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.subhankar29.seenitdemo.model.CatalogItemObjects;
import com.example.subhankar29.seenitdemo.R;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class CatalogRecyclerViewAdapter extends RecyclerView.Adapter<CatalogViewHolders> {

    private List<CatalogItemObjects> itemList;
    private Context context;

    public CatalogRecyclerViewAdapter(Context context, List<CatalogItemObjects> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public CatalogViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.catalog_list, null);
        CatalogViewHolders catalogViewHolders = new CatalogViewHolders(layoutView);
        return catalogViewHolders;
    }

    @Override
    public void onBindViewHolder(CatalogViewHolders holder, int position) {
        holder.catalogItem.setText(itemList.get(position).getName());
        holder.catalogPhoto.setImageResource(itemList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
