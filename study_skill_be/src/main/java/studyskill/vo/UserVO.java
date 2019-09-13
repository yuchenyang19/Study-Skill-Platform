package studyskill.vo;

import lombok.Data;
import studyskill.entity.UserEntity;

@Data
public class UserVO {

  private int id;
  private int identity;
  private String username;
  private String password;
  private String email;

  public UserVO(UserEntity userEntity) {
    this.id = userEntity.getId();
    this.identity = userEntity.getIdentity();
    this.username = userEntity.getUsername();
    this.password = userEntity.getPassword();
    this.email = userEntity.getEmail();
  }
}
