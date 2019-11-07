package org.codercamps.FSWO1043JV.classes;

import org.codercamps.FSWO1043JV.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
