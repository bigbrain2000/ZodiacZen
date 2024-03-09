package com.zodiaczen.service.converter;

import com.zodiaczen.model.UserEntity;
import com.zodiaczen.web.model.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class UserToUserEntityConverter implements Converter<User, UserEntity> {

    @Override
    public UserEntity convert(User source) {
        return UserEntity.builder()
                .username(source.username())
                .password(source.password())
                .firstName(source.firstName())
                .lastName(source.lastName())
                .role(source.role())
                .birthday(source.birthday())
                .email(source.email())
                .address(source.address())
                .phoneNumber(source.phoneNumber())
                .build();
    }
}
