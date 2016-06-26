package com.kitcheneesta.kitcheneesta.Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Jashan on 18/07/2015.
 */
public class OrderObject implements Parcelable{

    private int mImageId;
    private String mDisplayName;
    private int mPrice;

    public OrderObject(int id, String displayName, int price){
        mImageId = id;
        mDisplayName = displayName;
        mPrice = price;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getDisplayName() {
        return mDisplayName;
    }

    public void setDisplayName(String displayName) {
        mDisplayName = displayName;
    }

    public int getPrice() {
        return mPrice;
    }

    public void setPrice(int price) {
        mPrice = price;
    }

    @Override
    public int describeContents() {
        return 0; //Not being used right now
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mImageId);
        dest.writeInt(mPrice);
        dest.writeString(mDisplayName);
    }
    private OrderObject(Parcel in){
        mImageId = in.readInt();
        mPrice = in.readInt();
        mDisplayName = in.readString();
    }

    public static final Creator<OrderObject> CREATOR = new Creator<OrderObject>() {
        @Override
        public OrderObject createFromParcel(Parcel source) {
            return new OrderObject(source);
        }

        @Override
        public OrderObject[] newArray(int size) {
            return new OrderObject[size];
        }
    };
}
