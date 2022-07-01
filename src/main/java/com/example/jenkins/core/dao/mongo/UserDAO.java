package com.example.jenkins.core.dao.mongo;

import com.example.jenkins.core.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDAO extends MongoRepository<User, String> {
}
