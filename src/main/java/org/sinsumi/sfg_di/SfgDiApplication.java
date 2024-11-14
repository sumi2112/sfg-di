package org.sinsumi.sfg_di;

import org.sinsumi.sfg_di.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		i18NController i18NController = (i18NController) ctx.getBean("i18NController");
		System.out.println("i18N -----" + i18NController.greet());

		MyController myController = (MyController) ctx.getBean("myController"); //Name of the bean will be the class name with first letter small.
		System.out.println("Primary------" +myController.printName());

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("Property------" + propertyInjectedController.greet());

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println("Setter------" + setterInjectedController.greet());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println("Constructor------" + constructorInjectedController.greet());
	}

}
