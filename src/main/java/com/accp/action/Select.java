package com.accp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.*;
import com.accp.pojo.*;
import com.accp.vo.*;

/**
 * 后台处理servlet请求&响应
 * @author ASUS
 *
 */
@RestController
@RequestMapping("/api")
public class Select {

	@Autowired
	private Biz biz;
	@GetMapping("selectemployeeId/{userNumber}/{userPwd}")
	public Vuser select(HttpServletRequest request,@PathVariable Integer userNumber,@PathVariable String userPwd) {
		HttpSession session = request.getSession();
		Vuser emp = biz.selectEmp(userNumber, userPwd);
		session.setAttribute("emp", emp);
		System.out.println(session.getAttribute("emp"));
		System.out.println(1111);
		System.out.println("--"+userNumber+"--");
		return emp;
	}

	@GetMapping("sessions")
	public Vuser selectid(HttpSession session) {
		System.out.println("======");
		System.out.println(session.getAttribute("emp"));
		return (Vuser) session.getAttribute("emp");
	}
	
	@GetMapping("baoxiao/{s}/{n}")
	public void selectbaoxiao(@PathVariable Integer s,@PathVariable Integer n) {
		
	}
}
