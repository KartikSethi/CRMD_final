package com.example.android.splash;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String name, image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = this.getIntent();
        if (intent != null & intent.hasExtra("text"))
            name = intent.getStringExtra("text");
        if (intent != null & intent.hasExtra("image"))
            image = intent.getStringExtra("image");
        Bitmap bmp = base64ToBitmap(image);
       // Log.e("ddd", name);
        ImageView iv = (ImageView)findViewById(R.id.captured_image2);
        if (bmp != null)
            iv.setImageBitmap(bmp);


        //mLocationAddressTextView = (TextView) findViewById(R.id.location_address_view);
//        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);

//        Log.e("name", name);
       TextView et = (TextView) findViewById(R.id.edit2);
        et.setMinHeight(200);
        et.setText(name);
        // Set defaults, then update using values stored in the Bundle.



    //    report_header.setTypeface(typeFace);


    }

    private Bitmap base64ToBitmap(String b64) {
        byte[] imageAsBytes = Base64.decode(b64.getBytes(), Base64.DEFAULT);
        return BitmapFactory.decodeByteArray(imageAsBytes, 0, imageAsBytes.length);
    }

}
