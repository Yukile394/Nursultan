package Nursultan;

import jdk.jfr.FlightRecorderListener;
import jdk.jfr.Recording;
import minecraft.class03223;

public class class10159 implements FlightRecorderListener {
   public class10159(class03223 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void recordingStateChanged(Recording var1) {
      switch (var1.getState()) {
         case STOPPED:
            this.N.N();
         case NEW:
         case DELAYED:
         case RUNNING:
         case CLOSED:
      }
   }
}
