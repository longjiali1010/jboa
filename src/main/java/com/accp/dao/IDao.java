package com.accp.dao;

import java.util.*;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.*;
import com.accp.vo.*;
/**
 * 抽象のDao层
 * @author ASUS
 *
 */
public interface IDao {
	//抽象登录方法
	public Vuser selectEmp(@Param("employeeId")Integer employeeId,@Param("password")String password);
	
}
