package com.master.star.fademc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView mLogoImage;
    private View mGooglePayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLogoImage = findViewById(R.id.logo_image);
        mLogoImage.setImageResource(R.drawable.logo_image);
        mGooglePayButton = findViewById(R.id.google_pay_button);
        mGooglePayButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(), "Google Pay", Toast.LENGTH_LONG).show();
                    }
                });
    }
}
