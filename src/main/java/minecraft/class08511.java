package minecraft;

import com.google.gson.JsonParseException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public enum class08511 {
   field_57029(0, class01372.field_23292, class01372.field_23292, class01372.field_23292),
   field_57030(1, class01372.field_64508, class01372.field_64511, class01372.field_64514),
   field_57031(2, class01372.field_64507, class01372.field_64510, class01372.field_64513),
   field_57032(3, class01372.field_64506, class01372.field_64509, class01372.field_64512);

   public static final Codec<class08511> field_57033 = Codec.INT.comapFlatMap(var0 -> {
      return switch (class04995.L(var0, 360)) {
         case 0 -> DataResult.success(field_57029);
         case 90 -> DataResult.success(field_57030);
         case 180 -> DataResult.success(field_57031);
         case 270 -> DataResult.success(field_57032);
         default -> DataResult.error(() -> "Invalid rotation " + var0 + " found, only 0/90/180/270 allowed");
      };
   }, var0 -> {
      return switch (var0) {
         case field_57029 -> 0;
         case field_57030 -> 90;
         case field_57031 -> 180;
         case field_57032 -> 270;
      };
   });
   public final int field_57034;
   public final class01372 field_64521;
   public final class01372 field_64522;
   public final class01372 field_64523;

   private class08511(int var3, class01372 var4, class01372 var5, class01372 var6) {
      this.field_57034 = var3;
      this.field_64521 = var4;
      this.field_64522 = var5;
      this.field_64523 = var6;
   }

   public int y(int var1) {
      return (var1 + this.field_57034) % 4;
   }

   @Deprecated
   public static class08511 N(int var0) {
      return switch (class04995.L(var0, 360)) {
         case 0 -> field_57029;
         case 90 -> field_57030;
         case 180 -> field_57031;
         case 270 -> field_57032;
         default -> throw new JsonParseException("Invalid rotation " + var0 + " found, only 0/90/180/270 allowed");
      };
   }

   public static class01372 N(class08511 var0, class08511 var1, class08511 var2) {
      return var2.field_64523.N(var1.field_64522.N(var0.field_64521));
   }

   public static class01372 N(class08511 var0, class08511 var1) {
      return var1.field_64522.N(var0.field_64521);
   }
}
