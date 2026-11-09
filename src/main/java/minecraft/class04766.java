package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectSet;

class class04766 extends class04762 {
   protected final Long2ByteMap N;
   protected final int y;

   @Override
   protected int L(long var1) {
      return this.N.get(var1);
   }

   protected class04766(class04778 var1, int var2) {
      super(var2 + 2, 16, 256);
      this.L = var1;
      this.N = new Long2ByteOpenHashMap();
      this.y = var2;
      this.N.defaultReturnValue((byte)(var2 + 2));
   }

   @Override
   protected int y(long var1) {
      return this.R(var1) ? 0 : Integer.MAX_VALUE;
   }

   public void N() {
      this.y(Integer.MAX_VALUE);
   }

   protected void N(long var1, int var3, int var4) {
   }

   @Override
   protected void N(long var1, int var3) {
      byte b0;
      if (var3 > this.y) {
         b0 = this.N.remove(var1);
      } else {
         b0 = this.N.put(var1, (byte)var3);
      }

      this.N(var1, b0, var3);
   }

   private boolean R(long var1) {
      ObjectSet<class04770> objectset = (ObjectSet<class04770>)this.L.y.get(var1);
      return objectset != null && !objectset.isEmpty();
   }
}
