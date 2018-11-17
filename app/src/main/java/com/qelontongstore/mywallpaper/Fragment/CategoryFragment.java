package com.qelontongstore.mywallpaper.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qelontongstore.mywallpaper.R;

public class CategoryFragment extends Fragment {

  private static CategoryFragment INSTANCE = null;


  public CategoryFragment() {
    // Required empty public constructor
  }

  public static CategoryFragment getInstance(){

    if (INSTANCE == null)
          INSTANCE = new CategoryFragment();
    return INSTANCE;

  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_category, container, false);
  }

}
