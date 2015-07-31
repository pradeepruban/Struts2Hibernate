package net.javaonline.sample.inventory.controller;

import java.util.List;

import net.javaonline.sample.inventory.controller.ItemMasterDAO;
import net.javaonline.sample.inventory.dto.ItemMaster;

import com.opensymphony.xwork2.ActionSupport;


public class ItemMasterAction extends ActionSupport {

	private static final long serialVersionUID = -3761530667134304608L;
	private ItemMaster item;
	private List<ItemMaster> itemList;
	private Long id;
	private ItemMasterDAO itemMasterDao;
	
	public ItemMaster getItem() {
		return item;
	}

	public void setItem(ItemMaster item) {
		this.item = item;
	}

	
	public ItemMasterAction() {
		itemMasterDao = new ItemMasterDAO();
	}

	public String execute() {
		this.itemList = itemMasterDao.list();
		return SUCCESS;
	}

	public String add() {
		System.out.println(getItem());
		try {
			ItemMaster item=getItem();
			item.setCreatedOn(new java.util.Date());  // for  current date to store on createdOn field. 
			itemMasterDao.add(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.itemList = itemMasterDao.list();
		return SUCCESS;
	}

	public String list() {
		this.itemList = itemMasterDao.list();
		return SUCCESS;
	}
	
	public String delete() {
		itemMasterDao.delete(getId());
		return SUCCESS;
	}

	

	public List<ItemMaster> getItemList() {
		return itemList;
	}

	
	public void setItemList(List<ItemMaster> itemList) {
		this.itemList = itemList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
