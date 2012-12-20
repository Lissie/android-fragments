package com.lissie.androidfragments;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainFragments extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_fragments);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_fragments, menu);
        return true;
    }
}
