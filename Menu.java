package com.tap.model;

public class Menu {

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", resturantId=" + resturantId + ", itemName=" + itemName + ", description="
				+ description + ", price=" + price + ", isAvailable=" + isAvailable + ", imagePath=" + imagePath + "]";
	}

	private int menuId;
	private int resturantId;
	private String itemName;
	private String description;
	private int price;
	private String isAvailable;
	private String imagePath;
	
	
	public Menu() {
		
	}
	
	
	public Menu(int resturantId, String itemName, String description, int price, String isAvailable, String imagePath) {
		super();
		this.resturantId = resturantId;
		this.itemName = itemName;
		this.description = description;
		this.price = price;
		this.isAvailable = isAvailable;
		this.imagePath = imagePath;
	}




	public Menu(int menuId, int resturantId, String itemName, String description, int price, String isAvailable,
			String imagePath) {
		super();
		this.menuId = menuId;
		this.resturantId = resturantId;
		this.itemName = itemName;
		this.description = description;
		this.price = price;
		this.isAvailable = isAvailable;
		this.imagePath = imagePath;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public int getResturantId() {
		return resturantId;
	}

	public void setResturantId(int resturantId) {
		this.resturantId = resturantId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}


	
	
}

