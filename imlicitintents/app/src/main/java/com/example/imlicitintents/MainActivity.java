package com.example.imlicitintents;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText websiteEditText;
    private EditText locationEditText;
    private EditText shareEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        websiteEditText = findViewById(R.id.website_edittext1);
        locationEditText = findViewById(R.id.location_edittext2);
        shareEditText = findViewById(R.id.share_edittext3);

        Button openWebsiteButton = findViewById(R.id.open_website_button1);
        Button openLocationButton = findViewById(R.id.open_location_button2);
        Button shareTextButton = findViewById(R.id.share_text_button3);

        openWebsiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebsite();
            }
        });

        openLocationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLocation();
            }
        });

        shareTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareText();
            }
        });
    }

    public void openWebsite() {
        String url = websiteEditText.getText().toString();
        if (!url.isEmpty()) {
            if (!url.startsWith("http://") && !url.startsWith("https://")) {
                url = "http://" + url;
            }
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        }
    }

    public void openLocation() {
        String location = locationEditText.getText().toString();
        if (!location.isEmpty()) {
            Uri locationUri = Uri.parse("geo:0,0?q=" + location);
            Intent intent = new Intent(Intent.ACTION_VIEW, locationUri);
            startActivity(intent);
        }
    }

    public void shareText() {
        String text = shareEditText.getText().toString();
        if (!text.isEmpty()) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share via"));
        }
    }
}