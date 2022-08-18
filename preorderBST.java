class Node {  
    public int value;  
    public Node left, right;  
  
    public Node(int element)  
    {  
        value = element;  
        left = right = null;  
    }  
}  
  
class PreorderTraversal {  
    Node root;  
  
    PreorderTraversal() { root = null; }  
  
    void traversePreorder(Node node)  
    {  
        if (node == null)  
            return;  
        System.out.print(node.value + " ");  
        traversePreorder(node.left);  
        traversePreorder(node.right);  
    }  
  
    void traversePreorder() { traversePreorder(root); }  
