## Order of Bean Factories for Spring Context

Two bean factories (`@Configuration`) defines the same bean.
One defines it without any conditions 
and another using `@ConditionalOnMissingBean`.

In this situation when these factories are being injected into
`@SpringBootApplication` via `@Import` it is important that bean factory 
with a condition goes before the one without a condition,
otherwise there will be a startup error. 
`PrimaryApp` has the only difference from `SecondaryApp` 
in `@Import` definition (order of classes).
Try to run `SecondaryApp` that works fine, and `PrimaryApp` that fails.

And the opposite situation happens for tests.
This time the bean factory without a condition must go first,
before the one with a condition.
`PrimaryTest` has the only difference from `SecondaryTest`
in the `@SpringBootTest(classes=...)` definition (order of classes). 
`PrimaryTest` works fine, but `SecondaryTest` fails.
