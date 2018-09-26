package com.santander.cdpyme.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/idp-login")
public class IdpLoginController {

	@Value("${cdpyme.redirect.url}")
	private String CDPYME_REDIRECT_URL;

	@GetMapping
	public String loginIndex(Model model) {

		model.addAttribute("bankName", "Santander");

		return "login-index";
	}

	@PostMapping("/validate-buc")
	public String validateBuc(@RequestParam("buc") String buc, Model model) {

		model.addAttribute("bankName", "Santander");
		model.addAttribute("buc", buc);
		model.addAttribute("frase", "Hola artista !");

		return "login-enter-password";
	}

	@PostMapping("/validate-password")
	public ModelAndView validatePassword(@RequestParam("buc") String buc) {

		Map<String, Object> map = new HashMap<>();
		map.put("ot", "123-abc-456-def");

		return new ModelAndView("redirect:" + CDPYME_REDIRECT_URL, map);
	}

}
