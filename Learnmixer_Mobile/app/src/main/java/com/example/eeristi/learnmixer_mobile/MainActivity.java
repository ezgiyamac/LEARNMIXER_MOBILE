package com.example.eeristi.learnmixer_mobile;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button my_btn_login = (Button) findViewById(R.id.btn_login);
        final EditText my_username = (EditText) findViewById(R.id.edt_txt_username);
        final EditText my_password = (EditText) findViewById(R.id.edt_txt_password);
        final AlertDialog alertDialog = new AlertDialog.Builder(this).create();


        my_btn_login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (my_username.getText().toString().equals("ezgi") && my_password.getText().toString().equals("yamac") )
                {
                    startActivity(new Intent("com.example.eeristi.learnmixer_mobile.SCREEN_TWO"));
                }
                else
                {

                    alertDialog.setTitle("Incorrect...");
                    alertDialog.setMessage("Please control your username and password!..");
                    alertDialog.setButton("OK", new DialogInterface.OnClickListener()
                    {
                        public void onClick(DialogInterface dialog, int which)
                        {
                            // here you can add functions
                        }
                    });
                    alertDialog.setIcon(R.drawable.alert);
                    alertDialog.show();
                }


            }
        });




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
