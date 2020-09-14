package com.dogo.chat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@Autowired
	MessageRepository repository;
	
	@GetMapping("/chat")
	public List<Message> getMessages() {
		
		return repository.findAll();
	}
	
	@GetMapping("/chat/{id}")
	public ResponseEntity<Message> getMessage(@PathVariable(value="id") Integer id) {
		Message foundMessage = repository.findById(id).orElse(null);
		if (foundMessage == null) {
			return ResponseEntity.notFound().header("Message", "Not found with that id")
					.build();
		}
		
		return ResponseEntity.ok(foundMessage);
	}
	
	@PostMapping("/chat")
	public ResponseEntity<Message> postMessage(@RequestBody Message message) {
		
		return ResponseEntity.ok( repository.save(message));
	}
	
	@PostMapping("/chat/{id}")
	public ResponseEntity<Message> putMessage(@PathVariable(value="id") Integer id,
			@RequestBody Message message) {
		Message foundMessage = repository.findById(id).orElse(null);
		if (foundMessage == null) {
			return ResponseEntity.notFound().header("Message", "Not found with that id")
					.build();
		}
			
		foundMessage.setName(message.getName());
		foundMessage.setContent(message.getContent());
		
		return ResponseEntity.ok(repository.save(foundMessage));
	}
	
	@DeleteMapping("/chat/{id}")
	public ResponseEntity<Message> deleteMessage(@PathVariable(value="id") Integer id) {
		Message foundMessage = repository.findById(id).orElse(null);
		if (foundMessage == null) {
			return ResponseEntity.notFound().header("Message", "Not found with that id")
					.build();
		} else {
			repository.delete(foundMessage);
		}
		
		return ResponseEntity.ok().build();
	}
	

}
