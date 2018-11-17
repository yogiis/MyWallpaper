package com.qelontongstore.mywallpaper.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.google.firebase.database.core.Context;
import com.qelontongstore.mywallpaper.Fragment.CategoryFragment;
import com.qelontongstore.mywallpaper.Fragment.DailyPopularFragment;
import com.qelontongstore.mywallpaper.Fragment.RecentsFragment;
import com.qelontongstore.mywallpaper.HomeActivity;

public class MyFragmentAdapter extends FragmentPagerAdapter {

  private Context context;

  public MyFragmentAdapter(FragmentManager fm, Context context) {
    super(fm);
    this.context = context;
  }

  @Override
  public Fragment getItem(int position) {
    if (position == 0) {
      return CategoryFragment.getInstance();
    } else if (position == 1) {
      return DailyPopularFragment.getInstance();
    } else if (position == 2) {
      return RecentsFragment.getInstance();
    }else
      return null;
  }

  @Override
  public int getCount() {
    return 3;
  }

  @Nullable
  @Override
  public CharSequence getPageTitle(int position) {
    switch (position)
    {
      case 0:
        return "Category";
      case 1:
        return "Daily Popular";
      case 2:
        return "Recents";
    }
    return "";
  }
}
