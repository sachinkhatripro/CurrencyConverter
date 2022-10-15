package org.skdesign;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.ArrayList;

@SuppressWarnings("rawtypes")
public class Testing {
   public static void main(String[] args) {
      ArrayList<Class> testCases = new ArrayList<>();
      testCases.add(TestJunit.class);
      testCases.add(ConverterTest.class);
      for (Class clazz : testCases) {
         Result result = JUnitCore.runClasses(clazz);
         for(
                 Failure failure:result.getFailures()){
            System.out.println(failure.toString());
         }
      }
      System.out.println("tests successful");



      {
      }
   }



}
