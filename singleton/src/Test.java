public class Test {
    public static void main(String[] args) throws Exception {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println("Lazy : " + lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println("Lazy : " + lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println("Eager : " + eager);
        eager = SingletonEager.getInstancia();
        System.out.println("Eager : " + eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("Lazy Holder : " + lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("Lazy Holder : " + lazyHolder);

    }
}
