package com.example.ashraf.egypttourguid;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;
public class RestaurantItems extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        ArrayList<list> RestaurantItems=new ArrayList<>();
        RestaurantItems.add(new list(R.drawable.rotor_at_grand_hyatt_hotel_2,R.string.RestaurantItem1Name,R.string.RestaurantItem1Description,R.drawable.ic_add_location_2x,R.string.RestaurantItem1Address));
        RestaurantItems.add(new list(R.drawable.new_nile_pharaoh,R.string.RestaurantItem2Name,R.string.RestaurantItem2Description,R.drawable.ic_add_location_2x,R.string.RestaurantItem2Address));
        RestaurantItems.add(new list(R.drawable.scarabee,R.string.RestaurantItem3Name,R.string.RestaurantItem3Description,R.drawable.ic_add_location_2x,R.string.RestaurantItem3Address));
        EgyptTourGideAdapter egyptTourGideAdapter=new EgyptTourGideAdapter(this,RestaurantItems);
        ListView listView = (ListView) findViewById(R.id.List);
        listView.setAdapter(egyptTourGideAdapter);
    }
    @Override
    public void onClick(View v) {
    }
}
