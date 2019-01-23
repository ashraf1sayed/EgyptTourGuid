package com.example.ashraf.egypttourguid;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;
public class ShoppingItems extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        ArrayList<list> ShoppingItems=new ArrayList<>();
        ShoppingItems.add(new list(R.drawable.khan,R.string.ShoppingItem1Name,R.string.ShoppingItem1Description,R.drawable.ic_add_location_2x,R.string.ShoppingItem1Address));
        ShoppingItems.add(new list(R.drawable.moll,R.string.ShoppingItem2Name,R.string.ShoppingItem2Description,R.drawable.ic_add_location_2x,R.string.ShoppingItem2Address));
        ShoppingItems.add(new list(R.drawable.sultan,R.string.ShoppingItem3Name,R.string.ShoppingItem3Description,R.drawable.ic_add_location_2x,R.string.ShoppingItem3Address));
        EgyptTourGideAdapter egyptTourGideAdapter=new EgyptTourGideAdapter(this,ShoppingItems);
        ListView listView = (ListView) findViewById(R.id.List);
        listView.setAdapter(egyptTourGideAdapter);
    }
    @Override
    public void onClick(View v) {
    }
}
