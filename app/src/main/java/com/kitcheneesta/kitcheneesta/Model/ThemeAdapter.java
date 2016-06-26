package com.kitcheneesta.kitcheneesta.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.kitcheneesta.kitcheneesta.R;
import com.makeramen.roundedimageview.RoundedImageView;

/**
 * Created by Jashan on 01/08/2015.
 */
public class ThemeAdapter extends BaseAdapter {
    Context mContext;
    int [] mIds;

    public ThemeAdapter (Context context, int [] ids){
        this.mContext = context;
        this.mIds = ids;
    }

    @Override
    public int getCount() {
        return mIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mIds[position];
    }

    @Override
    public long getItemId(int position) {
        return mIds[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null){
            convertView = inflater.from(mContext).inflate(R.layout.theme_item, null);
            holder = new ViewHolder();
            holder.mView = (RoundedImageView) convertView.findViewById(R.id.themeIcon);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.mView.setImageResource(mIds[position]);
        holder.mView.setCornerRadius((float) 25);
        convertView.setTag(holder);
        return convertView;
    }
    public static class ViewHolder{
        RoundedImageView mView;
    }
}
