package minecraft;

import it.unimi.dsi.fastutil.bytes.ByteList;

record class06253(int[] contents, int bitWidth) implements class06267 {
   private static final int L = 24;

   private class06253(int[] contents, int bitWidth) {
      super();
      this.contents = contents;
      this.bitWidth = bitWidth;
   }

   public int[] y() {
      return this.contents;
   }

   public static class06267 y(int var0, ByteList var1) {
      int[] aint = new int[16];
      int i = 0;
      int j = 0;

      for (int k = 0; k < 16; k++) {
         int l = class06268.N(var0, var1, j++);
         int i1 = class06268.N(var0, var1, j++);
         int j1 = class06268.N(var0, var1, j++);
         int k1 = class06268.N(var0, var1, j++);
         int l1 = class06268.N(var0, var1, j++);
         int i2 = class06268.N(var0, var1, j++);
         int j2 = class06268.N(var0, var1, j++);
         int k2 = class06268.N(var0, var1, j++);
         int l2 = l << 28 | i1 << 24 | j1 << 20 | k1 << 16 | l1 << 12 | i2 << 8 | j2 << 4 | k2;
         aint[k] = l2;
         i |= l2;
      }

      return new class06253(aint, 32);
   }

   @Override
   public int N() {
      return this.bitWidth;
   }

   @Override
   public int N(int var1) {
      return this.contents[var1];
   }

   static class06267 N(int var0, ByteList var1) {
      int[] aint = new int[16];
      int i = 0;
      int j = 0;

      for (int k = 0; k < 16; k++) {
         int l = class06268.N(var0, var1, j++);
         int i1 = class06268.N(var0, var1, j++);
         int j1 = class06268.N(var0, var1, j++);
         int k1 = class06268.N(var0, var1, j++);
         int l1 = class06268.N(var0, var1, j++);
         int i2 = class06268.N(var0, var1, j++);
         int j2 = l << 20 | i1 << 16 | j1 << 12 | k1 << 8 | l1 << 4 | i2;
         aint[k] = j2 << 8;
         i |= j2;
      }

      return new class06253(aint, 24);
   }
}
