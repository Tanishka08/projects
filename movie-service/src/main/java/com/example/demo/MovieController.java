package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	private static List<Movie> movieList= new ArrayList<>();
	static
	{
		movieList.add(new Movie(1,"De Dana Dan","Summary=1"));
		movieList.add(new Movie(2,"Players","Summary=2"));
		movieList.add(new Movie(3,"Race","Summary=3"));
		
	}
	@GetMapping("/movies")
public ResponseEntity<?> getMovies(){
		return ResponseEntity.ok(movieList);

	}
@GetMapping("/movie/{iD}")
public ResponseEntity<?>getMovie(@PathVariable int iD){
	Movie movie= findMovie(iD);
	if(movie==null) {
		return ResponseEntity.badRequest().body("Invalid Movie Id");}
	
	return ResponseEntity.ok(movie);
}
	
private Movie findMovie(int iD)
{
return movieList.stream().filter(movie -> movie.getiD().equals(iD)).findFirst().orElse(null);
}
}
