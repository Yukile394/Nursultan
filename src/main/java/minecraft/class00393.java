package minecraft;

import org.jspecify.annotations.Nullable;

public class class00393 extends class00394 implements class07061 {
   public static final int N = 6;
   private static final String y = "patterns";
   private static final class00392 L = class00392.L("block.minecraft.banner");
   @Nullable
   private class00392 u;
   private final class06563 i;
   private class02708 R = class02708.L;

   public class06584 L() {
      class06584 class06584 = new class06584(class07800.N(this.i));
      class06584.y(this.g());
      return class06584;
   }

   @Nullable
   @Override
   public class00392 method_5797() {
      return this.u;
   }

   @Override
   public class00392 method_5477() {
      return this.u != null ? this.u : L;
   }

   public class00393(class07209 var1, class00500 var2) {
      this(var1, var2, ((class07685)var2.i()).y());
   }

   public class00393(class07209 var1, class00500 var2, class06563 var3) {
      super(class00404.field_11905, var1, var2);
      this.i = var3;
   }

   public class06563 u() {
      return this.i;
   }

   @Override
   public void y(class08329 var1) {
      var1.L("patterns");
      var1.L("CustomName");
   }

   public class02708 y() {
      return this.R;
   }

   public class07269 i() {
      return class07269.N(this);
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.u = N_10(var1, "CustomName");
      this.R = var1.<class02708>N("patterns", class02708.u).orElse(class02708.L);
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      if (!this.R.equals(class02708.L)) {
         var1.N("patterns", class02708.u, this.R);
      }

      var1.y("CustomName", class03748.N, this.u);
   }

   private class07001 N(class07001 var1) {
      var1.b("fabric:attachments");
      return var1;
   }

   @Override
   protected void N(class02676 var1) {
      super.N(var1);
      var1.N(class02484.Nv, this.R);
      var1.N(class02484.B, this.u);
   }

   @Override
   protected void N_9(class02666 var1) {
      super.N_9(var1);
      this.R = var1.a_(class02484.Nv, class02708.L);
      this.u = var1.method_58694(class02484.B);
   }

   @Override
   public class07001 N(class01929 var1) {
      return this.N(this.L(var1));
   }
}
