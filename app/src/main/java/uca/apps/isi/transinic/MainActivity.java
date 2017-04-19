package uca.apps.isi.transinic;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import io.realm.Realm;
import uca.apps.isi.transinic.fragments.DashboardFragment;
import uca.apps.isi.transinic.fragments.HomeFragment;
import uca.apps.isi.transinic.fragments.NotificationFragment;
import uca.apps.isi.transinic.models.Categoria;

public class MainActivity extends AppCompatActivity {


    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment=null;
            Class fragmentClass=null;

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragmentClass = HomeFragment.class;
                    break;
                case R.id.navigation_dashboard:
                    fragmentClass = DashboardFragment.class;
                    break;
                case R.id.navigation_notifications:
                    fragmentClass = NotificationFragment.class;
                    break;
            }

            try {
                fragment = (Fragment) fragmentClass.newInstance();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;


        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void addCategory() {
        // Get a Realm instance for this thread //naoisdnoaisdoaisdnoasd
        Realm realm = Realm.getDefaultInstance();

        realm.beginTransaction();
        //
        Categoria categoria = realm.createObject(Categoria.class);
        categoria.setNombre("");
        realm.commitTransaction();

        //loadData();
    }

}
