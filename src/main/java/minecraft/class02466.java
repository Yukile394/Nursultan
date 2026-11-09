package minecraft;

import it.unimi.dsi.fastutil.ints.IntList;

public interface class02466 extends class05033 {
   default int y() {
      return this.N().size();
   }

   IntList N();

   static class02466 N(String var0, IntList var1) {
      return new class02495(var1, var0);
   }
}
