package org.codercamps.FSWO1043JV.controllers;

import java.util.List;

import org.codercamps.FSWO1043JV.classes.MessageRepository;
import org.codercamps.FSWO1043JV.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

	@Autowired
	MessageRepository dao;
	
	@GetMapping("/chat")
	public List<Message>getAllMessages() {
		
		return dao.findAll();
	}
	
	@GetMapping("/chat/{id}")
	public ResponseEntity<Message> getMessage(@PathVariable(value="id") Integer id) {
		
		Message found = dao.findById(id).orElse(null);
		return ( found != null ) ? ResponseEntity.ok(found) :
									ResponseEntity.notFound().header("Message", "Message Not Found")
									.build();
	}
	
	@PostMapping("/chat")
	public ResponseEntity<Message> postMessage(@RequestBody Message message) {
		
		Message saved = dao.save(message);
		return ResponseEntity.ok(saved);
	}
	
	@PutMapping("/chat")
	public ResponseEntity<Message> putMessage(@RequestBody Message message) {
		
		Message existing = dao.findById(message.getId()).orElse(null);
		if (existing == null) {
			return ResponseEntity.notFound().header("Message", "Message Not Found")
					.build();
		}
		
		existing.setName(message.getName());
		existing.setContent(message.getContent());
		
		Message saved = dao.save(existing);
		return ResponseEntity.ok(saved);
	}

	@DeleteMapping("/chat/{id}")
	public ResponseEntity<Message> deleteMessage(@PathVariable(value="id") Integer id) {

		Message existing = dao.findById(id).orElse(null);
		if (existing == null) {
			return ResponseEntity.notFound().header("Message", "Message Not Found")
					.build();
		}
		dao.delete(existing);
		return ResponseEntity.ok().build();
	}
}
