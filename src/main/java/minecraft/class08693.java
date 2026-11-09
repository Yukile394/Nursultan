package minecraft;

import com.mojang.jtracy.Plot;
import com.mojang.jtracy.TracyClient;

final class class08693 {
   private final Plot N;
   private int y;

   class08693(String var1) {
      super();
      this.N = TracyClient.createPlot(var1);
      this.y = 0;
   }

   void y(int var1) {
      this.N(this.y + var1);
   }

   void N(int var1) {
      this.y = var1;
      this.N.setValue(var1);
   }
}
