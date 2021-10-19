import java.util.*;

public class StudentSolver {

	public static ArrayList<ArrayList<Pair<Integer, Integer>>> solve(ArrayList<Pair<Integer, Integer>> list) {
		ArrayList<ArrayList<Pair<Integer, Integer>>> arrangement = new ArrayList<ArrayList<Pair<Integer, Integer>>>();
		boolean order = true;
		int max = 0;
		while (max < 20) {
			for (int i = 0; i < list.size() - 1; i++) {
				Pair one = list.get(i);
				int t = (int) one.first;
				Pair two = list.get(i + 1);
				int k = (int) two.first;

				if (t < k) {
					order = true;
				} else if (t == k) {
					int compare = one.compareTo(two);
					if (compare < 1) {
						order = true;
					} else {
						Pair temp = list.get(i + 1);
						list.set(i + 1, one);
						list.set(i, temp);
					}
				} else {
					Pair temp = list.get(i + 1);
					list.set(i + 1, one);
					list.set(i, temp);
				}
			}
			max++;
		}

		ArrayList<Pair<Integer, Integer>> firstOrder = new ArrayList<Pair<Integer, Integer>>();
		for (Pair i : list) {
			firstOrder.add(i);
			// System.out.println(i);
		}
		arrangement.add(firstOrder);
		max = 0;
		while (max < 20) {
			for (int i = 0; i < list.size() - 1; i++) {
				Pair one = list.get(i);
				int t = (int) one.second;
				Pair two = list.get(i + 1);
				int k = (int) two.second;

				if (t < k) {
					order = true;
				} else if (t == k) {
					int compare = one.compareTo(two);
					if (compare < 1) {
						order = true;
					} else {
						Pair temp = list.get(i + 1);
						list.set(i + 1, one);
						list.set(i, temp);
					}
				} else {
					Pair temp = list.get(i + 1);
					list.set(i + 1, one);
					list.set(i, temp);
				}
			}
			max++;
		}

		arrangement.add(list);

		return arrangement;
	}

	/*
	 * public static void main(String[] args) { ArrayList<Pair<Integer,Integer>>
	 * list = new ArrayList<Pair<Integer,Integer>> ();
	 * 
	 * list.add(new Pair(4,2)); list.add(new Pair(1,2)); list.add(new Pair(2,1));
	 * list.add(new Pair(2,4));
	 * 
	 * list.add(new Pair(2,2)); list.add(new Pair(4,3)); list.add(new Pair(4,4));
	 * list.add(new Pair(4,1)); list.add(new Pair(5,4));
	 * System.out.println(solve(list));
	 * 
	 * }
	 */

}
