package com.miyuu.android.androidtipssample;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    EditText mEditText;
    Button mButton;
    Button mButton2;
    TextView mTextView;
    ImageButton mImageButton;

    private DialogFragment dialogFragment;
    private FragmentManager flagmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mEditText = findViewById(R.id.editText);
        mButton = findViewById(R.id.button);
        mButton2 = findViewById(R.id.button2);
        mTextView = findViewById(R.id.textView);
        mImageButton = findViewById(R.id.imageButton);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //EditTextに入力された内容を取得してString型の変数textに代入
                String text = mEditText.getText().toString();
                //TextViewに↑のtextを表示させる
                mTextView.setText(text);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ボタンをクリックしたらダイアログを表示させる
                //ダイアログを表示させるのに必要なFragmentマネージャを生成する
                flagmentManager = getSupportFragmentManager();
                //フラグメント用のクラスのインスタンスを作成
                dialogFragment = new DialogFragment();
                //↑を使ってダイアログを表示させる
                dialogFragment.show(flagmentManager, "dialog");
            }
        });

        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(intent);
            }
        });
    }
}
