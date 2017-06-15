package com.qatechie.dynamicjsonparsing;

import java.util.Map;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SamplePojo {

	@SerializedName("permission")
	@Expose
	private Object permissionJSON;
	@SerializedName("id")
	@Expose
	private String id;

	@SerializedName("name")
	@Expose
	private String name;

	private Map<String, String> mapData;

	public Object getPermissionJSON() {
		return permissionJSON;
	}

	public void setPermissionJSON(Object permission) {
		this.permissionJSON = permission;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Map<String, String> getMapData() {
		if (getPermissionJSON() != null) {
			mapData = Utility.getUnquotedJsonIntoMap(getPermissionJSON().toString());
		}
		return mapData;
	}

	public void setMapData(Map<String, String> mapData) {
		this.mapData = mapData;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "{ \"permissionJSON\" : '" + getMapData() + "', \"id\": '" + id + "',\"name\": '" + name + "'}";
	}

}