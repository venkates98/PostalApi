package com.PostalApiController;

import org.springframework.web.bind.annotation.RestController;

import com.PostalApiService.PincodeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/pincode")
public class PincodeController {

	@Autowired
	private PincodeService pincodeService;

	@GetMapping("/fetch/{a}")
	public String fetchAndSavePincodeData(@PathVariable String a) {
		pincodeService.savePincodeData(a);
		return "Pincode"+ a+"data saved successfully!";
	}
}
