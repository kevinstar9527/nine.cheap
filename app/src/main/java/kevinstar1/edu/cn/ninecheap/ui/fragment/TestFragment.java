package kevinstar1.edu.cn.ninecheap.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kevinstar1.edu.cn.ninecheap.R;

/**
 * Created by Administrator on 2017/5/2.
 */

public class TestFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test,container,false);

        return view;
    }
}
