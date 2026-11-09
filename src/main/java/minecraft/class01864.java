package minecraft;

import java.net.URI;

public class class01864 extends class05096 {
   private static final class00392 N = class00392.L("symlink_warning.title.world").N(class06541.field_1067);
   private static final class00392 y = class00392.N("symlink_warning.message.world", class00392.N(class03597.s));
   private static final class00392 L = class00392.L("symlink_warning.title.pack").N(class06541.field_1067);
   private static final class00392 u = class00392.N("symlink_warning.message.pack", class00392.N(class03597.s));
   private final class00392 i;
   private final URI R;
   private final Runnable M;
   private final class02060 B = new class02060().y(10);

   public class01864(class00392 var1, class00392 var2, URI var3, Runnable var4) {
      super(var1);
      this.i = var2;
      this.R = var3;
      this.M = var4;
   }

   public static class05096 y(Runnable var0) {
      return new class01864(L, u, class03597.s, var0);
   }

   public static class05096 N(Runnable var0) {
      return new class01864(N, y, class03597.s, var0);
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.B.L().y();
      class02080 class02080x = this.B.u(1);
      class02080x.N(new class02071(this.field_22785, this.field_22793));
      class02080x.N(new class04230(this.i, this.field_22793).N(this.field_22789 - 50).N(true));
      byte b0 = 120;
      class02060 class02060 = new class02060().N(5);
      class02080 class02080x = class02060.u(3);
      class02080x.N(class05362.method_46430(class05220.m, var1x -> class07536.m().N(this.R)).y(120, 20).N());
      class02080x.N(class05362.method_46430(class05220.s, var1x -> ((class06197)this.field_22787.L_3).N(this.R.toString())).y(120, 20).N());
      class02080x.N(class05362.method_46430(class05220.U, var1x -> this.method_25419()).y(120, 20).N());
      class02080x.N(class02060);
      this.method_48640();
      this.B.method_48206(this::method_37063);
   }

   @Override
   public void method_48640() {
      this.B.N();
      class02077.N(this.B, this.method_48202());
   }

   @Override
   public void method_25419() {
      this.M.run();
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(super.method_25435(), this.i);
   }
}
