package minecraft;

import com.mojang.text2speech.Narrator;

public class class03263 extends class05096 {
   private static final class00392 N = class00392.L("accessibility.onboarding.screen.title");
   private static final class00392 y = class00392.L("accessibility.onboarding.screen.narrator");
   private static final int L = 4;
   private static final int u = 16;
   private static final float i = 1000.0F;
   private static final int R = 374;
   private final class02088 M;
   private final class05630 B;
   private final boolean Z;
   private boolean z;
   private float U;
   private final Runnable E;
   private final class03686 W = new class03686(this, this.N(), 33);
   private float m;
   private boolean P = true;
   private float s;

   public class03263(class05630 var1, Runnable var2) {
      super(N);
      this.B = var1;
      this.E = var2;
      this.M = new class02088(true);
      this.Z = class06202.Nq().NT().N();
   }

   private void y() {
      if (!this.z && this.Z) {
         if (this.U < 40.0F) {
            this.U++;
         } else if (this.field_22787.y()) {
            Narrator.getNarrator().say(y.getString(), true, ((class05630)this.field_22787.i_7).N(class04911.field_15246));
            this.z = true;
         }
      }
   }

   private void N(boolean var1, Runnable var2) {
      if (var1) {
         this.B.NH();
      }

      Narrator.getNarrator().clear();
      var2.run();
   }

   private void N(class05096 var1) {
      this.N(false, () -> this.field_22787.N(var1));
   }

   private int N() {
      return 90;
   }

   @Override
   public void method_25426() {
      class01885 class01885 = this.W.L(class01885.u());
      class01885.L().y().N(4);
      class01885.N(class02091.N(this.field_22785, this.field_22793).N(374).N(), var0 -> var0.N(8));
      if (this.B.NV().method_57701(this.B) instanceof class06366 class06366) {
         this.field_52252 = class06366;
         this.field_52252.field_22763 = this.Z;
         class01885.N(this.field_52252);
      }

      class01885.N(class03240.y(150, var1x -> this.N(new class05336(this, (class05630)this.field_22787.i_7)), false));
      class01885.N(class03240.N(150, var1x -> this.N(new class06279(this, (class05630)this.field_22787.i_7, this.field_22787.X())), false));
      this.W.y(class05362.method_46430(class05220.z, var1x -> this.method_25419()).N());
      this.W.method_48206(this::method_37063);
      this.method_48640();
   }

   @Override
   protected void method_56131() {
      if (this.Z && this.field_52252 != null) {
         this.method_48265(this.field_52252);
      } else {
         super.method_56131();
      }
   }

   @Override
   public void method_48640() {
      this.W.N();
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.y();
      if (this.m == 0.0F && this.P) {
         this.m = (float)class07536.L();
      }

      if (this.m > 0.0F) {
         float f = ((float)class07536.L() - this.m) / 2000.0F;
         float f1 = 1.0F;
         if (f >= 1.0F) {
            this.P = false;
            this.m = 0.0F;
         } else {
            f = class04995.N(f, 0.0F, 1.0F);
            f1 = class04995.y(f, 0.5F, 1.0F, 0.0F, 1.0F);
         }

         this.method_71536(f1);
      }

      if (this.s > 0.0F) {
         float f2 = 1.0F - ((float)class07536.L() - this.s) / 1000.0F;
         float f3 = 0.0F;
         if (f2 <= 0.0F) {
            this.s = 0.0F;
            this.N(true, this.E);
         } else {
            f2 = class04995.N(f2, 0.0F, 1.0F);
            f3 = class04995.y(f2, 0.5F, 1.0F, 0.0F, 1.0F);
         }

         this.method_71536(f3);
      }

      this.M.N(var1, this.field_22789, 1.0F);
   }

   @Override
   public void method_25419() {
      if (this.s == 0.0F) {
         this.s = (float)class07536.L();
      }
   }

   @Override
   protected boolean method_72798() {
      return false;
   }
}
