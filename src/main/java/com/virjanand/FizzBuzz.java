package main.java.com.virjanand;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public List<String> getNumbers(int maxNumber) {
        return IntStream.rangeClosed(1, maxNumber)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
    }
}
