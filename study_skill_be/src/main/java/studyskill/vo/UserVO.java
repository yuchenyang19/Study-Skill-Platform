package studyskill.vo;

import lombok.Data;
import studyskill.entity.UserInfoEntity;

@Data
public class UserVO {

  private int id;
  private int identity;
  private String username;
  private String password;
  private String email;

  public UserVO(UserInfoEntity userInfoEntity) {
    this.id = userInfoEntity.getId();
    this.identity = userInfoEntity.getIdentity();
    this.username = userInfoEntity.getUsername();
    this.password = userInfoEntity.getPassword();
    this.email = userInfoEntity.getEmail();
  }
}
