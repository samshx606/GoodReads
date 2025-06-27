package com.global.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.global.model.User;
import com.global.projection.UserView;
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	List<UserView> findAllBy();
	User findByUsername(String username);
}
