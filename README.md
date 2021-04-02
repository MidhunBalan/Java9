# Java9
1. What is JSHELL?
2. Basic idea of JSHELL
3. JPMS
4. JLINK
5. HTTP/2 Client
6. Process API
   https://github.com/MidhunBalan/Java9/blob/main/src/com/introduction/Example1.java
7. try with resource enhancement
8. Factory methods to create unmodifiable collections
9. Stream api enhancements
  default methods
   * takeWhile method
   * dropWhile method
  static methods
   * Stream.iterate()
   * Stream.ofNullable()
10. <> operator
11. SafeVar args Annotation
12. G1GC(Garbage First Garbage Collector)

 Types of garbage collectors in java
   * Serial GC 
   * Parallel GC
   * CMS GC
   * G1 GC(added in 1.6 version)
  
(Note: Until 1.8v Parallel GC was the default GC. But 1.9v onwrds G1 GC became the default GC)

===============================================================================================

***Private methods in interface

What is private method in interface?
From java 9, we are allowed to keep private methods to the interface. it was not available until java8. 

what is the use of private method inside an interface?
No need to override the method inside the implemented classes. 
