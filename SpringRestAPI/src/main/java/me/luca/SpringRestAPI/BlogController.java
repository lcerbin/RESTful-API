package me.luca.SpringRestAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class BlogController {
	/*//@RequestMapping("/")
	UserMockData usersMockedData = UserMockData.getInstance();
	
	@GetMapping("/user")
	public List<UserObject> index(){
		return usersMockedData.retrieveUsers();
	}
	
    @GetMapping("/user/{id}")
    public UserObject show(@PathVariable int id) {
    	//int userId = Integer.parseInt(id);
    	return usersMockedData.getUsersById(id);
    }*/
    
	@Autowired
	MoodRepository moodRepository;
	
	@GetMapping("/mood")
	public List<Mood> index(){
		return moodRepository.findAll();
	}
    
	@GetMapping("/mood/{id}")
	public Mood show(@PathVariable int id) {
		return moodRepository.findOne(id);
	}
	
	@PostMapping("/mood/{id}")
	public Mood create(@RequestBody Map<String, String> body) {
		int id = Integer.parseInt(body.get("id"));
		//int numRank = Integer.parseInt(body.get("numRank"));
		String header = body.get("header");
		String content = body.get("content");
		return moodRepository.save(new Mood(header, content, id));
	}
}
