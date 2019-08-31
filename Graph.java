import java.util.LinkedList;

public class Graph {

	private int V;
	public LinkedList<Integer> adl[];
	
	public Graph(int V) {
		this.V=V;
		adl=new LinkedList[V];
		for (int i = 0; i < V; i++) {
			adl[i]=new LinkedList();
		}
	}
	
	public void add_edge(int m, int n){
		adl[m].add(n);
	}
	public void printGraph(){
		for (int i = 0; i < adl.length; i++) {
			System.out.print(i+": ");
			for (Integer integer : adl[i]) {
				System.out.print(integer+"->");
			}
			System.out.println("Null");
		}
	}
	
	public static void main(String[] args) {
		Graph graph=new Graph(3);
		graph.add_edge(0, 1);
		graph.add_edge(1, 2);
		graph.add_edge(2, 1);
		graph.printGraph();
	}
}
