package com.example.subhankar29.seenitdemo.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.subhankar29.seenitdemo.R;
import com.google.android.flexbox.AlignItems;
import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.JustifyContent;

import java.util.ArrayList;

public class CategorySelection extends AppCompatActivity implements View.OnClickListener {

    RecyclerView mRecyclerView;
    FlexboxLayoutManager mFlexboxLayoutManager;
    ArrayList<String> categoryArrayList = new ArrayList<>();
    FlexboxAdapter mFlexboxAdapter;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_selection);

        init();
        initView();
        nextButton.setOnClickListener(this);
    }

    private void init() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mFlexboxLayoutManager = new FlexboxLayoutManager(this);
        nextButton = findViewById(R.id.nextButton);
        initArray();
    }

    private void initView() {
        mFlexboxLayoutManager.setFlexDirection(FlexDirection.ROW);
        mFlexboxLayoutManager.setJustifyContent(JustifyContent.CENTER);
        mFlexboxLayoutManager.setAlignItems(AlignItems.CENTER);
        mRecyclerView.setLayoutManager(mFlexboxLayoutManager);
        mFlexboxAdapter = new FlexboxAdapter(this, categoryArrayList);
        mRecyclerView.setAdapter(mFlexboxAdapter);
    }

    private void initArray() {
        categoryArrayList.add("Jeans");
        categoryArrayList.add("Jackets");
        categoryArrayList.add("Sweater");
        categoryArrayList.add("Shirt");
        categoryArrayList.add("Trousers");
        categoryArrayList.add("Pants");
        categoryArrayList.add("Tie");
        categoryArrayList.add("Belts");
        categoryArrayList.add("Zara");
        categoryArrayList.add("Gucci");
        categoryArrayList.add("Abercombie&Fitch");
        categoryArrayList.add("TrueReligion");
        categoryArrayList.add("Denim");
        categoryArrayList.add("Jeans");
        categoryArrayList.add("TieAgain");
        categoryArrayList.add("Denim");
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.nextButton:
                Intent i = new Intent(CategorySelection.this, MainActivity.class);
                startActivity(i);
        }
    }
}