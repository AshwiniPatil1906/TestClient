package com.equifax.services.eport.servicedefs._1_0;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Test {

	
	public static void main(String[] args) {
		
		new Test().test();
	}
	
	private void test() {
		
		TestObject obj = new TestObject();
		obj.setAge(23);
		obj.setName("ashwini");
		
		try {
			MethodHandle findGetter1 = MethodHandles.lookup().
					findGetter(TestObject.class,"name", String.class);
			
			Object obj1 = findGetter1.invoke(obj);
			
			
			System.out.println("obj1 " + obj1);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*if(StringUtils.equals(segment, "accountList")){
			List<CibilRespAccount> accountList = cibilResponse.getAccountList();

			for (CibilRespAccount cibilRespAccount : accountList) {
				MethodHandle findGetter1 = MethodHandles.lookup().findGetter(CibilRespAccount.class,field, String.class);

				System.out.println("Segment :"+segment+"	Field :"+field+"	Value:"+findGetter1.invoke(cibilRespAccount));

				evalute(findGetter1.invoke(cibilRespAccount),opration);

			}
//			evalute(findGetter1.invoke(cibilRespAccount),opration);
		} */
	}
}
