package studyskill.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TradesEntity {

  private int id;

  private int studentId;

  private int courseId;

  private long amount;

  private Date datetime;
}
