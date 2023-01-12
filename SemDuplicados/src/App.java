import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Fruit> array1 = new ArrayList<>();
        List<Fruit> array2 = new ArrayList<>();

        array1.add(new Fruit("limão", "verde"));
        array1.add(new Fruit("abacaxi", "amarelo"));
        array1.add(new Fruit("morango", "vermelho"));
        array1.add(new Fruit("laranja", "laranja"));
        array1.add(new Fruit("uva", "roxo"));

        array2.add(new Fruit("uva", "roxo"));
        array2.add(new Fruit("pêssego", "rosa"));
        array2.add(new Fruit("côco", "marrom"));
        array2.add(new Fruit("morango", "vermelho"));
        array2.add(new Fruit("banana", "amarelo"));
        array2.add(new Fruit("abacaxi", "amarelo"));

        semDuplicados(array1, array2);

    }

    private static void semDuplicados(List<Fruit> fruitList1, List<Fruit> fruitList2) {

        for (int i = 0; i < fruitList1.size(); i++) {
            Fruit currentFruit = fruitList1.get(i);
            if (fruitList2.stream().anyMatch(f -> f.name.equals(currentFruit.name))) {
                System.out.println(
                        "A fruta " + currentFruit.name + " encontrada na lista 1 também existe na lista 2 ");
            }
        }
    }
}
