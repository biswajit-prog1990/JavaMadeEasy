package co.adobe.interview.questions.utility;

final class TreeNodes {
	private final int nodeValue;
	TreeNodes leftNode;
	TreeNodes rightNode;

	public TreeNodes(int nodeValue) {
		this.nodeValue = nodeValue;
	}

	public int getNodeValue() {
		return this.nodeValue;
	}
}

public class Util {

	private static Util utilObject = null;

	private Util() {
	}

	public static Util getInstance() {
		if (utilObject == null)
			utilObject = new Util();
		return utilObject;
	}

	private static TreeNodes createNodes(int nodeValue) {
		return new TreeNodes(nodeValue);
	}

	public static TreeNodes createHierarchy() {
		TreeNodes rootNode = createNodes(40);
		TreeNodes child1Left = createNodes(20);
		TreeNodes child1Right = createNodes(60);
		TreeNodes child11LeftLeft = createNodes(10);
		TreeNodes child11LeftRight = createNodes(30);
		TreeNodes child11RightLeft = createNodes(50);
		TreeNodes child11RightRight = createNodes(70);

		rootNode.leftNode = child1Left;
		rootNode.rightNode = child1Right;
		child1Left.leftNode = child11LeftLeft;
		child1Left.rightNode = child11LeftRight;
		child1Right.leftNode = child11RightLeft;
		child1Right.rightNode = child11RightRight;

		return rootNode;
	}

	public static void preOrderTraversal(TreeNodes treeNodes) {
		if (treeNodes != null) {
			System.out.print(treeNodes.getNodeValue() + " ");
			preOrderTraversal(treeNodes.leftNode);
			preOrderTraversal(treeNodes.rightNode);
		}
	}

	public static void inOrderTraversal(TreeNodes treeNodes) {
		if (treeNodes != null) {
			preOrderTraversal(treeNodes.leftNode);
			System.out.print(treeNodes.getNodeValue() + " ");
			preOrderTraversal(treeNodes.rightNode);
		}
	}

	public static void postOrderTraversal(TreeNodes treeNodes) {
		if (treeNodes != null) {
			preOrderTraversal(treeNodes.leftNode);
			preOrderTraversal(treeNodes.rightNode);
			System.out.print(treeNodes.getNodeValue() + " ");
		}
	}
}
