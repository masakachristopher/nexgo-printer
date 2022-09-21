/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

 import React from 'react';
 import {
   SafeAreaView,
   Button
 } from 'react-native';
 
 import {printReceipt} from './NexgoSdkInterface'
 
 const App = () => {
   return (
     <SafeAreaView>
       <Button
       title='Press To Print'
       onPress={() => {
         try {
          printReceipt("1","2","3", "4","5")
          .then(() => console.log("Printed"))
          .catch(() => console.log("Error"))
         }catch (e) {
           console.log("error")
         }
       }}
       />
     </SafeAreaView>
   );
 };
 
 export default App;
 