package ocp.chap1.cat.species;

import ocp.chap1.cat.BigCat;

public class Lynx extends BigCat {
	public static void main(String[] args) {
		BigCat cat = new BigCat();
		System.out.println(cat.name);
		System.out.println(cat.hasFur); // Not accessed via INheritance, hence
										// not able to take benefit of protected
		System.out.println(cat.hasPaws);
		System.out.println(cat.id);

		Lynx lynx = new Lynx();
		System.out.println(lynx.name);
		System.out.println(lynx.hasFur);
		System.out.println(lynx.hasPaws);
		System.out.println(lynx.id);
	}
}
