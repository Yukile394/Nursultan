package minecraft;

import Nursultan.class09956;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import net.caffeinemc.mods.lithium.common.block.entity.ShapeUpdateHandlingBlockBehaviour;
import net.fabricmc.fabric.mixin.content.registry.BlockBehaviourAccessor;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class01354 implements class02995, ShapeUpdateHandlingBlockBehaviour, BlockBehaviourAccessor {
   public static final class07211[] g = new class07211[]{
      class07211.field_11039, class07211.field_11034, class07211.field_11043, class07211.field_11035, class07211.field_11033, class07211.field_11036
   };
   protected final boolean I;
   protected final float J;
   protected final boolean o;
   protected final class07752 q;
   protected final float K;
   public float V;
   protected final float e;
   protected final boolean H;
   protected final class03767 c;
   public final class01362 X;
   protected final Optional<class05946<class05074>> a;
   protected final String p;

   public final String w() {
      return this.p;
   }

   protected class00494 L(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.y_4(var1, var2, var3, var4);
   }

   protected abstract class00891 P();

   public class01354(class01362 var1) {
      super();
      this.I = var1.L;
      this.a = var1.B();
      this.p = var1.T();
      this.J = var1.R;
      this.o = var1.Z;
      this.q = var1.u;
      this.K = var1.z;
      this.V = var1.U;
      this.e = var1.E;
      this.H = var1.Q;
      this.c = var1.O;
      this.X = var1;
   }

   public abstract class06581 B();

   protected boolean i(class00500 var1) {
      return false;
   }

   public class01362 n() {
      return this.X;
   }

   protected float l() {
      return 0.2F;
   }

   public final Optional<class05946<class05074>> d() {
      return this.a;
   }

   public class04689 k() {
      return this.X.y.apply(this.P().W());
   }

   protected static <B extends class00891> RecordCodecBuilder<B, class01362> t() {
      return class01362.N.fieldOf("properties").forGetter(class01354::n);
   }

   protected class07752 j(class00500 var1) {
      return this.q;
   }

   public class00494 z(class00500 var1) {
      return var1.R(class00515.field_12294, class07209.field_10980);
   }

   public class00494 u(class00500 var1, class07290 var2, class07209 var3) {
      return this.y_4(var1, var2, var3, class06092.N());
   }

   protected class04688 u(class00500 var1) {
      return class04684.N.M();
   }

   protected boolean y(class00500 var1) {
      return !class00891.N(var1.R(class00515.field_12294, class07209.field_10980)) && var1.Y().W();
   }

   protected boolean y(class00500 var1, class00500 var2, class07211 var3) {
      return false;
   }

   protected int y(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return 0;
   }

   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
   }

   protected float y(class00500 var1, class07290 var2, class07209 var3) {
      return var1.W(var2, var3) ? 0.2F : 1.0F;
   }

   public static <B extends class00891> MapCodec<B> y(Function<class01362, B> var0) {
      return RecordCodecBuilder.mapCodec(var1 -> var1.group(t()).apply(var1, var0));
   }

   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.I ? var1.R(var2, var3) : class00389.N();
   }

   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
   }

   protected abstract MapCodec<? extends class00891> N();

   protected float N(class00500 var1, class08036 var2, class07290 var3, class07209 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueF();
      } else {
         float f = var1.i(var3, var4);
         if (f == -1.0F) {
            return 0.0F;
         } else {
            int i = var2.method_7305(var1) ? 30 : 100;
            return var2.method_7351(var1) / f / i;
         }
      }
   }

   protected void N(class00500 var1, class04782 var2, class07209 var3, class06584 var4, boolean var5) {
   }

   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return class00389.y();
   }

   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class07049 var4) {
      return class00389.y();
   }

   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
   }

   protected void N(class07299 var1, class00500 var2, class06183 var3, class08005 var4) {
   }

   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return new class06584(this.B());
   }

   protected boolean N(class00500 var1, class08791 var2) {
      switch (var2) {
         case field_50:
            return !var1.W(class00515.field_12294, class07209.field_10980);
         case field_48:
            return var1.Y().N(class01231.N);
         case field_51:
            return !var1.W(class00515.field_12294, class07209.field_10980);
         default:
            return false;
      }
   }

   protected int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return 0;
   }

   @class09956(
      N = "entityInside"
   )
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
   }

   protected void N(class00500 var1, class07284 var2, class07209 var3, int var4, int var5) {
   }

   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, null);
      return var1;
   }

   protected class00500 N(class00500 var1, class06993 var2) {
      return var1;
   }

   protected class00500 N(class00500 var1, class07111 var2) {
      return var1;
   }

   protected boolean N(class00500 var1, class06942 var2) {
      return var1.d() && (var2.method_8041().R() || !var2.method_8041().N(this.B()));
   }

   protected boolean N(class00500 var1, class04651 var2) {
      return var1.d() || !var1.B();
   }

   protected List<class06584> N(class00500 var1, class04160 var2) {
      if (this.a.isEmpty()) {
         return Collections.emptyList();
      } else {
         class04162 class04162 = var2.N(class06551.Z, var1).N(class06925.j);
         return class04162.N().method_8503().yd().N(this.a.get()).N(class04162);
      }
   }

   protected boolean N(class00500 var1, class07299 var2, class07209 var3, int var4, int var5) {
      return false;
   }

   protected boolean N(class00500 var1) {
      return false;
   }

   public class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      return class07082.R;
   }

   private void N(class00500 var1, class08036 var2, class07290 var3, class07209 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_6tor1_4_7)) {
         float f = var1.i(var3, var4);
         if (f == -1.0F) {
            var5.setReturnValue(0.0F);
         } else if (!var2.method_7305(var1)) {
            var5.setReturnValue(1.0F / f / 100.0F);
         } else {
            var5.setReturnValue(var2.method_7351(var1) / f / 30.0F);
         }
      }
   }

   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      return class07082.i;
   }

   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
   }

   private void N(
      class00500 var1,
      class05487 var2,
      class08713 var3,
      class07209 var4,
      class07211 var5,
      class07209 var6,
      class00500 var7,
      class06069 var8,
      CallbackInfoReturnable var9
   ) {
      this.lithium$handleShapeUpdate(var2, var1, var4, var6, var7);
   }

   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
   }

   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return 0;
   }

   @Nullable
   protected class06237 N(class00500 var1, class07299 var2, class07209 var3) {
      return null;
   }

   protected long N(class00500 var1, class07209 var2) {
      return class04995.N(var2);
   }

   protected void N(class00500 var1, class04782 var2, class07209 var3, class07307 var4, BiConsumer<class06584, class07209> var5) {
      if (!var1.P() && var4.y() != class07302.field_47331) {
         class00891 class00891 = var1.i();
         boolean flag = var4.L() instanceof class08036;
         if (class00891.N(var4)) {
            class00394 class00394 = var1.k() ? var2.method_8321(var3) : null;
            class04160 class04160 = new class04160(var2)
               .N(class06551.B, class06889.y(var3))
               .N(class06551.U, class06584.E)
               .y(class06551.z, class00394)
               .y(class06551.N, var4.u());
            if (var4.y() == class07302.field_40879) {
               class04160.N(class06551.E, var4.i());
            }

            var1.N(var2, var3, class06584.E, flag);
            var1.N(class04160).forEach(var2x -> var5.accept(var2x, var3));
         }

         var2.method_8652(var3, class00869.N.W(), 3);
         class00891.N_5(var2, var3, var4);
      }
   }

   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return true;
   }

   protected boolean a_(class00500 var1) {
      return false;
   }

   protected boolean a_(class00500 var1, class07290 var2, class07209 var3) {
      return class00891.N(var1.M(var2, var3));
   }

   protected void a_(class00500 var1, class07299 var2, class07209 var3, class08036 var4) {
   }

   protected float G() {
      return 0.25F;
   }

   public float Y() {
      return this.X.M;
   }

   protected class06898 d_(class00500 var1) {
      return class06898.field_11458;
   }

   protected boolean i_(class00500 var1) {
      return false;
   }

   protected class00494 b_(class00500 var1, class07290 var2, class07209 var3) {
      return class00389.N();
   }

   protected int b_(class00500 var1) {
      if (var1.t()) {
         return 15;
      } else {
         return var1.Z() ? 0 : 1;
      }
   }

   protected boolean e_(class00500 var1) {
      return this.o;
   }

   @Override
   public class03767 method_45322() {
      return this.c;
   }
}
