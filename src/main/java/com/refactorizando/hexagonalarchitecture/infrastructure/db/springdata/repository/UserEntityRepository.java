package com.refactorizando.hexagonalarchitecture.infrastructure.db.springdata.repository;

import org.springframework.stereotype.Service;

import com.refactorizando.hexagonalarchitecture.application.repository.UserRepository;
import com.refactorizando.hexagonalarchitecture.domain.User;
import com.refactorizando.hexagonalarchitecture.infrastructure.db.springdata.mapper.UserEntityMapper;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class UserEntityRepository implements UserRepository {

  private final IUserEntityRepository userRepository;

  private final UserEntityMapper userMapper;

  @Override
  public User findById(Long id) {
    return userMapper.toDomain(userRepository.findById(id).orElseThrow());
  }

  @Override
  public User save(User user) {

    return userMapper.toDomain(userRepository.save(userMapper.toDbo(user)));

  }
}
