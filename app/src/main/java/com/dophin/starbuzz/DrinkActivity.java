package com.dophin.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DrinkActivity extends Activity {
    public static final String EXTRA_DRINKID="drinkID";
    TextView nameView;
    TextView description;
    int drinkID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        drinkID = (Integer)getIntent().getExtras().get(EXTRA_DRINKID);
        nameView = (TextView)findViewById(R.id.Drink_description_title);
        description = (TextView)findViewById(R.id.Drink_decription);
        nameView.setText(Drink.drinks[drinkID].getName());
        description.setText(Drink.drinks[drinkID].getDescription());
    }
}
