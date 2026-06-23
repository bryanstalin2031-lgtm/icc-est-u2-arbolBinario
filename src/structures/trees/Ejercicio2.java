package structures.trees;

import structures.node.Node;

public class Ejercicio2 {
     public void insert(int[] numeros){
        //crear un arbol BTS - instanciar BinaryTree
        //Insertar los numeros en el arbol
        //Imprimir el arbol
       BinaryTree<Integer> tree = new BinaryTree<>();
       for(int numero : numeros){
        tree.insert(numero);
       }
       invertTree(tree.getRoot());           
    
    }
    
    
    public Node<Integer> invertTree(Node<Integer> root){
        invertRecursively(root);
        return root;
    
    //imprimir  el árbol original
    //printTree(root);
    
    
    
        
    }
    private void invertRecursively(Node<Integer> root){
        if(root == null){
            return;
        }
        Node <Integer>  aux = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(aux);
        invertRecursively(root.getLeft());
        invertRecursively(root.getRight()); 
    }
    //imprimir el árbol invetido
    //printTee(root)
}
