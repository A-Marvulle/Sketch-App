# Professional Usage?

That was fun! But, how does this relate to *real* programming? 

Although not every method generates a result it is important to use the results from those which do. Here is an example section of code from a library called [TreeMap](https://github.com/eagle518/jdk-source-code/blob/91b771140de051fb843af246ab826dd6ff688fe3/jdk5.0_src/j2se/src/share/classes/java/util/TreeMap.java#L168), which is directly built into the Java environment.

```java
    public TreeMap(SortedMap<K, ? extends V> m) {
        comparator = m.comparator();
        try {
            buildFromSorted(m.size(), m.entrySet().iterator(), null, null);
        } catch (java.io.IOException cannotHappen) {
        } catch (ClassNotFoundException cannotHappen) {
        }
    }
```

The `comparator` method is generating a result which is used to give comparator a value. The `buildFromSorted` method apparently required four separate values to be passed in. The first of those values are results from the `size` method and the second is actually a double result, first from the `entrySet` method then from the `iterator` method!

Please, do not feel overwhelmed looking at this code. There are many more things to learn! The goal here was to see that results from method calls are actually used quite often.
