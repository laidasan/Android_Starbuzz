package com.dophin.starbuzz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import static android.widget.AdapterView.*;

public class DrinkCategoryActivity extends Activity {
    //private final Drink[] drinks = {new Drink("Lotte","This is a Lotte."),
    //                  new Drink("Cappuccino","This is a Cappuccino."),
    //                  new Drink("Filter","This is a Filter.")};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);
        ListView drinkView = (ListView)findViewById(R.id.Drink_listView);
        ArrayAdapter<Drink> DrinksAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Drink.drinks);

        drinkView.setAdapter(DrinksAdapter);
        drinkView.setOnItemClickListener(itemClickListener);
    }

    private OnItemClickListener itemClickListener =  (listview,itemview,position,id) -> {
        Intent intent = new Intent(DrinkCategoryActivity.this,DrinkActivity.class);
        intent.putExtra(DrinkActivity.EXTRA_DRINKID,(int)id);
        startActivity(intent);
    };
}
