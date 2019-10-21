package com.example.calculator;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class menu {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.help:
                Toast.makeText(MainActivity.this,"This is a help",Toast.LENGTH_SHORT).show();
                break;
            case R.id.transformate:


        }
        return true;
    }
}
