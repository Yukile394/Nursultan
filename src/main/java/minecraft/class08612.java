package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.function.Function;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class08612 extends class00864 implements class00873, class08614 {
   public static final MapCodec<class08612> N = y(class08612::new);
   public static final class08064<class07211> y = class06665.f;
   public static final class08071 L = class06665.C;
   private final Function<class00500, class00494> M;
   private static final class00494 B;

   @Override
   public double L() {
      return 3.0;
   }

   public class08612(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11043).y(L, 1));
      this.M = this.i();
   }

   private Function<class00500, class00494> i() {
      return this.N(this.N(y, L));
   }

   @Override
   public class08071 u() {
      return L;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return true;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L);
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      int i = var4.L(L);
      if (i < 4) {
         var1.method_8652(var3, var4.y(L, i + 1), 2);
      } else {
         N_21(var1, var3, new class06584(this));
      }
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20)) {
         var5.setReturnValue(B);
      }
   }

   @Override
   public class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   public class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   public boolean N(class00500 var1, class06942 var2) {
      return this.N(var1, var2, L) ? true : super.N(var1, var2);
   }

   @Override
   public class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : this.M.apply(var1);
   }

   @Override
   public MapCodec<class08612> N() {
      return N;
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.N(var1, this, L, y);
   }
}
