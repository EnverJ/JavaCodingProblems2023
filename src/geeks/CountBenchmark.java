package geeks;

import java.util.List;

public class CountBenchmark {
    private List<Integer> list;

    @Param({"1", "1000", "1000000"})
    private int size;

    @Setup
    public void setup() {
        list = IntStream.range(0, size)
                .boxed()
                .collect(toList());
    }

    @Benchmark
    public long listSize() {
        return list.size();
    }

    @Benchmark
    public long listStreamCount() {
        return list.stream().count();
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(CountBenchmark.class.getSimpleName())
                .mode(Mode.Throughput)
                .threads(Threads.MAX)
                .forks(1)
                .warmupIterations(5)
                .measurementIterations(5)
                .build();

        new Runner(opt).run();

    }
}
