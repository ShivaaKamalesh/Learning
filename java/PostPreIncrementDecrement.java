import java.util.*;

class PostPreIncrementDecrement {
	public static void main(String[] args) {

		int i = 1;
		System.out.println("Post-Increment");
		System.out.println(i++);
		System.out.println(i++);

		int j = 1;
		System.out.println("Pre-Increment");

		System.out.println(++j);

		int l = 1;
		System.out.println("Post-decrement");
		System.out.println(l--);

		int k = 1;
		System.out.println("Pre-decrement");

		System.out.println(--k);
	}
}

/*
 * output
 * Post-Increment
 * 1
 * 2
 * Pre-Increment
 * 2
 * Post-decrement
 * 1
 * Pre-decrement
 * 0
 */
