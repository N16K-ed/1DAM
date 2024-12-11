public class Main {
    public static void main(String[] args) {
        System.out.println(randoms1());
        System.out.println(randoms2());
        System.out.println(randoms3());
        System.out.println(randoms4());
    }
    private static int randoms1(){
        return (int) (Math.random() * 62) + 4;
    }

    private static int randoms2(){
        return (int) (Math.random() * 18) + 10;
    }

    private static int randoms3(){
        return (int) (Math.random() * 901) + 100;
    }

    private static int randoms4(){
        return (int) (Math.random() * 218) + 164;
    }

}