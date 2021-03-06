package com.rnshowcase;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.rninstabugsdk.rninstabugsdk.InstabugSDKPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.brentvatne.react.ReactVideoPackage;
import com.rnuxcam.rnuxcam.UXCamPackage;
import com.horcrux.svg.SvgPackage;
import com.jadsonlourenco.RNShakeEvent.RNShakeEventPackage;
import com.robinpowered.react.Intercom.IntercomPackage;
import com.microsoft.codepush.react.CodePush;
import com.airbnb.android.react.lottie.LottiePackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {

    @Override
    protected String getJSBundleFile() {
      return CodePush.getJSBundleFile();
    }

    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new InstabugSDKPackage(getApplicationContext()),
          new RNDeviceInfo(),
          new ReactVideoPackage(),
          new UXCamPackage(),
          new SvgPackage(),
          new RNShakeEventPackage(),
          new IntercomPackage(),
          new CodePush(null, getApplicationContext(), BuildConfig.DEBUG),
          new LottiePackage()
      );
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
