package studyskill.service;

import studyskill.entity.UserEntity;
import studyskill.form.UserForm;

public interface UserService {

  public UserEntity login(String username, String password);

  public UserEntity createNewAccount(UserForm userForm);

  public void modifyPassword(int userId, String oldPassword, String newPassword);

  public void test();
}
