package com.example.ahmed.letsdothis;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.List;

/*
 *RecyclerView.Adabpter
 *RecyclerView.ViewHolder
 */
public class ListRecyclerViewAdapter extends RecyclerView.Adapter<ListRecyclerViewAdapter.ListViewHolder>{

    private Context mContext;
    private List<Lists> Listslist;

    public ListRecyclerViewAdapter(Context mContext, List<Lists> listslist) {
        this.mContext = mContext;
        this.Listslist = listslist;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.list_layout, null);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Lists list = Listslist.get(position);

        holder.ListName.setText(list.getListName());

    }

    @Override
    public int getItemCount() {
        return Listslist.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder{

        TextView ListName;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            ListName = itemView.findViewById(R.id.LIST_NAME_TEXT_VIEW);
        }
    }
}
