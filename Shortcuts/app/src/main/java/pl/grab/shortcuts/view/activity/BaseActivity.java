package pl.grab.shortcuts.view.activity;

import android.app.Fragment;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import pl.grab.shortcuts.R;
import pl.grab.shortcuts.listener.FragmentListener;

/**
 * Created by GRY on 15.03.2017.
 */

public class BaseActivity extends AppCompatActivity implements FragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        addFragmentToLayout(getFragmentManager());
    }
}
