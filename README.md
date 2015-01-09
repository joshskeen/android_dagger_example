## DaggerExample
### A quick example of how to use dependency injection in an android application. 

---
0. Add gradle dependencies to app/build.gradle: 

```
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    compile 'com.android.support:appcompat-v7:19.+'
    compile 'com.jakewharton:butterknife:5.1.1'
    // dagger needs both the compiler and main dagger project
    compile 'com.squareup.dagger:dagger:1.2.1'
    provided 'com.squareup.dagger:dagger-compiler:1.2.1'
}

```

1. A dependency injection framework needs what's called a "module". The Module specifies how each object we want to inject should be constructed and it's behavior. In the example, i configure one object as a singleton, the other as a normal java object i want a new instance of each time i inject it. 

2. (dagger specific) Each class we want to inject into needs to be listed in the module @Module annotation. Because we inject into MainActivity and SecondActivity
```
@Module(injects = {
        MainActivity.class,
        SecondActivity.class,
}, complete = true)
```
3. @Inject now injects! Check out MainActivity and SecondActivity to see it in use. 