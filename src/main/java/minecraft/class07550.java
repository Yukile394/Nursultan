package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public class class07550 extends class07150 {
   private static final class02131<Integer> N = class03289.N(class07550.class, class02154.y);
   private static final class02131<Boolean> y = class03289.N(class07550.class, class02154.U);
   private static final class02131<Boolean> L = class03289.N(class07550.class, class02154.U);
   private static final boolean u = false;
   private static final boolean i = false;
   private static final short R = 30;
   private static final byte M = 3;
   private int B;
   private int Z;
   private int W = 30;
   private int T = 3;
   private boolean b;

   public static class05300 M() {
      return class07150.Y().N(class05298.l, 0.25);
   }

   @Override
   public int method_5850() {
      return this.T() == null ? this.method_56993(0.0F) : this.method_56993(this.method_6032() - 1.0F);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, -1);
      var1.N(y, false);
      var1.N(L, false);
   }

   @Override
   public void method_5773() {
      if (this.method_5805()) {
         this.B = this.Z;
         if (this.W()) {
            this.N(1);
         }

         int ix = this.E();
         if (ix > 0 && this.Z == 0) {
            this.method_5783(class04909.Bq, 1.0F, 0.5F);
            this.method_32876(class01194.q);
         }

         this.Z += ix;
         if (this.Z < 0) {
            this.Z = 0;
         }

         if (this.Z >= this.W) {
            this.Z = this.W;
            this.v();
         }
      }

      super.method_5773();
   }

   @Override
   public boolean method_5747(double var1, float var3, class07072 var4) {
      boolean flag = super.method_5747(var1, var3, var4);
      this.Z += (int)(var1 * 1.5);
      if (this.Z > this.W - 5) {
         this.Z = this.W - 5;
      }

      return flag;
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("powered", this.B());
      var1.N("Fuse", (short)this.W);
      var1.N("ExplosionRadius", (byte)this.T);
      var1.N("ignited", this.W());
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.field_6011.N(y, var1.N("powered", false));
      this.W = var1.N("Fuse", (short)30);
      this.T = var1.N("ExplosionRadius", (byte)3);
      if (var1.N("ignited", false)) {
         this.m();
      }
   }

   @Override
   public void method_5800(class04782 var1, class00672 var2) {
      super.method_5800(var1, var2);
      this.field_6011.N(y, true);
   }

   @Override
   public boolean method_5874(class04782 var1, class07438 var2, class07072 var3) {
      if (this.method_27071(var1) && this.B() && !this.b) {
         var2.method_72396(var1, var3, false, class06273.yu, var3x -> {
            var2.method_5775(var1, var3x);
            this.b = true;
         });
      }

      return super.method_5874(var1, var2, var3);
   }

   public class07550(class07078<? extends class07550> var1, class07299 var2) {
      super(var1, var2);
   }

   public boolean B() {
      return this.field_6011.N(y);
   }

   private void n() {
      Collection<class07055> collection = this.method_6026();
      if (!collection.isEmpty()) {
         class07048 class07048 = new class07048(this.method_73183(), this.method_23317(), this.method_23318(), this.method_23321());
         class07048.N(2.5F);
         class07048.L(-0.5F);
         class07048.L(10);
         class07048.N(300);
         class07048.y(0.25F);
         class07048.u(-class07048.N() / class07048.u());

         for (class07055 class07055 : collection) {
            class07048.N(new class07055(class07055));
         }

         this.method_73183().method_8649(class07048);
      }
   }

   public void m() {
      this.field_6011.N(L, true);
   }

   private class04891 t() {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_1) ? class04909.Uc : class04909.Ul;
   }

   private void v() {
      if (this.method_73183() instanceof class04782 class04782) {
         float f = this.B() ? 2.0F : 1.0F;
         super.fields_6212a028292fd3c078969e3ee4c71d9e8_1 = true;
         class04782.method_8437(this, this.method_23317(), this.method_23318(), this.method_23321(), this.T * f, class07328.field_40890);
         this.n();
         this.method_60699(class04782, class07062.field_26998);
         this.method_31472();
      }
   }

   public float u(float var1) {
      return class04995.B(var1, this.B, this.Z) / (this.W - 2);
   }

   @Override
   public void y(@Nullable class07438 var1) {
      if (!(var1 instanceof class02148)) {
         super.y(var1);
      }
   }

   public int E() {
      return this.field_6011.N(N);
   }

   public void N(int var1) {
      this.field_6011.N(N, var1);
   }

   @Override
   protected class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584 = var1.method_5998(var2);
      if (class06584.N(class01226.ya)) {
         class04891 class04891 = class06584.N(class06570.GZ) ? this.t() : class04909.Uc;
         this.method_73183()
            .method_43128(
               var1, this.method_23317(), this.method_23318(), this.method_23321(), class04891, this.method_5634(), 1.0F, this.field_5974.z() * 0.4F + 0.8F
            );
         if (!this.method_73183().method_8608()) {
            this.m();
            if (!class06584.W()) {
               class06584.B(1);
            } else {
               class06584.N(1, var1, var2.N());
            }
         }

         return class07082.N;
      } else {
         return super.N(var1, var2);
      }
   }

   public boolean W() {
      return this.field_6011.N(L);
   }

   @Override
   protected void l_() {
      this.e.N(1, new class07427(this));
      this.e.N(2, new class07988(this));
      this.e.N(3, new class07464<>(this, class06129.class, 6.0F, 1.0, 1.2));
      this.e.N(3, new class07464<>(this, class07617.class, 6.0F, 1.0, 1.2));
      this.e.N(4, new class07999(this, 1.0, false));
      this.e.N(5, new class07957(this, 0.8));
      this.e.N(6, new class07962(this, class08036.class, 8.0F));
      this.e.N(6, new class07956(this));
      this.H.N(1, new class07952<>(this, class08036.class, true));
      this.H.N(2, new class07989(this));
   }

   @Override
   public class04891 method_6002() {
      return class04909.BJ;
   }

   @Override
   public boolean method_6121(class04782 var1, class07049 var2) {
      return true;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.Bo;
   }
}
