package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum class06187 implements class05033 {
   field_13692("normal", class00869.D, class00869.m, class00869.il),
   field_13691("mesa", class00869.Nu, class00869.v, class00869.EL);

   public static final Codec<class06187> field_24839 = class05033.N(class06187::values);
   private static final IntFunction<class06187> field_41680 = class02121.N(Enum::ordinal, values(), class02126.field_41664);
   private final String field_13689;
   private final class00500 field_28850;
   private final class00500 field_28851;
   private final class00500 field_28852;

   public class00500 L() {
      return this.field_28851;
   }

   private class06187(String var3, class00891 var4, class00891 var5, class00891 var6) {
      this.field_13689 = var3;
      this.field_28850 = var4.W();
      this.field_28851 = var5.W();
      this.field_28852 = var6.W();
   }

   public class00500 u() {
      return this.field_28852;
   }

   public class00500 y() {
      return this.field_28850;
   }

   public String N() {
      return this.field_13689;
   }

   public static class06187 N(int var0) {
      return field_41680.apply(var0);
   }

   @Override
   public String method_15434() {
      return this.field_13689;
   }
}
