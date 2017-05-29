package com.bignerdranch.android.photogallery;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by t7500 on 5/29/2017.
 */

public class PollService extends IntentService {
    private static final String TAG = "PollService";

    /**
     * Returns a new Intent for launching a PollService
     * @param context The context for the PollService
     * @return Intent for launching a PollService
     */
    public static Intent newIntent(Context context) {
        return new Intent(context, PollService.class);
    }

    public PollService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG, "Received an intent: " + intent);
    }
}
