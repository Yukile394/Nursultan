package minecraft;

import jdk.jfr.FlightRecorder;
import jdk.jfr.FlightRecorderListener;
import jdk.jfr.Recording;

class class03207 implements FlightRecorderListener {
   final class03237 N;

   class03207(class03223 var1) {
      super();
      this.y = var1;
      this.N = new class03237(() -> this.y.R = null);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void recordingStateChanged(Recording var1) {
      if (var1 == this.y.R) {
         switch (var1.getState()) {
            case STOPPED:
               this.N.N(var1.getDestination());
               FlightRecorder.removeListener(this);
            case NEW:
            case DELAYED:
            case RUNNING:
            case CLOSED:
         }
      }
   }
}
