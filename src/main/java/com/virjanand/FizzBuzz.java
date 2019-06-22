package main.java.com.virjanand;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public List<Integer> getNumbers(int i) {
        return IntStream.rangeClosed(1, i)
                .boxed()
                .collect(Collectors.toList());
    }
}
