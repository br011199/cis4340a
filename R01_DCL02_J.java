// ...

for (final Integer i: list) {
    Integer item = i;
    if (first) {
        first = false;
        item = new Integer(99);
    }
    System.out.println(" New item: " + item);
    // Process item
}

// ...