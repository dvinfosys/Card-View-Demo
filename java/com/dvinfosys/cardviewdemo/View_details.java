package com.dvinfosys.cardviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class View_details extends AppCompatActivity {

    ImageView imageView;
    TextView name,desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_details);
        imageView= (ImageView) findViewById(R.id.image);
        name= (TextView) findViewById(R.id.name);
        desc= (TextView) findViewById(R.id.desc);

        imageView.setImageResource(getIntent().getIntExtra("image_id",00));
        name.setText("Name : "+getIntent().getStringExtra("name"));
        desc.setText(""+getIntent().getStringExtra("desc"));
    }
}
