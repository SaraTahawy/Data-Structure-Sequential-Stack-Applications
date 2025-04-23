# 🧱 Stack Applications in Java

This project is a Lab Assignment that demonstrates two classic stack-based applications implemented in **Java**
using the **sequential (array-based) stack paradigm**.

---

## 📚 Contents

### ✅ Part One: Balanced Parenthesis Check

This module checks whether a given string of parentheses is **balanced**.  
It supports the following types of brackets:

- Round `()`
- Curly `{}`  
- Square `[]`

#### ✅ Features:
- Manual implementation of stack operations:
  - `create()` – initialize an empty stack
  - `push()` – add element to the top
  - `pop()` – remove top element
  - `isEmpty()` – check if stack is empty
  - `isFull()` – check if stack is full
- Supports up to 80 characters input
- Gives feedback on valid/invalid parentheses

#### 🧪 Sample Input:
```
Input: {[()]} → Output: Balanced  
Input: {(])} → Output: Not Balanced
```

---

### 🔁 Part Two: String Inversion

This module takes any string (alphanumeric, symbols, etc.) and returns its **reversed** form using the stack.

#### ✅ Features:
- Uses the same stack implementation from Part One
- Handles:
  - Letters
  - Numbers
  - Special characters

#### 🧪 Sample Input:
```
Input: 123456789 → Output: 987654321
```

---

## 🧰 Technologies Used

- Language: **Java**
- Data Structure: **Array-based Stack**

---

## 🗂 Project Structure

```
.
├── Stack.java          # Stack class with push/pop/isEmpty/isFull
├── ParenthesisChecker.java   # Uses stack to check balanced parentheses
├── StringInverter.java       # Uses stack to reverse a string
├── README.md
```

---
