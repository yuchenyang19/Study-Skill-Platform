package studyskill.entity;

import lombok.Data;

@Data
public class CommentsEntity {

  private int id;

  private String location;

  private int userId;

  private boolean isResponse;

  private String message;
}
