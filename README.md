# Java Optionals

## Overview

This repository contains my learning and practice on **Optional in Java**.

I learned how Optional can be used to represent a value that may be **present or absent**, and how it can help us handle possible missing values without directly working with `null`.

## Learning Objectives

The main objectives of this module were to:

* Understand what `Optional` is
* Understand the problem with `null` and `NullPointerException`
* Know when to use `Optional`
* Learn how to create an `Optional`
* Learn how to retrieve and transform values
* Understand the difference between `map()` and `flatMap()`
* Practice handling values that may be absent

## What I Learned

### 1. `Optional`

`Optional` is a Java class used to represent a value that can be present or absent.

An `Optional` can contain:

```text
A value
```

or:

```text
Optional.empty()
```

### 2. `Optional.of()`

`of()` is used when I am sure that the value is not `null`.

```java
Optional<String> name = Optional.of("John");
```

If the value passed to `of()` is `null`, it throws a `NullPointerException`.

### 3. `Optional.ofNullable()`

`ofNullable()` is useful when the value may be `null`.

```java
Optional<String> name = Optional.ofNullable(possibleName);
```

If the value exists:

```text
Optional["John"]
```

If the value is `null`:

```text
Optional.empty()
```

### 4. `map()`

`map()` is used to transform the value inside an Optional when the value is present.

For example:

```java
Optional<String> name = Optional.of("john");

Optional<String> result = name.map(String::toUpperCase);
```

Result:

```text
Optional["JOHN"]
```

If the Optional is empty, `map()` does not perform the transformation and the result remains empty.

### 5. `filter()`

`filter()` allows me to keep a value only if it satisfies a condition.

For example:

```java
Optional<String> name = Optional.of("John");

name.filter(n -> n.length() > 3);
```

If the condition is false, the result becomes an empty Optional.

### 6. `orElse()`

`orElse()` provides a default value when the Optional is empty.

```java
Optional<String> name = Optional.empty();

String result = name.orElse("Unknown");
```

Result:

```text
Unknown
```

If the Optional contains a value, that value is returned instead.

### 7. `orElseGet()`

`orElseGet()` is similar to `orElse()`, but it receives a function that creates the default value when the Optional is empty.

```java
optional.orElseGet(() -> createDefaultValue());
```

The function is executed only when the Optional does not contain a value.

### 8. `orElseThrow()`

`orElseThrow()` is useful when the absence of a value should be treated as an error.

```java
Optional<User> user = userRepository.findById(id);

User result = user.orElseThrow();
```

If the user exists, the user is returned.

If the Optional is empty, an exception is thrown.

### 9. `get()`

`get()` directly retrieves the value contained in the Optional.

```java
Optional<String> name = Optional.of("John");

String result = name.get();
```

However, if the Optional is empty:

```java
Optional.empty().get();
```

it throws a `NoSuchElementException`.

Therefore, I learned that `get()` should generally be avoided when there are safer alternatives such as `orElse()` or `orElseThrow()`.

### 10. `map()` vs `flatMap()`

One important difference I learned is:

```text
map()      → used when the function returns a normal value
flatMap()  → used when the function already returns an Optional
```

For example, if:

```java
Optional<Address> getAddress()
```

already returns an Optional, using `map()` can produce:

```java
Optional<Optional<Address>>
```

Using `flatMap()` avoids this extra Optional:

```java
Optional<Address>
```

## Optional as a Method Return Type

Optional is mainly useful as a **method return type** when a method may not have a value to return.

For example:

```java
Optional<User> findUserById(Long id);
```

This tells the code using the method that the user may exist or may not exist.

## Optional as a Field

I also learned that Optional is generally not recommended as a class field.

Instead of:

```java
private Optional<String> nickname;
```

we can normally keep:

```java
private String nickname;
```

and return an Optional from the getter:

```java
public Optional<String> getNickname() {
    return Optional.ofNullable(nickname);
}
```

Optional is therefore mainly used to communicate that a **method result may be absent**.

## Main Example

One of the examples I practiced was an `Address` that may or may not have a city.

```java
String city = Optional.ofNullable(address)
        .map(Address::getCity)
        .map(String::toUpperCase)
        .orElse("UNKNOWN CITY");
```

The process is:

```text
Address
   ↓
ofNullable()
   ↓
Optional<Address>
   ↓
map(getCity)
   ↓
Optional<String>
   ↓
map(toUpperCase)
   ↓
Optional<String>
   ↓
orElse()
   ↓
String
```

This example helped me understand how several Optional methods can be combined to safely handle a value that may be absent.

## Practice

The exercises in this repository cover:

* Creating Optionals
* `of()`
* `ofNullable()`
* `empty()`
* `map()`
* `filter()`
* `orElse()`
* `orElseGet()`
* `orElseThrow()`
* `get()`
* `flatMap()`
* Handling `null`
* Understanding good and bad uses of Optional

## Key Takeaways

The main things I learned are:

```text
of()          → value must not be null
ofNullable()  → value may be null
empty()       → represents an empty Optional
map()         → transforms a normal value
flatMap()     → works with a function that returns Optional
filter()      → keeps a value if a condition is true
orElse()      → provides a default value
orElseGet()   → creates the default value only when needed
orElseThrow() → throws an exception when empty
get()         → directly retrieves the value, but can throw NoSuchElementException
```

## What I Practiced

Through these exercises, I focused not only on learning the syntax of Optional, but also on understanding **why and when each method should be used**.
