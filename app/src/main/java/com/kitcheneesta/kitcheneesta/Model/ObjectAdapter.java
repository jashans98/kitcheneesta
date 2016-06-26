package com.kitcheneesta.kitcheneesta.Model;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kitcheneesta.kitcheneesta.R;
import com.makeramen.roundedimageview.RoundedImageView;


/**
 * Created by Jashan on 22/07/2015.
 */
public class ObjectAdapter extends BaseAdapter{

    private Context mContext;
    private OrderObject [] mOrderObjects;

    public ObjectAdapter(Context context, OrderObject [] objects) {
        mContext = context;
        mOrderObjects = objects;
    }
    @Override
    public int getCount() {
        return mOrderObjects.length;
    }

    @Override
    public Object getItem(int position) {
        return mOrderObjects[position];
    }

    @Override
    public long getItemId(int position) {
        return 0; //not being used
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null){
            convertView = inflater.from(mContext).inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.mIcon = (RoundedImageView) convertView.findViewById(R.id.listIcon);
            holder.mDisplayText = (TextView) convertView.findViewById(R.id.item_label);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }
        OrderObject orderObject = mOrderObjects[position];
        holder.mDisplayText.setText(orderObject.getDisplayName());
        holder.mIcon.setImageResource(orderObject.getImageId());
        holder.mIcon.setCornerRadius((float) 85);
        convertView.setTag(holder);

        return convertView;


    }

    public static class ViewHolder{
        public TextView mDisplayText;
        public RoundedImageView mIcon;
    }
}
