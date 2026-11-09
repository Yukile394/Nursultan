package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01362 {
   public static final Codec<class01362> N = MapCodec.unitCodec(() -> N());
   Function<class00500, class04689> y = var0 -> class04689.N;
   boolean L = true;
   class07752 u = class07752.R;
   ToIntFunction<class00500> i = var0 -> 0;
   float R;
   float M;
   boolean B;
   boolean Z;
   float z = 0.6F;
   float U = 1.0F;
   float E = 1.0F;
   @Nullable
   private class05946<class00891> I;
   private class08216<class00891, Optional<class05946<class05074>>> J = var0 -> Optional.of(class05946.N(class04227.yJ, var0.N().R("blocks/")));
   private class08216<class00891, String> o = var0 -> class07536.N("block", var0.N());
   boolean W = true;
   boolean m;
   boolean P;
   @Deprecated
   boolean s;
   @Deprecated
   boolean T;
   boolean b;
   class04641 j = class04641.field_15974;
   boolean v = true;
   class08089 n = class08089.field_12648;
   boolean t;
   class01371<class07078<?>> G = (var0, var1, var2, var3) -> var0.L(var1, var2, class07211.field_11036) && var0.m() < 14;
   class01340 l = (var0, var1, var2) -> var0.W(var1, var2);
   class01340 d = (var0, var1, var2) -> var0.M() && var0.W(var1, var2);
   class01340 w = this.d;
   class01340 k = (var0, var1, var2) -> false;
   class01340 Y = (var0, var1, var2) -> false;
   boolean Q;
   class03767 O = class03794.M;
   @Nullable
   class01351 g;
   private static final float q = -0.25F;
   private static final float K = 0.25F;
   private static final int V = 16;

   public class01362 L(float var1) {
      this.E = var1;
      return this;
   }

   public class01362 L() {
      this.W = false;
      return this;
   }

   public class01362 L(class01340 var1) {
      this.w = var1;
      return this;
   }

   public class01362 M() {
      this.J = class08216.N(Optional.empty());
      return this;
   }

   public class01362 P() {
      this.v = false;
      return this;
   }

   public String T() {
      return this.o.get(Objects.requireNonNull(this.I, "Block id not set"));
   }

   protected class01362() {
      super();
   }

   public Optional<class05946<class05074>> B() {
      return this.J.get(Objects.requireNonNull(this.I, "Block id not set"));
   }

   public class01362 Z() {
      this.P = true;
      return this;
   }

   public class01362 i() {
      this.Z = true;
      return this;
   }

   public class01362 i(class01340 var1) {
      this.Y = var1;
      return this;
   }

   public class01362 i(float var1) {
      this.M = var1;
      return this;
   }

   public class01362 s() {
      this.t = true;
      return this;
   }

   public class01362 m() {
      this.B = true;
      return this;
   }

   public class01362 U() {
      this.b = true;
      return this;
   }

   public class01362 z() {
      this.s = true;
      return this;
   }

   public class01362 u() {
      return this.u(0.0F);
   }

   public class01362 u(float var1) {
      this.N(var1, var1);
      return this;
   }

   public class01362 u(class01340 var1) {
      this.k = var1;
      return this;
   }

   public class01362 y() {
      this.L = false;
      this.W = false;
      return this;
   }

   public class01362 y(class01340 var1) {
      this.d = var1;
      return this;
   }

   @Deprecated
   public static class01362 y(class01354 var0) {
      class01362 class01362x = new class01362();
      class01362 class01362x = var0.X;
      class01362x.M = class01362x.M;
      class01362x.R = class01362x.R;
      class01362x.L = class01362x.L;
      class01362x.Z = class01362x.Z;
      class01362x.i = class01362x.i;
      class01362x.y = class01362x.y;
      class01362x.u = class01362x.u;
      class01362x.z = class01362x.z;
      class01362x.U = class01362x.U;
      class01362x.Q = class01362x.Q;
      class01362x.W = class01362x.W;
      class01362x.m = class01362x.m;
      class01362x.P = class01362x.P;
      class01362x.s = class01362x.s;
      class01362x.T = class01362x.T;
      class01362x.b = class01362x.b;
      class01362x.j = class01362x.j;
      class01362x.B = class01362x.B;
      class01362x.g = class01362x.g;
      class01362x.v = class01362x.v;
      class01362x.O = class01362x.O;
      class01362x.Y = class01362x.Y;
      class01362x.n = class01362x.n;
      class01362x.t = class01362x.t;
      return class01362x;
   }

   public class01362 y(float var1) {
      this.U = var1;
      return this;
   }

   @Deprecated
   public class01362 E() {
      this.T = true;
      return this;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static class06889 N(class07209 var0, class01344 var1) {
      long ix = N(var0.method_10263(), var0.method_10260());
      long jx = class04043.N(ix);
      long kx = class04043.N(ix + -7046029254386353131L);
      class04053 class04053 = new class04053(jx, kx);
      float f = N(-0.25F, 0.25F, N(class04053.N()));

      float f1 = switch (var1) {
         case field_10657 -> {
            class04053.N();
            yield 0.0F;
         }
         case field_10655 -> N(-0.2F, 0.0F, N(class04053.N()));
         case field_10656 -> 0.0F;
      };
      float f2 = N(-0.25F, 0.25F, N(class04053.N()));
      return new class06889(f, f1, f2);
   }

   private static float N(long var0) {
      return (float)(var0 >>> 40) * 5.9604645E-8F;
   }

   private static float N(float var0, float var1, float var2) {
      if (var0 >= var1) {
         return var0;
      } else {
         float f = (var1 - var0) / 15.0F;
         float f1 = (float)Math.floor(16.0F * var2);
         return var0 + f1 * f;
      }
   }

   public static class01362 N() {
      return new class01362();
   }

   private void N(class01344 var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) && var1 != class01344.field_10656) {
         this.g = (var1x, var2x) -> N(var2x, var1);
      }
   }

   public static class01362 N(class01354 var0) {
      class01362 class01362x = y(var0);
      class01362 class01362x = var0.X;
      class01362x.E = class01362x.E;
      class01362x.l = class01362x.l;
      class01362x.G = class01362x.G;
      class01362x.k = class01362x.k;
      class01362x.d = class01362x.d;
      class01362x.w = class01362x.w;
      class01362x.J = class01362x.J;
      class01362x.o = class01362x.o;
      return class01362x;
   }

   private static long N(int var0, int var1) {
      long ix = 116129781L * var1 ^ 13442693585698817L * Integer.toUnsignedLong(var0) >> 32;
      return (int)(ix * (42317861L * ix + 11L) >>> 16) ^ 7640891576956012809L;
   }

   public class01362 N(class04641 var1) {
      this.j = var1;
      return this;
   }

   public class01362 N(class01371<class07078<?>> var1) {
      this.G = var1;
      return this;
   }

   public class01362 N_9(class01340 var1) {
      this.l = var1;
      return this;
   }

   public class01362 N(float var1) {
      this.z = var1;
      return this;
   }

   public class01362 N_25(Function<class00500, class04689> var1) {
      this.y = var1;
      return this;
   }

   public class01362 N(float var1, float var2) {
      return this.i(var1).R(var2);
   }

   public class01362 N(ToIntFunction<class00500> var1) {
      this.i = var1;
      return this;
   }

   public class01362 N(Optional<class05946<class05074>> var1) {
      this.J = class08216.N(var1);
      return this;
   }

   public class01362 N(class07752 var1) {
      this.u = var1;
      return this;
   }

   public class01362 N(class05946<class00891> var1) {
      this.I = var1;
      return this;
   }

   public class01362 N(String var1) {
      this.o = class08216.N(var1);
      return this;
   }

   public class01362 N(class06563 var1) {
      this.y = var1x -> var1.u();
      return this;
   }

   public class01362 N(class08089 var1) {
      this.n = var1;
      return this;
   }

   public class01362 N(class04689 var1) {
      this.y = var1x -> var1;
      return this;
   }

   public class01362 N(class02957... var1) {
      this.O = class03794.i.N(var1);
      return this;
   }

   public class01362 N(class01344 var1) {
      this.g = switch (var1) {
         case field_10656 -> null;
         case field_10657 -> (var0, var1x) -> {
            class00891 class00891 = var0.i();
            long ix = class04995.y(var1x.method_10263(), 0, var1x.method_10260());
            float f = class00891.G();
            double d0 = class04995.N(((float)(ix & 15L) / 15.0F - 0.5) * 0.5, (double)(-f), (double)f);
            double d1 = class04995.N(((float)(ix >> 8 & 15L) / 15.0F - 0.5) * 0.5, (double)(-f), (double)f);
            return new class06889(d0, 0.0, d1);
         };
         case field_10655 -> (var0, var1x) -> {
            class00891 class00891 = var0.i();
            long ix = class04995.y(var1x.method_10263(), 0, var1x.method_10260());
            double d0 = ((float)(ix >> 4 & 15L) / 15.0F - 1.0) * class00891.l();
            float f = class00891.G();
            double d1 = class04995.N(((float)(ix & 15L) / 15.0F - 0.5) * 0.5, (double)(-f), (double)f);
            double d2 = class04995.N(((float)(ix >> 8 & 15L) / 15.0F - 0.5) * 0.5, (double)(-f), (double)f);
            return new class06889(d1, d0, d2);
         };
      };
      this.N(var1, null);
      return this;
   }

   public class01362 W() {
      this.m = true;
      return this;
   }

   public class01362 R() {
      this.Q = true;
      return this;
   }

   public class01362 R(float var1) {
      this.R = Math.max(0.0F, var1);
      return this;
   }
}
