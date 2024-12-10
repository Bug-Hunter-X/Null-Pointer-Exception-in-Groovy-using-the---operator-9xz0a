```groovy
def calculate(a, b) {
  if (a == null || b == null) {
    return 0 // Or handle nulls appropriately 
  }
  return a + b
}

println calculate(5, null) // Returns 0
println calculate(5, 5) // Returns 10
```