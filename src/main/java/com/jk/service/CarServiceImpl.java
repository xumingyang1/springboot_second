package com.jk.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.mapper.CarModelMapper;
import com.jk.model.BookModel;
import com.jk.model.CarModel;
import com.jk.model.PermissionModel;
import com.jk.model.UserModel;
import com.jk.util.CarRe;
import com.jk.util.PageUtil;
import com.jk.util.PramesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarModelMapper carModelMapper;

    @Override
    public PageUtil queryCarList(PramesUtil parames) {
        //第一步初始化
        PageHelper.startPage(parames.getPageNumber(),parames.getPageSize());

        // 查询数据
        List<BookModel> list = carModelMapper.queryCarList(parames);

        //正式分页
        PageInfo<BookModel> pageInfo = new PageInfo(list);

        PageUtil pageUtil = new PageUtil((int)pageInfo.getTotal(),parames.getPageNumber(),parames.getPageSize());
        pageUtil.setList(list);
        return pageUtil;
    }

    @Override
    public void deleteCar(String ids) {
        carModelMapper.deleteCar(ids);
    }

    @Override
    public void addCar(CarModel carModel) {
        carModelMapper.addCar(carModel);
    }

    @Override
    public CarModel selectCarByid(Integer id) {
        return carModelMapper.selectCarByid(id);
    }

    @Override
    public void updateCaa(CarModel carModel) {
        carModelMapper.updateCaa(carModel);
    }

    @Override
    public String loginUser(UserModel user, HttpServletRequest request) {
        String str = "1";
        List<UserModel> list = carModelMapper.loginUser(user);
        if(list != null && list.size()>0){
            request.getSession().setAttribute("user", list.get(0));
            str= "2";
        }
        return str;
    }

    @Override
    public List<PermissionModel> getTreeAll(Integer userid) {
        return carModelMapper.getTreeAll(userid);
    }

    @Override
    public List<CarRe> countCar(CarModel carModel) {
        return carModelMapper.countCar(carModel);
    }
}
