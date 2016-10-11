package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }
/*
 * 初始化数据
 */

    private void initData() {
        List<String> mData = new ArrayList<String>();
        for (int i=0;i<10;i++){
            mData.add(i+"A");
        }
    }

    private void initView() {
        mListView = (ListView) findViewById(R.id.id_lv);
    }
}
