package com.tgt.igniteplus;

public class StringMethods {
    /*This program illustrates the usage of some common string methods.*/
    public static void main(String[] args) {
	String one="Honey";
	String two="Bee";
	System.out.println("Methods on the string \"Honey\" :");
	System.out.println("_______________________________");
	System.out.println("length : "+one.length());
	System.out.println("isEmpty : "+one.isEmpty());
	System.out.println("replace : "+one.replace('H','M'));
	System.out.println("Substring : "+one.substring(1,4));
	System.out.println("indexOf(\"n\") : "+one.indexOf("n"));
	System.out.println("endswith(\"y\") : "+one.endsWith("y"));
	System.out.println("contains(\"en\") : "+one.contains("en"));
	System.out.println("\n\n");
	System.out.println("Methods on the string \"Honey\" and \"Bee\":");
	System.out.println("_______________________________________________");
	System.out.println("compareTo : "+one.compareTo(two));
	System.out.println("concat : "+one.concat(two));
	/*OUTPUT:
    Methods on the string "Honey" :
    _______________________________
    length : 5
    isEmpty : false
    replace : Money
    Substring : one
    indexOf("n") : 2
    endswith("y") : true
    contains("en") : false



    Methods on the string "Honey" and "Bee":
    _______________________________________________
    compareTo : 6
    concat : HoneyBee
	 */
    }
}
