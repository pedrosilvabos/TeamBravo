package org.academiadecodigo.teambravo.converters;

import org.academiadecodigo.teambravo.command.UserDto;
import org.academiadecodigo.teambravo.persistence.model.User;

public class UserDtoToUser extends AbstractConverter<User, UserDto> {
    @Override
    public UserDto convert(User user) {
        return null;
    }
}
