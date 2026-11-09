package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07117 extends class00891 implements class00886 {
   private static final Codec<class05787> R = class04206.L
      .T()
      .comapFlatMap(
         var0 -> var0 instanceof class05787 ? DataResult.success((class05787)var0) : DataResult.error(() -> "Not a flowing fluid: " + var0), var0 -> var0
      );
   public static final MapCodec<class07117> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(R.fieldOf("fluid").forGetter(var0x -> var0x.L), t()).apply(var0, class07117::new)
   );
   public static final class08071 y = class06665.Nf;
   protected final class05787 L;
   private final List<class04688> M;
   public static final class00494 u = class00891.y(16.0, 0.0, 8.0);
   public static final ImmutableList<class07211> i = ImmutableList.of(
      class07211.field_11033, class07211.field_11035, class07211.field_11043, class07211.field_11034, class07211.field_11039
   );

   public class07117(class05787 var1, class01362 var2) {
      super(var2);
      this.L = var1;
      this.M = Lists.newArrayList();
      this.M.add(var1.N(false));

      for (int ix = 1; ix < 8; ix++) {
         this.M.add(var1.N(8 - ix, false));
      }

      this.M.add(var1.N(8, true));
      this.P(this.Q.y().y(y, 0));
   }

   @Override
   protected class04688 u(class00500 var1) {
      int ix = var1.L(y);
      return this.M.get(Math.min(ix, 8));
   }

   @Override
   protected boolean y(class00500 var1) {
      return false;
   }

   @Override
   protected boolean y(class00500 var1, class00500 var2, class07211 var3) {
      return var2.Y().N().N(this.L);
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class00494)callbackinforeturnable.getReturnValue();
      } else if (var4.u()) {
         return class00389.y();
      } else {
         return var4.N(u, var3, true) && var1.L(y) == 0 && var4.N(var2.method_8316(var3.method_10084()), var1.Y()) ? u : class00389.N();
      }
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      var1.Y().N(var2, var3, var4);
   }

   @Override
   public class06584 N(@Nullable class07438 var1, class07284 var2, class07209 var3, class00500 var4) {
      if (var4.L(y) == 0) {
         var2.method_8652(var3, class00869.N.W(), 11);
         return new class06584(this.L.N());
      } else {
         return class06584.E;
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   private void N(class07284 var1, class07209 var2) {
      var1.N(1501, var2, 0);
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
         var5.setReturnValue(class00389.N());
      }
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (this.N(var2, var3, var1)) {
         var2.N(var3, var1.Y().N(), this.L.N(var2));
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return class00389.N();
   }

   @Override
   protected List<class06584> N(class00500 var1, class04160 var2) {
      return Collections.emptyList();
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return !this.L.N(class01231.y);
   }

   @Override
   public MapCodec<class07117> N() {
      return N;
   }

   private boolean N(class07299 var1, class07209 var2, class00500 var3) {
      if (this.L.N(class01231.y)) {
         boolean flag = var1.method_8320(var2.method_10074()).N(class00869.ik);
         UnmodifiableIterator unmodifiableiterator = i.iterator();

         while (unmodifiableiterator.hasNext()) {
            class07211 class07211 = (class07211)unmodifiableiterator.next();
            class07209 class07209 = var2.method_10093(class07211.b());
            if (var1.method_8316(class07209).N(class01231.N)) {
               class00891 class00891 = var1.method_8316(var2).u() ? class00869.LV : class00869.W;
               var1.method_8501(var2, class00891.W());
               this.N(var1, var2);
               return false;
            }

            if (flag && var1.method_8320(class07209).N(class00869.mf)) {
               var1.method_8501(var2, class00869.iY.W());
               this.N(var1, var2);
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.Y().u() || var7.Y().u()) {
         var3.N(var4, var1.Y().N(), this.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (this.N(var2, var3, var1)) {
         var2.N(var3, var1.Y().N(), this.L.N(var2));
      }
   }

   @Override
   public Optional<class04891> s_() {
      return this.L.z();
   }

   @Override
   protected class06898 d_(class00500 var1) {
      return class06898.field_11455;
   }

   @Override
   protected boolean e_(class00500 var1) {
      return var1.Y().M();
   }
}
