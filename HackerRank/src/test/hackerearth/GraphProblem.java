package test.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GraphProblem {

	public static int compute(int[][] graph, int size) {
		int result = 0;

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (graph[i][j] != 0) {
					result = result + graph[i][j];
				} else {
					for (int k = 0; k < size; k++) {
						if (graph[j][k] != 0 && graph[i][k] != 0) {
							int greater = graph[j][k] > graph[i][k] ? graph[j][k] : graph[i][k];
							graph[i][j] = greater;
							result = result + graph[i][j];
							break;
						}
					}
				}
			}
		}
		return result;
	}

	public static int[][] process(int[][] graph, int size) {

		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j) {
					continue;
				}
				if (graph[i][j] != 0) {
					for (int k = j + 1; k < size; k++) {
						if (graph[j][k] != 0 && graph[i][k] != 0) {
							int temp = graph[j][k] + graph[i][k];
							graph[i][j] = temp;
							graph[j][i] = temp;
							break;
						}
					}
				}
			}
		}

		return graph;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int[][] graph = new int[size][size];
		for (int i = 1; i < size; i++) {
			String[] values = br.readLine().split(" ");
			int a = Integer.parseInt(values[0]) - 1;
			int b = Integer.parseInt(values[1]) - 1;
			int value = Integer.parseInt(values[2]);
			graph[a][b] = value;
			graph[b][a] = value;
		}
		System.out.println(compute(graph, size));

	}
}
