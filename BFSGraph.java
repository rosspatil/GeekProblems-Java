import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {

	Queue<Integer> queue;
	public BFSGraph(Graph graph,int s) {
		queue=new LinkedList<>();
		boolean visited[] = new boolean[6];

		// Mark the current node as visited and enqueue it
		visited[s]=true;
		queue.add(s);

		while (queue.size() != 0)
		{
			// Dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s+" ");

			for (Integer integer : graph.adl[s]) {
				if(!visited[integer]){
					visited[integer]=true;
					queue.add(integer);
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
		graph.add_edge(1, 3);
		graph.add_edge(2, 4);
		graph.add_edge(4, 3);
		
//		graph.add_edge( 1,0);
//		graph.add_edge( 2,1);
//		graph.add_edge( 0,2);
//		graph.add_edge( 4,1);
//		graph.add_edge( 3,2);
//		graph.add_edge( 5,4);
//		graph.add_edge(5,3);
//		graph.add_edge( 3,1);
//		graph.add_edge( 4,2);
//		graph.add_edge( 3,4);
		graph.printGraph();
		BFSGraph bfsGraph=new BFSGraph(graph, 0);
	}

}
