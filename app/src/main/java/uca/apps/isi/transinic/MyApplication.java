package uca.apps.isi.transinic;

import android.app.Application;

/**
 * Created by isi3 on 18/4/2017.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
    }
}
