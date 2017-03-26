package pl.grab.shortcuts.listener;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import pl.grab.shortcuts.R;


/**
 * Created by GRY on 15.03.2017.
 */

public interface FragmentListener {
    default void changeFragment(FragmentManager fragmentManager, Fragment fragment, Boolean shouldRemoveFromStack) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (shouldRemoveFromStack){
            transaction.replace(R.id.fragment_container, fragment);
        }
        else{
            transaction.replace(R.id.fragment_container, fragment)
                    .addToBackStack(null);

        }
        transaction.commit();
    }

    default void addFragmentToLayout(FragmentManager fragmentManager) {
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = createFragment();
            fragmentManager.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }

    default Fragment createFragment() {
        return new Fragment();
    }




}
