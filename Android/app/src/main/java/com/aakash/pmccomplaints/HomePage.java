package com.aakash.pmccomplaints;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    private Button btn_logcomplaints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        btn_logcomplaints =(Button) findViewById(R.id.btn_log);
        btn_logcomplaints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityForm();
            }
        });
    }

    public void openActivityForm(){

        Intent intent = new Intent(this,Activity_Form.class);
        startActivity(intent);
    }

}
