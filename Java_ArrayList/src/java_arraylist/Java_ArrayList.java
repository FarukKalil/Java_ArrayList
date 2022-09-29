package java_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Java_ArrayList {

    public static void main(String[] args) {
        System.out.println("---------- ARRAYLIST ----------");
        //addDadosArrayList();
        //buscaNomeListaPorPosicao();
        //limpaListaClear();
        //limpaListaRemoveAll();
        //removeDadoLista();
        //atualizaDadoLista();
    }
    /*Adicionando dados em uma ArrayList */
    public static void addDadosArrayList(){
        // instanciando classe Arraylist
        System.out.println("---------- ARRAYLIST ----------");
        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("EducaCiencia FastCode");
        listaNome.add("CobraDev");
        System.out.println("Lista: " + Arrays.toString(listaNome.toArray()));
    }
    
    /* Buscando Nome na lista por posição */
    public static void buscaNomeListaPorPosicao() {
        System.out.println("---------- ARRAYLIST ----------");
        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("EducaCiencia FastCode");
        listaNome.add("CobraDev");
        System.out.println("Buscando nome da posição 1 " +  listaNome.get(1)); // buscando posição 1 = CobraDev
        System.out.println("Buscando nome da posição 0 " + listaNome.get(0));  // buscando posição 0 = Educa
    }
    
    /* limpando lista utilizando Clear */
    public static  void limpaListaClear() {
        System.out.println("---------- ARRAYLIST ----------");
        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("EducaCiencia FastCode");
        listaNome.add("CobraDev");
        System.out.println("Lista: " + Arrays.toString(listaNome.toArray()));
        System.out.println(" ***** removendo dados da lista *****");
        listaNome.clear();
        System.out.println("Lista Atualizada: " + Arrays.toString(listaNome.toArray()));
    }
    
    /* limpando lista utilizando RemoveAll */
    public static void limpaListaRemoveAll(){
        System.out.println("---------- ARRAYLIST ----------");
        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("EducaCiencia FastCode");
        listaNome.add("CobraDev");
        System.out.println("Lista: " + Arrays.toString(listaNome.toArray()));
        System.out.println(" ***** removendo dados da lista *****");
        listaNome.removeAll(listaNome); // removendo dados da lista
        System.out.println("Lista Atualizada: " + Arrays.toString(listaNome.toArray()));
    }
    
    /*excluindo dado da lista utilizando Remove*/
    public static void removeDadoLista() {
        System.out.println("---------- ARRAYLIST ----------");
        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("EducaCiencia FastCode");
        listaNome.add("CobraDev");
        System.out.println("Lista: " + Arrays.toString(listaNome.toArray()));
        System.out.println(" ***** removendo dados da lista *****");
        listaNome.remove("CobraDev"); // removendo CobraDev
        System.out.println("Lista Atualizada: " + Arrays.toString(listaNome.toArray()));
    }
    
    public static void atualizaDadoLista() {
        System.out.println("---------- ARRAYLIST ----------");
        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("EducaCiencia FastCode");
        listaNome.add("CobraDev");
        System.out.println("Lista: " + Arrays.toString(listaNome.toArray()));
        System.out.println(" ***** atualizando dado na lista *****");
        listaNome.set(listaNome.indexOf("EducaCiencia FastCode"), "EDUCACIENCIA FASTCODE"); // atualizado nome EducaCiencia fastcode para EDUCACIENCIA FASTCODE
        System.out.println("Lista Atualizada: " + Arrays.toString(listaNome.toArray()));
     }
}
