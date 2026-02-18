# 🔧 IoT Debug Exercises — Exercise 9.3 & 9.5

> Bug analysis and defensive fixes for IoT Sensor Snapshot System and Micro-Inventory Unit.


---

## 📡 Exercise 9.3 — IoT Sensor Snapshot System

### Problem Summary

The original aggregation loop lacks defensive guards, causing a silent `ArithmeticException` on empty sensor arrays and printing a hardcoded misleading room label.

### Bugs Identified

| # | Bug | Impact |
|---|-----|--------|
| 1 | No empty-array / zero-count guard | `Division by Zero` at runtime |
| 2 | No null-entry check inside loop | `NullPointerException` on bad sensor data |
| 3 | Hardcoded label `"Average for Room A"` | Misleading output when reused for other rooms |

### Buggy Code

```java
double sum = 0;
int count = 0;

for (int i = 0; i < readings.length; i++) {
    sum += readings[i].value;
    count++;
}

double avg = sum / count;
System.out.println("Average for Room A: " + avg);
```


### Why the Label Was Misleading

The string `"Average for Room A"` is hardcoded, meaning:

- Reusing this method for **Room B, C, or any other room** still prints `"Room A"`
- In IoT systems handling **multiple zones**, this silently produces wrong output with no runtime error
- **Fix:** pass `roomName` as a parameter or read it from the sensor metadata


## Task

- Identify missing condition. 
- Correct the aggregation logic. 
- Explain why the output label is misleading.

---

## 📦 Exercise 9.5 — Micro-Inventory Unit

### Problem Summary

The `decreaseStock()` method performs no validation, allowing stock to go negative and accepting nonsensical input values like zero or negative quantities.

### Bugs Identified

| # | Bug | Impact |
|---|-----|--------|
| 1 | No check for `qty <= 0` | Stock can increase unintentionally |
| 2 | No check for `qty > stock` | Stock goes negative — invalid business state |

### Buggy Code

```java
public void decreaseStock(int qty) {
    stock = stock - qty;
}
```

---


### Decision Guide

| Context | Recommended Approach |
|---------|----------------------|
| Warehouse / B2B strict fulfillment | ✅ **Reject** |
| Retail / e-commerce flexible orders | ✅ **Partial Fulfillment** |
| IoT / Micro-Inventory embedded unit | ✅ **Reject** — predictable state is critical |

---

## Tasks

- Identify missing business rule. 
- Fix the method defensively. 
- Decide whether to reject or partially fulfill requests.