package com.berke.api.service.impl;

import com.berke.api.dto.UserDto;
import com.berke.api.model.User;
import com.berke.api.repository.UserRepository;
import com.berke.api.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return repo.findAll()
                .stream()
                .map(user -> new UserDto(user.getId(), user.getName(), user.getEmail()))
                .collect(Collectors.toList());
    }

    @Override
    public UserDto createUser(UserDto dto) {
        User user = new User(null, dto.getName(), dto.getEmail());
        user = repo.save(user);
        return new UserDto(user.getId(), user.getName(), user.getEmail());
    }
}
