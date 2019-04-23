package com.basics.graph;

import java.util.ArrayList;
import java.util.List;

public class MyGraphdfs {
	List<Node> allNodes;
	MyGraphdfs() {
		allNodes = new ArrayList<Node>();
	}

	public void addNode(Node node) {
		allNodes.add(node);
	}
	public List<Node> getVertices() {
		return allNodes;
	}
	public static void main(String[] args) {
		MyGraphdfs mygraph = new MyGraphdfs();
		Node m0 = new Node(0),  m1 = new Node(1),  m2 = new Node(2),  m3 = new Node(3);

		mygraph.addNode(m2);
		mygraph.addNode(m3);
		mygraph.addNode(m1);
		mygraph.addNode(m0);
		m0.getAdjacentNodes().add(m1);
		m0.getAdjacentNodes().add(m2);
		m1.getAdjacentNodes().add(m2);
		m2.getAdjacentNodes().add(m0);
		//m2.getToConnections().add(m3);
		m3.getAdjacentNodes().add(m3);
		System.out.println("Following is Depth First Traversal (starting from vertex 2)");
		System.out.println("Connected graph Traversal");
		mygraph.connectedGraph(m2);

		System.out.println();
		System.out.println("Disconnected graph Traversal");
		mygraph.disConnectedGraph(mygraph.getVertices());

	}
	public void connectedGraph(Node node) {
		DFS(node);
	}

	public void disConnectedGraph(List<Node> vertices) {
		for(Node vertex: vertices)
			DFS(vertex);
	}

    void DFS(Node v) {
		// Mark the current node as visited and print it
		v.setVisited(true);
		System.out.print(v.getVertex()+" ");
		for(Node n:v.getAdjacentNodes()) {
			if (!n.isVisited()){
				DFS(n);
			}
		}
		System.out.println("go back to old vertex from "  +v.getVertex());
	}
}

class Node{
	int vertex;
	boolean visited;
	List<Node> adjacentNodes;

	Node(int vert) {
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
	public List<Node> getAdjacentNodes() {
		if (adjacentNodes==null){
			adjacentNodes = new ArrayList<Node>();
		}
		return adjacentNodes;
	}

}