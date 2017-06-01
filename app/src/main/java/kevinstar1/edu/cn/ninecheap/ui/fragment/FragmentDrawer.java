package kevinstar1.edu.cn.ninecheap.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.GridView;

import com.classic.adapter.BaseAdapterHelper;
import com.classic.adapter.CommonAdapter;

import java.util.ArrayList;
import java.util.List;

import kevinstar1.edu.cn.ninecheap.R;

/**
 * Created by Administrator on 2017/5/1.
 */

public class FragmentDrawer extends Fragment {

    private int[][] pictureAndName = new int[][]{new int[]{R.drawable.left_menu_all, R.string.str_left_all}, new int[]{R.drawable.left_menu_nvzhuang, R.string.str_left_nvzhuang}, new int[]{R.drawable.left_menu_nanzhuang, R.string.str_left_nanzhuang}, new int[]{R.drawable.left_menu_neiyi, R.string.str_left_neiyi}, new int[]{R.drawable.left_menu_peishi, R.string.str_left_peishi}, new int[]{R.drawable.left_menu_xiebao, R.string.str_left_xiebao}, new int[]{R.drawable.left_menu_meizhuang, R.string.str_left_meizhuang}, new int[]{R.drawable.left_menu_dianqi, R.string.str_left_dianqi}, new int[]{R.drawable.left_menu_baihuo, R.string.str_left_market}, new int[]{R.drawable.left_menu_jiaju, R.string.str_left_jiaju}, new int[]{R.drawable.left_menu_muying, R.string.str_left_muying}, new int[]{R.drawable.left_menu_meishi, R.string.str_left_meishi}, new int[]{R.drawable.left_menu_sports, R.string.str_left_sport}, new int[]{R.drawable.left_menu_other, R.string.str_left_other}};
    private GridView mGridView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_drawer,container,false);

        mGridView = (GridView) view.findViewById(R.id.gridview_left_menu);

        initView(view);

        return view;
    }

    private void initView(View rootView) {

        List<String> mStrings = new ArrayList<>();
        for (int i = 0; i < pictureAndName.length; i++) {
            String hello = "hello";
            mStrings.add(hello);
        }

        CommonAdapter<String> commonAdapter = new CommonAdapter<String>(getContext(),R.layout.layout_main_left_list_item,mStrings) {
            @Override
            public void onUpdate(BaseAdapterHelper helper, String item, int position) {



            }
        };

        mGridView.setAdapter(commonAdapter);

        ViewGroup.LayoutParams params = mGridView.getLayoutParams();
        WindowManager wm = (WindowManager) getContext()
                .getSystemService(Context.WINDOW_SERVICE);

        int width = wm.getDefaultDisplay().getWidth();
        int widths = (int)(width*0.6);
        params.width = widths;
        mGridView.setLayoutParams(params);

    }
}
