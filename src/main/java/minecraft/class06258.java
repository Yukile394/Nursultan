package minecraft;

import it.unimi.dsi.fastutil.bytes.ByteList;

record class06258(short[] contents) implements class06267 {
   private class06258(short[] contents) {
      super();
      this.contents = contents;
   }

   public short[] y() {
      return this.contents;
   }

   static class06267 N(int var0, ByteList var1) {
      short[] ashort = new short[16];
      int i = 0;

      for (int j = 0; j < 16; j++) {
         int k = class06268.N(var0, var1, i++);
         int l = class06268.N(var0, var1, i++);
         int i1 = class06268.N(var0, var1, i++);
         int j1 = class06268.N(var0, var1, i++);
         short short1 = (short)(k << 12 | l << 8 | i1 << 4 | j1);
         ashort[j] = short1;
      }

      return new class06258(ashort);
   }

   @Override
   public int N(int var1) {
      return this.contents[var1] << 16;
   }

   @Override
   public int N() {
      return 16;
   }
}
