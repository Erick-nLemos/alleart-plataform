package com.ericklemos.alleart;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class Cursos extends AppCompatActivity {

    Intent nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);
    }

    public void clickVoltar(View view){
        finish();
    }
}