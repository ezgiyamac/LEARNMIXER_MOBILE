package com.example.eeristi.learnmixer_mobile;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class screen2 extends ListActivity
{
    String my_course_list_array []={"Math","Language(English)","Physics"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,my_course_list_array));

    }



    @Override
    protected  void onListItemClick(ListView lv, View v,int position, long id)
    {
        if(position==0)
        {
            startActivity(new Intent("com.example.eeristi.learnmixer_mobile.SCREEN_TWO_one"));
        }
        else if(position==1)
        {
            startActivity(new Intent("com.example.eeristi.learnmixer_mobile.SCREEN_TWO_two"));
        }
        else if(position==2)
        {
            startActivity(new Intent("com.example.eeristi.learnmixer_mobile.SCREEN_TWO_three"));
        }

        super.onListItemClick(lv, v, position, id);

    }



}
