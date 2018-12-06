package com.demo.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.demo.graphql.dao.UserRoleRepository;
import com.demo.graphql.dao.model.User;
import com.demo.graphql.dao.model.UserRole;
@Component
public class UserResolver implements GraphQLResolver<User>{
	
	@Autowired
	private UserRoleRepository repo;
	
	public UserResolver(UserRoleRepository repo) {
		this.repo =  repo;
	}
	
	public UserRole getRole(User user) {
		return repo.getOne(user.getId());
	}

}
