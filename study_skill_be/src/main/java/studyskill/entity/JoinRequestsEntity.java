package studyskill.entity;

import lombok.Data;

import java.util.Date;

@Data
public class JoinRequestsEntity {

  private int id;

  private int studentId;

  private int courseId;

  private Date datetime;
}
