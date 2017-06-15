package com.qatechie.dynamicjsonparsing;

import java.lang.reflect.Type;
import java.util.List;

import org.json.JSONException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MasterMain {

	public static void main(String[] args) throws JSONException {
		List<SamplePojo> list = new MasterMain().parseJSON();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

	private List<SamplePojo> parseJSON() {
		Gson gson = new Gson();
		Type listType = new TypeToken<List<SamplePojo>>() {
		}.getType();
		List<SamplePojo> list = (List<SamplePojo>) gson.fromJson(ConstantJSONS.DYNAMIC_JSON, listType);
		return list;

	}
}
