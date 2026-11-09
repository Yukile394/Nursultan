package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;

final class class05379 extends class01293 {
   private final Long2ByteMap y;

   @Override
   protected int L(long var1) {
      return this.y.get(var1);
   }

   protected class05379(class05368 var1) {
      super(7, 16, 256);
      this.N = var1;
      this.y = new Long2ByteOpenHashMap();
      this.y.defaultReturnValue((byte)7);
   }

   @Override
   protected int y(long var1) {
      return this.N.N(var1) ? 0 : 7;
   }

   @Override
   protected void N(long var1, int var3) {
      if (var3 > 6) {
         this.y.remove(var1);
      } else {
         this.y.put(var1, (byte)var3);
      }
   }

   public void N() {
      super.y(Integer.MAX_VALUE);
   }
}
