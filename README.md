# JetDB - Super Sonic Shared Preferences

[![](https://jitpack.io/v/Binary-Finery/JetDB.svg)](https://jitpack.io/#Binary-Finery/JetDB)

- min SDK 16 (Android Jellybean 4.1)
- written in Java

Simplified SharedPreferences, do it all in 1 line of code. JetDB goes the extra mile by allowing you to save/retreive ArrayLists,Lists of Objects and arrays with a simple, single line of code. It's never been simpler and quicker.

## Installation

Add this into your root build.gradle file:

```java
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Add the dependency to your module build.gradle:

```java
dependencies {
	implementation 'com.github.Binary-Finery:JetDB:1.0.5'
}
```

## Example Usage

save List of custom objects:
```java
JetDB.putListOfObjects(context, listObject, "key");
```
get List of custom objects:
```java
List<User> users = JetDB.getListOfObjects(context, User.class, "key");
```
save ArrayList:
```java
JetDB.putStringList(context, listObject, "key");
```
get ArrayList:
```java
ArrayList<String> names = JetDB.getStringList(context, "key");
```
save array:
```java
JetDB.putCharArray(context, charArrayObject, "key");
```
get array:
```java
char [] chars = JetDB.getCharArray(context, "key");
```
save single data:
```java
JetDB.putBoolean(context, true, "key");
```
get single data:
```java
boolean isActive = JetDB.getBoolean(context, "key", defaultValue);
```

Please note: other data types can be used (Integer, Float etc) in addition to the ones in the example usages above




