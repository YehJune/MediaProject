package com.yejin.mediaproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class HelloController {
	@GetMapping("/html")
	public String html() {
		System.out.println("HTML파일이 요청됨");
		return "redict:hello.html";
	}
	@GetMapping("/image")
	public String image() {
		System.out.println("이미지 파일이 요청됨");
		return "redict:image/yejin.jpeg";
	}
	@GetMapping("/jsp")
	public String jsp(Model model) {
		System.out.println("jsp 파일이 요청됨");
		model.addAttribute("username", "예진");
		return "hello";
	}
}
