import java.util.Stack;

public class DFSGraph {

	public DFSGraph(Graph graph,int s) {
		Stack<Integer> stack=new Stack<>();
		boolean visited[]=new  boolean[6];
		visited[s]=true;
		stack.push(s);
		while(!stack.isEmpty()){
			s=stack.pop();
			System.out.print(s+" ");
			for (Integer i : graph.adl[s]) {
				if(!visited[i]){
					visited[i]=true;
					stack.push(i);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Graph graph=new Graph(6);
		graph.add_edge(0, 1);
		graph.add_edge(1, 2);
		graph.add_edge(2, 0);
		graph.add_edge(1, 4);
		graph.add_edge(2, 3);
		graph.add_edge(4, 5);
		graph.add_edge(3, 5);
		graph.add_edge(2, 4);
		graph.add_edge(4, 3);
		
//		graph.add_edge( 1,0);
//		graph.add_edge( 2,1);
//		graph.add_edge( 0,2);
//		graph.add_edge( 4,1);
//		graph.add_edge( 3,2);
//		graph.add_edge( 5,4);
//		graph.add_edge(5,3);
//		graph.add_edge( 4,2);
//		graph.add_edge( 3,4);
		graph.printGraph();
		DFSGraph dfsGraph=new DFSGraph(graph, 0);
	}
}
