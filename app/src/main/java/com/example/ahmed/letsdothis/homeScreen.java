package com.example.ahmed.letsdothis;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.content.pm.ActivityInfo;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;



public class homeScreen extends AppCompatActivity {

    RecyclerView listRecyclerView;
    ListRecyclerViewAdapter listRecyclerAdapter;
    List<Lists> list;
    //List<Tasks> tasksList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // get day name
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        String dayName = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());

        // get full date
        String fullDate = DateFormat.getDateInstance(DateFormat.LONG).format(calendar.getTime());

        // display the dayName to TextView
        TextView dayNameTextView = findViewById(R.id.DATE_NAME);
        dayNameTextView.setText(dayName);
        // display full date
        TextView fullDateTextView = findViewById(R.id.Full_Date);
        fullDateTextView.setText(fullDate);

        // show lists in cards
        list = new ArrayList<>();

        listRecyclerView = findViewById(R.id.lIST_RECYCLER_VIEW);
        listRecyclerView.setHasFixedSize(true);
        listRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        list.add(new Lists("Home"));
        list.add(new Lists("Work"));

        listRecyclerAdapter = new ListRecyclerViewAdapter(this, list);
        listRecyclerView.setAdapter(listRecyclerAdapter);

        // show tasks in listView in Cards

       /*listView = findViewById(R.id.LIST_VIEW_CHECK_LIST);

        tasksArrayList = new ArrayList<>();

        tasksArrayList.add(new Tasks("clean room"));
        tasksArrayList.add(new Tasks("hug me"));

        ListViewadapter = new taskListViewAdapter(tasksArrayList,getApplicationContext());

        listView.setAdapter(ListViewadapter);*/

        //tasksList.add(new Tasks("clean room"));
        //CreateAndAppendListLayout();
        // CardView cardView = findViewById(R.id.CARD_VIEW);
        // LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.task_layout,null);
        // cardView.addView(linearLayout);

        /*LayoutInflater inflater =(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.task_layout,null);
        FrameLayout container = findViewById(R.id.CARD_VIEW);
        container.addView(view);*/


    }
}
