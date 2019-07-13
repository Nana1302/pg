package com.example.palawalygrace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class InsertTyre extends AppCompatActivity {

    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.insert_tyre );

        save = findViewById( R.id.save_button );

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InsertTyre.this, ListOfVehicles.class);
                startActivity(intent);
            }

        });

    }
}
