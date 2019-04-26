package org.academiadecodigo.teambravo.converters;

import org.academiadecodigo.teambravo.command.UserDto;
import org.academiadecodigo.teambravo.persistence.model.User;

public class UserToUserDto extends AbstractConverter<User, UserDto> {

    @Override
    public UserDto convert(User user) {

        UserDto userDto = new UserDto();

        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setCitizenNumber(user.getCitizenNumber());
        userDto.setCreditHours(user.getCreditHours());
        userDto.setDateOfBirth(user.getDateOfBirth());
        userDto.setEmail(user.getEmail());
        userDto.setGender(user.getGender());
        userDto.setLocation(user.getLocation());
        userDto.setPhone(user.getPhone());
        userDto.setUserSkills(user.getSkills());
        userDto.setRating(user.getRating());

        return userDto;
    }
}
