package studyskill.entity;

import lombok.Data;

import java.util.Date;

@Data
public class CourseInfoEntity {

  private int id;

  private String courseName;

  private String subject;

  private String grade;

  private Date startTime;

  private Date endTime;
}
