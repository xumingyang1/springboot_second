package com.jk.mapper;

import com.jk.model.BookModel;
import com.jk.model.CarModel;
import com.jk.model.PermissionModel;
import com.jk.model.UserModel;
import com.jk.util.CarRe;
import com.jk.util.PramesUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CarModelMapper {
    int deleteByPrimaryKey(Integer carid);

    int insert(CarModel record);

    int insertSelective(CarModel record);

    CarModel selectByPrimaryKey(Integer carid);

    int updateByPrimaryKeySelective(CarModel record);

    int updateByPrimaryKey(CarModel record);

    List<BookModel> queryCarList(PramesUtil parames);

    void deleteCar(@Param("ids") String ids);

    void addCar(CarModel carModel);
  @Select("select * from t_car where carid = #{id}")
  CarModel selectCarByid(Integer id);

    void updateCaa(CarModel carModel);
    @Select("select * from t_user where username= #{username} and userpass = #{userpass}")
    List<UserModel> loginUser(UserModel user);
    @Select("SELECT tp.*from  role_permission rp, t_permission tp, t_role tr, t_user tu, user_role ur where tu.userId = ur.user_id  and ur.role_id =tr.id and tr.id =rp.role_id and rp.permission_id=tp.id and tu.userId=#{userid}")
    List<PermissionModel> getTreeAll(Integer userid);
    List<CarRe> countCar(CarModel carModel);
}