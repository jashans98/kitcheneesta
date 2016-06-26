package com.kitcheneesta.kitcheneesta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import com.kitcheneesta.kitcheneesta.Model.Data;
import com.kitcheneesta.kitcheneesta.Model.OrderObject;
import com.kitcheneesta.kitcheneesta.Model.Pages;
import com.kitcheneesta.kitcheneesta.Model.ThemeAdapter;


public class ThemeActivity extends Activity {

    private int [] mLogos;
    private GridView mGridView;
    private int cakeOpt;
    private int creamOpt;
    private int weightOpt;
    private EditText mThemeEdit;
    private EditText mTitleEdit;
    private Button mContinueButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);
        Intent intent = getIntent();
        cakeOpt = intent.getIntExtra("cakeOpt", 2);
        creamOpt = intent.getIntExtra("creamOpt", 2);
        weightOpt = intent.getIntExtra("weightOpt", 0);
        Toast.makeText(this, " " + cakeOpt + " " + creamOpt, Toast.LENGTH_LONG).show();
        mThemeEdit = (EditText) findViewById(R.id.theme_edit_text);
        mTitleEdit = (EditText) findViewById(R.id.cake_edit_text);
        mLogos = Pages.themePics;
        ThemeAdapter adapter = new ThemeAdapter(this, mLogos);
        mGridView = (GridView) findViewById(R.id.themeGrid);
        mGridView.setAdapter(adapter);

        mContinueButton = (Button) findViewById(R.id.nextButton);
        mContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String themeText =  mThemeEdit.getText().toString();
                String titleText = mTitleEdit.getText().toString();
                Data.cakeText = titleText;
                Data.cakeTheme = themeText;

                Intent intent = new Intent(ThemeActivity.this, SummaryActivity.class);
                startActivity(intent);
            }
        });
    }


}
