package com.example.a20140550.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.settingID)
        {

            Toast.makeText(MainActivity.this,"Setting is Selected",Toast.LENGTH_SHORT).show();
            return true;
        }

        if(item.getItemId()==R.id.ShareID)
        {

            Toast.makeText(MainActivity.this,"Shared is Selected",Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.FeedbackID)
        {

            Toast.makeText(MainActivity.this,"Feedback is Selected",Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.ContactUsID)
        {

            Toast.makeText(MainActivity.this,"Contact us is Selected",Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.AboutusID)
        {

            Toast.makeText(MainActivity.this,"About us is Selected",Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
