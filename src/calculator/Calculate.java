package calculator;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Calculate {
    List<Double> listadoNumeros1 = Arrays.asList();
    List<Double> listadoNumeros2 = Arrays.asList();


    public void suma( List<Double> listadoNumeros1, List<Double> listadoNumeros2){
        AtomicInteger contador = new AtomicInteger();
            listadoNumeros1.stream()
                .map(valor1-> {return valor1 + listadoNumeros2.get(contador.getAndIncrement());})
                .forEach(valor1 -> System.out.println(valor1));
  }

  public void resta(List<Double> listadoNumeros1, List<Double> listadoNumeros2){
      AtomicInteger contador = new AtomicInteger();
      listadoNumeros1.stream()
              .map(valor1-> {return valor1 - listadoNumeros2.get(contador.getAndIncrement());})
              .forEach(valor1 -> System.out.println(valor1));
  }
  public void potencia(){
      Stream.of(1,2,3,4,5)
              .filter(mul -> mul > 3)
              .peek(e -> System.out.println("La potencia es: "+e*e))

              .collect(Collectors.toList());
  }

  public void multi(List<Double> listadoNumeros1, List<Double> listadoNumeros2){
      AtomicInteger contador = new AtomicInteger();
      listadoNumeros1.stream()
              .map(valor1-> {return valor1 * listadoNumeros2.get(contador.getAndIncrement());})
              .forEach(valor1 -> System.out.println(valor1));

  }

  public void div(){
      Map<String, Integer> listadoMapper = Map.of("Jerry", 7, "Tom", 30);
      double divisor = 5;
      Map<String, Double> result = listadoMapper.entrySet().stream()
              .map(v -> new AbstractMap.SimpleEntry<>(v.getKey(), ((double) v.getValue() / divisor)))
              .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> y, LinkedHashMap::new));
      System.out.println("La division es: "+result);
  }

    public List<Double> getListadoNumeros1() {
        return listadoNumeros1;
    }

    public void setListadoNumeros1(List<Double> listadoNumeros1) {
        this.listadoNumeros1 = listadoNumeros1;
    }

    public List<Double> getListadoNumeros2() {
        return listadoNumeros2;
    }

    public void setListadoNumeros2(List<Double> listadoNumeros2) {
        this.listadoNumeros2 = listadoNumeros2;
    }
}
