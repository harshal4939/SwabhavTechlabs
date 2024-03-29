package com.aurionpro.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class RflctionTest 
{

	public void getClassMetaData(Class c1) 
	{

		System.out.println("Fields of class " + c1);
		System.out.println("");
		printFields(c1);

		System.out.println("");
		System.out.println("Methods of class " + c1);
		System.out.println("");

		printMethods(c1);

	}

	public static void printMethods(Class cl) 
	{
		Method[] methods = cl.getDeclaredMethods();
		
		for (Method m : methods) 
		{
			Class retType = m.getReturnType();
			String name = m.getName();

			System.out.print(" ");
			// print modifiers, return type and method name
			String modifiers = Modifier.toString(m.getModifiers());
			if (modifiers.length() > 0)
				System.out.print(modifiers + " ");
			System.out.print(retType.getName() + " " + name + "(");

			// print parameter types
			Class[] paramTypes = m.getParameterTypes();
			for (int j = 0; j < paramTypes.length; j++) {
				if (j > 0)
					System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
	}

	public static void printFields(Class cl) 
	{
		Field[] fields = cl.getDeclaredFields();

		for (Field f : fields) {
			Class type = f.getType();
			String name = f.getName();
			System.out.print("   ");
			String modifiers = Modifier.toString(f.getModifiers());
			if (modifiers.length() > 0)
				System.out.print(modifiers + " ");
			System.out.println(type.getName() + " " + name + ";");
		}
	}

}