package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    public User findbyUser(String username); 
    
}
