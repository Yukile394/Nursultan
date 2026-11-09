package minecraft;

import Nursultan.class09403;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import net.caffeinemc.mods.sodium.client.world.biome.BiomeColorMaps;
import net.irisshaders.iris.mixinterface.ExtendedBiome;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class00780 implements ExtendedBiome {
   public static final Codec<class00780> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00777.u.forGetter(var0x -> var0x.M),
            class00587.u.optionalFieldOf("attributes", class00587.N).forGetter(var0x -> var0x.z),
            class05987.R.fieldOf("effects").forGetter(var0x -> var0x.W),
            class01029.y.forGetter(var0x -> var0x.B),
            class01002.L.forGetter(var0x -> var0x.Z)
         )
         .apply(var0, class00780::new)
   );
   public static final Codec<class00780> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00777.u.forGetter(var0x -> var0x.M),
            class00587.L.optionalFieldOf("attributes", class00587.N).forGetter(var0x -> var0x.z),
            class05987.R.fieldOf("effects").forGetter(var0x -> var0x.W)
         )
         .apply(var0, (var0x, var1, var2) -> new class00780(var0x, var1, var2, class01029.N, class01002.y))
   );
   public static final Codec<class03556<class00780>> L = class01281.N(class04227.NA, N);
   public static final Codec<class03543<class00780>> u = class03541.N(class04227.NA, N);
   private static final class05024 U = new class05024(new class07836(new class06075(1234L)), ImmutableList.of(0));
   static final class05024 i = new class05024(new class07836(new class06075(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final class05024 R = new class05024(new class07836(new class06075(2345L)), ImmutableList.of(0));
   private static final int E = 1024;
   public class00777 M;
   public final class01029 B;
   public final class01002 Z;
   public class00587 z;
   private final class05987 W;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m;
   private int P = -1;
   private boolean s;
   private int T;
   private boolean b;
   private int j;
   private int v;
   private class05987 n;

   private class04688 L(class05487 var1, class07209 var2) {
      return null;
   }

   public class01029 L() {
      return this.B;
   }

   public boolean L(class07209 var1, int var2) {
      return this.i(var1, var2) >= 0.15F;
   }

   public class05987 M() {
      return this.W;
   }

   private void P() {
      this.n = this.W;
      Optional optional = this.n.u();
      if (optional.isPresent()) {
         this.s = true;
         this.T = (Integer)optional.get();
      } else {
         this.s = false;
      }

      Optional optional1 = this.n.y();
      if (optional1.isPresent()) {
         this.b = true;
         this.j = (Integer)optional1.get();
      } else {
         this.b = false;
      }

      this.v = this.s();
   }

   class00780(class00777 var1, class00587 var2, class05987 var3, class01029 var4, class01002 var5) {
      super();
      this.m = ThreadLocal.withInitial(() -> {
         class09403 class09403 = new class09403(this, 1024, 0.25F);
         class09403.defaultReturnValue(Float.NaN);
         return class09403;
      });
      this.M = var1;
      this.B = var4;
      this.Z = var5;
      this.z = var2;
      this.W = var3;
      this.N(null);
   }

   public int B() {
      return this.W.N();
   }

   public int Z() {
      if (this.W != this.n) {
         this.P();
      }

      int ix;
      if (this.b) {
         ix = this.j;
      } else {
         ix = BiomeColorMaps.getFoliageColor(this.v);
      }

      return ix;
   }

   public float i() {
      return this.M.y();
   }

   @Deprecated
   public float i(class07209 var1, int var2) {
      return this.R(var1, var2);
   }

   private int s() {
      double d0 = class04995.N(this.M.y(), 0.0F, 1.0F);
      double d1 = class04995.N(this.M.u(), 0.0F, 1.0F);
      return BiomeColorMaps.getIndex(d0, d1);
   }

   private int U() {
      double d0 = class04995.N(this.M.y(), 0.0F, 1.0F);
      double d1 = class04995.N(this.M.u(), 0.0F, 1.0F);
      return class07287.N(d0, d1);
   }

   private int z() {
      Optional optional = this.W.u();
      return optional.isPresent() ? (Integer)optional.get() : this.U();
   }

   public boolean u(class07209 var1, int var2) {
      return this.i(var1, var2) > 0.1F;
   }

   public int u() {
      return this.W.L().orElseGet(this::W);
   }

   public boolean y(class05487 var1, class07209 var2) {
      if (this.N(var2, var1.method_8615()) != class00801.field_9383) {
         return false;
      } else {
         if (var1.L(var2.method_10264()) && var1.method_8314(class00772.field_9282, var2) < 10) {
            class00500 class00500 = var1.method_8320(var2);
            if ((class00500.P() || class00500.N(class00869.is)) && class00869.is.W().N(var1, var2)) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean y(class07209 var1, int var2) {
      return !this.L(var1, var2);
   }

   public boolean y() {
      return this.M.N();
   }

   private int E() {
      double d0 = class04995.N(this.M.y(), 0.0F, 1.0F);
      double d1 = class04995.N(this.M.u(), 0.0F, 1.0F);
      return class07289.N(d0, d1);
   }

   public class00801 N(class07209 var1, int var2) {
      if (!this.y()) {
         return class00801.field_9384;
      } else {
         return this.y(var1, var2) ? class00801.field_9383 : class00801.field_9382;
      }
   }

   private class00891 N(class00500 var1) {
      return var1.Y().N() == class04684.L ? var1.i() : null;
   }

   private class04651 N(class04688 var1) {
      return class04684.L;
   }

   private void N(CallbackInfo var1) {
      this.P();
   }

   public class01002 N() {
      return this.Z;
   }

   public int N(double var1, double var3) {
      if (this.W != this.n) {
         this.P();
      }

      int ix;
      if (this.s) {
         ix = this.T;
      } else {
         ix = BiomeColorMaps.getGrassColor(this.v);
      }

      class06009 class06009 = this.n.i();
      if (class06009 != class06009.field_26426) {
         ix = class06009.N(var1, var3, ix);
      }

      return ix;
   }

   public boolean N(class05487 var1, class07209 var2) {
      return this.N(var1, var2, true);
   }

   public boolean N(class05487 var1, class07209 var2, boolean var3) {
      if (this.L(var2, var1.method_8615())) {
         return false;
      } else {
         if (var1.L(var2.method_10264()) && var1.method_8314(class00772.field_9282, var2) < 10) {
            class00500 class00500 = var1.method_8320(var2);
            class04688 class04688 = this.L(var1, var2);
            if (this.N(class04688) == class04684.L && this.N(class00500) instanceof class07117) {
               if (!var3) {
                  return true;
               }

               if (!var1.z(var2.method_10067()) || !var1.z(var2.method_10078()) || !var1.z(var2.method_10095()) || !var1.z(var2.method_10072())) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public void setBiomeCategory(int var1) {
      this.P = var1;
   }

   public float getDownfall() {
      return this.M.u();
   }

   public int getBiomeCategory() {
      return this.P;
   }

   private int W() {
      double d0 = class04995.N(this.M.y(), 0.0F, 1.0F);
      double d1 = class04995.N(this.M.u(), 0.0F, 1.0F);
      return class08498.N(d0, d1);
   }

   public class00587 R() {
      return this.z;
   }

   private float R(class07209 var1, int var2) {
      float f = this.M.L().N(var1, this.i());
      int ix = var2 + 17;
      if (var1.method_10264() > ix) {
         float f1 = (float)(U.N(var1.method_10263() / 8.0F, var1.method_10260() / 8.0F, false) * 8.0);
         return f - (f1 + var1.method_10264() - ix) * 0.05F / 40.0F;
      } else {
         return f;
      }
   }
}
