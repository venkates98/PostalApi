package com.PostalApiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.PostalApiEntity.PincodeData;
import com.PostalApiEntity.PincodeEntity;
import com.PostalApiRepository.PincodeRepository;

@Service
public class PincodeService {

	private final RestTemplate restTemplate;

	@Autowired
	private PincodeRepository pincodeRepository;

	public PincodeService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public void savePincodeData(String a) {
		String url = "https://api.postalpincode.in/pincode/";

		PincodeData[] response = restTemplate.getForObject(url + a, PincodeData[].class);

		if (response != null && response.length > 0 && response[0].getPostOffices() != null) {
			for (PincodeData.PostOffice postOffice : response[0].getPostOffices()) {
				PincodeEntity entity = new PincodeEntity();
				entity.setPincode(postOffice.getPincode());
				entity.setName(postOffice.getName());
				entity.setDescription(postOffice.getDescription());
				entity.setBranchType(postOffice.getBranchType());
				entity.setDeliveryStatus(postOffice.getDeliveryStatus());
				entity.setCircle(postOffice.getCircle());
				entity.setDistrict(postOffice.getDistrict());
				entity.setDivision(postOffice.getDivision());
				entity.setRegion(postOffice.getRegion());
				entity.setBlock(postOffice.getBlock());
				entity.setState(postOffice.getState());
				entity.setCountry(postOffice.getCountry());

				pincodeRepository.save(entity);
			}
		}
	}
}
