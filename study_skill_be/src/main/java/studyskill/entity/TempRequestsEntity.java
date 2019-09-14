package studyskill.entity;

import lombok.Data;

@Data
public class TempRequestsEntity {

  private int id;

  private int studentId;

  private String contact;

  private String phoneNumber;

  private String message;
}
