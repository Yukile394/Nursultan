package minecraft;

import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00757 extends class00891 {
   public static final MapCodec<class00757> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class04206.i.T().fieldOf("potted").forGetter(var0x -> var0x.u), t()).apply(var0, class00757::new)
   );
   private static final Map<class00891, class00891> y = Maps.newHashMap();
   private static final class00494 L = class00891.y(6.0, 0.0, 6.0);
   private final class00891 u;

   private boolean L() {
      return this.u == class00869.N;
   }

   public class00757(class00891 var1, class01362 var2) {
      super(var2);
      this.u = var1;
      y.put(var1, this);
   }

   public class00500 U(class00500 var1) {
      if (var1.N(class00869.nh)) {
         return class00869.nr.W();
      } else {
         return var1.N(class00869.nr) ? class00869.nh.W() : var1;
      }
   }

   public class00891 y() {
      return this.u;
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (this.e_(var1)) {
         boolean flag = this.u == class00869.nx;
         boolean flag1 = var2.method_75728().N(class00608.o, var3).y(flag);
         if (flag != flag1) {
            var2.method_8652(var3, this.U(var1), 3);
            class08846 class08846 = class08846.N(flag).L();
            class08846.N(var2, var3, var4);
            var2.method_8396(null, var3, class08846.i(), class04911.field_15245, 1.0F, 1.0F);
         }
      }

      super.y_2(var1, var2, var3, var4);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   private void N(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_10) && this.u != class00869.N) {
         var1.setReturnValue(class07082.L);
      }
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      class00500 class00500 = (var1.B() instanceof class06918 class06918 ? y.getOrDefault(class06918.L(), class00869.N) : class00869.N).W();
      if (class00500.P()) {
         return class07082.R;
      } else if (!this.L()) {
         return class07082.L;
      } else {
         var3.method_8652(var4, class00500, 3);
         var3.N(var5, class01194.L, var4);
         var5.method_7281(class01235.Nz);
         var1.N(1, var5);
         return class07082.N;
      }
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (this.L()) {
         return class07082.L;
      } else {
         class06584 class06584 = new class06584;
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
         this.N(callbackinforeturnable);
         if (callbackinforeturnable.isCancelled()) {
            return (class07082)callbackinforeturnable.getReturnValue();
         } else {
            class06584./* $VF: Unable to resugar constructor */<init>(this.u);
            class06584 class06584x = class06584;
            if (!var4.method_7270(class06584x)) {
               var4.method_7328(class06584x, false);
            }

            var2.method_8652(var3, class00869.MJ.W(), 3);
            var2.N(var4, class01194.L, var3);
            return class07082.N;
         }
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return L;
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return this.L() ? super.N(var1, var2, var3, var4) : new class06584(this.u);
   }

   @Override
   public MapCodec<class00757> N() {
      return N;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5 == class07211.field_11033 && !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected boolean e_(class00500 var1) {
      return var1.N(class00869.nh) || var1.N(class00869.nr);
   }
}
