package com.tthong.Json2Model;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class JsonArray2ArrayList {

    public ArrayList<String> Js2Array(JSONArray jsonArray) throws JSONException {
        ArrayList<String> list = new ArrayList<String>();
        if (jsonArray != null) {
            int len = jsonArray.length();
            for (int i=0;i<len;i++){
                list.add(jsonArray.get(i).toString());
            }
        }
        return list;
    }
}
