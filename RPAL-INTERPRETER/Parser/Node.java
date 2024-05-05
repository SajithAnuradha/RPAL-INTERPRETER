package Parser;

public class Node {
	public String value;
	public NodeType type;
	public int noOfChildren;

	public Node(NodeType type, String value, int children) {
		this.type = type;
		this.value = value;
		this.noOfChildren = children;
	}
}
