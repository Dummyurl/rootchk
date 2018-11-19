package com.root.rootcheck;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by rishabh on 1/1/16.
 */
public class BuildInfoFragment extends Fragment {

//    private Tracker mTracker;
    private static final String ARG_TEXT = "text";
    @BindView(R.id.text1)
    TextView t1;
    @BindView(R.id.text2)
    TextView t2;
    @BindView(R.id.text3)
    TextView t3;
    @BindView(R.id.text4)
    TextView t4;
    @BindView(R.id.text5)
    TextView t5;
    @BindView(R.id.text6)
    TextView t6;
    @BindView(R.id.text7)
    TextView t7;
    @BindView(R.id.text8)
    TextView t8;
    @BindView(R.id.text9)
    TextView t9;
    @BindView(R.id.text10)
    TextView t10;
    @BindView(R.id.text11)
    TextView t11;
    @BindView(R.id.text12)
    TextView t12;
    @BindView(R.id.text13)
    TextView t13;
    @BindView(R.id.text14)
    TextView t14;
    @BindView(R.id.text15)
    TextView t15;
    @BindView(R.id.text16)
    TextView t16;
    @BindView(R.id.text17)
    TextView t17;
    @BindView(R.id.text18)
    TextView t18;
    @BindView(R.id.text19)
    TextView t19;
    @BindView(R.id.text20)
    TextView t20;
    @BindView(R.id.text21)
    TextView t21;
    @BindView(R.id.text22)
    TextView t22;
    @BindView(R.id.text23)
    TextView t23;

    public BuildInfoFragment() {
    }

    public static BuildInfoFragment newInstance(String text) {
        BuildInfoFragment fragment = new BuildInfoFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_TEXT, text);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.build_info, container, false);
        /*Google Analytics: send screen Name*/

        // Obtain the shared Tracker instance.
        AnalyticsApplication application = (AnalyticsApplication) getActivity().getApplication();
     /*   mTracker = application.getTracker(AnalyticsApplication.TrackerName.APP_TRACKER);

        // Send a screen view.
        mTracker.setScreenName("Build Info");
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
        mTracker.send(new HitBuilders.ScreenViewBuilder()
                .set("BuildInfo", "Build Info")
                .build());*/

        //Log.e("Ads Status", String.valueOf(Constants.isAdsDisabled));

       /* if (!Constants.isAdsDisabled) {

            AdView mAdView = (AdView) view.findViewById(R.id.adView2);

            AdRequest adRequest = new AdRequest.Builder().addTestDevice("ABB5948E67DE2D6336B525992B921143").build();

            mAdView.loadAd(adRequest);
        }*/
        //Log.d("on detail create view", "created");
        //GENERAL
        ButterKnife.bind(this, view);
        t1.setText(Build.BOARD);
        t2.setText(Build.BOOTLOADER);
        t3.setText(Build.BRAND);
        t4.setText(Build.CPU_ABI);
        t5.setText(Build.CPU_ABI2);
        t6.setText(Build.DEVICE);
        t7.setText(Build.DISPLAY);
        t8.setText(Build.FINGERPRINT);
        t9.setText(Build.HARDWARE);
        t10.setText(Build.HOST);
        t11.setText(Build.ID);
        t12.setText(Build.MANUFACTURER);
        t13.setText(Build.MODEL);
        t14.setText(Build.PRODUCT);
        t15.setText(Build.SERIAL);
        t16.setText(Build.TAGS);
        t17.setText(Build.TYPE);
        t18.setText(Build.USER);
        t19.setText(Build.VERSION.CODENAME);
        t20.setText(Build.VERSION.INCREMENTAL);
        t21.setText(Build.VERSION.RELEASE);
        t22.setText(String.valueOf(Build.VERSION.SDK_INT));
        t23.setText(Build.getRadioVersion());

        return view;
    }
}

