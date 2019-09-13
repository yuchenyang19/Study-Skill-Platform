package studyskill.constant;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class SimpleResponse {

  private int code;
  private Object data;
  private transient String exception;

  public SimpleResponse() {
    this(ResponseCode.SUCCESS, "Success");
  }

  public SimpleResponse(boolean success){
    this(success ? ResponseCode.SUCCESS
                    : ResponseCode.ERROR,
            success ? "Success"
                    : "Error");
  }

  public SimpleResponse(int code){
    this(code, "", "");
  }

  public SimpleResponse(int code, Object data){
    this(code, data, "");
  }

  public SimpleResponse(int code, Object data, String exception){
    this.code = code;
    this.data = data;
    this.exception = exception;
    System.out.println("code: " + code + ", data: " + data);
  }

  public static SimpleResponse exception(Exception exception){
    exception.printStackTrace();
    return new SimpleResponse(ResponseCode.CATCH_EXCEPTION, exception.getMessage());
  }

  public static SimpleResponse error(Object data){
    return new SimpleResponse(ResponseCode.ERROR, data);
  }

  public static SimpleResponse success(Object data){
    return new SimpleResponse(ResponseCode.SUCCESS, data);
  }

  public static SimpleResponse checkNull(Object data){
    if(data == null)
      return new SimpleResponse(ResponseCode.NULL_RESPONSE);
    else
      return new SimpleResponse(ResponseCode.SUCCESS, data);
  }

  public static SimpleResponse checkBoolean(boolean result){
    return new SimpleResponse(result);
  }

  @JsonIgnore
  public String getException(){
    return exception;
  }

}
