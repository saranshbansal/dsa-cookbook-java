# Design Patterns Summary

## 1. Adapter Pattern
**File:** [AdaptorPattern.java](cci:7://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/AdaptorPattern.java:0:0-0:0)  
**Type:** Structural  
**Intent:** Allows incompatible interfaces to work together.  
**Summary:**
- [AudioPlayer](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/AdaptorPattern.java:117:0-136:1) natively plays MP3 files.
- Uses [MediaAdaptor](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/AdaptorPattern.java:82:0-106:1) to play MP4 and MOV formats via [Mp4Player](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/AdaptorPattern.java:47:0-59:1) and [MovPlayer](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/AdaptorPattern.java:64:0-76:1).
- Demonstrates how an adapter bridges two interfaces so that a client can use different implementations transparently.

---

## 2. Decorator Pattern
**File:** [DecoratorPattern.java](cci:7://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/DecoratorPattern.java:0:0-0:0)  
**Type:** Structural  
**Intent:** Adds new behavior to objects dynamically at runtime.  
**Summary:**
- [Troll](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/DecoratorPattern.java:2:0-10:1) interface with [SimpleTroll](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/DecoratorPattern.java:53:0-71:1) as base.
- [ClubbedTroll](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/DecoratorPattern.java:74:0-101:1) decorates a troll, adding club attack behavior.
- Demonstrates how to enhance object functionality without affecting other instances.

---

## 3. Factory Pattern
**File:** [FactoryPattern.java](cci:7://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/FactoryPattern.java:0:0-0:0)  
**Type:** Creational  
**Intent:** Provides an interface for creating objects, letting subclasses alter the type of objects created.  
**Summary:**
- [Country](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/FactoryPattern.java:15:0-20:1) interface with implementations like [India](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/FactoryPattern.java:23:0-36:1) and [Australia](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/FactoryPattern.java:39:0-52:1).
- `FactoryPattern.getCurrencyByCountry(String)` returns the correct country object.
- Decouples client code from object creation logic.

---

## 4. Flyweight Pattern
**File:** [FlyWeightPattern.java](cci:7://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/FlyWeightPattern.java:0:0-0:0)  
**Type:** Structural  
**Intent:** Minimizes memory usage by sharing as much data as possible with similar objects.  
**Summary:**
- [Player](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/FlyWeightPattern.java:10:0-15:1) interface with [Terrorist](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/FlyWeightPattern.java:19:0-42:1) and [CounterTerrorist](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/FlyWeightPattern.java:46:0-67:1) implementations.
- [PlayerFactory](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/FlyWeightPattern.java:73:0-111:1) reuses player objects for the same type.
- Demonstrates object sharing in a game simulation context.

---

## 5. Observer Pattern
**File:** [ObserverPattern.java](cci:7://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/ObserverPattern.java:0:0-0:0)  
**Type:** Behavioral  
**Intent:** Defines a one-to-many dependency so that when one object changes state, all dependents are notified.  
**Summary:**
- [Subject](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/ObserverPattern.java:37:0-53:1) and [Observer](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/ObserverPattern.java:61:0-69:1) interfaces.
- [MyPersonalFeed](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/ObserverPattern.java:88:0-157:1) (subject) notifies registered [MyFeedObserver](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/ObserverPattern.java:167:0-193:1) instances.
- Demonstrates event notification and subscription.

---

## 6. Prototype Pattern
**File:** [PrototypePattern.java](cci:7://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/PrototypePattern.java:0:0-0:0)  
**Type:** Creational  
**Intent:** Creates new objects by copying an existing object (prototype).  
**Summary:**
- [Color](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/PrototypePattern.java:9:0-28:1) abstract class with [RedColor](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/PrototypePattern.java:31:0-42:1) and [GreenColor](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/PrototypePattern.java:45:0-56:1) implementations.
- [ColorStore](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/PrototypePattern.java:59:0-73:1) manages prototypes and clones them on request.
- Demonstrates object cloning for efficient object creation.

---

## 7. Proxy Pattern
**File:** [ProxyPattern.java](cci:7://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/ProxyPattern.java:0:0-0:0)  
**Type:** Structural  
**Intent:** Provides a surrogate or placeholder to control access to another object.  
**Summary:**
- [Image](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/ProxyPattern.java:22:4-24:5) interface with [RealImage](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/ProxyPattern.java:27:4-44:5) and [ProxyImage](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/ProxyPattern.java:47:4-63:5).
- [ProxyImage](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/ProxyPattern.java:47:4-63:5) delays loading the real image until needed.
- Demonstrates access control, lazy initialization, and logging.

---

## 8. Singleton Pattern
**File:** [SingletonPattern.java](cci:7://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/SingletonPattern.java:0:0-0:0)  
**Type:** Creational  
**Intent:** Ensures a class has only one instance and provides a global point of access.  
**Summary:**
- Thread-safe, double-checked locking implementation.
- Only one instance of [SingletonPattern](cci:2://file:///Users/saranshbansal/Documents/Workspace/dsa-cookbook-java/src/main/java/com/designpatterns/SingletonPattern.java:8:0-29:1) is ever created.

---