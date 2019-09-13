package studyskill.dao;

import org.springframework.stereotype.Repository;
import studyskill.entity.UserEntity;

@Repository
public interface UserMapper {

  UserEntity selectById(Integer userId);

}
