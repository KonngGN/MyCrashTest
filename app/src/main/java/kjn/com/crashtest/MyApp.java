package kjn.com.crashtest;

import android.app.Application;

/**
 * 作者：Konng on 2017/6/5 13:47
 * 邮箱：197726885@qq.com
 * 说明：
 * 详细：
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(this);
    }
}
