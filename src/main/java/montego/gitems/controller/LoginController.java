package montego.gitems.controller;

import montego.gitems.entity.User;
import montego.gitems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Collections;
import java.util.Map;

@Controller
public class LoginController {

    private final UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String registration(Model model) {
        return "login";
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(
            @RequestParam("password_confirm") String passwordConfirm,
            @RequestParam("g-recaptcha-response") String captchaResponse,
            @Valid User user,
            BindingResult bindingResult,
            Model model
    ) {

//        String url = String.format(CAPTCHA_URL, secret,captchaResponse);
//        CaptchaResponseDto response = restTemplate.postForObject(url, Collections.emptyList(),CaptchaResponseDto.class);
//
//        if(!response.isSuccess()){
//            model.addAttribute("captchaError","Captcha is not correct. Try again");
//        }
//
//        boolean isConfirmEmpty = StringUtils.isEmpty(passwordConfirm);
//        if(isConfirmEmpty){
//            model.addAttribute("password_confirmError","Password confirmation can't be empty");
//        }
//        if(user.getPassword() != null && !user.getPassword().equals(passwordConfirm)){
//            model.addAttribute("passwordError","Passwords are different");
//        }
//        if(isConfirmEmpty || bindingResult.hasErrors() || !response.isSuccess()){
//            Map<String,String> errors = ControllerUtils.getErrors(bindingResult);
//            model.mergeAttributes(errors);
//            return "registration";
//        }

//        if (!userService.addUser(user)) {
//            model.addAttribute("usernameError", "User exists!!!!");
//            return "registration";
//        }
        return "redirect:/login";
    }
}
