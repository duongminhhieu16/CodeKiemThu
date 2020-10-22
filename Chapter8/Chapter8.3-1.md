```java
// Test predicate = true
thermo = new Thermostat();
settings = new ProgrammedSettings();
settings.setSetting (Period.MORNING, DayType.WEEKDAY, 69);
thermo.setPeriod (Period.MORNING);
thermo.setDay(DayType.WEEKDAY);

// Clause a: curTemp < dTemp - thresholdDiff : true
thermo.setCurrentTemp (63);
thermo.setThresholdDiff (5);

// Clause b: Override : true
thermo.setOverride (true);

// Clause c: curTemp < overTemp - threshold : true
thermo.setOverTemp (70);

// Clause d: timeSinceLastRun.greaterThan (minLag): true
thermo.setMinLag (10);
thermo.setTimeSinceLastRun (12);

// Run the test
assertTrue (thermo.turnHeaterOn (settings));
```

```java
// Test predicate = false
thermo = new Thermostat();
settings = new ProgrammedSettings();
settings.setSetting (Period.MORNING, DayType.WEEKDAY, 69);
thermo.setPeriod (Period.MORNING);
thermo.setDay(DayType.WEEKDAY);

// Clause a: curTemp < dTemp - thresholdDiff : true
thermo.setCurrentTemp (63);
thermo.setThresholdDiff (5);

// Clause b: Override : true
thermo.setOverride (true);

// Clause c: curTemp < overTemp - threshold : true
thermo.setOverTemp (70);

// Clause d: timeSinceLastRun.greaterThan (minLag): false
thermo.setMinLag (10);
thermo.setTimeSinceLastRun (9);

// Run the test
assertFalse (thermo.turnHeaterOn (settings));
```