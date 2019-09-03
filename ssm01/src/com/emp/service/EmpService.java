package com.emp.service;

import java.util.List;

import com.emp.entity.Emp;
import com.emp.utils.PageBean;

public interface EmpService {
      //��ҳ��ѯ
	   PageBean<Emp>  queryByPage(Integer pageNo,Integer pageSize);
	  //������ҳ��ѯ
	  PageBean<Emp> queryByCondition(Integer pageNo,Integer pageSize,
			     String ename);
	  //���ݱ�Ų�ѯԱ��
	  Emp queryEmpById(String empno);
	  //���Ա��
	  void addEmp(Emp emp);	 
	  //�޸�Ա��
	  void updateEmp(Emp emp);
	  //ɾ��Ա��	
	   void deleteEmp(String empno);
	   
	   //��ѯ���еľ���
	   List<Emp> queryMgrs();
}
