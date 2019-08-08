package br.univille.estd.stacks.comparables;

public class NumberComparable implements Comparables<Integer> {
	 
	public int compare(Integer a, Integer b) {

	        if (a - b > 0){
	            return (int)Math.ceil(a-b);
	        }
	        else {
	            return (int)Math.floor(a-b);
	        }

	    }
}
