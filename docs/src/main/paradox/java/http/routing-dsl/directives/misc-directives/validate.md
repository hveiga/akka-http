<a id="validate-java"></a>
# validate

Allows validating a precondition before handling a route.

## Description

Checks an arbitrary condition and passes control to the inner route if it returns `true`.
Otherwise, rejects the request with a `ValidationRejection` containing the given error message.

## Example

TODO: Example snippets for JavaDSL are subject to community contributions! Help us complete the docs, read more about it here: [write example snippets for Akka HTTP Java DSL #218](https://github.com/akka/akka-http/issues/218).