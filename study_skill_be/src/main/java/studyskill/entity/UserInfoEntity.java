package studyskill.entity;

import lombok.Data;

@Data
public class UserInfoEntity {

  private Integer id;

  private Integer identity;   // { 0: guest, 1: student, 2: teacher, 3: administrator }

  private String username;

  private String password;

  private String email;

  private char sex;   // 'f' or 'm'

  private int age;

  private String address;

  private String phone;

  private String edu_level;

  public String toString(){
    return "UserInfoEntity: " + id + " " + username;
  }
}
