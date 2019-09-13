package studyskill.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studyskill.dao.UserMapper;
import studyskill.entity.UserEntity;
import studyskill.form.UserForm;
import studyskill.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserMapper userMapper;

  @Override
  public UserEntity login(String username, String password){
    return null;
  }

  @Override
  public UserEntity createNewAccount(UserForm userForm){
    return null;
  }

  @Override
  public void modifyPassword(int userId, String oldPassword, String newPassword){

  }

  @Override
  public void test(){
    UserEntity userEntity = userMapper.selectById(0);
//    System.out.println(userEntity);
  }
}
