# Professional Usage?

We made two variables to store an x and a y value. How big of a deal is storing data like this in a *real* program? 

The majority of programming ends up being holding onto data, retrieving the contents, and updating that data for later. Variables will be used in every program and will be scattered all throughout. Pro tip: you can name variables anything you wish, but using an easily recognizable name makes code easier to read and work with! 

The following segment of code comes from an [Amazon AWS library](https://github.com/aws/aws-sdk-java/blob/a7193abef2297021d31a6ef20919a361adc6708a/aws-java-sdk-account/src/main/java/com/amazonaws/services/account/model/AlternateContact.java#L36) to store the alternate contact information of a user. Comments have been removed to reduce how much you see here.

```java
public class AlternateContact implements Serializable, Cloneable, StructuredPojo {

    private String alternateContactType;
    private String emailAddress;
    private String name;
    private String phoneNumber;
    private String title;
```

Notice how these variables are all storing `String` values, which are words/phrases instead of `int` values. If it was decided a contact should also include their age, then you may have seen the following: 
```java
    private int age;
```

