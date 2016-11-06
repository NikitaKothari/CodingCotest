package utd.nikita.code;

import java.util.LinkedList;
import java.util.Queue;

class Tree {
	public int x;
	public Tree l;
	public Tree r;
}

public class Test123 {

	static int maxHeightOfSubTree;

	public int solution(int A, int B, Tree T) {
		int maxHeight = 0;
		Queue<Tree> bfsQueue = new LinkedList<Tree>();
		bfsQueue.add(T);
		while (!bfsQueue.isEmpty()) {
			Tree subTree = bfsQueue.poll();
			if (subTree.l != null)
				bfsQueue.add(subTree.l);
			if (subTree.r != null)
				bfsQueue.add(subTree.r);
			maxHeight = Math.max(maxHeight, process(A, B, subTree));
			maxHeightOfSubTree = 0;
		}
		return maxHeight;
	}

	public int process(int A, int B, Tree T) {

		if (T == null)
			return -1;

		if (T.x >= A && T.x <= B) {
			maxHeightOfSubTree = maxHeightOfSubTree + 1;
			int leftTreeHeight = process(A, B, T.l);
			if (leftTreeHeight == 0) {
				maxHeightOfSubTree = 0;
				return 0;
			}
			int rightTreeHeight = process(A, B, T.r);
			if (rightTreeHeight == 0) {
				maxHeightOfSubTree = 0;
				return 0;
			}
		} else {
			return 0;
		}

		return maxHeightOfSubTree;
	}
}
