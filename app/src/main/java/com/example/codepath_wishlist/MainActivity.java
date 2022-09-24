package com.example.codepath_wishlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView list;
    ArrayList<recyclerJoin> join = new ArrayList<>();
    String Sname, Sprice, Sstore;
    EditText Ename, Eprice, Estore;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list);
        Ename = findViewById(R.id.editItemName);
        Eprice = findViewById(R.id.editPrice);
        Estore = findViewById(R.id.editStore);
        add = findViewById(R.id.button);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setJoin();
                listAdapter adapter = new listAdapter(MainActivity.this, join);
                list.setAdapter(adapter);
                list.setLayoutManager(new LinearLayoutManager(MainActivity.this));

                list.scrollToPosition(adapter.getItemCount()-1);
                Ename.setText("");
                Eprice.setText("");
                Estore.setText("");
            }
        });
        
    }

    public void setJoin(){
        join.add(new recyclerJoin(
        Sname = Ename.getText().toString(),
        Sprice = Eprice.getText().toString(),
        Sstore = Estore.getText().toString()));
    }

}