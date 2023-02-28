package com.dio.academia.controller;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoServices service;
}
