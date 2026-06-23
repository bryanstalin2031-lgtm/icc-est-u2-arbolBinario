package structures.trees;

import structures.node.Node;

public class Ejercicio2 {
    
    public void insert(int[] numeros) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int numero : numeros) {
            tree.insert(numero);
        }

        System.out.println("Imprimimos el arbol original");
        printTree(tree.getRoot(), 0);

        Node<Integer> invertido = invertTree(tree.getRoot());

        System.out.println("Imprimimos el arbol invertido");
        printTree(invertido, 0);
    }

    public void printTree(Node<Integer> actual, int nivel) {
        if (actual == null) {
            return;
        }
       
        printTree(actual.getRight(), nivel + 1);
        System.out.println("\t".repeat(nivel) + actual.getValue());
        printTree(actual.getLeft(), nivel + 1);
    }

    public Node<Integer> invertTree(Node<Integer> root) {
        invertRecursively(root);
        return root;
        
    }

    public void invertRecursively(Node<Integer> root) {
        if (root == null) {
            return;
        }
        
        Node<Integer> aux = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(aux);
        invertRecursively(root.getLeft());
        invertRecursively(root.getRight()); 
    }
}