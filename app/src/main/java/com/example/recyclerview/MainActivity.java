package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView courseRV = findViewById(R.id.idRVCourse);

        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel("Chapter One", 4, R.drawable.flemingo));
        courseModelArrayList.add(new CourseModel("Chapter Two", 3, R.drawable.flemingo));
        courseModelArrayList.add(new CourseModel("Chapter Three", 4, R.drawable.flemingo));
        courseModelArrayList.add(new CourseModel("Chapter Four", 4, R.drawable.flemingo));
        courseModelArrayList.add(new CourseModel("Chapter Five", 4, R.drawable.flemingo));
        courseModelArrayList.add(new CourseModel("Chapter Six", 4, R.drawable.flemingo));
        courseModelArrayList.add(new CourseModel("Chapter Seven", 4, R.drawable.flemingo));
        CourseAdapter courseAdapter = new CourseAdapter(this, courseModelArrayList);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }
}