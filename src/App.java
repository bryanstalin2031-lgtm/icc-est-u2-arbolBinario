import java.util.Random;
import java.util.Set;

import collections.maps.Maps;
import collections.set.Sets;
import models.Contacto;
import models.Person;
import structures.graphs.Graph;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.Ejercicio3;
import structures.trees.Ejercicio4;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {

        //runIntTree();
        //runPersonTree();
        //runEjercicios();
        //runEjercicios2();
        //runEjercicios3();
        //runEjercicios4();
        //runSets();
        //runMaps();
        runGraphs();
    }

    private static void runGraphs() {
        Graph<String> graph = new Graph<>();
        graph.add("A");
        graph.add("B");
        graph.add("C");
        graph.add("D");
        graph.add("J");
        
        graph.addEdge("D", "J");
        graph.addEdge("D", "C");
        graph.addEdgeUni("A", "B");
        graph.addEdgeUni("B", "C");
        graph.addEdgeUni("B", "D");
        graph.addEdgeUni("C", "A");

        graph.printGraph();

        
    }

    // private static void runMaps() {
    //     Maps maps = new Maps();
    //     maps.construirHashMap();
    // }
    // private static void runMaps() {
    //     Maps maps = new Maps();
    //     maps.construirLinkedHashMap();
    // }
    private static void runMaps() {
        Maps maps = new Maps();
        maps.construirTreeMap();
    }
    


    private static void runSets() {
        Sets sets = new Sets();
        //Primera implementacion: HashSet
        System.out.println("HashSet");
        Set<String> hashSet = sets.construirHasSet();
        System.out.println(hashSet);
        System.out.println("Tamaño: " + hashSet.size());
        System.out.println(hashSet.contains("F"));
        System.out.println("LinkedHashSet");
        Set<String> linkedHashSet = sets.construirLinkedHashSets();
        System.out.println(linkedHashSet);
        System.out.println("Tamaño: " + linkedHashSet.size());
        System.out.println(linkedHashSet.contains("B"));
        System.out.println("TreeSet");
        Set<String> treeSet = sets.construirTreeSet();
        System.out.println(treeSet);
        System.out.println("Tamaño: " + treeSet.size());
        System.out.println(treeSet.contains("B"));

        System.out.println("TreeSet");
        Set<Contacto> tCSet = sets.construirTreeSetConComparador();
        System.out.println(tCSet);
        System.out.println(tCSet.size());

        System.out.println("TreeSet");
        Set<Contacto> hCSet = sets.construirHashSetContactos();
        System.out.println(hCSet);
        System.out.println(hCSet.size());
    }


    private static void runEjercicios4() {
        Ejercicio4 ejercicio4 = new Ejercicio4();
        int[] numeros = new int[]{4,7,2,9,6,3,1};
        ejercicio4.insert(numeros);
    }

    private static void runEjercicios3() {
        Ejercicio3 ejercicio3 = new Ejercicio3();
        int[] numeros = new int[]{4,7,2,9,6,3,1};
        ejercicio3.insert(numeros);
    }

    private static void runEjercicios() {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[]{5,3,7,2,4,6,8};
        ejercicio1.insert(numeros);
    }
    private static void runEjercicios2() {
        Ejercicio2 ejercicio2 = new Ejercicio2();
        int[] numeros = new int[]{4,7,2,9,6,3,1};
        ejercicio2.insert(numeros);
    }

    private static void runPersonTree() {
        BinaryTree<Person> personTree = new BinaryTree<>();
        personTree.insert(new Person("Alice", 30));
        personTree.insert(new Person("Bob", 25));
        personTree.insert(new Person("Diego", 35));
        personTree.insert(new Person("Rafael", 35));
        personTree.insert(new Person("Ana", 35));

        personTree.inOrder();
    }

    private static void runIntTree() {
        IntTree arbolNumeros = new IntTree(); /// CLASE ARBOL

        // Node<Integer> node3 = new Node<>(30);
        // Node<Integer> node4 = new Node<>(40);
        // Node<Integer> node5 = new Node<>(50);

        // Node<Integer> root = arbolNumeros.getRoot();

        // root.setLeft(node2);
        // root.setRight(node3);

        // node2.setLeft(node4);
        // node4.setRight(node5);

        //// ERROR GENERA CLICLOS
        // node5.setLeft(root);

        arbolNumeros.insert(10);
        arbolNumeros.insert(5);
        arbolNumeros.insert(3);
        arbolNumeros.insert(8); /// INORDER 3, 5, 8, 10, 15, 20
        arbolNumeros.insert(20); /// POSTORDER 3 8 5 15 20 10
        arbolNumeros.insert(15); // ANCHURA O NIVELES: 10 5 20 3 8 15

        System.out.println("pre Order");

        arbolNumeros.preOrder();
        System.out.println();

        System.out.println("Pos Order");
        arbolNumeros.posOrder();
        System.out.println();

        System.out.println("In Order");
        arbolNumeros.inOrder();
        System.out.println();

        System.out.println("Niveles");
        arbolNumeros.niveles();
        System.out.println();
        System.out.println("Altura");
        System.out.println(arbolNumeros.altura());
        System.out.println();

        System.out.println("Peso");
        System.out.println(arbolNumeros.peso());
    }
    private static void runIntComparativaPesos() {
        IntTree tree = new IntTree();
        Random random = new Random();

        final int TOTAL_NODOS = 50_000;
        final int MIN = 1;
        final int MAX = 50_000;

        // Insertar 50 000 números aleatorios entre 1 y 50 000
        for (int i = 0; i < TOTAL_NODOS; i++) {
            int value = random.nextInt(MAX - MIN + 1) + MIN;
            tree.insert(value);
        }

        // Medir peso con variable acumulada
        long inicioPesoVariable = System.nanoTime();

        int pesoVariable = tree.getPeso();

        long finPesoVariable = System.nanoTime();

        double tiempoPesoVariableMs = (finPesoVariable - inicioPesoVariable) / 1_000_000.0;

        // Medir peso recursivo
        long inicioPesoRecursivo = System.nanoTime();

        int pesoRecursivo = tree.peso();

        long finPesoRecursivo = System.nanoTime();

        double tiempoPesoRecursivoMs = (finPesoRecursivo - inicioPesoRecursivo) / 1_000_000.0;

        // Resultados
        System.out.println("Cantidad de nodos insertados: " + TOTAL_NODOS);
        System.out.println("Peso usando variable: " + pesoVariable);
        System.out.println("Peso usando recursion: " + pesoRecursivo);

        System.out.println();

        System.out.println("Tiempo getPeso(): "
                + tiempoPesoVariableMs + " ms");

        System.out.println("Tiempo pesoRecursivo(): "
                + tiempoPesoRecursivoMs + " ms");
    }
}
