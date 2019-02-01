package edu.jspiders.beanlifecycle.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ClassA implements InitializingBean,DisposableBean{

	public ClassA() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println(this.getClass().getSimpleName()+" afterPropertiesSet() invoked");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(this.getClass().getSimpleName()+" destroy() invoked");
	}
}
