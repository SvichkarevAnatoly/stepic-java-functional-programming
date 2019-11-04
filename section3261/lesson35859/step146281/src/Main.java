import java.util.stream.Collectors;

class Main {
//Stepik code: start
Collectors.reducing(1, i -> i*i, (x, y) -> x*y)
//Stepik code: end
}