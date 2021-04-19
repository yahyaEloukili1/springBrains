package org.ensas.springBrains.dao;

import org.ensas.springBrains.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
