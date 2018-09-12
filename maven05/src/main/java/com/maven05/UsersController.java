package com.maven05;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersServices usersServices;

    @RequestMapping(value = {"/users", "/getUsers"}, method = RequestMethod.GET)
    public List<Users> personList() {
        return usersServices.findAll();
    }
}
