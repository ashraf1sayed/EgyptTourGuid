package com.example.ashraf.egypttourguid;
import android.app.Activity;
public class list extends Activity{
    private int NameOfPlace;
    private int mImageResourceId;
    private int ImageLocationId;
    private int AddressOfPlace;
    private int Description;
    public list( int imageResourceId,int nameOfPlace, int description,int imageLocationId ,int addressOfPlace)
    {
        mImageResourceId = imageResourceId;
        NameOfPlace = nameOfPlace;
        Description=description;
        AddressOfPlace=addressOfPlace;
        ImageLocationId=imageLocationId;
    }
    public int getImageResourceId() {return mImageResourceId;}
    public int getNameOfPlace() {return NameOfPlace;}
    public int getDescription() {return Description;}
    public int getAddressOfPlace() {return AddressOfPlace;}
    public int getImageLocationId(){return ImageLocationId;}
}
