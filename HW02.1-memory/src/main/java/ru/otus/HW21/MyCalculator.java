package ru.otus.HW21;

import java.util.function.Supplier;

class MyCalculator {
    private final Runtime runtime;
    private final int size;
    private final Object[] array;

    MyCalculator(int size) {
       runtime = Runtime.getRuntime();
       this.size = size;
       array = new Object[size];
    }
    private static long getMemorySize(Runtime runtime) {
        return runtime.totalMemory() - runtime.freeMemory();
    }
    long getObjectSize(Supplier<Object> supplier) {

        System.gc();
        Object[] array = new Object[size];

        long memBefore = getMemorySize(runtime);
        for (int j = 0; j < size; j++) {
            array[j] = supplier.get();
        }
        System.gc();
        long memAfter  = getMemorySize(runtime);

        clearArray(array);

        return (memAfter - memBefore) / size;
    }

    private void clearArray(Object[] arr) {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
    }
}
