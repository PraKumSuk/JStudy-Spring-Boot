package com.spk.event.reg.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AudienceController {

	@Autowired
	private AudienceService audienceService;

	@GetMapping("/")
	public String index(@ModelAttribute("model") ModelMap model) {

		model.addAttribute("audienceList", audienceService.findAll());

		return "index";
	}

	@PostMapping("/add")
	public String add(Audience audience) {

		audienceService.add(audience);

		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {

		audienceService.deleteById(id);

		return "redirect:/";
	}

}
