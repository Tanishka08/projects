package com.example.demo.Service;
import java.util.List;

import com.example.demo.Item;
public interface ItemService
{
public List<Item> getAllItem();
public Item createItem(Item item);
public Item updateItem(Item item);
public void deleteItem(Item item);
}
