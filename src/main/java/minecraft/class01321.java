package minecraft;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;

public class class01321 extends class05733 {
   private static final class00392 N = class00392.L("chat.link.warning").y(-13108);
   private static final int y = 100;
   private final String L;
   private final boolean u;

   public class01321(BooleanConsumer var1, class00392 var2, class00392 var3, String var4, class00392 var5, boolean var6) {
      super(var1, var2, var3);
      this.field_2402 = var6 ? class05220.m : class05220.R;
      this.field_2399 = var5;
      this.u = !var6;
      this.L = var4;
   }

   public class01321(BooleanConsumer var1, class00392 var2, class00392 var3, URI var4, class00392 var5, boolean var6) {
      this(var1, var2, var3, var4.toString(), var5, true);
   }

   public class01321(BooleanConsumer var1, String var2, boolean var3) {
      this(var1, N(var3), class00392.y(var2), var2, var3 ? class05220.i : class05220.M, var3);
   }

   public class01321(BooleanConsumer var1, class00392 var2, String var3, boolean var4) {
      this(var1, var2, N(var4, var3), var3, var4 ? class05220.i : class05220.M, var4);
   }

   public class01321(BooleanConsumer var1, class00392 var2, URI var3, boolean var4) {
      this(var1, var2, var3.toString(), var4);
   }

   public static class05361 y(class05096 var0, URI var1, boolean var2) {
      return var3 -> N(var0, var1, var2);
   }

   public static class05361 y(class05096 var0, String var1, boolean var2) {
      return var3 -> N(var0, var1, var2);
   }

   public static class05361 y(class05096 var0, URI var1) {
      return y(var0, var1, true);
   }

   public static class05361 y(class05096 var0, String var1) {
      return y(var0, var1, true);
   }

   protected static class05216 N(boolean var0, String var1) {
      return N(var0).y(class05220.l).y(class00392.y(var1));
   }

   public void N() {
      ((class06197)this.field_22787.L_3).N(this.L);
   }

   public static void N(class05096 var0, String var1, boolean var2) {
      class06202 class06202 = class06202.Nq();
      class06202.N(new class01321(var3x -> {
         if (var3x) {
            class07536.m().N(var1);
         }

         class06202.N(var0);
      }, var1, var2));
   }

   public static void N(class05096 var0, URI var1, boolean var2) {
      class06202 class06202 = class06202.Nq();
      class06202.N(new class01321(var3x -> {
         if (var3x) {
            class07536.m().N(var1);
         }

         class06202.N(var0);
      }, var1.toString(), var2));
   }

   public static void N(class05096 var0, String var1) {
      N(var0, var1, true);
   }

   protected static class05216 N(boolean var0) {
      return class00392.L(var0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   public static void N(class05096 var0, URI var1) {
      N(var0, var1, true);
   }

   @Override
   protected void method_37051(class01885 var1) {
      this.field_61002 = var1.N(class05362.method_46430(this.field_2402, var1x -> this.field_2403.accept(true)).N(100).N());
      var1.N(class05362.method_46430(class05220.P, var1x -> {
         this.N();
         this.field_2403.accept(false);
      }).N(100).N());
      this.field_61003 = var1.N(class05362.method_46430(this.field_2399, var1x -> this.field_2403.accept(false)).N(100).N());
   }

   @Override
   protected void method_72128() {
      if (this.u) {
         this.field_61001.N(new class02071(N, this.field_22793));
      }
   }
}
