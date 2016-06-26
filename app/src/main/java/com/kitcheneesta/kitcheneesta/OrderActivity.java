package com.kitcheneesta.kitcheneesta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.kitcheneesta.kitcheneesta.Model.Data;
import com.kitcheneesta.kitcheneesta.Model.ObjectAdapter;
import com.kitcheneesta.kitcheneesta.Model.OrderObject;
import com.kitcheneesta.kitcheneesta.Model.OrderPage;
import com.kitcheneesta.kitcheneesta.Model.Pages;


public class OrderActivity extends Activity {

    private GridView mGridView;
    private TextView mHeading;
    private int mVar = 0; //counter to determine next setting
    private OrderPage mPage;
    private int mFirstVal;
    private int mSecondVal;
    private int mThirdVal;
    private int mFourthVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        mHeading = (TextView) findViewById(R.id.orderLogo);
        mGridView = (GridView) findViewById(R.id.gridView);
        setLayout();
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (mVar == 0) {
                    mFirstVal = position;
                    Data.baseIndex = position;
                } else if (mVar == 1) {
                    mSecondVal = position;
                    Data.topIndex = position;
                } else if (mVar == 2){
                    mThirdVal = position;
                    Data.sizeIndex = position;
                } else if (mVar == 3){
                    mThirdVal = position;
                    Data.sugarIndex = position;
                }
                mVar += 1;
                setLayout();
            }
        });
    }

    private void setLayout() {
        setViews();
    }

    private void setViews() {
        if (mVar == 0){
            mPage = Pages.cakePage;
        }
        else if (mVar == 1){
            mPage = Pages.creamPage;
        }
        else if (mVar == 2){
            mPage = Pages.weights;
        }
        else if (mVar == 3){
            mPage = Pages.sugarPage;
        }
        else if (mVar == 4){
            moveToThemeSelection();
            return;
        }
        ObjectAdapter adapter = new ObjectAdapter(this, mPage.getObjects());
        mGridView.setAdapter(adapter);
        mHeading.setText(mPage.getHeading());
    }

    private void moveToThemeSelection() {
        Intent intent = new Intent(this, ThemeActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mVar = 0;
        setLayout();
    }
}
