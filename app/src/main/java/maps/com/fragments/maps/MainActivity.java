package maps.com.fragments.maps;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


FragmentManager manager= getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        myMapFragment mymapWithDataFragment= new myMapFragment();
        transaction.add(R.id.mapContainer , mymapWithDataFragment);

        PlaceFragment placeFragment= new PlaceFragment();
        transaction.add(R.id.placeConatiner , placeFragment);

        transaction.commit();




    }
}
