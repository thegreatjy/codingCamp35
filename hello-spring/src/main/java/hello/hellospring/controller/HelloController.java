package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hihi") //스프링이 해당 컨드롤러를 찾음 / localhost:8080/[getmapping따옴표] / 컨트롤러 없으면 html 찾음. 없으면 에러
    public String hello(Model model){
        model.addAttribute("data", " hello!!");  //key, value / model(data:hello!!)객체
        return "hello"; //resources/templates/[리턴값].html 찾음
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){ //localhost:8080/hello-mvc?[param]=[원하는 문자열]
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody   //템플릿을 찾지 않음. 문자를 넘김
    public String helloString(@RequestParam("name") String name){   //hello-string?name=[value]
        return "hello "+ name;  //hello [value] 를 출력 / html로 변환없이 리턴값만 그대로 리턴
    }

    @GetMapping("hello-api")
    @ResponseBody   //객체가 오면 json형식 으로 변환
    public Hello helloAPI(@RequestParam("name") String name){
            Hello hello = new Hello();
            hello.setName(name);
            return hello;
            //json 형식으로 반환
            //{"key":"value"}
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}