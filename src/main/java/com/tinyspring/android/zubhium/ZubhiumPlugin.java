package com.tinyspring.android.zubhium;

import com.h2.tinyspring.android.Application;
import com.h2.tinyspring.android.plugin.APlugin;
import com.zubhium.ZubhiumSDK;

/**
 * This is a plugin for Zubhium framework (https://www.zubhium.com/)
 * 
 * The bean declaration in config file must declare constructor argument with
 * string value containing your  zubhium SDK api key.
 * 
 * @author 35pr17
 *
 */
public class ZubhiumPlugin extends APlugin {
	
	private String key;

	public ZubhiumPlugin(String key) {
		this.key = key;
	}

	@Override
	public void onApplicationCreate(Application application) {
		ZubhiumSDK.getZubhiumSDKInstance(application.getApplicationContext(), this.key);
	}
}
