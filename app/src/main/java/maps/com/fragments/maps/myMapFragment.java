package maps.com.fragments.maps;


import android.app.FragmentManager;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class myMapFragment extends Fragment {


    public myMapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_my_map, container, false);


        // find the map fragments (and cast it to SupportMapFragment):
        FragmentManager fm = getChildFragmentManager();
        MapFragment mapFragment = (MapFragment) fm.findFragmentById(R.id.googlemapfragment);
        // get the map object from the fragment:
        GoogleMap map = mapFragment.getMap();
        // setup the map type:
        map.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        // setup map position and zoom
        LatLng position = new LatLng(40.758493 , -73.970944);

        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(position, 15);
        map.moveCamera(update);


        // add a map marker:
        MarkerOptions markerOptions = new MarkerOptions()
                .position(position)
                .title("tal's house")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));
        Marker marker = map.addMarker(markerOptions);





        return v;
    }

}
