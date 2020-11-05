package kr.hs.emirim.s2019s05.actionbarandfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.AppComponentFactory;
import android.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {

    ActionBar.Tab tabPark, tabSon, tabAhn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        androidx.appcompat.app.ActionBar bar = getSupportActionBar();
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}