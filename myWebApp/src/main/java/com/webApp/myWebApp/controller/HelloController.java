package com.webApp.myWebApp.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello from web";
    }

    @RequestMapping("/hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My first Web App</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("I am a Superman!!");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    ///src/main/resources/META-INF/resources/WEB-INF/jsp/hello.jsp
    @RequestMapping("hello-jsp")
    public String sayHelloJsp() {
        return "hello";
    }

}
