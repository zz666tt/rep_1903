package com.emp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emp.entity.User;

@Controller
public class UserController {
    //ģ���������õ��û�
	private List<User> users = new ArrayList<User>();
	
	public UserController(){
		 users.add(new User("zs","123"));
		 users.add(new User("ls","456"));
		
	}
	
	//��ת����¼ҳ�� Login.jsp
	@RequestMapping("/user/toLogin")
	public String toLogin(){
		return "Login";
	}
	
	//�����¼
	@RequestMapping("/user/login")
	public String login(User user,HttpSession session,Model model){
		   if(users.contains(user)){
			     //��¼�ɹ�
                 //���û�����ŵ�session
			   session.setAttribute("user", user);
			   //�ض���Ա���б�
			   return "redirect:/emp/conditionList";
		   }else{
			   //��¼ʧ��
			   //�󶨴�����Ϣ
			   model.addAttribute("msg", "�û������������");
			   //ת���ص�¼ҳ��
			   return "forward:/user/toLogin";
		   }
	}
}
