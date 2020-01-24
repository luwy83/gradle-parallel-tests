### Running gradle tests in parallel

The build is setup to run maximum 8 parallel tests.

To run all tests with ParallelTest category execute:

```
./gradlew clean testBuild
```

To run all tests with OtherParallelTest category (identical as those with ParallelTest category) execute:

```
./gradlew clean testBuild -Pother
```

All 6 tests should run in parallel in both cases but they don't.
