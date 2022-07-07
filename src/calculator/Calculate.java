package calculator;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Calculate {
  public void suma(){
      Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
              .filter(i -> i % 2 == 0)
              .skip(3)
              .forEach(i -> System.out.println("La suma es: "+(i+i)));
      System.out.println("");
  }

  public void resta(){
      List<Integer> gastos= new ArrayList<Integer>();

      int total=0;
      gastos.add(-100);
      gastos.add(200);
      gastos.add(300);

      for(int gasto : gastos) {

          total+=gasto;
      }

      System.out.println("La resta es: "+total);
  }
  public void potencia(){
      Stream.of(1,2,3,4,5)
              .filter(mul -> mul > 3)
              .peek(e -> System.out.println("La potencia es: "+e*e))

              .collect(Collectors.toList());

  }

  public void multi(){
      List<Integer> listOfIntegers = new ArrayList<>();
      listOfIntegers.addAll(Arrays.asList(7,5));
      listOfIntegers.stream().mapToInt(a -> a).sum();
      Integer mul = listOfIntegers.stream().reduce(1, (a, b) -> a * b);
      System.out.println(mul);

  }

  public void div(){
      Map<String, Integer> listadoMapper = Map.of("Jerry", 7, "Tom", 30);
      double divisor = 5;
      Map<String, Double> result = listadoMapper.entrySet().stream()
              .map(v -> new AbstractMap.SimpleEntry<>(v.getKey(), ((double) v.getValue() / divisor)))
              .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> y, LinkedHashMap::new));
      System.out.println(result);
  }

}
