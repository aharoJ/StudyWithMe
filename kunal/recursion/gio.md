
Well, you would add the offset

[1, 2, 3, 4] middle is 2 ((4 - 1) / 2 => 1)
If you wanna be fancy:
```java
int[] arr = new int[...];
int middle = (arr.length - (arr.length % 2)) / 2
```

But we as engineers know that fancy != best cost
So we make it easier

```java
int[] arr = new int[...];
int middle;

// If even, choose middle left (offset by 1)
if (arr.length % 2 == 0) {
  middle = (arr.length - 1) / 2;
// Otherwise, choose the exact middle
} else {
  middle = arr.length / 2;
}
```