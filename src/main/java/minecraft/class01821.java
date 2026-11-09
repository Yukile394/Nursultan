package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;

public class class01821 extends class04762 {
   public static final int N = 33;
   protected final Long2ByteMap y = new Long2ByteOpenHashMap();
   private final class08593 L;

   @Override
   protected int L(long var1) {
      return this.y.get(var1);
   }

   public class01821(class08593 var1) {
      super(34, 16, 256);
      this.L = var1;
      var1.y(this::y);
      this.y.defaultReturnValue((byte)33);
   }

   @Override
   protected int y(long var1) {
      return this.L.N(var1, true);
   }

   public void N() {
      this.y(Integer.MAX_VALUE);
   }

   @Override
   protected void N(long var1, int var3) {
      if (var3 >= 33) {
         this.y.remove(var1);
      } else {
         this.y.put(var1, (byte)var3);
      }
   }

   public int N(class07321 var1) {
      return this.L(var1.y());
   }
}
