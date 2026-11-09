package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06952 extends class07482 {
   protected static final int N = 0;
   protected static final int y = 1;
   protected static final int L = 2;
   private static final int u = 3;
   private static final int i = 30;
   private static final int R = 30;
   private static final int j = 39;
   private static final int v = 136;
   private static final int n = 162;
   private static final int t = 220;
   private static final int G = 37;
   private final class07288 l;
   private final class06917 d;
   private int w;
   private boolean k;
   private boolean Y;

   public void M(int var1) {
      this.w = var1;
   }

   public boolean P() {
      return this.Y;
   }

   public boolean T() {
      return this.k;
   }

   public class06952(int var1, class08044 var2) {
      this(var1, var2, new class08013(var2.z));
   }

   public class06952(int var1, class08044 var2, class07288 var3) {
      super(class05851.field_17340, var1);
      this.l = var3;
      this.d = new class06917(var3);
      this.N(new class06937(this.d, 0, 136, 37));
      this.N(new class06937(this.d, 1, 162, 37));
      this.N(new class06928(var2.z, var3, this.d, 2, 220, 37));
      this.L(var2, 108, 84);
   }

   public void B(int var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (var1 >= 0 && this.s().size() > var1) {
            class06584 class06584x = this.d.method_5438(0);
            if (!class06584x.R()) {
               if (!this.N(class06584x, 3, 39, true)) {
                  return;
               }

               this.d.method_5447(0, class06584x);
            }

            class06584 class06584x = this.d.method_5438(1);
            if (!class06584x.R()) {
               if (!this.N(class06584x, 3, 39, true)) {
                  return;
               }

               this.d.method_5447(1, class06584x);
            }

            if (this.d.method_5438(0).R() && this.d.method_5438(1).R()) {
               class07324 class07324 = this.s().get(var1);
               this.N(0, class07324.u());
               class07324.i().ifPresent(var1x -> this.N(1, var1x));
            }
         }
      }
   }

   private void b() {
      if (!this.l.L()) {
         class07049 class07049 = (class07049)this.l;
         class07049.method_73183()
            .method_8486(class07049.method_23317(), class07049.method_23318(), class07049.method_23321(), this.l.R(), class04911.field_15254, 1.0F, 1.0F, false);
      }
   }

   public class07316 s() {
      return this.l.y();
   }

   public int m() {
      return this.w;
   }

   public void y(boolean var1) {
      this.Y = var1;
   }

   @Override
   public void y(class08036 var1) {
      super.y(var1);
      this.l.N(null);
      if (!this.l.L()) {
         if (!var1.method_5805() || var1 instanceof class04770 && ((class04770)var1).method_14239()) {
            class06584 class06584 = this.d.method_5441(0);
            if (!class06584.R()) {
               var1.method_7328(class06584, false);
            }

            class06584 = this.d.method_5441(1);
            if (!class06584.R()) {
               var1.method_7328(class06584, false);
            }
         } else if (var1 instanceof class04770) {
            var1.method_31548().B(this.d.method_5441(0));
            var1.method_31548().B(this.d.method_5441(1));
         }
      }
   }

   @Override
   public void y(class06695 var1) {
      this.d.N();
      super.y(var1);
   }

   public int E() {
      return this.l.u();
   }

   public void N(class07316 var1) {
      this.l.N(var1);
   }

   private void N(int var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
         var2.cancel();
         if (var1 >= this.s().size()) {
            return;
         }

         class03443 class03443 = (class03443)class06202.Nq().T_2;
         class04453 class04453 = (class04453)class06202.Nq().T_4;
         if (!this.d.method_5438(0).R()) {
            int ix = this.d.method_5438(0).c();
            class03443.N(this.b, 0, 0, class07510.field_7794, class04453);
            if (ix == this.d.method_5438(0).c()) {
               return;
            }
         }

         if (!this.d.method_5438(1).R()) {
            int jx = this.d.method_5438(1).c();
            class03443.N(this.b, 1, 0, class07510.field_7794, class04453);
            if (jx == this.d.method_5438(1).c()) {
               return;
            }
         }

         if (this.d.method_5438(0).R() && this.d.method_5438(1).R()) {
            class07324 class07324 = this.s().get(var1);
            this.N(class03443, class04453, 0, class07324.u());
            class07324.i().ifPresent(var3x -> this.N(class03443, class04453, 1, var3x));
         }
      }
   }

   private void N(class06584 var1, class06937 var2, CallbackInfoReturnable var3) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
         var3.setReturnValue(true);
      }
   }

   private void N(class03443 var1, class04453 var2, int var3, class02680 var4) {
      int ix;
      for (ix = 3; ix < 39; ix++) {
         class06584 class06584x = this.T.get(ix).i();
         if (!class06584x.R() && var4.N(class06584x)) {
            class06584 class06584x = this.d.method_5438(var3);
            if (class06584x.R() || class06584.L(class06584x, class06584x)) {
               break;
            }
         }
      }

      if (ix != 39) {
         boolean flag = !((class07482)var2.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M().R();
         var1.N(this.b, ix, 0, class07510.field_7790, var2);
         var1.N(this.b, ix, 0, class07510.field_7793, var2);
         var1.N(this.b, var3, 0, class07510.field_7790, var2);
         if (flag) {
            var1.N(this.b, ix, 0, class07510.field_7790, var2);
         }
      }
   }

   public void N(int var1) {
      this.d.N(var1);
   }

   @Override
   public boolean N(class08036 var1) {
      return this.l.y(var1);
   }

   public void N(boolean var1) {
      this.k = var1;
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      class06584 class06584x = class06584.E;
      class06937 class06937 = this.T.get(var2);
      if (class06937 != null && class06937.R()) {
         class06584 class06584x = class06937.i();
         class06584x = class06584x.t();
         if (var2 == 2) {
            if (!this.N(class06584x, 3, 39, true)) {
               return class06584.E;
            }

            class06937.y(class06584x, class06584x);
            this.b();
         } else if (var2 != 0 && var2 != 1) {
            if (var2 >= 3 && var2 < 30) {
               if (!this.N(class06584x, 30, 39, false)) {
                  return class06584.E;
               }
            } else if (var2 >= 30 && var2 < 39 && !this.N(class06584x, 3, 30, false)) {
               return class06584.E;
            }
         } else if (!this.N(class06584x, 3, 39, false)) {
            return class06584.E;
         }

         if (class06584x.R()) {
            class06937.u(class06584.E);
         } else {
            class06937.M();
         }

         if (class06584x.c() == class06584x.c()) {
            return class06584.E;
         }

         class06937.N(var1, class06584x);
      }

      return class06584x;
   }

   @Override
   public boolean N(class06584 var1, class06937 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : false;
   }

   private void N(int var1, class02680 var2) {
      for (int ix = 3; ix < 39; ix++) {
         class06584 class06584xx = this.T.get(ix).i();
         if (!class06584xx.R() && var2.N(class06584xx)) {
            class06584 class06584x = this.d.method_5438(var1);
            if (class06584x.R() || class06584.L(class06584xx, class06584x)) {
               int jx = class06584xx.U();
               int kx = Math.min(jx - class06584x.c(), class06584xx.c());
               class06584 class06584xx = class06584xx.L(class06584x.c() + kx);
               class06584xx.B(kx);
               this.d.method_5447(var1, class06584xx);
               if (class06584xx.c() >= jx) {
                  break;
               }
            }
         }
      }
   }

   public int W() {
      return this.d.L();
   }

   public void R(int var1) {
      this.l.N(var1);
   }
}
