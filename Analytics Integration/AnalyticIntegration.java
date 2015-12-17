package com.carnival.sdk;

import com.google.android.gms.analytics.Tracker;

import java.util.Map;

/**
 * Any of the methods present in this class can be added or removed as needed to reflect
 * what analytic frameworks you are currently supporting.
 *
 * After selecting the methods your require, search and replace the method calls to the analytic
 * frameworks with the forwarding methods defined here.
 */
public class AnalyticIntegration {

    private static final String SOURCE_GA = "Google Analytics";
    private static final String SOURCE_MIXPANEL = "Mixpanel";
    private static final String SOURCE_FLURRY = "Flurry Analytics";
    private static final String SOURCE_LOCALYTICS = "Localytics";
    private static final String SOURCE_TAPLYTICS = "Taplytics";
    private static final String SOURCE_AMPLITUDE = "Amplitude";
    private static final String SOURCE_ADOBE = "Adobe Analytics";

    /**
     * Send a Google Analytics event to both Google Analytics and Carnival.
     * The event parsed in will be sent to Google Analytics as is and reformatted as "[category] - [action]" (without the square brackets) when sent to Carnival.
     * @param tracker the Google Analytics tracker instance.
     * @param event the result of calling `build()` on a Google Analytics `EventBuilder`.
     */
    public static void sendGAEvent(Tracker tracker, Map<String, String> event) {
        tracker.send(event);

        String category = event.get("&ec");
        String action = event.get("&ea");

        Carnival.logEvent(SOURCE_GA, category + " - " + action);
    }

    /**
     * Send an event to both Mixpanel and Carnival.
     * @param mixpanel an instance of the Mixpanel API.
     * @param eventName the event name that is passed to both Mixpanel and Carnival.
     * @param properties the extra properties that will be attached to this Mixpanel event log. Unused by Carnival.
     */
//    public static void mixpanelTrack(MixpanelAPI mixpanel, String eventName, Map<String, String> properties) {
//        mixpanel.track(eventName, properties);
//        Carnival.logEvent(SOURCE_MIXPANEL, eventName);
//    }

    /**
     * Send an event to both Flurry and Carnival.
     * @param eventName the event name that is passed to both Flurry and Carnival.
     * @param properties the extra properties that will be attached to this Flurry event log. Unused by Carnival.
     */
//    public static void flurryLogEvent(String eventName, Map<String, String> properties) {
//        FlurryAgent.logEvent(eventName, properties);
//        Carnival.logEvent(SOURCE_FLURRY, eventName);
//    }

    /**
     * Send an event to both Localytics and Carnival.
     * @param eventName the event name that is passed to both Localytics and Carnival.
     * @param properties the extra properties that will be attached to this Localytics event tag. Unused by Carnival.
     */
//    public static void localyticsTagEvent(String eventName, Map<String, String> properties) {
//        Localytics.tagEvent(eventName, properties);
//        Carnival.logEvent(SOURCE_LOCALYTICS, eventName);
//    }

    /**
     * Send an event to both Taplytics and Carnival.
     * @param eventName the event name that is passed to both Taplytics and Carnival.
     * @param num a Number value used by Taplytics. Unused by Carnival.
     * @param properties the extra properties that will be attached to the Taplytics event log. Unused by Carnival.
     */
//    public static void taplyticsLogEvent(String eventName, Number num, JSONObject properties) {
//        Taplytics.logEvent(eventName, num, properties);
//        Carnival.logEvent(SOURCE_TAPLYTICS, eventName);
//    }

    /**
     * Send an event to both Amplitude and Carnival.
     * @param eventName the event name that is passed to both Amplitude and Carnival.
     */
//    public static void amplitudeLogEvent(String eventName) {
//        Amplitude.getInstance().logEvent(eventName);
//        Carnival.logEvent(SOURCE_AMPLITUDE, eventName);
//    }

    /**
     * Send an event to both Adobe Analytics and Carnival.
     * @param eventName the event name that is passed to both Adobe Analytics and Carnival.
     * @param properties the extra properties that will be attached to the Adobe Analytics action. Unused by Carnival.
     */
//    public static void adobeTrackAction(String eventName, Map<String, Object> properties) {
//        Analytics.trackAction(eventName, properties);
//        Carnival.logEvent(SOURCE_ADOBE, eventName);
//    }

}
