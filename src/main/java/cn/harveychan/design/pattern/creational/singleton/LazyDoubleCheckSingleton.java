package cn.harveychan.design.pattern.creational.singleton;

public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    // 1.分配内存给这个对象
                    // 2.初始化对象
                    // 3.设置lazyDoubleCheckSingleton指向刚分配的对象
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
