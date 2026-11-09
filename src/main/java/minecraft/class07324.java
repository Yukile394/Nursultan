package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public class class07324 {
   public static final Codec<class07324> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class02680.N.fieldOf("buy").forGetter(var0x -> var0x.L),
            class02680.N.lenientOptionalFieldOf("buyB").forGetter(var0x -> var0x.u),
            class06584.y.fieldOf("sell").forGetter(var0x -> var0x.i),
            Codec.INT.lenientOptionalFieldOf("uses", 0).forGetter(var0x -> var0x.R),
            Codec.INT.lenientOptionalFieldOf("maxUses", 4).forGetter(var0x -> var0x.M),
            Codec.BOOL.lenientOptionalFieldOf("rewardExp", true).forGetter(var0x -> var0x.B),
            Codec.INT.lenientOptionalFieldOf("specialPrice", 0).forGetter(var0x -> var0x.Z),
            Codec.INT.lenientOptionalFieldOf("demand", 0).forGetter(var0x -> var0x.z),
            Codec.FLOAT.lenientOptionalFieldOf("priceMultiplier", 0.0F).forGetter(var0x -> var0x.U),
            Codec.INT.lenientOptionalFieldOf("xp", 1).forGetter(var0x -> var0x.E)
         )
         .apply(var0, class07324::new)
   );
   public static final class02362<class04247, class07324> y = class02362.N(class07324::N, class07324::N);
   private final class02680 L;
   private final Optional<class02680> u;
   private final class06584 i;
   private int R;
   private final int M;
   private final boolean B;
   private int Z;
   private int z;
   private final float U;
   private final int E;

   public class06584 L() {
      return this.u.map(class02680::u).orElse(class06584.E);
   }

   public void M() {
      this.z = this.z + this.R - (this.M - this.R);
   }

   public int P() {
      return this.Z;
   }

   public int T() {
      return this.E;
   }

   private class07324(class02680 var1, Optional<class02680> var2, class06584 var3, int var4, int var5, boolean var6, int var7, int var8, float var9, int var10) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.R = var4;
      this.M = var5;
      this.B = var6;
      this.Z = var7;
      this.z = var8;
      this.U = var9;
      this.E = var10;
   }

   public class07324(class02680 var1, Optional<class02680> var2, class06584 var3, int var4, int var5, int var6, float var7) {
      this(var1, var2, var3, var4, var5, var6, var7, 0);
   }

   private class07324(class07324 var1) {
      this(var1.L, var1.u, var1.i.t(), var1.R, var1.M, var1.B, var1.Z, var1.z, var1.U, var1.E);
   }

   public class07324(class02680 var1, Optional<class02680> var2, class06584 var3, int var4, int var5, int var6, float var7, int var8) {
      this(var1, var2, var3, var4, var5, true, 0, var8, var7, var6);
   }

   public class07324(class02680 var1, Optional<class02680> var2, class06584 var3, int var4, int var5, float var6) {
      this(var1, var2, var3, 0, var4, var5, var6);
   }

   public class07324(class02680 var1, class06584 var2, int var3, int var4, float var5) {
      this(var1, Optional.empty(), var2, var3, var4, var5);
   }

   public class06584 B() {
      return this.i.t();
   }

   public int Z() {
      return this.R;
   }

   public Optional<class02680> i() {
      return this.u;
   }

   public boolean b() {
      return this.R >= this.M;
   }

   public float s() {
      return this.U;
   }

   public boolean n() {
      return this.B;
   }

   public void m() {
      this.Z = 0;
   }

   public class07324 t() {
      return new class07324(this);
   }

   public boolean v() {
      return this.R > 0;
   }

   public void j() {
      this.R = this.M;
   }

   public int U() {
      return this.M;
   }

   public void z() {
      this.R = 0;
   }

   public class02680 u() {
      return this.L;
   }

   public class06584 y() {
      return this.L.u().L(this.N(this.L));
   }

   public void y(int var1) {
      this.Z = var1;
   }

   public boolean y(class06584 var1, class06584 var2) {
      if (!this.N(var1, var2)) {
         return false;
      } else {
         var1.B(this.y().c());
         if (!this.L().R()) {
            var2.B(this.L().c());
         }

         return true;
      }
   }

   public void E() {
      this.R++;
   }

   public class06584 N() {
      return this.L.u();
   }

   private static void N(class04247 var0, class07324 var1) {
      class02680.y.encode(var0, var1.u());
      class06584.z.encode(var0, var1.R());
      class02680.L.encode(var0, var1.i());
      var0.writeBoolean(var1.b());
      var0.writeInt(var1.Z());
      var0.writeInt(var1.U());
      var0.writeInt(var1.T());
      var0.writeInt(var1.P());
      var0.writeFloat(var1.s());
      var0.writeInt(var1.W());
   }

   public boolean N(class06584 var1, class06584 var2) {
      if (!this.L.N(var1) || var1.c() < this.N(this.L)) {
         return false;
      } else {
         return !this.u.isPresent() ? var2.R() : this.u.get().N(var2) && var2.c() >= this.u.get().y();
      }
   }

   private int N(class02680 var1) {
      int ix = var1.y();
      int j = Math.max(0, class04995.y(ix * this.z * this.U));
      return class04995.N(ix + j + this.Z, 1, var1.u().U());
   }

   public void N(int var1) {
      this.Z += var1;
   }

   public static class07324 N(class04247 var0) {
      class02680 class02680 = class02680.y.decode(var0);
      class06584 class06584 = class06584.z.decode(var0);
      Optional<class02680> optional = class02680.L.decode(var0);
      boolean flag = var0.readBoolean();
      int ix = var0.readInt();
      int j = var0.readInt();
      int k = var0.readInt();
      int l = var0.readInt();
      float f = var0.readFloat();
      int i1 = var0.readInt();
      class07324 class07324 = new class07324(class02680, optional, class06584, ix, j, k, f, i1);
      if (flag) {
         class07324.j();
      }

      class07324.y(l);
      return class07324;
   }

   public int W() {
      return this.z;
   }

   public class06584 R() {
      return this.i;
   }
}
