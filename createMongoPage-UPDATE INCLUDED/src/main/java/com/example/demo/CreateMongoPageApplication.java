package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.ItemRepository;

@SpringBootApplication
public class CreateMongoPageApplication //implements CommandLineRunner
{
/*private ItemRepository itemRepository;
@Autowired
	public CreateMongoPageApplication(ItemRepository itemRepository) {
	super();
	this.itemRepository = itemRepository;
}*/

	public static void main(String[] args) 
	{
		
		SpringApplication.run(CreateMongoPageApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception
	{
		
itemRepository.save(new Item("200","Computer", 2000,LocalDate.now())); 
itemRepository.save(new Item("100","Mobile",200000,LocalDate.now()));
List<Item> list=itemRepository.findAll();
			 list.forEach(i->{ System.out.println(i); });
			 
		}
*/
	}

		

