package com.app.service;

import com.app.entity.Address;

public interface AddressService {
	
	Address addAddress(Address address);
	
	Address updateAddress(Address address);
	
	Address getAddressById(int addressId);

}
