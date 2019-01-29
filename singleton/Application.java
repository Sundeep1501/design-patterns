public final class Application {

    // private constructor so that instances can not be created outside the class
    private Application() {

    }

    // Instance will be created on only when the first call is made to getInstance() method.
    private static class LazyHolder {

        // This avoids creating multiple instances.
        static final Application INSTANCE = new Application();
    }

    public static Application getInstance() {
        return LazyHolder.INSTANCE;
    }
}