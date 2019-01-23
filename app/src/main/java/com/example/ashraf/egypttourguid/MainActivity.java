package com.example.ashraf.egypttourguid;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button TouristicalMonuments= (Button) findViewById(R.id.TouristicalMonumentsId);
        Button Restaurant= (Button) findViewById(R.id.RestaurantId);
        Button Shopping= (Button) findViewById(R.id.ShoppingId);
        Button Information= (Button) findViewById(R.id.InformationId);
        TouristicalMonuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TouristicalMonuments=new Intent(MainActivity.this,TouristcalMonumentsItems.class);
                startActivity(TouristicalMonuments);
            }
        });
        Restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Restaurant=new Intent(MainActivity.this,RestaurantItems.class);
                startActivity(Restaurant);
            }
        });
        Shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Shopping=new Intent(MainActivity.this,ShoppingItems.class);
                startActivity(Shopping);
            }
        });
        Information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Information=new Intent(MainActivity.this,InformationItems.class);
                startActivity(Information);
            }
        });
    }
}
