package com.example.lab11;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText ed_book,ed_price;
    private Button btn_query,btn_insert,btn_update,dtn_delete;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private ArrayAdapter<String> items=new ArrayAdapter<>();
    private SQLiteDatabase dbrw;

    @Override
    protected void onDestroy(){
        super.onDestroy();
        dbrw.close();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_book=findViewById(R.id.ed_book);
        ed_price

    }
}