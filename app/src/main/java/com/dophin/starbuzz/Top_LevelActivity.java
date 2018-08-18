package com.dophin.starbuzz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import static android.widget.AdapterView.*;

public class Top_LevelActivity extends Activity {
    private ListView listView;
    private CharSequence text = "This is a first item.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top__level);
        listView = (ListView)findViewById(R.id.Top_listView);
        listView.setOnItemClickListener(itemClickListener);

    }

    private OnItemClickListener itemClickListener = new OnItemClickListener() {
        @Override
        public void onItemClick(
                AdapterView<?> listView,
                View itemView,
                int position,
                long id
        ){
            Intent intent = new Intent();
            //依照按下哪個item傳到相應的Activity
            switch (position) {
                case 0:
                    //Intent intent = new Intent(Top_LevelActivity.this,DrinkCategoryActivity.class);
                    intent.setClass(Top_LevelActivity.this,DrinkCategoryActivity.class);
                    break;
                case 1:
                    intent.setClass(Top_LevelActivity.this,EatCategoryActivity.class);
                    break;
                case 2:
                    break;
            }
            startActivity(intent);


            Toast.makeText(Top_LevelActivity.this, "This is a " + (position + 1)+" item." , Toast.LENGTH_SHORT).show();
        }
    };
}
