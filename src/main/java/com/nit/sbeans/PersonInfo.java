package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
@PropertySource(value="com.nit.commons/info.properties")

public class PersonInfo {
	@Value("${per.Id}")
	private Integer pid;
	@Value("${per.addrs}")
	
	private String addrs;
	@Value("9898989898")
	private Long mobileNo;
	 @Value("${os.name}")
	 private String os_name;
	 @Value("$os.version}")
	 private String os_ver;
	 
	 @Value("${Path}")
	 private String path_date;

	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", addrs=" + addrs + ", mobileNo=" + mobileNo + ", os_name=" + os_name
				+ ", os_ver=" + os_ver + ", path_date=" + path_date + "]";
	}
	 
	

}
