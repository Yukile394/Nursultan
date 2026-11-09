package minecraft;

import Nursultan.class10409;
import java.util.function.IntFunction;

public enum class04440 implements class05033 {
   SENDER(0, "sender", (var0, var1) -> var1.y()),
   TARGET(1, "target", (var0, var1) -> var1.L().orElse(class05220.N)),
   CONTENT(2, "content", (var0, var1) -> var0);

   public Integer fields_0ec9e67d4a0683ab6bd6627d9711a269e_0;
   public String fields_0ec9e67d4a0683ab6bd6627d9711a269e_1;
   public class10409 fields_0ec9e67d4a0683ab6bd6627d9711a269e_2;
   public boolean fields_0ec9e67d4a0683ab6bd6627d9711a269e_init;
   public static IntFunction staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_3 = class02121.N(
      var0 -> var0.fields_0ec9e67d4a0683ab6bd6627d9711a269e_0, values(), class02126.field_41664
   );
   public static Object staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_4 = class05033.N(class04440::values);
   public static class02362 staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_5 = class02389.N(
      staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_3, var0 -> var0.fields_0ec9e67d4a0683ab6bd6627d9711a269e_0
   );

   private static void L() {
   }

   private static void M() {
      SENDER = null;
      TARGET = null;
      CONTENT = null;
      staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_3 = null;
      staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_4 = null;
      staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_5 = null;
   }

   private class04440(int var3, String var4, class10409 var5) {
      this.R();
      this.fields_0ec9e67d4a0683ab6bd6627d9711a269e_0 = var3;
      this.fields_0ec9e67d4a0683ab6bd6627d9711a269e_1 = var4;
      this.fields_0ec9e67d4a0683ab6bd6627d9711a269e_2 = var5;
   }

   static {
      y();
      L();
      u();
   }

   private static void u() {
   }

   private static void y() {
   }

   public class00392 N(class00392 var1, class00649 var2) {
      return this.fields_0ec9e67d4a0683ab6bd6627d9711a269e_2.select(var1, var2);
   }

   private void R() {
      if (!this.fields_0ec9e67d4a0683ab6bd6627d9711a269e_init) {
         this.fields_0ec9e67d4a0683ab6bd6627d9711a269e_init = true;
         this.fields_0ec9e67d4a0683ab6bd6627d9711a269e_0 = 0;
      }
   }

   @Override
   public String method_15434() {
      return this.fields_0ec9e67d4a0683ab6bd6627d9711a269e_1;
   }
}
