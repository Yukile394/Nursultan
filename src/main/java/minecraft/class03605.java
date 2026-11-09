package minecraft;

import com.google.gson.JsonObject;

public class class03605 extends class03576 {
   private static final String M = "url";
   private static final String B = "buttonText";
   private static final String Z = "message";
   private final String z;
   private final class03596 U;
   private final class03596 E;

   private class03605(class03576 var1, String var2, class03596 var3, class03596 var4) {
      super(var1.L, var1.u, var1.i, var1.R);
      this.z = var2;
      this.U = var3;
      this.E = var4;
   }

   public class00392 u() {
      return this.E.N(class00392.L("mco.notification.visitUrl.message.default"));
   }

   public static class03605 N(class03576 var0, JsonObject var1) {
      String s = class04719.N("url", var1);
      class03596 class03596x = class04719.N("buttonText", var1, class03596::N);
      class03596 class03596x = class04719.N("message", var1, class03596::N);
      return new class03605(var0, s, class03596x, class03596x);
   }

   public class05362 N(class05096 var1) {
      return class05362.method_46430(this.U.N(class03576.y), class01321.y(var1, this.z)).N();
   }
}
