package com.example.ashraf.egypttourguid;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public class EgyptTourGideAdapter extends ArrayAdapter<list> {
    public EgyptTourGideAdapter(Activity context, ArrayList<list> touristicalMonuments) {
        super(context ,0 ,touristicalMonuments);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ListView=convertView;
        if(ListView == null) {
            ListView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listitems, parent, false);
        }
        list List1= (list) getItem(position);
        ImageView imageView = (ImageView) ListView.findViewById(R.id.ImageId);
        imageView.setImageResource(List1.getImageResourceId());
        TextView textView1= (TextView) ListView.findViewById(R.id.NameId);
        textView1.setText(List1.getNameOfPlace());
        TextView textView2= (TextView) ListView.findViewById(R.id.DescriptionId);
        textView2.setText(List1.getDescription());
        ImageView ImageLocation= (ImageView) ListView.findViewById(R.id.ImageLocationId);
        ImageLocation.setImageResource(List1.getImageLocationId());
        TextView textView3= (TextView) ListView.findViewById(R.id.AddressId);
        textView3.setText(List1. getAddressOfPlace());
        return ListView;
    }
}
