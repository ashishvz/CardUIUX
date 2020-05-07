package com.example.carding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   private CourseAdapter adapter,adapter1;
   private TestAdapter testAdapter;
   private List<TestDataModel> testDataModelList;
   private List<CourseDataModel> courseDataModelList;
   private RecyclerView recyclerView,recyclerView1,testrecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView1=findViewById(R.id.rv);
        testrecycler=findViewById(R.id.testrecycler);
        recyclerView.setHasFixedSize(true);
        courseDataModelList=new ArrayList<>();
        testDataModelList=new ArrayList<>();
        adapter=new CourseAdapter(this,courseDataModelList);
        adapter1=new CourseAdapter(this,courseDataModelList);
        testAdapter = new TestAdapter(this,testDataModelList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        RecyclerView.LayoutManager testlayout = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView1.setLayoutManager(layoutManager1);
        testrecycler.setLayoutManager(testlayout);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView1.setItemAnimator(new DefaultItemAnimator());
        testrecycler.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        recyclerView1.setAdapter(adapter1);
        testrecycler.setAdapter(testAdapter);
        cardData();
        testData();
    }

    private void cardData(){
        CourseDataModel cd = new CourseDataModel("React JS Course","Just 25$",R.drawable.img1, Color.parseColor("#B83227"));
        CourseDataModel cd1 = new CourseDataModel("C++","Just 20$",R.drawable.img2,Color.parseColor("#4834DF"));
        CourseDataModel cd2 =new CourseDataModel("MERN","Just 2$",R.drawable.img3,Color.parseColor("#6AB04A"));
        courseDataModelList.add(cd);
        courseDataModelList.add(cd1);
        courseDataModelList.add(cd2);
        adapter.notifyDataSetChanged();
        adapter1.notifyDataSetChanged();
    }
    public void testData(){
        TestDataModel td = new TestDataModel("React Js Course",Color.parseColor("#B83227"));
        TestDataModel td1 = new TestDataModel("C++",Color.parseColor("#4834DF"));
        TestDataModel td2 = new TestDataModel("MERN",Color.parseColor("#6AB04A"));
        testDataModelList.add(td);
        testDataModelList.add(td1);
        testDataModelList.add(td2);
        testAdapter.notifyDataSetChanged();
    }
}
