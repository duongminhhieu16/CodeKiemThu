```java
// Combine in 2 test when all clauses are false or true
thermo = new Thermostat();
settings = new ProgrammedSettings();
settings.setSetting (Period.MORNING, DayType.WEEKDAY, 69);
thermo.setPeriod (Period.MORNING);
thermo.setDay(DayType.WEEKDAY);

// Clause a: curTemp < dTemp - thresholdDiff : true
thermo.setCurTemp (63);
thermo.setThresholdDiff (5);
// Clause a: curTemp < dTemp - thresholdDiff : false
thermo.setCurTemp (66);
thermo.setThresholdDiff (5);

// Clause b: Override : true
thermo.setOverride (true);
// Clause b: Override : false
thermo.setOverride (false);

// Clause c: curTemp < overTemp - threshold : true
thermo.setOverTemp (72);
// Clause c: curTemp < overTemp - threshold : true
thermo.setOverTemp (67);

// Clause d: timeSinceLastRun.greaterThan (minLag): true
thermo.setMinLag (10);
thermo.setTimeSinceLastRun (12);
// Clause d: timeSinceLastRun.greaterThan (minLag): true
thermo.setMinLag (10);
thermo.setTimeSinceLastRun (8);

// Run the test
```