package studyskill.form;

import lombok.Data;

@Data
public class InfoForm {

  private int identity;   // { 0: guest, 1: student, 2: teacher, 3: administrator }
  
  private String email;

}
