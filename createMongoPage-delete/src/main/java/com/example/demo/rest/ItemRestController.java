package com.example.demo.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Item;
import com.example.demo.repo.ItemRepository;
@RestController
@RequestMapping("api")
public class ItemRestController
{
private ItemRepository itemRepository;
@Autowired
public ItemRestController(ItemRepository itemRepository) {
	super();
	this.itemRepository = itemRepository;
}
@PostMapping("/items")
public Item createItem(@RequestBody Item item)
{
	return itemRepository.insert(item);
}
@GetMapping("/items")
public List<Item> getAllItem()
{
	return itemRepository.findAll();
}
@PutMapping("/items")
public Item updateItem(@RequestBody Item item)
{
	return itemRepository.insert(item);
}
@DeleteMapping("/items")
public void deleteItem()
{
	itemRepository.deleteAll();
}
}
