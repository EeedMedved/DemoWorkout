package com.senna.workouts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity
                implements WorkoutListFragment.WorkoutListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void itemClicked(long id) {
        WorkoutDetailFragment details = new WorkoutDetailFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        details.setWorkout(id);
        ft.replace(R.id.fragment_container, details);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_EXIT_MASK);
        ft.commit();
    }
}
