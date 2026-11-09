package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;

public class class03503 {
   private static final int N = 4;
   private static final int y = 16;
   private static final int L = 15;
   private static final int u = 4096;
   private static final int i = 0;
   private static final int R = 4;
   private static final int M = 8;
   private static final int B = (int)Math.pow(16.0, 0.0);
   private static final int Z = (int)Math.pow(16.0, 1.0);
   private static final int z = (int)Math.pow(16.0, 2.0);
   private static final int U = -1;
   private static final class07211[] E = class07211.values();
   private final BitSet W = new BitSet(4096);
   private static final int[] m = class07536.N(new int[1352], var0 -> {
      boolean flag = false;
      byte b0 = 15;
      int ix = 0;

      for (int j = 0; j < 16; j++) {
         for (int k = 0; k < 16; k++) {
            for (int l = 0; l < 16; l++) {
               if (j == 0 || j == 15 || k == 0 || k == 15 || l == 0 || l == 15) {
                  var0[ix++] = N(j, k, l);
               }
            }
         }
      }
   });
   private int P = 4096;

   public class03503() {
      super();
   }

   private static int y(class07209 var0) {
      return N(var0.method_10263() & 15, var0.method_10264() & 15, var0.method_10260() & 15);
   }

   private void N(int var1, Set<class07211> var2) {
      int ix = var1 >> 0 & 15;
      if (ix == 0) {
         var2.add(class07211.field_11039);
      } else if (ix == 15) {
         var2.add(class07211.field_11034);
      }

      int j = var1 >> 8 & 15;
      if (j == 0) {
         var2.add(class07211.field_11033);
      } else if (j == 15) {
         var2.add(class07211.field_11036);
      }

      int k = var1 >> 4 & 15;
      if (k == 0) {
         var2.add(class07211.field_11043);
      } else if (k == 15) {
         var2.add(class07211.field_11035);
      }
   }

   private int N(int var1, class07211 var2) {
      switch (var2) {
         case field_11033:
            if ((var1 >> 8 & 15) == 0) {
               return -1;
            }

            return var1 - z;
         case field_11036:
            if ((var1 >> 8 & 15) == 15) {
               return -1;
            }

            return var1 + z;
         case field_11043:
            if ((var1 >> 4 & 15) == 0) {
               return -1;
            }

            return var1 - Z;
         case field_11035:
            if ((var1 >> 4 & 15) == 15) {
               return -1;
            }

            return var1 + Z;
         case field_11039:
            if ((var1 >> 0 & 15) == 0) {
               return -1;
            }

            return var1 - B;
         case field_11034:
            if ((var1 >> 0 & 15) == 15) {
               return -1;
            }

            return var1 + B;
         default:
            return -1;
      }
   }

   private Set<class07211> N(int var1) {
      EnumSet<class07211> enumset = EnumSet.noneOf(class07211.class);
      IntArrayFIFOQueue intarrayfifoqueue = new IntArrayFIFOQueue();
      intarrayfifoqueue.enqueue(var1);
      this.W.set(var1, true);

      while (!intarrayfifoqueue.isEmpty()) {
         int ix = intarrayfifoqueue.dequeueInt();
         this.N(ix, enumset);

         for (class07211 class07211 : E) {
            int j = this.N(ix, class07211);
            if (j >= 0 && !this.W.get(j)) {
               this.W.set(j, true);
               intarrayfifoqueue.enqueue(j);
            }
         }
      }

      return enumset;
   }

   public void N(class07209 var1) {
      this.W.set(y(var1), true);
      this.P--;
   }

   public class03476 N() {
      class03476 class03476 = new class03476();
      if (4096 - this.P < 256) {
         class03476.N(true);
      } else if (this.P == 0) {
         class03476.N(false);
      } else {
         for (int ix : m) {
            if (!this.W.get(ix)) {
               class03476.N(this.N(ix));
            }
         }
      }

      return class03476;
   }

   private static int N(int var0, int var1, int var2) {
      return var0 << 0 | var1 << 8 | var2 << 4;
   }
}
