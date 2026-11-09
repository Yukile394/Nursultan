package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;

public class class00410 extends class00891 {
   public static final MapCodec<class00410> N = y(class00410::new);
   private static final class00494 y = class00891.y(16.0, 0.0, 1.0);
   private static final class00494 L;

   public class00410(class01362 var1) {
      super(var1);
   }

   @Override
   public class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_7_6) ? L : super.y_4(var1, var2, var3, var4);
   }

   @Override
   public MapCodec<? extends class00410> N() {
      return N;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return y;
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return !var2.R(var3.method_10074());
   }
}
