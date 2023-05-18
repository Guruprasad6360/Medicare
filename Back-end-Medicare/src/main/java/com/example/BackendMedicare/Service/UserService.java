package com.example.BackendMedicare.Service;

import java.util.List;

import com.example.BackendMedicare.Dto.UserDto;
import com.example.BackendMedicare.entity.User;

public interface UserService {
  public String addUser(UserDto userDto);
  public List<User> getAllUser();
  public String updateUser(UserDto userDto);
  public User getUser(Long id);
  public String deleteUser(Long id);
}
