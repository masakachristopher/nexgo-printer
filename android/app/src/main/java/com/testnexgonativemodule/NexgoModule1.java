// package com.testnexgonativemodule;

// import com.facebook.react.bridge.Promise;
// import com.facebook.react.bridge.NativeModule;
// import com.facebook.react.bridge.ReactApplicationContext;
// import com.facebook.react.bridge.ReactContext;
// import com.facebook.react.bridge.ReactContextBaseJavaModule;
// import com.facebook.react.bridge.ReactMethod;
// import java.util.Map;
// import java.util.HashMap;
// import android.util.Log;


// public class NexgoModule extends ReactContextBaseJavaModule {
//    NexgoModule(ReactApplicationContext context) {
//        super(context);
//    }

//    // add to CalendarModule.java
//   @Override
//   public String getName() {
//     return "NexgoModule";
//   }


//   @ReactMethod
//   public void createCalendarEvent(String name, String location, Promise promise) {
//     // Log.d("NexgoModule", "Create event called with name: " + name
//     // + " and location: " + location);
//     promise.resolve(name + location);
//     // return location;
//   }

//   @ReactMethod
//   public void multiply(double a, double b, Promise promise) {
//       promise.resolve(a * b);
//   }
// }