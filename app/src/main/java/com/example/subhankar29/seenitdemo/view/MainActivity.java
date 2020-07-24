package com.example.subhankar29.seenitdemo.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.subhankar29.seenitdemo.model.CatalogItemObjects;
import com.example.subhankar29.seenitdemo.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private StaggeredGridLayoutManager waterFallLayoutManager;
    RecyclerView mRecyclerView;
    List<CatalogItemObjects> catalogList;
    CatalogRecyclerViewAdapter mCatalogRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        initView();
    }

    private void init() {
        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        catalogList = getListItemData();
    }

    private void initView() {
        waterFallLayoutManager = new StaggeredGridLayoutManager(3, 1);
        mCatalogRecyclerViewAdapter = new CatalogRecyclerViewAdapter(MainActivity.this, catalogList);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(waterFallLayoutManager);
        mRecyclerView.setAdapter(mCatalogRecyclerViewAdapter);
    }

    private List<CatalogItemObjects> getListItemData(){
        List<CatalogItemObjects> listViewItems = new ArrayList<CatalogItemObjects>();
        listViewItems.add(new CatalogItemObjects("Zara", R.drawable.model1));
        listViewItems.add(new CatalogItemObjects("Jack&Jones", R.drawable.model2));
        listViewItems.add(new CatalogItemObjects("Armani", R.drawable.model3));
        listViewItems.add(new CatalogItemObjects("Gucci", R.drawable.model4));
        listViewItems.add(new CatalogItemObjects("Zara", R.drawable.model1));
        listViewItems.add(new CatalogItemObjects("Jack&Jones", R.drawable.model2));
        listViewItems.add(new CatalogItemObjects("Gucci", R.drawable.model3));
        listViewItems.add(new CatalogItemObjects("Armani", R.drawable.model4));
        listViewItems.add(new CatalogItemObjects("Zara", R.drawable.model1));
        listViewItems.add(new CatalogItemObjects("Jack&Jones", R.drawable.model2));
        listViewItems.add(new CatalogItemObjects("Jack&Jones", R.drawable.model3));
        listViewItems.add(new CatalogItemObjects("Gucci", R.drawable.model4));

        return listViewItems;
    }
}