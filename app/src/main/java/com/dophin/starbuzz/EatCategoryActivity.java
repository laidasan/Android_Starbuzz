package com.dophin.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.*;

public class EatCategoryActivity extends Activity {
    private String[] eatKey= {"店長推薦","火","評價推薦"};
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_category);
        List<Map<String,String>> eatList = new ArrayList<>();
        for (int i = 0;i < eatKey.length;i++) {
            Map<String,String> eatMap = new HashMap<>();
            eatMap.put("levels",eatKey[i]);
            eatMap.put("Name",Eat.Eats[i].getName());
            eatList.add(eatMap);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,
                eatList,
                R.layout.eat_layout,
                new String[]{"levels","Name"},
                new int[]{R.id.Eat_title,R.id.Eat_Name}
        );
        listView = (ListView)findViewById(R.id.Eat_CatagoryListView);
        listView.setAdapter(simpleAdapter);


    }
}
