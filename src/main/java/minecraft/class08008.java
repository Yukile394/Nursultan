package minecraft;

import com.mojang.serialization.Codec;

public enum class08008 {
   field_7592,
   field_7593,
   field_7594;

   public static final Codec<class08008> field_56665 = Codec.BYTE.xmap(class08008::N, var0 -> (byte)var0.ordinal());

   private class08008() {
   }

   public static class08008 N(int var0) {
      if (var0 < 0 || var0 > values().length) {
         var0 = 0;
      }

      return values()[var0];
   }
}
