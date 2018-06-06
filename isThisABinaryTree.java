/*To check if a given tree is binary tree or not;
Hidden stub code will pass a root argument to the function below.
Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    List<Integer> list = new ArrayList<>();
    public void inOrderTraversal(Node node){
        if(node == null){
            return;
        }
        inOrderTraversal(node.left);
        list.add(node.data);
        inOrderTraversal(node.right);
    }
    boolean checkBST(Node root) {
        inOrderTraversal(root); 
        for(int i = 1; i < list.size(); i++) {
			if(list.get(i) <= list.get(i-1)) {
				return false;
			}
		}
		return true;
    }
