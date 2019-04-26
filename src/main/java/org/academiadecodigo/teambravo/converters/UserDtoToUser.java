package org.academiadecodigo.teambravo.converters;

import org.academiadecodigo.teambravo.command.UserDto;
import org.academiadecodigo.teambravo.persistence.model.User;
import org.academiadecodigo.teambravo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDtoToUser extends AbstractConverter<UserDto, User> {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @Override
    public User convert(UserDto userDto) {

        User user = (userDto.getUserId() != null ? userService.getUserById(userDto.getUserId()) : new User());

        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setCitizenNumber(userDto.getCitizenNumber());
        user.setCreditHours(userDto.getCreditHours());
        user.setDateOfBirth(userDto.getDateOfBirth());
        user.setEmail(userDto.getEmail());
        user.setGender(userDto.getGender());
        user.setLocation(userDto.getLocation());
        user.setPhone(userDto.getPhone());
        user.setSkills(userDto.getUserSkills());
        user.setRating(userDto.getRating());

        return user;

    }
}
