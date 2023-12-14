package exercises;

import java.util.*;
import java.util.stream.Collectors;

public class Element25Mais {

    public static void main(String[] args) {

        int[] array = {9057,13452,13452,13452,13452,13452,14141,14448,60395,95081};
        System.out.println(findSpecialInteger(array));
    }

    public static int findSpecialInteger(int[] arr) {

        Set<Integer> hs = new TreeSet<>();
        Arrays.stream(arr)
                .forEach(hs::add);

        List<Integer> data = new ArrayList<>();
        Arrays.stream(arr)
                .forEach(data::add);

        Map<Integer, List<Integer>> grupado = hs.stream()
                .collect(HashMap::new, (map, key) -> map.put(
                        key,
                        data.stream()
                                .filter(value -> value.equals(key))
                                .collect(Collectors.toList())
                ), HashMap::putAll);

        int i = grupado.entrySet().stream()
                                  .max(Comparator.comparingInt(e -> e.getValue().size()))
                                  .map(Map.Entry::getKey)
                                  .orElse(-1);
        System.out.println(grupado);

        return i;
    }
}
