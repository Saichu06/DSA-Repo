boolean checkBST(Node root) {
    ArrayList<Integer> list = new ArrayList<>();
    inorder(root, list);
    return checkSorted(list);
}

void inorder(Node root, ArrayList<Integer> list) {
    if (root == null) return;

    inorder(root.left, list);
    list.add(root.data);
    inorder(root.right, list);
}

boolean checkSorted(ArrayList<Integer> list){
    for(int i=1;i<list.size();i++){
        if(list.get(i-1) >= list.get(i)){ // FIXED (>=)
            return false;
        }
    }
    return true;
}