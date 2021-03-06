package com.youtube.demo.dao;



import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.youtube.demo.model.Rol;
import com.youtube.demo.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
	



	@Query("FROM Rol r")
	List<Rol> findAllRoles();
	
}
