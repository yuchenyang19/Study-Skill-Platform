package studyskill.service;

import studyskill.entity.UserInfoEntity;
import studyskill.form.UserForm;

public interface UserService {

  public UserInfoEntity login(String username, String password);

  public UserInfoEntity createNewAccount(UserForm userForm);

  public void modifyPassword(int userId, String oldPassword, String newPassword);

  public void test();
}
