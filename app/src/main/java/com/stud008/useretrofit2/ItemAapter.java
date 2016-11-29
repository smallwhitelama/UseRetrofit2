package com.stud008.useretrofit2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yvtc on 2016/11/29.
 */

public class ItemAapter extends ArrayAdapter<String>{
    private  int resource;
    private  List<String> items;

    public ItemAapter(Context context, int resource/*, List<String> items*/) {
        super(context, resource/*,items*/);
        this.resource=resource;
        /*this.items=items;*/

    }

    @NonNull
    @Override
    public View getView(final  int position, View convertView, ViewGroup parent){
//        return super.getView(position,convertView,parent);

        LinearLayout itemView;
        String string = getItem(position);

        if (convertView ==null){
            itemView=new LinearLayout(getContext());
            String inflater = Context.LAYOUT_INFLATER_SERVICE;
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(inflater);
            layoutInflater.inflate(resource,itemView,true);
        }
        else{
            itemView = (LinearLayout) convertView;
        }
        TextView textView = (TextView) itemView.findViewById(R.id.buttonUpdate);






                return itemView;
    }
}
