# README
This project demonstrates polymorphism using the concept of geometric shapes.

## Background
For the area of a triangle we use Heron's formula.

Area $A = sqrt(s(s-a)(s-b)(s-b))$

Where semi-perimeter $s = 1/2(a+b+c)$

The triangle constructor assume equilateral sides, but can be manually defined with the `setA`, `setB`, and `setC`.

The rectangle constructor assumes a square, but can be manually defined with `setHeight` and `setWidth`.

The circle constructor assume a radius of 1, but can be manually defined with `setRadius` after initializing the object.

## Build
`./gradlew build`

## Test
`./gradlew test`

## Dependencies
- docker for dev containers
- gradle for build
- junit for test cases

**Note**: dependencyUpdates gradle plugin is disabled \
 uncomment to check for updates using `./gradlew dependencyUpdates`
