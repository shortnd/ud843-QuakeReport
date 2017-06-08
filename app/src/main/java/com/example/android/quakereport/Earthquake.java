package com.example.android.quakereport;


public class Earthquake {
    /**
     * Location of the Earthquake
     */
    private String mLocation;

    /**
     * Date the Earthquake Occurred
     */
    private String mDate;

    /**
     * Magnitude of the Earthquake
     */
    private String mMagnitude;

    /**
     * Creates a new Earthquake object
     *
     * @param EarthquakeLocation  the location of the earthquake
     * @param EarthquakeDate      the date of the earthquake
     * @param EarthquakeMagnitude the Magnitude of the earthquake
     */
    public Earthquake(String EarthquakeLocation, String EarthquakeDate, String EarthquakeMagnitude) {
        mLocation = EarthquakeLocation;
        mDate = EarthquakeDate;
        mMagnitude = EarthquakeMagnitude;
    }

    /**
     * Gets the location of the Earthquake
     *
     * @return
     */
    public String getmLocation() {
        return mLocation;
    }

    /**
     * Gets the Date of the Earthquake
     *
     * @return
     */
    public String getmDate() {
        return mDate;
    }

    /**
     *  Gets the magnitude of the Earthquake
     * @return
     */
    public String getmMagnitude() {
        return mMagnitude;
    }
}
