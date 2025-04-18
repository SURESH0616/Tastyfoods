package com.tap.model;

public class Resturant {
	private int resturantId;
	private String resturantName;
	private String cuisineType;
	private String deliveryTime;
	private int adminuserId;
	private float rating;
	private String isActive;
	private String imagepath;
	
	
	
	
	public Resturant(String resturantName, String cuisineType, String deliveryTime, int adminuserId, float rating,
			String isActive, String imagepath) {
		super();
		this.resturantName = resturantName;
		this.cuisineType = cuisineType;
		this.deliveryTime = deliveryTime;
		this.adminuserId = adminuserId;
		this.rating = rating;
		this.isActive = isActive;
		this.imagepath = imagepath;
	}


	public Resturant(int resturantId, String resturantName, String cuisineType, String deliveryTime, int adminuserId,
			float rating, String isActive, String imagepath) {
		super();
		this.resturantId = resturantId;
		this.resturantName = resturantName;
		this.cuisineType = cuisineType;
		this.deliveryTime = deliveryTime;
		this.adminuserId = adminuserId;
		this.rating = rating;
		this.isActive = isActive;
		this.imagepath = imagepath;
	}



	public Resturant() {
		// TODO Auto-generated constructor stub
	}


	public int getResturantId() {
		return resturantId;
	}

	public void setResturantId(int resturantId) {
		this.resturantId = resturantId;
	}

	public String getResturantName() {
		return resturantName;
	}

	public void setResturantName(String resturantName) {
		this.resturantName = resturantName;
	}

	public String getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public int getAdminuserId() {
		return adminuserId;
	}

	public void setAdminuserId(int admineuserId) {
		this.adminuserId = admineuserId;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

	

}
