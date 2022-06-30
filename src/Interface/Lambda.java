package Interface;

public class Lambda {
    public static void main(String[] args) {
        Greeting greeting = n -> "Hello " + n;
        System.out.println(greeting.greet("Baxita"));
        Max max = (a, b) -> (a > b) ? a : b;
        System.out.println(max.max(6, 7));
        ABC abc = new ABC();
        System.out.println(abc.getInner().getData());


    }
}

@FunctionalInterface
interface Greeting {
    String greet(String name);
    class Generator{

    }
    interface Inner{
        String getData();

    }
}
class ABC implements Greeting{
    @Override
    public String greet(String name) {
        return null;
    }
    class InnerClass implements Greeting.Inner{
        @Override
        public String getData() {
            return "My Data";
        }
    }
    public InnerClass getInner(){
        return new InnerClass();

    }
}


interface Max {
    int max(int numa, int numb);
}
// Max max = (a,b)->{
//if (a>b){
//        return a;
//      }else{
//   return b;
//     }




