package minecraft;

import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.List;
import java.util.Map;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class05467 extends class05465 {
   public static final MapCodec<class05467> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class04206.i.T().fieldOf("candle").forGetter(var0x -> var0x.B), t()).apply(var0, class05467::new)
   );
   public static final class06667 u = class05465.y;
   private static final class00494 i = class00389.N(class00891.y(2.0, 8.0, 14.0), class00891.y(14.0, 0.0, 8.0));
   private static final Map<class05440, class05467> R = Maps.newHashMap();
   private static final Iterable<class06889> M = List.of(new class06889(8.0, 16.0, 8.0).L(0.0625));
   private final class05440 B;
   private static final class00494 Z;

   public class05467(class00891 var1, class01362 var2) {
      super(var2);
      this.P(this.Q.y().y(u, false));
      if (var1 instanceof class05440 class05440) {
         R.put(class05440, this);
         this.B = class05440;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + class05440.class + " was " + var1.getClass());
      }
   }

   public static boolean v(class00500 var0) {
      return var0.N(class01210.yl, var1 -> var1.y(u) && !var0.L(u));
   }

   @Override
   protected Iterable<class06889> U(class00500 var1) {
      return M;
   }

   @Override
   public class00494 z(class00500 var1) {
      return ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) ? i : super.z(var1);
   }

   public static class00500 N(class05440 var0) {
      return R.get(var0).W();
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   public MapCodec<class05467> N() {
      return L;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         var5.setReturnValue(Z);
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(u);
   }

   private static boolean N(class06183 var0) {
      return var0.y().B - var0.u().method_10264() > 0.5;
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      class07082 class07082 = class00868.N(var2, var3, class00869.ie.W(), var4);
      if (class07082.N()) {
         y(var1, var2, var3);
      }

      return class07082;
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      if (var1.N(class06570.sf) || var1.N(class06570.GZ)) {
         return class07082.i;
      } else if (N(var7) && var1.R() && var2.L(u)) {
         N(var5, var2, var3, var4);
         return class07082.N;
      } else {
         return super.N(var1, var2, var3, var4, var5, var6, var7);
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : i;
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return class00868.u;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5 == class07211.field_11033 && !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return new class06584(class00869.ie);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return var2.method_8320(var3.method_10074()).B();
   }
}
