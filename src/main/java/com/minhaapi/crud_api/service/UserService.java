/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minhaapi.crud_api.service;

/**
 *
 * @author piter
 */

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    
    public User save(User user){
        return repository.save(user);
    }
    
    public List<User> list() {
        return repository.findAll();
    }
    
    public User update(Long id, User user) {
        user.setId(id);
        return repository.save(user);
    }
    
    public void delete(Long id){
        repository.deleteById(id);
    }
}
