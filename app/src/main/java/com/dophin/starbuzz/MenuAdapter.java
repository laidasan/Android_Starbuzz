package com.dophin.starbuzz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.*;

public class MenuAdapter extends BaseAdapter {
    private List<Object> datas = new ArrayList<>();
    private LayoutInflater layoutInflater;

    static class ViewHolder {
        //LayoutInflater layout2;
        TextView level;
        TextView name;
    }
    public MenuAdapter(List<Object> datas,LayoutInflater layoutInflater) {
        this.datas = datas;
        this.layoutInflater = layoutInflater;
    }
    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View converview, ViewGroup parent) {
        ViewHolder holder;
        if (converview != null) {
            holder = (ViewHolder)converview.getTag();
        }else {
            holder = new ViewHolder();
            converview = layoutInflater.inflate(R.layout.eat_layout2,null);
            holder.level = (TextView)converview.findViewById(R.id.level);
            holder.name = (TextView)converview.findViewById(R.id.name);
            converview.setTag(holder);
        }
        holder.level.setText( ((Eat)getItem(position)).getLevel());
        holder.name.setText(((Eat)getItem(position)).getName());
        return converview;


    }
}