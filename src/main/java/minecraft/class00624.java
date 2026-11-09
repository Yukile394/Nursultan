package minecraft;

import Nursultan.class11066;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.Map;
import java.util.function.BiConsumer;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;

public class class00624 extends class07101 implements class06084, class11066 {
   public static final MapCodec<class00624> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01960.N.fieldOf("block_set_type").forGetter(var0x -> var0x.B), t()).apply(var0, class00624::new)
   );
   public static final class06667 y = class06665.d;
   public static final class08064<class08052> L = class06665.NZ;
   public static final class06667 u = class06665.k;
   public static final class06667 i = class06665.q;
   private static final Map<class07211, class00494> M = class00389.u(class00891.L(16.0, 13.0, 16.0));
   private final class01960 B;
   private static final Map Z;

   public class01960 L() {
      return this.B;
   }

   public class00624(class01960 var1, class01362 var2) {
      super(var2.N(var1.M()));
      this.B = var1;
      this.P(this.Q.y().y(R, class07211.field_11043).y(y, false).y(L, class08052.field_12617).y(u, false).y(i, false));
   }

   @Override
   public class00494 z(class00500 var1) {
      return ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)
         ? M.get(var1.L(y) ? var1.L(R) : (var1.L(L) == class08052.field_12619 ? class07211.field_11033 : class07211.field_11036))
         : super.z(var1);
   }

   private Map u() {
      return ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) ? Z : M;
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(i) ? class04684.L.N(false) : super.u(var1);
   }

   private void y(class00500 var1, class07299 var2, class07209 var3, @Nullable class08036 var4) {
      class00500 class00500 = var1.N(y);
      var2.method_8652(var3, class00500, 2);
      if (class00500.L(i)) {
         var2.N(var3, class04684.L, class04684.L.N(var2));
      }

      this.N(var4, var2, var3, class00500.L(y));
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(i)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(R, y, L, u, i);
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!this.B.L()) {
         return class07082.i;
      } else {
         this.y(var1, var2, var3, var4);
         return class07082.N;
      }
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      switch (var2) {
         case field_50:
            return var1.L(y);
         case field_48:
            return var1.L(i);
         case field_51:
            return var1.L(y);
         default:
            return false;
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return (class00494)this.u().get(var1.L(y) ? var1.L(R) : (var1.L(L) == class08052.field_12619 ? class07211.field_11033 : class07211.field_11036));
   }

   @Override
   public MapCodec<? extends class00624> N() {
      return N;
   }

   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = this.W();
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      class07211 class07211 = var1.method_8038();
      if (!var1.y() && class07211.z().L()) {
         class00500 = class00500.y(R, class07211)
            .y(L, var1.method_17698().B - var1.method_8037().method_10264() > 0.5 ? class08052.field_12619 : class08052.field_12617);
      } else {
         class00500 = class00500.y(R, var1.method_8042().b()).y(L, class07211 == class07211.field_11036 ? class08052.field_12617 : class08052.field_12619);
      }

      if (var1.method_8045().W(var1.method_8037())) {
         class00500 = class00500.y(y, true).y(u, true);
      }

      return class00500.y(i, class04688.N() == class04684.L);
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (!var2.method_8608()) {
         boolean flag = var2.W(var3);
         if (flag != var1.L(u)) {
            if (var1.L(y) != flag) {
               var1 = var1.y(y, flag);
               this.N(null, var2, var3, flag);
            }

            var2.method_8652(var3, var1.y(u, flag), 2);
            if (var1.L(i)) {
               var2.N(var3, class04684.L, class04684.L.N(var2));
            }
         }
      }
   }

   protected void N(@Nullable class08036 var1, class07299 var2, class07209 var3, boolean var4) {
      var2.method_8396(var1, var3, var4 ? this.B.U() : this.B.z(), class04911.field_15245, 1.0F, var2.method_8409().z() * 0.1F + 0.9F);
      var2.N(var1, var4 ? class01194.B : class01194.u, var3);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class07307 var4, BiConsumer<class06584, class07209> var5) {
      if (var4.M() && this.B.u() && !var1.L(u)) {
         this.y(var1, var2, var3, null);
      }

      super.N(var1, var2, var3, var4, var5);
   }
}
