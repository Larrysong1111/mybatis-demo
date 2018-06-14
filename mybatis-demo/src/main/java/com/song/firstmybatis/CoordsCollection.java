package com.song.firstmybatis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 * 小区范围编码解析接口参数实例
 * @author 334515
 */
public class CoordsCollection implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2870850868755935259L;
	// 小区经纬度集合
	private List<CoordsEntity> Coords = new ArrayList<CoordsEntity>();
	// 小区编码
	private String code;

	public List<CoordsEntity> getCoords() {
		return Coords;
	}

	public void setCoords(List<CoordsEntity> coords) {
		Coords = coords;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
