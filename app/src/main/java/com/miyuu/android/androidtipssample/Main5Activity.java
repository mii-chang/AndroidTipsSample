package com.miyuu.android.androidtipssample;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        // レイアウトファイルで定義したリストビューを取得
        ListView listView = findViewById(R.id.sample_listview);

        // リストビューに表示する要素(SampleListItemで定義したもの)を設定
        ArrayList<SampleListItem> listItems = new ArrayList<>();

        // 五人分の情報を表示させる
        for (int i = 0; i < 5; i++) {

            //　リストに表示するための値を変数に代入しておく
            Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.rabbit);
            String text = "sample text No. " + String.valueOf(i);

            // SampleListItemにそれぞれの変数を格納する
            SampleListItem item = new SampleListItem(bmp, text);

            // リストビューに表示するためのリストにアイテムを追加
            listItems.add(item);
        }

        // 出力結果をリストビューに表示
        SampleListAdapter adapter = new SampleListAdapter(this, R.layout.samplelist_item, listItems);
        listView.setAdapter(adapter);
    }
}
