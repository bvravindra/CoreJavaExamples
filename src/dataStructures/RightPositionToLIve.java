package dataStructures;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class RightPositionToLIve {

	public static void main(String[] args) {

		Queue<Integer> q1 = new PriorityQueue<Integer>();

		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
		q1.add(6);
		q1.add(7);
		q1.add(8);
		q1.add(9);

		int result = killByNext(q1);
		System.out.println(result);
	}

	private static int killByNext(Queue<Integer> q1) {

		Queue<Integer> q2 = killByNext2(q1, true);
		return q2.poll();
	}

	private static Queue<Integer> killByNext2(Queue<Integer> q1, boolean flag) {

		Queue<Integer> q2 = new PriorityQueue<Integer>();

		while (q1.size() > 0) {

			if (flag) {
				q2.add(q1.poll());
				q1.poll();
			} else {
				q1.poll();
				if(q1.size() > 0)
				q2.add(q1.poll());

			}
		}

		System.out.println(q2);
		if (q2.size() > 1) {
			return killByNext2(q2, !flag);
		} else {
			return q2;
		}

	}

}
