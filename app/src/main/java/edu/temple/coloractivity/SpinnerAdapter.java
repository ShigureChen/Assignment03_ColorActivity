package edu.temple.coloractivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SpinnerAdapter extends BaseAdapter
{
    Context context;
    String[] colourStr;
    int[] colourInt;
    private LayoutInflater mInflater;

    public SpinnerAdapter(Context context, String[] colourStr,int[] colourInt)
    {
        super();
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
    public View getView(int position, View convertView, ViewGroup viewGroup) {


        TextView textView = new TextView(context);
        textView.setText(getItem(position).toString());
        textView.setPadding(5, 5, 5, 5);
        textView.setTextSize(22);
        textView.setBackgroundColor(colourInt[position]);

        return textView;
    }


}
