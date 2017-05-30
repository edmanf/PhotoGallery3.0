package com.bignerdranch.android.photogallery;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * Interface for reading and writing the query to and from shared preferences
 * Allows for persistence of your query
 */



public class QueryPreferences {

    // Key for query preference
    private static final String PREF_SEARCH_QUERY = "searchQuery";
    private static final String PREF_LAST_RESULT_ID = "lastResultId";

    /**
     * Returns the query value stored in shared preferences for the
     * given context.
     * @param context The context to get the SharedPreferences from.
     * @return The query value.
     */
    public static String getStoredQuery(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getString(PREF_SEARCH_QUERY, null);
    }

    /**
     * Writes the query to the shared preferences for the given context.
     * @param context The context to get the shared preferences from
     * @param query The query to write
     */
    public static void setStoredQuery(Context context, String query) {
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putString(PREF_SEARCH_QUERY, query)
                .apply();
    }

    public static String getLastResultId(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getString(PREF_LAST_RESULT_ID, null);
    }

    public static void setLastResultId(Context context, String lastResultId) {
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putString(PREF_LAST_RESULT_ID, lastResultId)
                .apply();
    }
}
