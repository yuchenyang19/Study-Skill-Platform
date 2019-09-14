package studyskill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import studyskill.constant.IdentityCode;
import studyskill.constant.ResponseCode;
import studyskill.constant.ServerException;
import studyskill.constant.SimpleResponse;
import studyskill.entity.UserInfoEntity;
import studyskill.service.UserService;
import studyskill.vo.UserVO;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("/")
  public SimpleResponse hello(){
    userService.test();
    return new SimpleResponse();
  }

  public void certify(Object user){
    UserVO userVO = new UserVO((UserInfoEntity)user);
    int identity = userVO.getIdentity();
    if(identity != IdentityCode.student && identity != IdentityCode.teacher)
      throw new ServerException(ResponseCode.ERROR, "must be student or teacher");
  }
}
