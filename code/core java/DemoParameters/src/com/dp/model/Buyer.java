package com.dp.model;

public class Buyer {
	public void buyLaptop(Laptop lt) {// lt = 20202020
		//data //logic
		System.out.println(lt.getModelName());
		System.out.println(lt.getModel());
		System.out.println(lt.getLaptopId());
		System.out.println(lt.getCost());
	}
	public void buyLaptop(int i,String n,String m,float amount) {// logic data-p,id,name,model
		System.out.println(i);
		System.out.println(m);
		System.out.println(n);
		System.out.println(amount);
	}
}
