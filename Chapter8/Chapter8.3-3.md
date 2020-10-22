```java
// 6 tests

// Test 1 - TTFT - Major clause a is true.
thermo.setCurrentTemp (63);
thermo.setThresholdDiff (5);
thermo.setOverride (true);
thermo.setOverTemp (65);
thermo.setMinLag (10);
thermo.setTimeSinceLastRun (12);

// Test 2 - FTFT - Major clause a is false, major clause c is false.
thermo.setCurrentTemp (66);
thermo.setThresholdDiff (5);
thermo.setOverride (true);
thermo.setOverTemp (65);
thermo.setMinLag (10);
thermo.setTimeSinceLastRun (12);

// Test 3 - FTTT - Major clause b is true, major clause c is true.
thermo.setCurrentTemp (66);
thermo.setThresholdDiff (5);
thermo.setOverride (true);
thermo.setOverTemp (72);
thermo.setMinLag (10);
thermo.setTimeSinceLastRun (12);

// Test 4 - FFTT - Major clause b is false.
thermo.setCurrentTemp (66);
thermo.setThresholdDiff (5);
thermo.setOverride (false);
thermo.setOverTemp (70);
thermo.setMinLag (10);
thermo.setTimeSinceLastRun (12);

// Test 5 - TTTT - Major clause d is true.
thermo.setCurrentTemp (63);
thermo.setThresholdDiff (5);
thermo.setOverride (true);
thermo.setOverTemp (70);
thermo.setMinLag (10);
thermo.setTimeSinceLastRun (12);

// Test 6 - TTTF - Major clause d is false.
thermo.setCurrentTemp (63);
thermo.setThresholdDiff (5);
thermo.setOverride (true);
thermo.setOverTemp (70);
thermo.setMinLag (10);
thermo.setTimeSinceLastRun (8);
```