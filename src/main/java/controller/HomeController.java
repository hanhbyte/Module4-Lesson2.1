package controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
  public static final String EMAIL_REGEX =  "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
  private static Pattern pattern;
  private Matcher matcher;

  public HomeController(){
    pattern = Pattern.compile(EMAIL_REGEX);
  }

  @GetMapping(value = "/")
  public String home(){
    return "home";
  }

  @PostMapping(value = "/validate")
  public String user(@RequestParam("email") String email, ModelMap modelMap){
    boolean isValid = this.validate(email);
    if (!isValid){
      modelMap.addAttribute("message", "Email in isvalid");
      return "home";
    }
    modelMap.addAttribute("email", email);
    return "succcess";
  }

  private boolean validate(String regex){
    matcher = pattern.matcher(regex);
    return matcher.matches();
  }
}
