# FizzBuzz kata by using Streams

Try to use as many elements of streams as possible
- IntStream
- map
- filter
- reduce
- collect
- flatmap

# To do
- [x] test: 15 -> list of integers 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
- [x] refactor: rewrite to IntStream
- [x] refactor: suggestion IntelliJ use boxed instead of mapToObject(Integer::valueOf)
- [x] refactor: parameter name
- [x] test: 15 -> list of strings 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
- [ ] test: 15 -> list of strings 1, 2, FIZZ, 4, 5, FIZZ, 7, 8, FIZZ, 10, 11, FIZZ, 13, 14, FIZZ
- [ ] test: 15 -> list of strings 1, 2, FIZZ, 4, BUZZ, FIZZ, 7, 8, FIZZ, BUZZ, 11, FIZZ, 13, 14, FIZZBUZZ