package br.com.alura.microservices.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservices.shop.controller.dto.BuyDTO;
import br.com.alura.microservices.shop.service.BuyService;

@RestController
@RequestMapping("/buy")
public class BuyController {
	
	@Autowired
	private BuyService buyService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void makeBuy(@RequestBody BuyDTO buy) {
		buyService.makeBuy(buy);
	}

}