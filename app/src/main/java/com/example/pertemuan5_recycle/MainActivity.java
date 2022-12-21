package com.example.pertemuan5_recycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class MainActivity extends AppCompatActivity {
    RecyclerView recylerView;
    String s1[], s2[],s3[];
    int images[] =
            {R.drawable.images,R.drawable.curry,R.drawable.durant,R.drawable.gianis};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recylerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.Player);
        s2 = getResources().getStringArray(R.array.Bio);
        s3 = getResources().getStringArray(R.array.star);
        PemainAdapter appAdapter = new
                PemainAdapter(this,s1,s2,s3,images);
        recylerView.setAdapter(appAdapter);
        recylerView.setLayoutManager(new
                LinearLayoutManager(this));
    }
}
