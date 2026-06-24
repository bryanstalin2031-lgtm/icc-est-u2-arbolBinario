package structures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import structures.node.Node;

public class Ejercicio3 {

    public void insert(int[] numeros) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int numero : numeros) {
            tree.insert(numero);
        }

        System.out.println("Imprimimos el arbol original");
        printTree(tree.getRoot(), 0);

        System.out.println("\nOutput:");
        List<List<Node<Integer>>> niveles = listLevels(tree.getRoot());
        
        for (List<Node<Integer>> nivel : niveles) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue());
                if (i < nivel.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

    public void printTree(Node<Integer> actual, int nivel) {
        if (actual == null) {
            return;
        }
       
        printTree(actual.getRight(), nivel + 1);
        System.out.println("\t".repeat(nivel) + actual.getValue());
        printTree(actual.getLeft(), nivel + 1);
    }

    public List<List<Node<Integer>>> listLevels(Node<Integer> root) {
        List<List<Node<Integer>>> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }
        
        Queue<Node<Integer>> cola = new LinkedList<>();
        cola.add(root); 

        while (!cola.isEmpty()) {
            int nivel = cola.size(); 
            
            List<Node<Integer>> lista = new LinkedList<>(); 

            for (int i = 0; i < nivel; i++) {
                Node<Integer> actual = cola.poll(); 
                lista.add(actual);        
                
                if (actual.getLeft() != null) {
                    cola.add(actual.getLeft());
                }
                if (actual.getRight() != null) {
                    cola.add(actual.getRight());
                }
            }
            result.add(lista);
        }

        return result;
    }
}