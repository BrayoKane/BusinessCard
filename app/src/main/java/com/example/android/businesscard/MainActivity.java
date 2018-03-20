package com.example.android.businesscard;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    TextView textView = new TextView(this);
//                    SpannableStringBuilder ssb = new SpannableStringBuilder( "Here's a smiley how are you ");
//                    Bitmap smiley = BitmapFactory.decodeResource( getResources(), R.drawable.ic_smiley_wink );
//                    ssb.setSpan( new ImageSpan( smiley ), ssb.length()-1, ssb.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE );
//                    textView.setText( ssb, TextView.BufferType.SPANNABLE );
}
