package com.example.download;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class _TabActivity extends TabActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		TabHost tabHost = getTabHost();
		Intent remoteIntent = new Intent();
		remoteIntent.setClass(this, MainActivity.class);
		TabHost.TabSpec remoteSpec = tabHost.newTabSpec("Remote");
		Resources res = getResources();
		remoteSpec.setIndicator("Remote", res.getDrawable(android.R.drawable.stat_sys_download));
		remoteSpec.setContent(remoteIntent);
		tabHost.addTab(remoteSpec);
		
		tabHost.addTab(tabHost.newTabSpec("Local") 
                .setIndicator("Local", res.getDrawable(android.R.drawable.stat_sys_upload)) 
                .setContent(new Intent(this,LocalMp3ListActivity.class)));
	}
}
