package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum class07645 implements class05033 {
   field_6788(0, "normal", false),
   field_6794(1, "lazy", false),
   field_6795(2, "worried", false),
   field_6791(3, "playful", false),
   field_6792(4, "brown", true),
   field_6793(5, "weak", true),
   field_6789(6, "aggressive", false);

   public static final Codec<class07645> field_41673 = class05033.N(class07645::values);
   private static final IntFunction<class07645> field_6786 = class02121.N(class07645::N, values(), class02126.field_41664);
   private static final int field_30350 = 6;
   private final int field_6785;
   private final String field_6797;
   private final boolean field_6790;

   private class07645(int var3, String var4, boolean var5) {
      this.field_6785 = var3;
      this.field_6797 = var4;
      this.field_6790 = var5;
   }

   public boolean y() {
      return this.field_6790;
   }

   public static class07645 N(int var0) {
      return field_6786.apply(var0);
   }

   public static class07645 N(class06069 var0) {
      int i = var0.y(16);
      if (i == 0) {
         return field_6794;
      } else if (i == 1) {
         return field_6795;
      } else if (i == 2) {
         return field_6791;
      } else if (i == 4) {
         return field_6789;
      } else if (i < 9) {
         return field_6793;
      } else {
         return i < 11 ? field_6792 : field_6788;
      }
   }

   static class07645 N(class07645 var0, class07645 var1) {
      if (var0.y()) {
         return var0 == var1 ? var0 : field_6788;
      } else {
         return var0;
      }
   }

   public int N() {
      return this.field_6785;
   }

   @Override
   public String method_15434() {
      return this.field_6797;
   }
}
