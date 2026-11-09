package minecraft;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

class class04574 {
   private final SystemInfo y = new SystemInfo();
   private final CentralProcessor L = this.y.getHardware().getProcessor();
   public final int N = this.L.getLogicalProcessorCount();
   private long[][] u = this.L.getProcessorCpuLoadTicks();
   private double[] i = this.L.getProcessorCpuLoadBetweenTicks(this.u);
   private long R;

   class04574() {
      super();
   }

   public double N(int var1) {
      long ix = System.currentTimeMillis();
      if (this.R == 0L || this.R + 501L < ix) {
         this.i = this.L.getProcessorCpuLoadBetweenTicks(this.u);
         this.u = this.L.getProcessorCpuLoadTicks();
         this.R = ix;
      }

      return this.i[var1] * 100.0;
   }
}
