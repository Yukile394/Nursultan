package minecraft;

import it.unimi.dsi.fastutil.bytes.ByteList;

record class06255(byte[] contents) implements class06267 {
   private class06255(byte[] contents) {
      super();
      this.contents = contents;
   }

   public byte[] y() {
      return this.contents;
   }

   static class06267 N(int var0, ByteList var1) {
      byte[] abyte = new byte[16];
      int i = 0;

      for (int j = 0; j < 16; j++) {
         int k = class06268.N(var0, var1, i++);
         int l = class06268.N(var0, var1, i++);
         byte b0 = (byte)(k << 4 | l);
         abyte[j] = b0;
      }

      return new class06255(abyte);
   }

   @Override
   public int N(int var1) {
      return this.contents[var1] << 24;
   }

   @Override
   public int N() {
      return 8;
   }
}
