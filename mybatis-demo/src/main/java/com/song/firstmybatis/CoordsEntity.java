package com.song.firstmybatis;


import java.io.Serializable;

/**
 * 经纬度实体类
 * @author 334515
 */
public class CoordsEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private double lng;//经度
	private double lat;//纬度
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	
	public CoordsEntity() {
		super();
	}
	
	public CoordsEntity(double lng, double lat) {
		super();
		this.lng = lng;
		this.lat = lat;
	}
	@Override
	public String toString() {
		return "CoordsEntity [lng=" + lng + ", lat=" + lat + "]";
	}
	
}
