package com.ilyabuglakov.elevate.model.registration;

import com.ilyabuglakov.elevate.model.authentication.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormUserDTO {
    public String username;
    public String name;
    public String surname;
    public String password;

    public User asUser(){
        User user = new User();
        user.setEmail(username);
        user.setPassword(password);
        user.setName(name);
        user.setSurname(surname);
        return user;
    }
}
