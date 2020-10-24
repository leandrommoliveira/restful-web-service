package com.rest.webservices.restfulwebservice.daos;

import com.rest.webservices.restfulwebservice.beans.User;
import com.rest.webservices.restfulwebservice.entities.UserEntity;
import com.rest.webservices.restfulwebservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoService {

    @Autowired
    private UserRepository repository;

    public List<UserEntity> findAll() {
        return repository.findAll();
    }

    public User save(User user) {
        UserEntity userEntity = new UserEntity(user);
        repository.save(userEntity);
        return user;
    }

    public User update(User user) {
        UserEntity userEntity = new UserEntity(user);
        repository.save(userEntity);
        return user;
    }

    public void delete(int id) {
        UserEntity entity = repository.getOne(id);
        repository.delete(entity);
    }

    public User findOne(int id) {
        UserEntity userEntity = repository.getOne(id);
        return userEntity.toUserBean();
    }

    public User deleteById(int id) {
        UserEntity entity = repository.getOne(id);
        repository.delete(entity);
        return entity.toUserBean();
    }
}
