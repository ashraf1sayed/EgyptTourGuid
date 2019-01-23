package com.example.ashraf.egypttourguid;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;
public class InformationItems extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        ArrayList<list> Description=new ArrayList<>();
        Description.add(new list(R.drawable.transportation,R.string.InformationItem1Name, R.string.InformationItem1Description,R.drawable.ic_add_location_2x,R.string.InformationItem1Address));
        Description.add(new list(R.drawable.hotel,R.string.InformationItem2Name, R.string.InformationItem2Description,R.drawable.ic_add_location_2x,R.string.InformationItem2Address));
        EgyptTourGideAdapter Information=new EgyptTourGideAdapter(this,Description);
        ListView listView = (ListView) findViewById(R.id.List);
        listView.setAdapter(Information);
    }
    @Override
    public void onClick(View v) {
    }
}

