package com.basics.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyGraphBfs {

	public static void main(String[] args) {
		MyGraphBfs mygraph = new MyGraphBfs();
		NodeBFS m0 = new NodeBFS(0), m1 = new NodeBFS(1), m2 = new NodeBFS(2), m3 = new NodeBFS(3);
		m0.getAdjacentNodes().add(m1);
		m0.getAdjacentNodes().add(m2);
		m1.getAdjacentNodes().add(m2);
		m2.getAdjacentNodes().add(m0);
		m2.getAdjacentNodes().add(m3);
		m3.getAdjacentNodes().add(m3);

		System.out.println("Following is Depth First Traversal (starting from vertex 2)");
		System.out.println("Connected graph Traversal");
		mygraph.connectedGraph(m3);
	}

	public void connectedGraph(NodeBFS node) {
		BFS(node);
	}

	public void disConnectedGraph(List<NodeBFS> vertices) {
		for (NodeBFS vertex : vertices)
			BFS(vertex);
	}

	void BFS(NodeBFS v) {
		// Mark the current node as visited and print it
		v.setVisited(true);
		LinkedList<NodeBFS> queue = new LinkedList<NodeBFS>();
		queue.add(v);
		while (queue.size() != 0) {
			// Dequeue a vertex from queue and print it
			v = queue.poll();
			System.out.print(v.getVertex() + " ");
			for (NodeBFS n : v.getAdjacentNodes()) {
				if (!n.isVisited()) {
					n.setVisited(true);
					queue.add(n);
				}
			}
		}
	}
}

class NodeBFS {
	int vertex;
	boolean visited;
	List<NodeBFS> adjacentNodes;
	NodeBFS(int vert) {
		this.vertex = vert;
	}
	public int getVertex() {
		return vertex;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public List<NodeBFS> getAdjacentNodes() {
		if (adjacentNodes == null) {
			adjacentNodes = new ArrayList<NodeBFS>();
		}
		return adjacentNodes;
	}
}