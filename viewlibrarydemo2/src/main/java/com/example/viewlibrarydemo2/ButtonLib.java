package com.example.viewlibrarydemo2;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;

public class ButtonLib extends LinearLayout {

    public Button button;

    public ButtonLib(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public void setButtonText(String text){
        button.setText(text);
    }

    public void init(Context context) {

        inflate(context,R.layout.activity_button_lib,this);
        button = findViewById(R.id.btnID);

    }
}
