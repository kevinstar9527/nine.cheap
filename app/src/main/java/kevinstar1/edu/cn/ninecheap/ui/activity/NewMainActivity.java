package kevinstar1.edu.cn.ninecheap.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;

import kevinstar1.edu.cn.ninecheap.R;
import kevinstar1.edu.cn.ninecheap.ui.fragment.TestFragment;

/**
 * Created by Administrator on 2017/5/1.
 */

public class NewMainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private SlidingTabLayout mTabs;
    private String[] mTitles = new String[]{
            "ceshi",
            "今日上新",
            "今日上新",
            "今日上新",
            "今日上新",
            "今日上新",
            "今日上新",
            "今日上新",
            "今日上新",
            "今日上新"
    };
    private ArrayList<Fragment> mArrayList = new ArrayList();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageView imageView = (ImageView) findViewById(R.id.iv_home_left);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggle();
            }
        });
        mTabs = (SlidingTabLayout) findViewById(R.id.tabs);
        mTabs.setVisibility(View.VISIBLE);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        mArrayList.add(new TestFragment());
        for (int i = 0; i < mTitles.length-1; i++) {
            Fragment fragment = new Fragment();
            mArrayList.add(fragment);
        }
        mTabs.setViewPager(viewPager,mTitles,this,mArrayList);

    }

  private   void toggle() {
        int drawerLockMode = mDrawerLayout.getDrawerLockMode(GravityCompat.START);
        if (mDrawerLayout.isDrawerVisible(GravityCompat.START)
                && (drawerLockMode != DrawerLayout.LOCK_MODE_LOCKED_OPEN)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else if (drawerLockMode != DrawerLayout.LOCK_MODE_LOCKED_CLOSED) {
            mDrawerLayout.openDrawer(GravityCompat.START);
        }
    }
}
