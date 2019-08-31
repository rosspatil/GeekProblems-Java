
import java.util.*;

class TrieNode 
{
	String data; 
	boolean isEnd; 
	int count;  
	LinkedList<TrieNode> childList; 

	/* Constructor */
	public TrieNode(String c)
	{
		childList = new LinkedList();
		isEnd = false;
		data = c;
		count = 0;
	}  
	public TrieNode getChild(String c)
	{
		if (childList != null)
			for (TrieNode eachChild : childList)
				if (eachChild.data.equals(c))
					return eachChild;
		return null;
	}
}

public class TrieDataStructure
{
	private TrieNode root;
	private static StringBuffer result=new StringBuffer();
	private static StringBuffer tmp=new StringBuffer();

	/* Constructor */
	public TrieDataStructure()
	{
		root = new TrieNode(" "); 
	}
	/* This function is used to insert a word in trie*/
	public void insert(String word)
	{
		if (search(word) == true) 
			return;        
		TrieNode current = root; 
		
		String[] tokens=word.split("[>]");
		
		for (String ch : tokens )
		{
			TrieNode child = current.getChild(ch);
			if (child != null)
				current = child;
			else 
			{
				// If child not present, adding it io the list
				current.childList.add(new TrieNode(ch));
				current = current.getChild(ch);
			}
			current.count++;
		}
		current.isEnd = true;
	}
	/* This function is used to search a word in trie*/
	public boolean search(String word)
	{
		boolean found=false;
		TrieNode current = root;  
		for (String ch : word.split("[>]") )
		{
			if (current.getChild(ch) == null)
				return false;
			else{
				current = current.getChild(ch);
				found=true;
			}
		}      
		if (current.isEnd == true || found) 
			return true;
		return false;
	}
	
	public static String printWord(TrieNode root,String s){
		
		TrieNode current = root;
		if(root.childList==null || root.childList.size()==0){
			return result.toString() ;
		}else{
			result.append(s);
			return printWord(current.getChild(s), s);
		}
	}
	

	public static void printAllWordsInTrie(TrieNode root,String s)
	{
		TrieNode current = root;
		if(root.childList==null || root.childList.size()==0){
			return ;
		}
		for(TrieNode trieNode:current.childList){
			result=new StringBuffer();
			printWord(trieNode, trieNode.data);			
		}

	}
	public static void main(String[] args)
	{            
		TrieDataStructure t = new TrieDataStructure();       
		t.insert("dear>hello");
		t.insert("dear>hi");
		t.insert("hello>dear");
		t.insert("hi>dear");
		t.insert("good morning");

		System.out.println("dear>hi present in trie : "+t.search("dear>hi"));
		System.out.println("dear>hello present in trie : "+t.search("dear>hello"));
		System.out.println("dear present in trie : "+t.search("dear"));
		System.out.println("========================");
		System.out.println("Printing all word present in trie : ");
//		printAllWordsInTrie(t.root,"");              
	}
}