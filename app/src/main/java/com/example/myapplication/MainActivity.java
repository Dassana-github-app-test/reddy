package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
   RecyclerView listView;
   EditText editText;
   EditText editText2;
   TextView text1,text2;
   Button button1,button2;
    ArrayList<Apps> app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        editText = findViewById(R.id.name);
        editText2 = findViewById(R.id.section);
        app = new ArrayList<>();
        button1=findViewById(R.id.submit);
        button2=findViewById(R.id.remove);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String update = editText.getText().toString();
                String update2= editText2.getText().toString();
                app.add(new Apps(update,update2));
                Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT).show();
            }

        });

        Myadapter myadapter = new Myadapter(this,app);
        listView.setHasFixedSize(true);
        StaggeredGridLayoutManager linearLayoutManager = new StaggeredGridLayoutManager(3,LinearLayoutManager.VERTICAL);
        listView.setLayoutManager(linearLayoutManager);
        listView.setAdapter(myadapter);

    }
}
