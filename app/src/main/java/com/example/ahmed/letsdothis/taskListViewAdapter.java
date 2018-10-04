package com.example.ahmed.letsdothis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextClock;

import java.util.ArrayList;


public class taskListViewAdapter extends ArrayAdapter<Tasks> {

    private ArrayList<Tasks> tasksArrayList;
    Context mContext;

    private static class ViewHolder{
        CheckBox TaskName;
        TextClock TaskTime;
    }

    public taskListViewAdapter(ArrayList<Tasks> tasks,Context context){
        super(context, R.layout.task_layout, tasks );
        this.tasksArrayList =tasks;
        this.mContext=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // Get the data item for this position
        Tasks tasks = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.task_layout, parent, false);
            viewHolder.TaskName = convertView.findViewById(R.id.CHECK_B0X_TASK);
            //viewHolder.TaskTime = convertView.findViewById(R.id.TEXT_CLOCK_TASK);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.TaskName.setText("kn,m");


        // Return the completed view to render on screen
        return convertView;
    }


}
