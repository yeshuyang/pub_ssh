package cn.ysy.tt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import cn.ysy.pojo.Student;
import cn.ysy.service.IStudentService;
import junit.framework.TestCase;

public class test {

	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentService service=ctx.getBean("studentServiceImpl",IStudentService.class);
		Student s=new Student();

<<<<<<< HEAD
		s.setName("lili");
=======
		s.setName("丽丽");
>>>>>>> branch 'master' of https://git@github.com/yeshuyang/pubDepot.git
		s.setAge(12);
	
			try {
				service.insert(s);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
