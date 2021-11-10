package org.maven;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.naming.directory.SearchControls;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PracticeProject {
	
	public static void main(String[] args) {
		
		int a[]= {30,20,30,10,5,15,50,5,40,100};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int first=a[i];
				int second=a[j];
				if (first!=second) {
					if (first>second) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			try {
				if(a[i+1]!=a[i]) {
					System.out.println(a[i]);
				}
			} catch (Exception e) {
			}
		}
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("cde");
		System.out.println("cde");
		System.out.println("ABC");
		System.out.println("ABC");


		
	}
}
