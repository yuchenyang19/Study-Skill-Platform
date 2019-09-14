package studyskill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import studyskill.constant.ResponseCode;
import studyskill.constant.ServerException;
import studyskill.constant.SimpleResponse;
import studyskill.entity.UserInfoEntity;
import studyskill.form.LoginForm;
import studyskill.form.UserForm;
import studyskill.service.UserService;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/entrance")
public class EntranceController {

  @Autowired
  UserService userService;

  @GetMapping("/")
  public SimpleResponse hello(){
    return new SimpleResponse(ResponseCode.SUCCESS, "hello world");
  }

  @PostMapping("/register")
  public SimpleResponse register(HttpSession session, @RequestBody UserForm userForm){
    UserInfoEntity userInfoEntity = null;
    try{
      userInfoEntity = userService.createNewAccount(userForm);
    }catch (ServerException e){
      e.printStackTrace();
      return SimpleResponse.error(e.getMessage());
    }catch (Exception e){
      e.printStackTrace();
      return SimpleResponse.error(e.getMessage());
    }
    return SimpleResponse.success("register success");
  }

  @PostMapping("/login")
  public SimpleResponse login(HttpSession session, @RequestBody LoginForm loginForm){
    UserInfoEntity userInfoEntity = null;
    try{
      userInfoEntity = userService.login(loginForm.getUsername(), loginForm.getPassword());
    }catch (ServerException e){
      e.printStackTrace();
      return SimpleResponse.error(e.getMessage());
    }catch (Exception e){
      e.printStackTrace();
      return SimpleResponse.error(e.getMessage());
    }
    return SimpleResponse.success("login success");
  }
}
