package com.accp.biz;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.accp.dao.*;
import com.accp.pojo.*;
import com.accp.vo.*;
import com.github.pagehelper.*;

/**
 * Biz：逻辑&业务
 * @author ASUS
 *
 */
@Service("biz")
public class Biz {

	@Autowired
	private IDao dao;
	public Vuser selectEmp(@Param("employeeId")Integer employeeId,@Param("password")String password) {
		return dao.selectEmp(employeeId, password);
	}

}
