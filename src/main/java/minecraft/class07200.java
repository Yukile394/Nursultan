package minecraft;

import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07200 extends class00891 {
   public static final MapCodec<class07200> N = y(class07200::new);
   public static final class08064<class07211> y = class07101.R;
   public static final class06667 L = class06665.U;
   private static final class00494 u = class00891.y(16.0, 0.0, 13.0);
   private static final class00494 i = class00389.N(u, class00891.y(8.0, 13.0, 16.0));
   @Nullable
   private static class06649 R;
   private static final class00494 M;
   private static final class00494 B;
   private static final class00494 Z;

   public class07200(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11043).y(L, false));
   }

   @Override
   public class00494 z(class00500 var1) {
      return ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) ? u : super.z(var1);
   }

   public static class06649 y() {
      if (R == null) {
         R = class06684.N()
            .N("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .N('?', class06646.N(class06670.N))
            .N('^', class06646.N(class06670.N(class00869.Mm).N(L, Predicates.equalTo(true)).N(y, Predicates.equalTo(class07211.field_11035))))
            .N('>', class06646.N(class06670.N(class00869.Mm).N(L, Predicates.equalTo(true)).N(y, Predicates.equalTo(class07211.field_11039))))
            .N('v', class06646.N(class06670.N(class00869.Mm).N(L, Predicates.equalTo(true)).N(y, Predicates.equalTo(class07211.field_11043))))
            .N('<', class06646.N(class06670.N(class00869.Mm).N(L, Predicates.equalTo(true)).N(y, Predicates.equalTo(class07211.field_11034))))
            .y();
      }

      return R;
   }

   @Override
   public class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         return var1.L(L) ? B : u;
      } else {
         return super.y_4(var1, var2, var3, var4);
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var5.setReturnValue(u);
      } else if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         var5.setReturnValue(Z);
      }
   }

   @Override
   public MapCodec<class07200> N() {
      return N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class00494)callbackinforeturnable.getReturnValue();
      } else {
         return var1.L(L) ? i : u;
      }
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(y, var1.method_8042().b()).y(L, false);
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return var1.L(L) ? 15 : 0;
   }

   @Override
   protected boolean a_(class00500 var1) {
      return true;
   }
}
