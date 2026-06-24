package structures.trees;


import structures.node.Node;

public class Ejercicio4 {
    public void insert(int[] numeros) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int numero : numeros) {
            tree.insert(numero);
        }

        System.out.println("Imprimimos el arbol original");
        printTree(tree.getRoot(), 0);

        int profundidad = maxDepth(tree.getRoot());
        System.out.println("La profundidad es : " + profundidad); 
    }

    public void printTree(Node<Integer> actual, int nivel) {
        if (actual == null) {
            return;
        }
       
        printTree(actual.getRight(), nivel + 1);
        System.out.println("\t".repeat(nivel) + actual.getValue());
        printTree(actual.getLeft(), nivel + 1);
    }
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(root.getLeft());
            int rightDepth = maxDepth(root.getRight());
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }
}
