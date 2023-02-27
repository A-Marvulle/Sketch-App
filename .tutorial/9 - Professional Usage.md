# Professional Usage?

That was fun! But, how does this relate to *real* programming? 

Method calling is a tremendous part of real life programming. Here is an example section of code from a library called [Gson](https://github.com/google/gson/blob/818faeeaa2eb5b434710d76ab9c685d4285e4788/gson/src/main/java/com/google/gson/Gson.java#L881), developed by Google, and used by many Java developers.

```java
  public JsonWriter newJsonWriter(Writer writer) throws IOException {
    if (generateNonExecutableJson) {
      writer.write(JSON_NON_EXECUTABLE_PREFIX);
    }
    JsonWriter jsonWriter = new JsonWriter(writer);
    if (prettyPrinting) {
      jsonWriter.setIndent("  ");
    }
    jsonWriter.setHtmlSafe(htmlSafe);
    jsonWriter.setLenient(lenient);
    jsonWriter.setSerializeNulls(serializeNulls);
    return jsonWriter;
  }
```

This sample section of code has 10 lines, of which 5 of the lines have a method call. Those methods are displayed in a different color (`write`, `setIndent`, `setHtmlSafe`, etc.). Although you may not understand the rest of the code yet, you should be able to identify those are method calls just like you just learned!
