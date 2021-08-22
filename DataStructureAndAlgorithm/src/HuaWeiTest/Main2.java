package HuaWeiTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a.so:f1 N,f2 N,f3 Y,f4 N;b.so:f4 Y,f5 N
		//OUT:a.so:f1,f2;b.so:f5
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] files = str.split(";");
		List<FileNode> outList = new ArrayList<>();
		Set<String> n_nodes = new HashSet<>();
		Set<String> y_nodes = new HashSet<>();
		for(String file : files)
		{
			handleFile(file,outList,n_nodes,y_nodes);
		}
		System.out.println(n_nodes.toString());
		System.out.println(y_nodes.toString());
		for(String node : n_nodes)
		{
			if(y_nodes.contains(node))
			{
				removeNodeFromFileNodes(outList,node);
			}
		}
		StringBuilder sb = new StringBuilder("OUT:");
		if(outList.size() > 0)
		{
			int i = 0;
			for(;i < outList.size() - 1;i++)
			{
				getFileOutString(outList.get(i),sb);
				sb.append(";");
			}
			getFileOutString(outList.get(i),sb);
		}
		System.out.println(sb.toString());
	}
	
	private static class FileNode{
		private String fileName;
		private List<String> nodes;
		
		public FileNode()
		{
			
		}
	}
	
	private static void handleFile(String file,List<FileNode> outList,Set<String> n_nodes,Set<String> y_nodes)
	{
		String[] strs = file.split(":");
		String[] notes = strs[1].split(",");
		StringBuilder sb = new StringBuilder(strs[0]+":");
		boolean has = false;
		FileNode fileNode = new FileNode();
		fileNode.fileName = strs[0];
		List<String> nodes = new ArrayList<>();
		for(String note : notes)
		{;
			String[] strs2 = note.split(" ");
			if(strs2[1].equals("N"))
			{
				nodes.add(strs2[0]);
				n_nodes.add(strs2[0]);
				has = true;
			}else {
				y_nodes.add(strs2[0]);
			}
		}
		if(has)
		{
			fileNode.nodes = nodes;
			outList.add(fileNode);
		}
	}
	
	private static void removeNodeFromFileNodes(List<FileNode> outList,String node)
	{
		for(FileNode fileNode : outList)
		{
			for(int i = fileNode.nodes.size()-1;i >= 0;i--)
			{
				if(fileNode.nodes.get(i).equals(node))
				{
					fileNode.nodes.remove(i);
				}
			}
		}
	}
	
	private static void getFileOutString(FileNode fileNode,StringBuilder sb)
	{
		if(fileNode.nodes.size() >= 0)
		{
			sb.append(fileNode.fileName+":");
			int j = 0;
			for(;j < fileNode.nodes.size() - 1;j++)
			{
				sb.append(fileNode.nodes.get(j)+",");
			}
			sb.append(fileNode.nodes.get(j));
		}
	}

}
