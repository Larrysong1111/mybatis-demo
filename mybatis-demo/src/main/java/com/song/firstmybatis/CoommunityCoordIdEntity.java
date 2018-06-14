package com.song.firstmybatis;

public class CoommunityCoordIdEntity extends CoommunityCoordEntity {
	
	/**
	 * TODO（用一句话描述这个变量表示什么）
	 */
	private static final long serialVersionUID = 1L;
	//小区id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CoommunityCoordIdEntity [id=" + id + "]";
	}

	 
}
