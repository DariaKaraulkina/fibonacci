public class Main {
    public static void main(String[] args) {
        fibonacci(0);
    }

    public static void fibonacci(int maxNumber) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        while (n0 + n1 <= maxNumber) {
            System.out.print(n0 + " " + n1 + " ");
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }

    public static void kassaEpta(String productEpta) {
        System.out.println("Берем в руки " + productEpta);
        System.out.println("Сканируем штрикод");
        System.out.println("Отображается цена в аппарате");
        System.out.println(productEpta + "пробили, ура!");
    }
}
