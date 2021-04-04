class Test {
    public static void main(String[] args) {
        printTest();
        printSquash();
        int calculated = addOneNumberToAnother(1, 1);
        System.out.println(calculated);
    }

    private static void printTest() {
        System.out.println("gitflow test");
        System.out.println("important hotfix");
    }

    private static void printSquash() {
        System.out.println("commit 1");
        System.out.println("commit 2");
        System.out.println("commit 3");
    }

    private static int addOneNumberToAnother(int no1, int no2) {
        return no1 + no2;
    }
}
