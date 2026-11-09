package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.stream.IntStream;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class03780 extends class05096 {
   protected final class07267 L;
   private class03610 N;
   private final String[] y;
   private final boolean i;
   protected final class05904 u;
   private int R;
   private int M;
   @Nullable
   private class06125 B;

   private boolean L() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled()
         ? callbackinforeturnable.getReturnValueZ()
         : (class04453)this.field_22787.T_4 != null && !this.L.k() && !this.L.y(((class04453)this.field_22787.T_4).method_5667());
   }

   private void L(class01054 var1) {
      Vector3f vector3f = this.y();
      var1.i().scale(vector3f.x(), vector3f.y());
      int ix = this.N.N() ? this.N.y().R() : class08385.N(this.N);
      boolean flag = this.R / 6 % 2 == 0;
      int j = this.B.M();
      int k = this.B.B();
      int l = 4 * this.L.R() / 2;
      int i1 = this.M * this.L.R() - l;

      for (int j1 = 0; j1 < this.y.length; j1++) {
         String s = this.y[j1];
         if (s != null) {
            if (this.field_22793.N()) {
               s = this.field_22793.N(s);
            }

            int k1 = -this.field_22793.y(s) / 2;
            var1.N(this.field_22793, s, k1, j1 * this.L.R() - l, ix, false);
            if (j1 == this.M && j >= 0 && flag) {
               int l1 = this.field_22793.y(s.substring(0, Math.max(Math.min(j, s.length()), 0)));
               int i2 = l1 - this.field_22793.y(s) / 2;
               if (j >= s.length()) {
                  var1.N(this.field_22793, "_", i2, i1, ix, false);
               }
            }
         }
      }

      for (int k3 = 0; k3 < this.y.length; k3++) {
         String s1 = this.y[k3];
         if (s1 != null && k3 == this.M && j >= 0) {
            int l3 = this.field_22793.y(s1.substring(0, Math.max(Math.min(j, s1.length()), 0)));
            int i4 = l3 - this.field_22793.y(s1) / 2;
            if (flag && j < s1.length()) {
               var1.N(i4, i1 - 1, i4 + 1, i1 + this.L.R(), class02566.M(ix));
            }

            if (k != j) {
               int j4 = Math.min(j, k);
               int j2 = Math.max(j, k);
               int k2 = this.field_22793.y(s1.substring(0, j4)) - this.field_22793.y(s1) / 2;
               int l2 = this.field_22793.y(s1.substring(0, j2)) - this.field_22793.y(s1) / 2;
               int i3 = Math.min(k2, l2);
               int j3 = Math.max(k2, l2);
               var1.N(i3, i1, j3, i1 + this.L.R(), true);
            }
         }
      }
   }

   public class03780(class07267 var1, boolean var2, boolean var3) {
      this(var1, var2, var3, class00392.L("sign.edit"));
   }

   public class03780(class07267 var1, boolean var2, boolean var3, class00392 var4) {
      super(var4);
      this.L = var1;
      this.N = var1.N(var2);
      this.i = var2;
      this.u = class07036.N(var1.w().i());
      this.y = IntStream.range(0, 4).mapToObj(var2x -> this.N.N(var2x, var3)).map(class00392::getString).toArray(String[]::new);
   }

   private void u() {
      this.field_22787.N(null);
   }

   private void y(class01054 var1) {
      var1.i().pushMatrix();
      var1.i().translate(this.field_22789 / 2.0F, this.N());
      var1.i().pushMatrix();
      this.N(var1);
      var1.i().popMatrix();
      this.L(var1);
      var1.i().popMatrix();
   }

   protected abstract Vector3f y();

   private void N(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_4)) {
         var1.setReturnValue(this.L.O().method_20526(this.L.w()));
      }
   }

   protected abstract float N();

   private void N(String var1) {
      this.y[this.M] = var1;
      this.N = this.N.N(this.M, class00392.y(var1));
      this.L.N(this.N, this.i);
   }

   protected abstract void N(class01054 var1);

   @Override
   public void method_25426() {
      this.method_37063(class05362.method_46430(class05220.u, var1 -> this.u()).N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 144, 200, 20).N());
      this.B = new class06125(
         () -> this.y[this.M],
         this::N,
         class06125.N(this.field_22787),
         class06125.L(this.field_22787),
         var1 -> ((class01590)this.field_22787.i_3).y(var1) <= this.L.M()
      );
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.B()) {
         this.M = this.M - 1 & 3;
         this.B.R();
         return true;
      } else if (var1.Z() || var1.u()) {
         this.M = this.M + 1 & 3;
         this.B.R();
         return true;
      } else {
         return this.B.N(var1) ? true : super.method_25404(var1);
      }
   }

   @Override
   public void method_25393() {
      this.R++;
      if (!this.L()) {
         this.u();
      }
   }

   @Override
   public boolean method_73150() {
      return true;
   }

   @Override
   public void method_25432() {
      class01683 class01683 = this.field_22787.NE();
      if (class01683 != null) {
         class01683.N(new class07807(this.L.d(), this.i, this.y[0], this.y[1], this.y[2], this.y[3]));
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 40, -1);
      this.y(var1);
   }

   @Override
   public void method_25419() {
      this.u();
   }

   @Override
   public boolean method_25421() {
      return false;
   }

   @Override
   public boolean method_25400(class06626 var1) {
      this.B.N(var1);
      return true;
   }
}
