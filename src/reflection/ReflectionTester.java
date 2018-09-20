package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTester {

	public static void main(String[] args) {

		Class reflectClass = Person.class;
		System.out.println(reflectClass.getName());

		// isAbstract, isFinal, isInterface, isPrivate, etc.
		int classModifier = reflectClass.getModifiers();
		System.out.println(Modifier.isPublic(classModifier));

		Class[] interfaces = reflectClass.getInterfaces();

		Class classSuper = reflectClass.getSuperclass();
		System.out.println(classSuper.getName());

		// List methods and parameters of class
		Method[] classMethods = reflectClass.getMethods();
		for (Method method : classMethods) {
			System.out.println("Method Name: " + method.getName() + "\tReturn type: " + method.getReturnType());
			Class[] parameterTypes = method.getParameterTypes();
			for (Class parameter : parameterTypes) {
				System.out.println("\tParameters: " + parameter.getName());
			}
		}

		Constructor constructor = null;
		Constructor constructor2 = null;

		Object constructor3 = null;
		try {
			constructor = reflectClass.getConstructor();
			constructor2 = reflectClass.getConstructor(int.class, String.class);

			constructor3 = reflectClass.getConstructor(int.class, String.class).newInstance(12, "Random String");
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		Class[] constructParameters = constructor2.getParameterTypes();

		for (Class parameter : constructParameters) {
			System.out.println(parameter.getName());
		}

		Person paul = null;

		try {
			paul = (Person) constructor.newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		paul.setIdcode("P1");
		System.out.println(paul.getIdcode());

		// Accessing private fields
		Field privateStringName = null;
		Person personPrivate = new Person();

		try {
			// private field
			String idCodeString = "idcode";
			privateStringName = Person.class.getDeclaredField(idCodeString);
			privateStringName.setAccessible(true);
			String valueOfName = (String) privateStringName.get(personPrivate);
			System.out.println(valueOfName);

			// private method
			String methodName = "getPrivate";
			Method privateMethod = Person.class.getDeclaredMethod(methodName, null);
			privateMethod.setAccessible(true);
			String privateReturnValue = (String) privateMethod.invoke(personPrivate, null);
			System.out.println("Person private method: " + privateReturnValue);

			// private method with parameters
			Class[] methodParameters = new Class[] { Integer.TYPE, String.class };
			Object[] objectParameters = new Object[] { new Integer(10), new String("Random") };
			privateMethod = Person.class.getDeclaredMethod("getOtherPrivate", methodParameters);
			privateMethod.setAccessible(true);
			privateReturnValue = (String) privateMethod.invoke(personPrivate, objectParameters);
			System.out.println("Person private method with parameters: " + privateReturnValue);

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException
				| NoSuchMethodException | InvocationTargetException e) {
			e.printStackTrace();
		}

	}
}
