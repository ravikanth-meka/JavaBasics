package com.basics.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class TestLambda {
	
	//sort using java 8
	private void sortUsingJava8(List<String> names){
	  Collections.sort(names, (s1, s2) -> s2.compareTo(s1));
	}
	
	public static void main(String[] args)
	{
		TestLambda tl = new TestLambda();
		
		List<String> names = new ArrayList<String>();
		names.add("Devi");
		names.add("Sravanthi");
		names.add("Ravi");
		names.add("Kanth");
		names.add("Devi");
		
		
		tl.sortUsingJava8(names);
		
		names.forEach(name -> System.out.println(name));
		
		System.out.println("\n Distinct names \n");
		names.stream().distinct().forEach(name -> System.out.println(name));
		
		List<String> aNames = new ArrayList<String>();
		
		names.stream()
			.filter(name -> name.startsWith("R"))
			.forEach(name -> aNames.add(name));
		
		System.out.println("\n A name \n");
		
		aNames.forEach(name -> System.out.println(name));
		
		
		List<Veh> vehList = new ArrayList<Veh>();
		
		
		
		
		
		Veh v = new Veh();
			v.setYear(2001);
			v.setMake("Ford");
			v.setModel("Tarus");
			vehList.add(v);
		 v = new Veh();
			v.setYear(2008);
			v.setMake("Audi");
			v.setModel("Q5");vehList.add(v);
		 v = new Veh();
			v.setYear(2002);
			v.setMake("Toyota");
			v.setModel("Prius");vehList.add(v);
			
			 v = new Veh();
				v.setYear(2008);
				v.setMake("Audi");
				v.setModel("A1");vehList.add(v);
			 v = new Veh();
				v.setYear(2006);
				v.setMake("Audi");
				v.setModel("Q3");vehList.add(v);
				
		 v = new Veh();
			v.setYear(2004);
			v.setMake("Toyota");
			v.setModel("Camry");vehList.add(v);
		 v = new Veh();
			v.setYear(2006);
			v.setMake("Bmw");
			v.setModel("200");vehList.add(v);
		
			
			
			 Collections.sort(vehList, (s1, s2) -> {
				 int i = s2.getYear()-s1.getYear() ;
				 if (i==0)  i= s1.getMake().compareTo(s2.getMake());
				 if (i==0)  i= s1.getModel().compareTo(s2.getModel());
				 return i;
			 });
			 
			 
			 
			 vehList.forEach(veh -> System.out.println(veh.getYear() +" " +veh.getMake() +" " + veh.getModel()));
			 
			 System.out.println("*****************************");
			 Comparator<Veh> vehComp = (s1, s2) -> {
				 int i = s1.getYear()-s2.getYear() ;
				 if (i==0)  i= s1.getMake().compareTo(s2.getMake());
				 if (i==0)  i= s1.getModel().compareTo(s2.getModel());
				 return i;
			 };
					
			 vehList.sort(vehComp);
			 vehList.forEach(veh -> System.out.println(veh.getYear() +" " +veh.getMake() +" " + veh.getModel()));
				
	}

	
	
}
