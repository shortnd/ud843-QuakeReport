package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView earthquakeMagnitude = (TextView) listItemView.findViewById(R.id.earthquake_magnitude);
        earthquakeMagnitude.setText(currentEarthquake.getmMagnitude());

        TextView earthquakeLocation = (TextView) listItemView.findViewById(R.id.earthquake_location);
        earthquakeLocation.setText(currentEarthquake.getmLocation());

        TextView earthquakeDate = (TextView) listItemView.findViewById(R.id.earthquake_date);
        earthquakeDate.setText(currentEarthquake.getmDate());

        return listItemView;

    }
}
