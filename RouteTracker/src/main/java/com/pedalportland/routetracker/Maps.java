package com.pedalportland.routetracker;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by Minh Vu on 2/18/14.
 */
public class Maps extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_maps);
        LatLng PORTLANDSU = new LatLng(45.512, 122.685);
        LatLng PORTLANDSQ = new LatLng(45.519, 122.679);
        GoogleMap map;



        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
                .getMap();
        Marker PortlandSU = map.addMarker(new MarkerOptions().position(PORTLANDSU)
                .title("Portland State University,OR"));
        Marker PioneerSQ = map.addMarker(new MarkerOptions()
                .position(PORTLANDSQ)
                .title("PioneerSQ")
                .snippet("Heart of portland")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.ic_launcher)));

        // Move the camera instantly to PORTLANDSQ with a zoom of 15.
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(PORTLANDSQ, 15));

        // Zoom in, animating the camera.
        map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
    }
}
