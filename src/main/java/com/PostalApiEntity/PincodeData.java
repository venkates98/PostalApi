package com.PostalApiEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class PincodeData {

	@JsonProperty("Message")
	private String message;

	@JsonProperty("Status")
	private String status;

	@JsonProperty("PostOffice")
	private List<PostOffice> postOffices;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PostOffice> getPostOffices() {
		return postOffices;
	}

	public void setPostOffices(List<PostOffice> postOffices) {
		this.postOffices = postOffices;
	}

	public static class PostOffice {
		private String Name;
		private String Description;
		private String BranchType;
		private String DeliveryStatus;
		private String Circle;
		private String District;
		private String Division;
		private String Region;
		private String Block;
		private String State;
		private String Country;
		private String Pincode;

		

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getDescription() {
			return Description;
		}

		public void setDescription(String description) {
			Description = description;
		}

		public String getBranchType() {
			return BranchType;
		}

		public void setBranchType(String branchType) {
			BranchType = branchType;
		}

		public String getDeliveryStatus() {
			return DeliveryStatus;
		}

		public void setDeliveryStatus(String deliveryStatus) {
			DeliveryStatus = deliveryStatus;
		}

		public String getCircle() {
			return Circle;
		}

		public void setCircle(String circle) {
			Circle = circle;
		}

		public String getDistrict() {
			return District;
		}

		public void setDistrict(String district) {
			District = district;
		}

		public String getDivision() {
			return Division;
		}

		public void setDivision(String division) {
			Division = division;
		}

		public String getRegion() {
			return Region;
		}

		public void setRegion(String region) {
			Region = region;
		}

		public String getBlock() {
			return Block;
		}

		public void setBlock(String block) {
			Block = block;
		}

		public String getState() {
			return State;
		}

		public void setState(String state) {
			State = state;
		}

		public String getCountry() {
			return Country;
		}

		public void setCountry(String country) {
			Country = country;
		}

		public String getPincode() {
			return Pincode;
		}

		public void setPincode(String pincode) {
			Pincode = pincode;
		}
	}
}
