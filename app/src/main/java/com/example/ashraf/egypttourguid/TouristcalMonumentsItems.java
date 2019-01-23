package com.example.ashraf.egypttourguid;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;
public class TouristcalMonumentsItems extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        ArrayList<list> TouristcalMonuments=new ArrayList<>();
        TouristcalMonuments.add(new list(R.drawable.egyption_museum,R.string.TouristicalMonumentsItem1Name,R.string.TouristicalMonumentsItem1Description,R.drawable.ic_add_location_2x,R.string.TouristicalMonumentsItem1Address));
        TouristcalMonuments.add(new list(R.drawable.mosque_of_ibn_tulun,R.string.TouristicalMonumentsItem2Name,R.string.TouristicalMonumentsItem2Description,R.drawable.ic_add_location_2x,R.string.TouristicalMonumentsItem2Address));
        TouristcalMonuments.add(new list(R.drawable.karnak_temple,R.string.TouristicalMonumentsItem3Name,R.string.TouristicalMonumentsItem3Description,R.drawable.ic_add_location_2x,R.string.TouristicalMonumentsItem3Address));
        TouristcalMonuments.add(new list(R.drawable.valley_of_the_kings,R.string.TouristicalMonumentsItem4Name,R.string.TouristicalMonumentsItem4Description,R.drawable.ic_add_location_2x,R.string.TouristicalMonumentsItem4Address));
        EgyptTourGideAdapter egyptTourGideAdapter=new EgyptTourGideAdapter(this,TouristcalMonuments);
        ListView listView = (ListView) findViewById(R.id.List);
        listView.setAdapter(egyptTourGideAdapter);
    }
    @Override
    public void onClick(View v) {
    }
}
