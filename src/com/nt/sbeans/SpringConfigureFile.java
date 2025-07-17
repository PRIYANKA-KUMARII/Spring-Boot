package com.nt.sbeans;
@Configuration
public class SpringConfigureFile {
	@Bean
	public Address createAddressObj() {
		Address addr= new Address();
		addr.setHouseNo(1000);
		addr.setCity("Delhi");
		addr.setPincode(123456);
		return addr;
		
	}
	public Student createStdObj() {
		Student std= new Student();
		std.setName("Priyanka");
		std.setRollNo(101);
		std.setAddress(createAddressObj());
		return std;
	}
	

}
