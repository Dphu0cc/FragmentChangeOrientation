package com.phuoc.fragmentchangeorientation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<SinhVien> sinhvienList;

    public StudentAdapter(Context context, int layout, List<SinhVien> sinhvienList) {
        this.context = context;
        this.layout = layout;
        this.sinhvienList = sinhvienList;
    }

    @Override
    public int getCount() {
        return sinhvienList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public class ViewHolder {
        TextView txtTen;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            viewHolder.txtTen = view.findViewById(R.id.textviewHoTen);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }


        SinhVien sinhVien = sinhvienList.get(i);

        viewHolder.txtTen.setText(sinhVien.getHoTen());
        return view;
    }

}
