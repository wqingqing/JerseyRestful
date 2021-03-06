package com.drawthink.iguyuan.manager;

import java.util.List;

import com.drawthink.iguyuan.model.City;
import com.drawthink.iguyuan.model.County;
import com.drawthink.iguyuan.model.Province;

public interface AreaManager {

	List<Province> getProvince();

	List<City> getCity(String province);
	
	List<County> getCounty(String city);
}
