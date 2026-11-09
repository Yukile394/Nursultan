package minecraft;

import com.google.common.collect.ImmutableMap;

public class class05739<T extends class07079> extends class05765<T> {
   private final float N;

   public class05739(float var1) {
      super(ImmutableMap.of());
      this.N = var1;
   }

   protected void L(class04782 var1, class07079 var2, long var3) {
      if (var2.method_59922().z() < this.N) {
         var2.A().y();
      }
   }

   protected boolean N(class04782 var1, class07079 var2) {
      return N(var2);
   }

   public static <T extends class07079> boolean N(T var0) {
      return var0.method_5799() && var0.method_5861(class01231.N) > var0.method_29241() || var0.method_5771();
   }

   protected boolean N(class04782 var1, class07079 var2, long var3) {
      return this.N(var1, var2);
   }
}
