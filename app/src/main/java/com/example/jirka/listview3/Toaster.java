package com.example.jirka.listview3;

/**
 * Created by Jirka on 12.6.2016.
 */

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void toastMessage(Context context, String str) {
        Toast.makeText(context,"String: " + str, Toast.LENGTH_SHORT).show();
    }

    public static void toastMessage(Context context, int i) {
        Toast.makeText(context, "Int: " + String.valueOf(i), Toast.LENGTH_SHORT).show();
    }

    public static void toastMessage(Context context, double d) {
        Toast.makeText(context, "Double: " + String.valueOf(d), Toast.LENGTH_SHORT).show();
    }

    public static void toastMessage(Context context, float f) {
        Toast.makeText(context, "Float: " + String.valueOf(f), Toast.LENGTH_SHORT).show();
    }

    public static void toastMessage(Context context, String header, int i) {
        Toast.makeText(context, header + " " + String.valueOf(i) + " (int)", Toast.LENGTH_SHORT).show();
    }

    public static void toastMessage(Context context, String header, double d) {
        Toast.makeText(context, header + " " + String.valueOf(d) + " (double)", Toast.LENGTH_SHORT).show();
    }

    public static void toastMessage(Context context, String header, float f) {
        Toast.makeText(context, header + " " + String.valueOf(f) + " (float)", Toast.LENGTH_SHORT).show();
    }


    public static float getPi () {
        return 3.1415927f;
    }
}


