package minecraft;

import org.jspecify.annotations.Nullable;

public class class04210 extends class05096 {
   private static final class00392 N = class00392.L("telemetry_info.screen.title");
   private static final class00392 y = class00392.L("telemetry_info.screen.description").y(-4539718);
   private static final class00392 L = class00392.L("telemetry_info.button.privacy_statement");
   private static final class00392 u = class00392.L("telemetry_info.button.give_feedback");
   private static final class00392 i = class00392.L("telemetry_info.button.show_data");
   private static final class00392 R = class00392.L("telemetry_info.opt_in.description").y(-2039584);
   private static final int M = 8;
   private static final boolean B = class06202.Nq().Nk();
   private final class05096 Z;
   private final class05630 z;
   private final class03686 U = new class03686(this, 16 + 45 + 20, B ? 33 + class05725.N((class01590)class06202.Nq().i_3) : 33);
   @Nullable
   private class04240 E;
   @Nullable
   private class04230 W;
   @Nullable
   private class05725 m;
   private double P;

   private void L(class05362 var1) {
      class07536.m().N(this.field_22787.NI().y());
   }

   public class04210(class05096 var1, class05630 var2) {
      super(N);
      this.Z = var1;
      this.z = var2;
   }

   private void y(class05362 var1) {
      class01321.N(this, class03597.Z);
   }

   private void N(class05362 var1) {
      class01321.N(this, class03597.L);
   }

   private void N(class06478 var1, boolean var2) {
      if (this.E != null) {
         this.E.N(var2);
      }
   }

   @Override
   public void method_25426() {
      class01885 class01885xxxx = this.U.N(class01885.u().N(4));
      class01885xxxx.L().y();
      class01885xxxx.N(new class02071(N, this.field_22793));
      this.W = class01885xxxx.N(new class04230(y, this.field_22793).N(true));
      class01885 class01885x = class01885xxxx.N(class01885.i().N(8));
      class01885x.N(class05362.method_46430(L, this::N).N());
      class01885x.N(class05362.method_46430(u, this::y).N());
      class01885 class01885xx = this.U.y(class01885.u().N(4));
      class01885xx.L().y();
      if (B) {
         this.m = class01885xx.N(class05725.y(R, this.field_22793).N(this.field_22789 - 40).N(this.z.Nk()).N(this::N).N());
      }

      class01885 class01885xxx = class01885xx.N(class01885.i().N(8));
      class01885xxx.N(class05362.method_46430(i, this::L).N());
      class01885xxx.N(class05362.method_46430(class05220.u, var1x -> this.method_25419()).N());
      class01885 class01885xxxx = this.U.L(class01885.u().N(8));
      this.E = class01885xxxx.N(new class04240(0, 0, this.field_22789 - 40, this.U.u(), this.field_22793));
      this.E.N(var1x -> this.P = var1x);
      this.U.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   protected void method_56131() {
      if (this.E != null) {
         this.method_48265(this.E);
      }
   }

   @Override
   public void method_48640() {
      if (this.E != null) {
         this.E.method_44382(this.P);
         this.E.method_25358(this.field_22789 - 40);
         this.E.method_53533(this.U.u());
         this.E.y();
      }

      if (this.W != null) {
         this.W.N(this.field_22789 - 16);
      }

      if (this.m != null) {
         this.m.N(this.field_22789 - 40, this.field_22793);
      }

      this.U.N();
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.Z);
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(super.method_25435(), y);
   }
}
