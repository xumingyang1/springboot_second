package com.jk.controller;

import com.jk.model.CarModel;
import com.jk.model.PermissionModel;
import com.jk.model.UserModel;
import com.jk.service.CarService;
import com.jk.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("car")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("queryCarList")
    public @ResponseBody
    EasyUIDataGridResult queryCarList(@RequestBody PramesUtil parames){
        EasyUIDataGridResult dataGridResult = new EasyUIDataGridResult();
        PageUtil pageUtil =  carService.queryCarList(parames);
        dataGridResult.setRows(pageUtil.getList());
        dataGridResult.setTotal(pageUtil.getSumSize());
        return dataGridResult;
    }
    @RequestMapping("toAddCarPage")
    public ModelAndView toAddExpPage2(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/addExpPage");
        return  mv;
    }
    @RequestMapping("countCar")
    public @ResponseBody Map<String,Object> countCar(CarModel carModel){
        Map<String,Object> map = new HashMap<>();
        List<CarRe> list = carService.countCar(carModel);
        List<String> names = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        for (int i=0; i<list.size(); i++){
            names.add(list.get(i).getName());
            values.add(list.get(i).getValue());
        }
        map.put("names",names);
        map.put("values",values);
        return map;
    }

    @RequestMapping("countCarSize")
    public @ResponseBody
    Map<String,Object> countCarSize(CarModel carModel){
        Map<String,Object> map = new HashMap<>();
        List<CarRe> list = carService.countCar(carModel);
        List<String> names = new ArrayList<>();
        for (int i=0; i<list.size(); i++){
            names.add(list.get(i).getName());
        }
        map.put("names",names);
        map.put("lists",list);
        return map;
    }
    @RequestMapping("toindex")
    public ModelAndView toindex(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/index");
        return  mv;
    }
    @RequestMapping("tologinUser")
    public ModelAndView tologinUser(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/shu");
        return  mv;
    }
    @RequestMapping("qqlogin")
    public ModelAndView qqlogin(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/login");
        return  mv;
    }
    @RequestMapping("deleteCar")
    public  @ResponseBody
    void   deleteCar(String ids){
    carService.deleteCar(ids);
}
    @RequestMapping("addCar")
    public @ResponseBody
    void addCar(CarModel carModel){
        carService.addCar(carModel);
    }

    @RequestMapping("toupdate")
    public String toupdate(Integer id, Model model){
        CarModel carModel =  carService.selectCarByid(id);
        model.addAttribute("model",carModel);
        System.out.println(carModel);
        return  "updatej";
    }
    @RequestMapping("updateCaa")
    public @ResponseBody
    void updateCaa(CarModel carModel){
        System.out.println(carModel);
        carService.updateCaa(carModel);
    }
    @RequestMapping("loginUser")
    public @ResponseBody String loginUser(UserModel user, HttpServletRequest request){
        String str = carService.loginUser(user,request);
        return str;
    }
    @RequestMapping("getAllTree")
    public @ResponseBody List<PermissionModel> getTreeAll(HttpServletRequest request){
        System.out.println("9999");
        UserModel user = (UserModel) request.getSession().getAttribute("user");
        if (user==null) {
            return null;
        }
            List<PermissionModel> list = carService.getTreeAll(user.getUserid());
            if(list != null && list.size()>0){
                list = TreeNoteUtil.getFatherNode(list);
                return list;
            }
        return null;
    }
}
