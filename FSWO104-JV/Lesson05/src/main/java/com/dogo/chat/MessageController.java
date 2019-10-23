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
	MessageRepository dao;
	
	@GetMapping("/chat")
	public List<Message> getMessage() {
		List<Message> foundMessages = dao.findAll();
		return foundMessages;
	}
	
	@GetMapping("/chat/{id}")
	public ResponseEntity<Message>getMessage(@PathVariable(value="id") Integer id) {
		Message foundMessage = dao.findById(id).orElse(null);
		if (foundMessage == null) {
			return ResponseEntity.notFound().header("Message", "Nothing found with that id").build();
		}
		
		return ResponseEntity.ok(foundMessage);
	}
	
	@PostMapping("/chat")
	public ResponseEntity<Message> postMessage(@RequestBody Message message) {
		Message createdMessage = dao.save(message);
		return ResponseEntity.ok(createdMessage);
	}

	@PutMapping("/chat")
	public ResponseEntity<Message> putMessage(@RequestBody Message message) {
		Message foundMessage = dao.findById(message.getId()).orElse(null);
		if (foundMessage == null) {
			return ResponseEntity.notFound().header("Message", "Nothing found with that id").build();
		} 
			
		dao.save(message);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/chat/{id}")
	public ResponseEntity<Message> deleteMessage(@PathVariable(value="id") Integer id) {
		Message foundMessage = dao.findById(id).orElse(null);
		if (foundMessage == null) {
			return ResponseEntity.notFound().header("Message", "Nothing found with that id").build();
		} 
			
		dao.delete(foundMessage);
		return ResponseEntity.ok().build();
	}
}
