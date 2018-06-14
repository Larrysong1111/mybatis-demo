package com.song.firstmybatis;

import java.io.Serializable;

/**
 * 经纬度实体类
 * @author 340780
 */
public class CoommunityCoordEntity  implements Serializable{
	
	 
	@Override
	public String toString() {
		return "CoommunityCoordEntity [coordsEntity=" + coordsEntity + ", orgCode=" + orgCode + ", communityCode="
				+ communityCode + ", communityName=" + communityName + "]";
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 4584383168007948110L;

	private CoordsEntity coordsEntity;
	//组织编码
	private String orgCode;
	//收派小区编码
	private String communityCode;
	//收派小区名称
	private String communityName;
	public CoordsEntity getCoordsEntity() {
		return coordsEntity;
	}
	public void setCoordsEntity(CoordsEntity coordsEntity) {
		this.coordsEntity = coordsEntity;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getCommunityCode() {
		return communityCode;
	}
	public void setCommunityCode(String communityCode) {
		this.communityCode = communityCode;
	}
	public String getCommunityName() {
		return communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}
	
	 
}
