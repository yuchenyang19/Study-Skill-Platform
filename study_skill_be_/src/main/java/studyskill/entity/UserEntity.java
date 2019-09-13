package studyskill.entity;

import lombok.Data;

@Data
public class UserEntity {

  private Integer id;

  private Integer identity;   // { 0: guest, 1: student, 2: teacher, 3: administrator }

  private String username;

  private String password;

  private String email;

  public String toString(){
    return "UserEntity: " + id + " " + username;
  }
}
