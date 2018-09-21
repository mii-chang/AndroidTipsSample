package com.miyuu.android.androidtipssample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //変数の追加
    TextView mTextView1;
    TextView mTextView2;

    Button mButton;
    ImageButton mImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //レイアウトファイルと変数を関連付け
        mTextView1 = findViewById(R.id.textView1);
        mTextView2 = findViewById(R.id.textView2);
        mButton = findViewById(R.id.button);
        mImageButton = findViewById(R.id.imageButton);

        //文字を表示させる
        //textView.setText("表示させたい文字")
        mTextView1.setText("文字を表示させる");

        //ボタンをクリックできるようにする
        //button.setOnClickListener(new View.OnClickListener() {
        //        @Override
        //        public void onClick(View v) {
        //            ボタンを押したらしたい処理
        //        }
        //    });
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ボタンを押したらしたい処理
                mTextView2.setText("文字が変わります");
            }
        });

        //画像ボタンを推せるようにする
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //画面を切り替える
                //Intent intent = new Intent(現在のActivity ,遷移したいActivity.class);
                //startActivity(intent)
                Intent intent = new Intent(MainActivity.this ,Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
