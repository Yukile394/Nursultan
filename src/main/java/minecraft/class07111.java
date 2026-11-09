package minecraft;

import com.mojang.serialization.Codec;

public enum class07111 implements class05033 {
   field_11302("none", class01372.field_23292),
   field_11300("left_right", class01372.field_23267),
   field_11301("front_back", class01372.field_23323);

   public static final Codec<class07111> field_39311 = class05033.N(class07111::values);
   @Deprecated
   public static final Codec<class07111> field_56669 = class06338.L(class07111::valueOf);
   private final String field_39312;
   private final class00392 field_27883;
   private final class01372 field_23263;

   private class07111(String var3, class01372 var4) {
      this.field_39312 = var3;
      this.field_27883 = class00392.L("mirror." + var3);
      this.field_23263 = var4;
   }

   public class07211 y(class07211 var1) {
      if (this == field_11301 && var1.z() == class07185.field_11048) {
         return var1.b();
      } else {
         return this == field_11300 && var1.z() == class07185.field_11051 ? var1.b() : var1;
      }
   }

   public class00392 y() {
      return this.field_27883;
   }

   public class06993 N(class07211 var1) {
      class07185 class07185 = var1.z();
      return (this != field_11300 || class07185 != class07185.field_11051) && (this != field_11301 || class07185 != class07185.field_11048)
         ? class06993.field_11467
         : class06993.field_11464;
   }

   public int N(int var1, int var2) {
      int i = var2 / 2;
      int j = var1 > i ? var1 - var2 : var1;
      switch (this) {
         case field_11300:
            return (i - j + var2) % var2;
         case field_11301:
            return (var2 - j) % var2;
         default:
            return var1;
      }
   }

   public class01372 N() {
      return this.field_23263;
   }

   @Override
   public String method_15434() {
      return this.field_39312;
   }
}
