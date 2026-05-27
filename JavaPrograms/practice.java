## Arithmetic Operators in Java

Arithmetic operators are used to perform mathematical calculations.

| Operator | Meaning             | Example |
| -------- | ------------------- | ------- |
| `+`      | Addition            | `a + b` |
| `-`      | Subtraction         | `a - b` |
| `*`      | Multiplication      | `a * b` |
| `/`      | Division            | `a / b` |
| `%`      | Modulus (Remainder) | `a % b` |

---

## Example Program

```java id="ao1"
class ArithmeticOperator {
    public static void main(String args[]) {

        int a = 10;
        int b = 5;

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));
    }
}
```

---

## Output

```text id="ao2"
Addition = 15
Subtraction = 5
Multiplication = 50
Division = 2
Modulus = 0
```

---

## Explanation

* `+` adds numbers
* `-` subtracts numbers
* `*` multiplies numbers
* `/` divides numbers
* `%` gives remainder after division

Learn more:

* [Oracle Java Operators Tutorial](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html?utm_source=chatgpt.com)
