TMSampleAndroid (ALPHA)
===============

Getting started guide for testmunk android.


Prerequisites:
---
- Mac OS
- Android phone

Setup
---
You will need to first install calabash-android. For Mac users, its as simple as opening the terminal and running `gem install calabash-android` or `sudo gem install calabash-android` in case you don’t have the appropriate permission. You will also need the Android SDK for eclipse deployed and configured on your computer, as well as the ANDROID_HOME variable configured to the SDK directory. 
You can download the SDK from [here](https://developer.android.com/sdk/index.html).
The ANDROID_HOME variable can be configured in the following way:
Open your .bash_profile and copy paste the following 2 lines:

`export ANDROID_HOME=$HOME/android-sdks`
`export PATH=$PATH:$ANDROID_HOME:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools:$ANDROID_HOME/add-ons`


Download and launch demo app
---
You can use our simple demo app that you can download and use for your first android test. Just download or pull the code from this repository to get started.

In order to launch this demo app on the emulator or device you need to follow the following 3 steps.  
1. Open android sdk (Go to applications and click on Eclipse.app)  
2. Import the project folder that you have just downloaded  
3. Select “CalabashTest” in the Package Explorer and click on the green “Run” button in the headerbar of eclipse. A new window “Android Device Chooser” should open. In case you plugged in a device this device should appear here. Select it and click OK. The demo app should launch on your device.

BTW: In case you don’t have an android phone on hand, you can also create a new android virtual device in the android device chooser.

Run demo app
---
Start the terminal and tranverse to the project directory. Use `calabash-android run ./bin/CalabashTest.apk` to start the tests. Make sure that either the device or the emulator is already running with or without the app. The report shall output inside the terminal window. 

Edit testcases
---
To edit the testcases open the file `features/my_first.feature`. This contains the testcases. If you are editing in Eclipse, you can download the [Eclipse-Cucumber plugin](https://github.com/cucumber/cucumber-eclipse) for additional syntax support.
You can find some predefined steps [here](https://github.com/calabash/calabash-android/blob/master/ruby-gem/lib/calabash-android/canned_steps.md). You can also write your own custom steps using the [Ruby API](https://github.com/calabash/calabash-android/blob/master/documentation/ruby_api.md).

Writing testcases
---
Writing teststeps requires you to know the relevant elements on the screen that you ‘d like to touch and interact with. 
You can use the UI Automator Viewer to inspect your view. How?
Open a terminal window and enter
`uiautomatorviewer`
Further infos about the Ui Automator Viewer can be found [here](http://www.tutorialspoint.com/android/android_ui_testing.htm).  
Please be aware that if you use an android version lower than API level 18 / Jelly bean you will not be able to interact with the resource-id of the element.

Further info:
---
- The project above is configured from API 8 to API 18, so the default downloaded SDK should work.
- A handy command to check which devices are connected is `adb devices`

