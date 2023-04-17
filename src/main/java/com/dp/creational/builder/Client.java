package com.dp.creational.builder;

import java.time.LocalDate;

//This is our client which also works as "director"
public class Client {

	public static void main(String[] args) {
		User user = createUser();

		UserWebDTOBuilder userWebDTOBuilder = new UserWebDTOBuilder();

		UserWebDTO userWebDTO = (UserWebDTO) buildUserWebDto(userWebDTOBuilder, user);
		System.out.println(userWebDTO);
	}

	public static UserDTO buildUserWebDto(UserWebDTOBuilder userWebDTOBuilder, User user){
		return userWebDTOBuilder
				.withFirstName(user.getFirstName())
				.withLastName(user.getLastName())
				.withBirthday(user.getBirthday())
				.withAddress(user.getAddress())
				.build();
	}

	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}


}
