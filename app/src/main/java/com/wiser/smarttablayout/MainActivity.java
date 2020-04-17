package com.wiser.smarttablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wiser.tab.SmartPageView;
import com.wiser.tab.SmartTabInfo;

public class MainActivity extends AppCompatActivity {

    private SmartPageView smartPageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smartPageView = findViewById(R.id.smart_page);
        Bundle bundle1 = new Bundle();
        bundle1.putString(TestFragment.PASS,"测试1");
        Bundle bundle2 = new Bundle();
        bundle2.putString(TestFragment.PASS,"测试2");
        Bundle bundle3 = new Bundle();
        bundle3.putString(TestFragment.PASS,"测试3");


        smartPageView.setPage(getSupportFragmentManager(),new SmartTabInfo("测试 11231231", TestFragment.class, bundle1), new SmartTabInfo("测试2", TestFragment.class, bundle2), new SmartTabInfo("测试3", TestFragment.class, bundle3));
		smartPageView.setOffscreenPageLimit(3);
    }
}
