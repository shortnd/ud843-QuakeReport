package com.example.android.quakereport;


public class Earthquake {
    /**
     * Location of the Earthquake
     */
    private String mLocation;

    /**
     * Date the Earthquake Occurred
     */
    private long mTimeInMilliseconds;

    /**
     * Magnitude of the Earthquake
     */
    private double mMagnitude;

    /**
     *  Url of the earthquake
     */
    private String mUrl;


    /**
     * Creates a new Earthquake object
     *
     * @param EarthquakeLocation  the location of the earthquake
     * @param timeInMilliseconds     the date of the earthquake
     * @param EarthquakeMagnitude the Magnitude of the earthquake
     */
    public Earthquake(String EarthquakeLocation, long timeInMilliseconds, double EarthquakeMagnitude, String url) {
        mLocation = EarthquakeLocation;
        mTimeInMilliseconds = timeInMilliseconds;
        mMagnitude = EarthquakeMagnitude;
        mUrl = url;
    }

    /**
     * Gets the location of the Earthquake
     *
     * @return
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Gets the Time of the Earthquake
     *
     * @return
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     *  Gets the magnitude of the Earthquake
     * @return
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     *  Gets the url of the earthquake
     */
    public String getUrl() {
        return mUrl;
    }
}
