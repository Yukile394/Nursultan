package minecraft;

import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import net.caffeinemc.mods.lithium.common.util.Pos.ChunkCoord;
import net.caffeinemc.mods.lithium.common.util.Pos.SectionYIndex;
import net.caffeinemc.mods.lithium.common.world.ChunkView;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00783 implements class07290, class07322, ChunkView {
   protected final int N;
   protected final int y;
   protected final class08050[][] L;
   protected boolean u;
   protected final class07299 i;
   private final Supplier<class03556<class00780>> R;
   private static final class00500 M = class00869.N.W();
   private class08050[] B;
   private int Z;
   private int z;
   private int U;
   private int E;

   @Override
   public int method_31607() {
      return this.i.method_31607();
   }

   @Override
   public class00500 method_8320(class07209 var1) {
      int ix = var1.method_10264();
      if (ix >= this.U && ix <= this.E) {
         int j = var1.method_10263();
         int k = var1.method_10260();
         int l = ChunkCoord.fromBlockCoord(j) - this.N;
         int i1 = ChunkCoord.fromBlockCoord(k) - this.y;
         if (l >= 0 && l < this.Z && i1 >= 0 && i1 < this.z) {
            class08050 class08050 = this.B[l * this.z + i1];
            if (class08050 != null) {
               class00554 class00554 = class08050.u()[SectionYIndex.fromBlockCoord(this, ix)];
               if (class00554 != null) {
                  return class00554.N(j & 15, ix & 15, k & 15);
               }
            }
         }
      }

      return M;
   }

   @Override
   public List<class00494> method_20743(@Nullable class07049 var1, class00734 var2) {
      return List.of();
   }

   @Override
   public class08057 method_8621() {
      return this.i.method_8621();
   }

   @Override
   public class04688 method_8316(class07209 var1) {
      return this.method_8320(var1).Y();
   }

   public class00783(class07299 var1, class07209 var2, class07209 var3) {
      super();
      this.i = var1;
      this.R = Suppliers.memoize(() -> var1.method_30349().L(class04227.NA).y(class00795.y));
      this.N = class01296.N(var2.method_10263());
      this.y = class01296.N(var2.method_10260());
      int ix = class01296.N(var3.method_10263());
      int j = class01296.N(var3.method_10260());
      this.L = new class08050[ix - this.N + 1][j - this.y + 1];
      class00558 class00558 = var1.method_8398();
      this.u = true;

      for (int k = this.N; k <= ix; k++) {
         for (int l = this.y; l <= j; l++) {
            this.L[k - this.N][l - this.y] = class00558.N(k, l);
         }
      }

      for (int i1 = class01296.N(var2.method_10263()); i1 <= class01296.N(var3.method_10263()); i1++) {
         for (int j1 = class01296.N(var2.method_10260()); j1 <= class01296.N(var3.method_10260()); j1++) {
            class08050 class08050 = this.L[i1 - this.N][j1 - this.y];
            if (class08050 != null && !class08050.N(var2.method_10264(), var3.method_10264())) {
               this.u = false;
               this.N(var1, var2, var3, null);
               return;
            }
         }
      }

      this.N(var1, var2, var3, null);
   }

   private void N(class07299 var1, class07209 var2, class07209 var3, CallbackInfo var4) {
      this.Z = 1 + ChunkCoord.fromBlockCoord(var3.method_10263()) - ChunkCoord.fromBlockCoord(var2.method_10263());
      this.z = 1 + ChunkCoord.fromBlockCoord(var3.method_10260()) - ChunkCoord.fromBlockCoord(var2.method_10260());
      this.B = new class08050[this.Z * this.z];

      for (int ix = 0; ix < this.Z; ix++) {
         System.arraycopy(this.L[ix], 0, this.B, ix * this.z, this.z);
      }

      this.U = this.method_31607();
      this.E = this.method_31600();
   }

   private class08050 method_22338(int var1, int var2) {
      int ix = var1 - this.N;
      int j = var2 - this.y;
      if (ix >= 0 && ix < this.L.length && j >= 0 && j < this.L[ix].length) {
         class08050 class08050 = this.L[ix][j];
         return (class08050)(class08050 != null ? class08050 : new class00561(this.i, new class07321(var1, var2), this.R.get()));
      } else {
         return new class00561(this.i, new class07321(var1, var2), this.R.get());
      }
   }

   private class08050 N(class07209 var1) {
      return this.method_22338(class01296.N(var1.method_10263()), class01296.N(var1.method_10260()));
   }

   public class08050 lithium$getLoadedChunk(int var1, int var2) {
      return this.method_22338(var1, var2);
   }

   @Nullable
   @Override
   public class00394 method_8321(class07209 var1) {
      return this.N(var1).method_8321(var1);
   }

   @Override
   public int method_31605() {
      return this.i.method_31605();
   }
}
