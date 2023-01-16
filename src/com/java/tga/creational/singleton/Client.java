package com.java.tga.creational.singleton;

import com.java.tga.creational.singleton.eager.EagerRegistry;
import com.java.tga.creational.singleton.lazy.LazyRegistryIODH;
import com.java.tga.creational.singleton.lazy.LazyRegistryWithDCL;

public class Client {

	public static void main(String[] args) {
		EagerRegistry eagerSingleton1 = EagerRegistry.getInstance();
		EagerRegistry eagerSingleton2 = EagerRegistry.getInstance();
		System.out.printf("EagerRegistry: %s \n", eagerSingleton1 == eagerSingleton2);

		LazyRegistryWithDCL lazySingleton1 = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazySingleton2 = LazyRegistryWithDCL.getInstance();
		System.out.printf("LazyRegistryWithDCL: %s \n", lazySingleton1 == lazySingleton2);

		LazyRegistryIODH singleton;

		singleton = LazyRegistryIODH.getInstance();
		LazyRegistryIODH singleton2 = LazyRegistryIODH.getInstance();
		System.out.printf("LazyRegistryIODH: %s \n", singleton == singleton2);
	}

}
