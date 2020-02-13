package com.jk.service;

import com.jk.model.CarModel;
import com.jk.model.PermissionModel;
import com.jk.model.UserModel;
import com.jk.util.CarRe;
import com.jk.util.PageUtil;
import com.jk.util.PramesUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface CarService {
    PageUtil queryCarList(PramesUtil parames);

    void deleteCar(String ids);

    void addCar(CarModel carModel);

    CarModel selectCarByid(Integer id);

    void updateCaa(CarModel carModel);

    String loginUser(UserModel user, HttpServletRequest request);

    List<PermissionModel> getTreeAll(Integer userid);

    List<CarRe> countCar(CarModel carModel);
}
