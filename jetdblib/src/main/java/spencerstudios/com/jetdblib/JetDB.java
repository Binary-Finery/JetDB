package spencerstudios.com.jetdblib;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JetDB {


    public static void putStringList(Context ctx, ArrayList<String> list, String key) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(key, json);
        editor.apply();
    }

    public static ArrayList<String> getStringList(Context ctx, String key) {
        ArrayList<String> list;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        Gson gson = new Gson();
        String json = prefs.getString(key, "");

        if (json.isEmpty()) {
            list = new ArrayList<>();
        } else {
            Type type = new TypeToken<ArrayList<String>>() {
            }.getType();
            list = gson.fromJson(json, type);
        }
        return list;
    }

    //-------------------------- List<Integer> ----------------//

    public static void putIntList(Context ctx, ArrayList<Integer> list, String key) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(key, json);
        editor.apply();
    }

    public static ArrayList<Integer> getIntList(Context ctx, String key) {
        ArrayList<Integer> list;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        Gson gson = new Gson();
        String json = prefs.getString(key, "");

        if(json.isEmpty()){
            list = new ArrayList<>();
        }else {
            Type type = new TypeToken<ArrayList<Integer>>() {
            }.getType();
            list = gson.fromJson(json, type);
        }
        return list;
    }


    //-------------------------- List<Double> ----------------//

    public static void putDoubleList(Context ctx, ArrayList<Double> list, String key) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(key, json);
        editor.apply();
    }

    public static ArrayList<Double> getDoubleList(Context ctx, String key) {
        ArrayList<Double> list;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        Gson gson = new Gson();
        String json = prefs.getString(key, "");

        if(json.isEmpty()){
            list = new ArrayList<>();
        }else {
            Type type = new TypeToken<ArrayList<Double>>() {
            }.getType();
            list = gson.fromJson(json, type);
        }
        return list;
    }


    //-------------------------- List<Float> ----------------//


    public static void putFloatList(Context ctx, ArrayList<Float> list, String key) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(key, json);
        editor.apply();     // This line is IMPORTANT !!!
    }

    public static ArrayList<Float> getFloatList(Context ctx, String key) {
        ArrayList<Float> list;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        Gson gson = new Gson();
        String json = prefs.getString(key, "");

        if(json.isEmpty()){
            list = new ArrayList<>();
        }else {
            Type type = new TypeToken<ArrayList<Float>>() {
            }.getType();
            list = gson.fromJson(json, type);
        }
        return list;
    }


    //-------------------------- List<Boolean> ----------------//


    public static void putBooleanList(Context ctx, ArrayList<Boolean> list, String key) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(key, json);
        editor.apply();
    }

    public static ArrayList<Boolean> getBooleanList(Context ctx, String key) {
        ArrayList<Boolean> list;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        Gson gson = new Gson();
        String json = prefs.getString(key, "");
        if(json.isEmpty()){
            list = new ArrayList<>();
        }else{
            Type type = new TypeToken<ArrayList<Boolean>>() {
            }.getType();
           list = gson.fromJson(json, type);
        }
        return list;
    }


    //-------------------------- List<Custom> ----------------//


    public static <T> void putListOfObjects(Context ctx, List<T> list, String key) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(key, json).apply();
    }

    public static <T> List<T> getListOfObjects(Context ctx, Class<T> t, String key) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        String content = db.getString(key, "");
        List<T> list;
        Gson gson = new Gson();
        if (content.isEmpty()) {
            list = new ArrayList<>();
        } else {
            Type type = TypeToken.getParameterized(List.class, t).getType();
            list = gson.fromJson(content, type);
        }
        return list;
    }

    //-----------------------string----------------------------------------//

    public static String getString(Context ctx, String key, String defaultValue) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        return db.getString(key, defaultValue);
    }

    public static void putString(Context ctx, String value, String key) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        editor.putString(key, value).apply();
    }

    //-----------------------int----------------------------------------//

    public static int getInt(Context ctx, String key, int defaultValue) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        return db.getInt(key, defaultValue);
    }

    public static void putInt(Context ctx, int value, String key) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        editor.putInt(key, value).apply();
    }

    //-----------------------float----------------------------------------//

    public static double getFloat(Context ctx, String key, float defaultValue) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        return db.getFloat(key, defaultValue);
    }

    public static void putFloat(Context ctx, float value, String key) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        editor.putFloat(key, value).apply();
    }

    //-----------------------long----------------------------------------//

    public static double getLong(Context ctx, String key, long defaultValue) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        return db.getLong(key, defaultValue);
    }

    public static void putLong(Context ctx, long value, String key) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        editor.putLong(key, value).apply();
    }

    //-----------------------boolean----------------------------------------//

    public static boolean getBoolean(Context ctx, String key, boolean defaultValue) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        return db.getBoolean(key, defaultValue);
    }

    public static void putBoolean(Context ctx, boolean value, String key) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        editor.putBoolean(key, value).apply();
    }

    //-int array----///

    public static void putIntArray(Context ctx, int []  intArray, String key){
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        List<Integer> list = new ArrayList<>();
        for(int i : intArray){
            list.add(i);
        }
        editor.putString(key, new Gson().toJson(list)).apply();
        list.clear();
    }

    public static int [] getIntArray(Context ctx, String key) {
        ArrayList<Integer> list;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        Gson gson = new Gson();
        String json = prefs.getString(key, "");

        if(json.isEmpty()){
            list = new ArrayList<>();
        }else {
            Type type = new TypeToken<ArrayList<Integer>>() {
            }.getType();
            list = gson.fromJson(json, type);
        }

        int [] array = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        list.clear();

        return array;
    }

    //-string array----///

    public static void putStringArray(Context ctx, String []  stringArray, String key){
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(stringArray));
        editor.putString(key, new Gson().toJson(list)).apply();
        list.clear();
    }

    public static String [] getStringArray(Context ctx, String key) {
        ArrayList<String> list;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        Gson gson = new Gson();
        String json = prefs.getString(key, "");

        if(json.isEmpty()){
            list = new ArrayList<>();
        }else {
            Type type = new TypeToken<ArrayList<String>>() {
            }.getType();
            list = gson.fromJson(json, type);
        }

        String [] array = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    //--double array--//

    public static void putDoubleArray(Context ctx, double []  doubleArray, String key){
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        List<Double> list = new ArrayList<>();
        for(double d : doubleArray){
            list.add(d);
        }
        editor.putString(key, new Gson().toJson(list)).apply();
        list.clear();
    }

    public static double [] getDoubleArray(Context ctx, String key) {
        ArrayList<Double> list;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        Gson gson = new Gson();
        String json = prefs.getString(key, "");

        if(json.isEmpty()){
            list = new ArrayList<>();
        }else {
            Type type = new TypeToken<ArrayList<Double>>() {
            }.getType();
            list = gson.fromJson(json, type);
        }

        double [] array = new double[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    //--boolean array--//

    public static void putBooleanArray(Context ctx, boolean []  booleanArray, String key){
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        List<Boolean> list = new ArrayList<>();
        for(boolean b : booleanArray){
            list.add(b);
        }
        editor.putString(key, new Gson().toJson(list)).apply();
        list.clear();
    }

    public static boolean [] getBooleanArray(Context ctx, String key) {
        ArrayList<Boolean> list;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        Gson gson = new Gson();
        String json = prefs.getString(key, "");

        if(json.isEmpty()){
            list = new ArrayList<>();
        }else {
            Type type = new TypeToken<ArrayList<Boolean>>() {
            }.getType();
            list = gson.fromJson(json, type);
        }

        boolean [] array = new boolean[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    //float array//

    public static void putFloatArray(Context ctx, float []  floatArray, String key){
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        List<Float> list = new ArrayList<>();
        for(float flt : floatArray){
            list.add(flt);
        }
        editor.putString(key, new Gson().toJson(list)).apply();
        list.clear();
    }

    public static float [] getFloatArray(Context ctx, String key) {
        ArrayList<Float> list;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        Gson gson = new Gson();
        String json = prefs.getString(key, "");

        if(json.isEmpty()){
            list = new ArrayList<>();
        }else {
            Type type = new TypeToken<ArrayList<Float>>() {
            }.getType();
            list = gson.fromJson(json, type);
        }

        float [] array = new float[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    //char array..//

    public static void putCharArray(Context ctx, char []  charArray, String key){
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        List<Character> list = new ArrayList<>();
        for(char c : charArray){
            list.add(c);
        }
        editor.putString(key, new Gson().toJson(list)).apply();
        list.clear();
    }

    public static char [] getCharArray(Context ctx, String key) {
        ArrayList<Character> list;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        Gson gson = new Gson();
        String json = prefs.getString(key, "");

        if(json.isEmpty()){
            list = new ArrayList<>();
        }else {
            Type type = new TypeToken<ArrayList<Character>>() {
            }.getType();
            list = gson.fromJson(json, type);
        }

        char [] array = new char[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    //long array//

    public static void putLongArray(Context ctx, long [] longArray, String key){
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        List<Long> list = new ArrayList<>();
        for(long l : longArray){
            list.add(l);
        }
        editor.putString(key, new Gson().toJson(list)).apply();
        list.clear();
    }

    public static long [] getLongArray(Context ctx, String key) {
        ArrayList<Long> list;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        Gson gson = new Gson();
        String json = prefs.getString(key, "");

        if(json.isEmpty()){
            list = new ArrayList<>();
        }else {
            Type type = new TypeToken<ArrayList<Long>>() {
            }.getType();
            list = gson.fromJson(json, type);
        }

        long [] array = new long[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
