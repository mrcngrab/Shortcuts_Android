package pl.grab.shortcuts.view.fragment;

import android.app.Fragment;
import android.content.Context;
import pl.grab.shortcuts.listener.FragmentListener;

/**
 * Created by gmra on 2016-05-06.
 */
public class BaseFragment extends Fragment {

    protected FragmentListener fragmentListener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(context instanceof FragmentListener) {
            fragmentListener = (FragmentListener) context;
        }
    }
}
