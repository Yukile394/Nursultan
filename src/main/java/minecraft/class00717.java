package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Objects;
import java.util.UUID;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangePublisher;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber.CountChangeSubscriber;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber.Multi;
import net.caffeinemc.mods.lithium.mixin.util.accessors.ItemEntityAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00717 extends class07049 implements class03244, ChangePublisher, CountChangeSubscriber, ItemEntityAccessor {
   private static final class02131<class06584> L = class03289.N(class00717.class, class02154.B);
   private static final float u = 0.1F;
   public static final float N = 0.2125F;
   private static final int i = 6000;
   private static final int R = 32767;
   private static final int M = -32768;
   private static final int B = 5;
   private static final short Z = 0;
   private static final short z = 0;
   private int U = 0;
   private int E = 0;
   private int W = 5;
   @Nullable
   private class08372<class07049> m;
   @Nullable
   private UUID P;
   public final float y = this.field_5974.z() * (float) Math.PI * 2.0F;
   private ChangeSubscriber s;
   private int T;

   public void L() {
      this.E = 10;
   }

   public void M() {
      this.U = -32768;
   }

   private void P() {
      class06584 class06584 = this.N();
      if (!class06584.R()) {
         class06584.lithium$subscribe(this, 0);
      }
   }

   @Override
   public boolean method_5659(class07307 var1) {
      return var1.B() ? super.method_5659(var1) : true;
   }

   @Nullable
   @Override
   public class04803 method_32318(int var1) {
      return var1 == 0 ? class04803.N(this::N, this::N) : super.method_32318(var1);
   }

   @Override
   public void method_5674(class02131<?> var1) {
      super.method_5674(var1);
      if (L.equals(var1)) {
         this.N().N((class07049)this);
      }
   }

   @Override
   public float method_73188() {
      return 180.0F - N(this.y() + 0.5F, this.y) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(L, class06584.E);
   }

   @Override
   public boolean method_5753() {
      return !this.N().N(this.method_48923().N()) || super.method_5753();
   }

   @Override
   public void method_5773() {
      if (this.N().R()) {
         this.method_31472();
      } else {
         super.method_5773();
         if (this.E > 0 && this.E != 32767) {
            this.E--;
         }

         this.field_6014 = this.method_23317();
         this.field_6036 = this.method_23318();
         this.field_5969 = this.method_23321();
         class06889 class06889x = this.method_18798();
         if (this.method_5799() && this.method_5861(class01231.N) > 0.1F) {
            this.U();
         } else if (this.method_5771() && this.method_5861(class01231.y) > 0.1F) {
            this.E();
         } else {
            this.method_56990();
         }

         if (this.method_73183().method_8608()) {
            this.field_5960 = false;
         } else {
            this.field_5960 = !this.method_73183().method_8587(this, this.method_5829().B(1.0E-7));
            if (this.field_5960) {
               this.method_5632(this.method_23317(), (this.method_5829().y + this.method_5829().i) / 2.0, this.method_23321());
            }
         }

         if (!this.method_24828() || this.method_18798().z() > 1.0E-5F || (this.field_6012 + this.method_5628()) % 4 == 0) {
            this.method_5784(class07451.field_6308, this.method_18798());
            this.method_61409();
            float f = 0.98F;
            if (this.method_24828()) {
               f = this.method_73183().method_8320(this.method_23314()).i().Z() * 0.98F;
            }

            this.method_18799(this.method_18798().u(f, 0.98, f));
            if (this.method_24828()) {
               class06889 class06889x = this.method_18798();
               if (class06889x.B < 0.0) {
                  this.method_18799(class06889x.u(1.0, -0.5, 1.0));
               }
            }
         }

         boolean flag = class04995.N(this.field_6014) != class04995.N(this.method_23317())
            || class04995.N(this.field_6036) != class04995.N(this.method_23318())
            || class04995.N(this.field_5969) != class04995.N(this.method_23321());
         int ix = flag ? 2 : 40;
         if (this.field_6012 % ix == 0 && !this.method_73183().method_8608() && this.m()) {
            this.W();
         }

         if (this.U != -32768) {
            this.U++;
         }

         this.field_64356 = this.field_64356 | this.method_5876();
         if (!this.method_73183().method_8608() && this.method_18798().u(class06889x).B() > 0.01) {
            this.field_64356 = true;
         }

         if (!this.method_73183().method_8608() && this.U >= 6000) {
            this.method_31472();
         }
      }
   }

   @Override
   public class04911 method_5634() {
      return class04911.field_15256;
   }

   @Override
   public final boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (this.method_64421(var2)) {
         return false;
      } else if (!var1.method_64395().N(class07305.I) && var2.u() instanceof class07079) {
         return false;
      } else if (!this.N().N(var2)) {
         return false;
      } else {
         this.method_5785();
         this.W = (int)(this.W - var3);
         this.method_32875(class01194.P, var2.u());
         if (this.W <= 0) {
            this.N().N(this);
            this.method_31472();
         }

         return true;
      }
   }

   @Override
   protected boolean method_64270() {
      return this.W <= 0 ? true : this.field_6012 % 10 == 0;
   }

   @Override
   protected class07065 method_33570() {
      return class07065.field_28630;
   }

   @Override
   public class07209 method_23314() {
      return this.method_43258(0.999999F);
   }

   @Override
   protected double method_7490() {
      return 0.04;
   }

   @Override
   public boolean method_33189() {
      return this.N().N(class01226.S);
   }

   @Override
   public void method_5694(class08036 var1) {
      if (!this.method_73183().method_8608()) {
         class06584 class06584 = this.N();
         class06581 class06581 = class06584.B();
         int ix = class06584.c();
         if (this.E == 0 && (this.P == null || this.P.equals(var1.method_5667())) && var1.method_31548().M(class06584)) {
            var1.method_6103(this, ix);
            if (class06584.R()) {
               this.method_31472();
               class06584.i(ix);
            }

            var1.method_7342(class01235.i.y(class06581), ix);
            var1.method_29499(this);
         }
      }
   }

   @Override
   protected void method_5652(class08329 var1) {
      var1.N("Health", (short)this.W);
      var1.N("Age", (short)this.U);
      var1.N("PickupDelay", (short)this.E);
      class08372.N(this.m, var1, "Thrower");
      var1.y("Owner", class01487.N, this.P);
      if (!this.N().R()) {
         var1.N("Item", class06584.y, this.N());
      }
   }

   @Override
   public final boolean method_5643(class07072 var1) {
      return this.method_64421(var1) ? false : this.N().N(var1);
   }

   @Override
   protected void method_5749(class08299 var1) {
      this.W = var1.N("Health", (short)5);
      this.U = var1.N("Age", (short)0);
      this.E = var1.N("PickupDelay", (short)0);
      this.P = var1.<UUID>N("Owner", class01487.N).orElse(null);
      this.m = class08372.N(var1, "Thrower");
      this.N(var1.<class06584>N("Item", class06584.y).orElse(class06584.E));
      if (this.N().R()) {
         this.method_31472();
      }
   }

   @Nullable
   @Override
   public class07049 method_5731(class01032 var1) {
      class07049 class07049 = super.method_5731(var1);
      if (!this.method_73183().method_8608() && class07049 instanceof class00717) {
         ((class00717)class07049).W();
      }

      return class07049;
   }

   @Override
   public class00392 method_5477() {
      class00392 class00392 = this.method_5797();
      return class00392 != null ? class00392 : this.N().k();
   }

   @Override
   public void method_5878(class07049 var1) {
      super.method_5878(var1);
      if (var1 instanceof class00717 class00717) {
         this.m = class00717.m;
      }
   }

   @Override
   public boolean method_5732() {
      return false;
   }

   public class00717(class07299 var1, double var2, double var4, double var6, class06584 var8, double var9, double var11, double var13) {
      this(class07078.Nt, var1);
      this.method_5814(var2, var4, var6);
      this.method_18800(var9, var11, var13);
      this.N(var8);
   }

   public class00717(class07299 var1, double var2, double var4, double var6, class06584 var8) {
      this(var1, var2, var4, var6, var8, var1.field_9229.U() * 0.2 - 0.1, 0.2, var1.field_9229.U() * 0.2 - 0.1);
   }

   public class00717(class07078<? extends class00717> var1, class07299 var2) {
      super(var1, var2);
      this.method_36456(this.field_5974.z() * 360.0F);
   }

   public void B() {
      this.U = -6000;
   }

   public void Z() {
      this.i();
      this.U = 5999;
   }

   public void i() {
      this.E = 32767;
   }

   private boolean m() {
      class06584 class06584 = this.N();
      return this.method_5805() && this.E != 32767 && this.U != -32768 && this.U < 6000 && class06584.c() < class06584.U();
   }

   private void U() {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.N(0.99F);
      }
   }

   @Nullable
   @Override
   public class07049 z() {
      return class08372.N(this.m, this.method_73183());
   }

   public void u() {
      this.E = 0;
   }

   public int y() {
      return this.U;
   }

   public void lithium$forceUnsubscribe(class06584 var1, int var2) {
      if (this.s != null) {
         this.s.lithium$forceUnsubscribe(this, this.T);
         this.s = null;
         this.T = 0;
      }
   }

   private void E() {
      this.N(0.95F);
   }

   private void N(class06584 var1, CallbackInfo var2) {
      if (this.s != null) {
         class06584 class06584 = this.N();
         if (class06584 != var1) {
            if (!class06584.R()) {
               class06584.lithium$unsubscribe(this);
            }

            if (!var1.R()) {
               var1.lithium$subscribe(this, this.T);
               this.s.lithium$notify(this, this.T);
            } else {
               this.s.lithium$forceUnsubscribe(this, this.T);
               this.s = null;
               this.T = 0;
            }
         }
      }
   }

   public void lithium$notify(class06584 var1, int var2) {
      if (var1 != this.N()) {
         throw new IllegalStateException("Received notification from an unexpected publisher");
      } else {
         if (this.s != null) {
            this.s.lithium$notify(this, this.T);
         }
      }
   }

   private void N(CallbackInfo var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var1.cancel();
      }
   }

   public static float N(float var0, float var1) {
      return var0 / 20.0F + var1;
   }

   public void lithium$notifyCount(class06584 var1, int var2, int var3) {
      if (var1 != this.N()) {
         throw new IllegalStateException("Received notification from an unexpected publisher");
      } else {
         ChangeSubscriber changesubscriber = this.s;
         if (changesubscriber instanceof CountChangeSubscriber) {
            ((CountChangeSubscriber)changesubscriber).lithium$notifyCount(this, this.T, var3);
         }
      }
   }

   public class06584 N() {
      return this.method_5841().N(L);
   }

   private void N(class00717 var1) {
      class06584 class06584x = this.N();
      class06584 class06584x = var1.N();
      if (Objects.equals(this.P, var1.P) && N(class06584x, class06584x)) {
         if (class06584x.c() < class06584x.c()) {
            N(this, class06584x, var1, class06584x);
         } else {
            N(var1, class06584x, this, class06584x);
         }
      }
   }

   private static void N(class00717 var0, class06584 var1, class06584 var2) {
      class06584 class06584 = N(var1, var2, 64);
      var0.N(class06584);
   }

   private void N(double var1) {
      class06889 class06889 = this.method_18798();
      this.method_18800(class06889.M * var1, class06889.B + (class06889.B < 0.06F ? 5.0E-4F : 0.0F), class06889.Z * var1);
   }

   public static class06584 N(class06584 var0, class06584 var1, int var2) {
      int ix = Math.min(Math.min(var0.U(), var2) - var0.c(), var1.c());
      class06584 class06584 = var0.L(var0.c() + ix);
      var1.B(ix);
      return class06584;
   }

   public static boolean N(class06584 var0, class06584 var1) {
      return var1.c() + var0.c() > var1.U() ? false : class06584.L(var0, var1);
   }

   public void N(int var1) {
      this.E = var1;
   }

   private static void N(class00717 var0, class06584 var1, class00717 var2, class06584 var3) {
      N(var0, var1, var3);
      var0.E = Math.max(var0.E, var2.E);
      var0.U = Math.min(var0.U, var2.U);
      if (var3.R()) {
         var2.method_31472();
      }
   }

   public void N(class07049 var1) {
      this.m = class08372.N(var1);
   }

   public void N(@Nullable UUID var1) {
      this.P = var1;
   }

   public void N(class06584 var1) {
      this.N(var1, null);
      this.method_5841().N(L, var1);
   }

   private void W() {
      if (this.m()) {
         for (class00717 class00717 : this.method_73183().N(class00717.class, this.method_5829().L(0.5, 0.0, 0.5), var1 -> var1 != this && var1.m())) {
            if (class00717.m()) {
               this.N(class00717);
               if (this.method_31481()) {
                  break;
               }
            }
         }
      }
   }

   public boolean R() {
      return this.E > 0;
   }

   public int lithium$unsubscribe(ChangeSubscriber var1) {
      int ix = ChangeSubscriber.dataOf(this.s, var1, this.T);
      this.T = ChangeSubscriber.dataWithout(this.s, var1, this.T);
      this.s = ChangeSubscriber.without(this.s, var1);
      if (this.s == null) {
         class06584 class06584 = this.N();
         if (!class06584.R()) {
            class06584.lithium$unsubscribe(this);
         }
      }

      return ix;
   }

   public void lithium$subscribe(ChangeSubscriber var1, int var2) {
      if (this.s == null) {
         this.P();
      }

      this.s = ChangeSubscriber.combine(this.s, this.T, var1, var2);
      if (this.s instanceof Multi) {
         this.T = 0;
      } else {
         this.T = var2;
      }
   }
}
