# SmartTabLayout
Tab 切换控件

## 环境配置
    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
    
    dependencies {
	        implementation 'com.github.Wiser-Wong:SmartTabLayout:1.0.0'
	}
  
  ## 使用控件

  * ProgressTimeBar
  
        Bundle bundle1 = new Bundle();
        bundle1.putString(TestFragment.PASS,"测试1");
        Bundle bundle2 = new Bundle();
        bundle2.putString(TestFragment.PASS,"测试2");
        Bundle bundle3 = new Bundle();
        bundle3.putString(TestFragment.PASS,"测试3");
        
        smartPageView.setPage(getSupportFragmentManager(),new SmartTabInfo("测试 11231231", TestFragment.class, bundle1), new       SmartTabInfo("测试2", TestFragment.class, bundle2), new SmartTabInfo("测试3", TestFragment.class, bundle3));
  
        <com.wiser.tab.smart.SmartTabLayout
            android:id="@+id/smart_tab"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="16dp"
            android:layout_marginEnd="16dp"
            android:background="#ffffff"
            app:stl_customTabTextLayoutId="@layout/smart_text"
            app:stl_customTabTextViewId="@+id/custom_text"
            app:stl_distributeEvenly="true"
            app:stl_dividerColor="@android:color/transparent"
            app:stl_indicatorColor="#377AFF"
            app:stl_indicatorCornerRadius="4dp"
            app:stl_indicatorInterpolation="smart"
            app:stl_indicatorThickness="4dp"
            app:stl_indicatorWidth="32dp"
            app:stl_underlineColor="#E9E9E9"
            app:stl_underlineThickness="0.5dp" />

        <com.wiser.tab.SmartPageView
            android:id="@+id/smart_page"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:isResetPageHeight="false"
            app:smartTabId="@+id/smart_tab" />
