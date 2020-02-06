package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Item;
import com.example.demo.repo.ItemRepository;
@Service
public class ItemServiceImpl implements ItemService
{
private ItemRepository itemRepository;
@Autowired
public ItemServiceImpl(ItemRepository itemRepository)
{
	super();
	this.itemRepository = itemRepository;
}
@Override
@Transactional
public Item createItem(Item item) 
{

	return itemRepository.insert(item);
}
@Override
@Transactional
public List<Item> getAllItem() {

	return itemRepository.findAll();
}

}

