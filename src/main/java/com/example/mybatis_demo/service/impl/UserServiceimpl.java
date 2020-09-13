package com.example.mybatis_demo.service.impl;
import com.example.mybatis_demo.bean.User;
import com.example.mybatis_demo.dao.UserDao;
import com.example.mybatis_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;


@Service(value = "userService")
public class UserServiceimpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getallUser() {
        return userDao.getallUser();
    }


    /**
     * @param id
     * @return
     * 通过头id查询数据
     *
     *
     */
    @Override
    public User getuserbyId(Integer id) {
        return userDao.getuserbyId(id);
    }


    /**
     * @param user
     * @return
     * 添加数据
     */
    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }


    //通过用户名查询数据
    @Override
    public User getuserbyname(String name) {
        return null;
    }


    /**
     * @param name
     * @param password
     * @return
     * 更新数据
     *
     */
    @Override
    public String upDatePassword(String name, String password, String newpsw) {
          User user=userDao.getuserbyname(name);
          if(user!=null){
            if(user.getPassword().equals(password)){
                  userDao.upDatePassword(name,newpsw);
                  return "success";
              }else{
                  return "defeated";
              }
          }else{
              return  "fail";
          }
    }

    @Override
    public int deleteUser(Integer id) {
        return userDao.deleteUser(id);
    }

}
