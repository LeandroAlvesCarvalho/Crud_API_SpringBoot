/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minhaapi.crud_api.controller;

/**
 *
 * @author piter
 */

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;
    
    @PostMapping //Create (CRUD)
    public User create(@RequestBody User user) {
        return service.save(user);
    }
    
    @GetMapping //Reed (CRUD)
    public List<User> list() {
        return service.list();
    }
    
    @PutMapping("/{id}") //Update (CRUD)
    public User update(@PathVariable Long id, @RequestBody User user) {
        return service.update(id, user);
    }
    
    @DeleteMapping("/{id}") //Delete (CRUD)
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
