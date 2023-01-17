package sample1;

import static org.junit.Assert.*;

import org.junit.Test;

public class sampletest {
	public float sampleInterest(float pr,float rate,float time) {
		return pr*rate*time/100;
		
		
	}
	public static void main(String[] args) {
		sampletest s1 = new sampletest();
		System.out.println(s1.sampleInterest(4000, 4, 3));
		
	}

	

}
