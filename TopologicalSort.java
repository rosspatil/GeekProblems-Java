import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class TopologicalSort {
	
	private int v;
	private LinkedList<Integer> adj[];
	
	public TopologicalSort(int v) {
		this.v=v;
		adj=new LinkedList[v];
		for (int i = 0; i < adj.length; i++) {
			adj[i]=new LinkedList<>();
		}
	}
	
	public void add_edge(int m,int n){
		adj[m].add(n);
	}
	
	
	
	

	public static void main(String[] args) {
		TopologicalSort graph=new TopologicalSort(3);
		graph.add_edge(0, 1);
		graph.add_edge(1, 2);
		graph.add_edge(0, 2);
//		graph.add_edge(2, 0);
//		graph.add_edge(1, 4);
//		graph.add_edge(2, 3);
//		graph.add_edge(4, 5);
//		graph.add_edge(3, 5);
//		graph.add_edge(1, 3);
//		graph.add_edge(2, 4);
//		graph.add_edge(4, 3);
////		graph.sort(0);
//		graph.BFS(0);
		graph.DFS(0);
	}
	private void DFS(int s){
		Stack<Integer> stack=new Stack<>();
		boolean visited[]=new boolean[v];
		visited[s]=true;
		stack.push(s);
		Set<Integer> set=new HashSet<>();
		while(!stack.isEmpty()){
			s=stack.pop();
			set.add(s);
			System.out.print(s+" ");
			for(Integer i:adj[s]){
				if(set.contains(i)){
					System.err.println("Cycle is present");
				}
				if(!visited[i]){
					visited[i]=true;
					stack.push(i);
					set.add(i);
				}
			}
		}
	}
	
	private void BFS(int s){
		Queue<Integer> queue=new LinkedList<>();
		queue.add(s);
		boolean visited[]=new boolean[v];
		visited[s]=true;
		
		while(!queue.isEmpty()){
			s=queue.poll();
		
			System.out.print(s+" ");
			for (Integer integer : adj[s]) {
				
				if(!visited[integer]){
					visited[integer]=true;
					queue.add(integer);
					
				}
			}
		}
	}

	private void sort(int i) {
		Stack<Integer> stack=new Stack<>();
		boolean visited[]=new boolean[v];
		for (int j = 0; j < visited.length; j++) {
			visited[i]=false;
		}
		for (int j = 0; j < v; j++) {
			if(!visited[i]){
				toputils(i,visited,stack);
			}
		}
		for (int j = 0; j < visited.length; j++) {
			System.out.println(stack.pop());
		}
		
	}

	private void toputils(int i, boolean[] visited, Stack<Integer> stack) {

		visited[i]=true;
		for(Integer integer:adj[i]){
			if(!visited[integer]){
				toputils(integer, visited, stack);
			}
		}
		stack.push(i);
	}

}
