package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ColorAdapter extends BaseAdapter
{
    Context context;
    String[] colourStr;
    int[] colourInt;
    int counter = 0;

    public ColorAdapter(Context context, String[] colourStr, int[] colourInt)
    {
        this.context = context;
        this.colourStr = colourStr;
        this.colourInt = colourInt;
    }

    @Override
    public int getCount() {
        return colourStr.length;
    }

    @Override
    public Object getItem(int i) {
        return colourStr[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, @Nullable View convertView, ViewGroup viewGroup) {
        TextView textView;

        if(convertView == null)
        {
            textView = new TextView(context);
            textView.setText(getItem(position).toString());
            if(counter == 0)
            {
                textView.setTextColor(Color.BLACK);
                counter ++;
            }
            else
            {
                textView.setTextColor(colourInt[position]);
            }
        }

        else
        {
            textView = (TextView) convertView;
        }
        textView.setTextSize(22);
        textView.setBackgroundColor(Color.WHITE);
        return textView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, ViewGroup viewGroup){
        TextView textView;
        if (convertView == null)
        {
            textView = new TextView(context);
        }
        else
        {
            textView = (TextView) convertView;
        }
        textView.setTextColor(Color.BLACK);
        textView.setText(getItem(position).toString());
        textView.setPadding(5, 5, 5, 5);
        textView.setTextSize(22);
        textView.setBackgroundColor(colourInt[position]);
        return textView;
    }



}
