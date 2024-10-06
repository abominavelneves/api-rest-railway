package neves.seven.api_rest_railway.service;
import neves.seven.api_rest_railway.model.User;
public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
    
}
