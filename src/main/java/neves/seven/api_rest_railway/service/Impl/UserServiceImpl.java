package neves.seven.api_rest_railway.service.Impl;

import neves.seven.api_rest_railway.service.UserService;
import repository.UserRepository;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;
import neves.seven.api_rest_railway.model.User;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    public User findById(Long id){
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
    @Override
    public User create(User userToCreate){
        if (userToCreate.getId()!=0 && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This User already exists!");
        }

        return userRepository.save(userToCreate);
    }
}
