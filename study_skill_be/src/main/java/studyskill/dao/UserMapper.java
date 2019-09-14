package studyskill.dao;

import org.springframework.stereotype.Repository;
import studyskill.entity.UserInfoEntity;

@Repository
public interface UserMapper {

  UserInfoEntity selectById(Integer userId);

}
