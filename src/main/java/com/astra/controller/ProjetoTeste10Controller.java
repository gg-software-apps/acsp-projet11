package com.astra.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astra.dto.ProjetoTeste10DTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class ProjetoTeste10Controller {

	@GetMapping("/")
	public ResponseEntity<ProjetoTeste10DTO> index() throws IOException {

		ProjetoTeste10DTO oProjetoTeste10DTO = new ProjetoTeste10DTO();
		oProjetoTeste10DTO.setData("Hello Word");
		return ResponseEntity.ok(oProjetoTeste10DTO);
	}

}