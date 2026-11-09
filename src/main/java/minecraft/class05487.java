package minecraft;

import java.util.stream.Stream;
import net.caffeinemc.mods.lithium.common.world.ChunkView;
import org.jspecify.annotations.Nullable;

public interface class05487 extends class03589, class05527, class07295, class07322, ChunkView {
   default Stream<class00500> L(class00734 var1) {
      int i = class04995.N(var1.N);
      int j = class04995.N(var1.u);
      int k = class04995.N(var1.y);
      int l = class04995.N(var1.i);
      int i1 = class04995.N(var1.L);
      int j1 = class04995.N(var1.R);
      return this.N(i, k, i1, j, l, j1) ? this.N(var1) : Stream.empty();
   }

   default boolean M(class07209 var1) {
      if (var1.method_10264() >= this.method_8615()) {
         return this.N_17(var1);
      } else {
         class07209 class07209x = new class07209(var1.method_10263(), this.method_8615(), var1.method_10260());
         if (!this.N_17(class07209x)) {
            return false;
         } else {
            for (class07209 class07209x = class07209x.method_10074();
               class07209x.method_10264() > var1.method_10264();
               class07209x = class07209x.method_10074()
            ) {
               class00500 class00500 = this.method_8320(class07209x);
               if (class00500.z() > 0 && !class00500.T()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   class01042 method_30349();

   boolean method_8608();

   @Override
   default int method_31607() {
      return this.method_8597().B();
   }

   default float B(class07209 var1) {
      return this.Z(var1) - 0.5F;
   }

   @Deprecated
   default float Z(class07209 var1) {
      float f = this.U(var1) / 15.0F;
      float f1 = f / (4.0F - 3.0F * f);
      return class04995.B(this.method_8597().E(), f1, 1.0F);
   }

   default class03556<class00780> i(class07209 var1) {
      return this.method_22385().N(var1);
   }

   default int U(class07209 var1) {
      return this.N(var1, this.method_8594());
   }

   default boolean z(class07209 var1) {
      return this.method_8316(var1).N(class01231.N);
   }

   default boolean u(class00734 var1) {
      int i = class04995.N(var1.N);
      int j = class04995.L(var1.u);
      int k = class04995.N(var1.y);
      int l = class04995.L(var1.i);
      int i1 = class04995.N(var1.L);
      int j1 = class04995.L(var1.R);
      class07218 class07218 = new class07218();

      for (int k1 = i; k1 < j; k1++) {
         for (int l1 = k; l1 < l; l1++) {
            for (int i2 = i1; i2 < j1; i2++) {
               if (!this.method_8320(class07218.N(k1, l1, i2)).Y().W()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @Deprecated
   default boolean y(int var1, int var2) {
      return this.N(class01296.N(var1), class01296.N(var2));
   }

   default int y(class07830 var1, class07209 var2) {
      return this.method_8624(var1, var2.method_10263(), var2.method_10260());
   }

   @Deprecated
   default boolean E(class07209 var1) {
      return this.y(var1.method_10263(), var1.method_10260());
   }

   default <T> class01905<T> N_51(class05946<? extends class00751<? extends T>> var1) {
      return this.method_30349().<T>L(var1).N(this.method_45162());
   }

   @Deprecated
   boolean N(int var1, int var2);

   @Deprecated
   default boolean N(int var1, int var2, int var3, int var4) {
      int i = class01296.N(var1);
      int j = class01296.N(var3);
      int k = class01296.N(var2);
      int l = class01296.N(var4);

      for (int i1 = i; i1 <= j; i1++) {
         for (int j1 = k; j1 <= l; j1++) {
            if (!this.N(i1, j1)) {
               return false;
            }
         }
      }

      return true;
   }

   default class07209 N(class07830 var1, class07209 var2) {
      return new class07209(var2.method_10263(), this.method_8624(var1, var2.method_10263(), var2.method_10260()), var2.method_10260());
   }

   @Deprecated
   default boolean N(class07209 var1, class07209 var2) {
      return this.N(var1.method_10263(), var1.method_10264(), var1.method_10260(), var2.method_10263(), var2.method_10264(), var2.method_10260());
   }

   default int N(class07209 var1, int var2) {
      return var1.method_10263() >= -30000000 && var1.method_10260() >= -30000000 && var1.method_10263() < 30000000 && var1.method_10260() < 30000000
         ? this.method_22335(var1, var2)
         : 15;
   }

   @Deprecated
   default boolean N(int var1, int var2, int var3, int var4, int var5, int var6) {
      return var5 >= this.method_31607() && var2 <= this.method_31600() ? this.N(var1, var3, var4, var6) : false;
   }

   default boolean R(class07209 var1) {
      return this.method_8320(var1).P();
   }

   default class08050 lithium$getLoadedChunk(int var1, int var2) {
      return this.method_8402(var1, var2, class00549.m, false);
   }

   default boolean hasBiomes() {
      return true;
   }

   class03556<class00780> method_22387(int var1, int var2, int var3);

   @Nullable
   class08050 method_8402(int var1, int var2, class00549 var3, boolean var4);

   int method_8615();

   class07376 method_8597();

   class00611 method_75598();

   int method_8624(class07830 var1, int var2, int var3);

   class03767 method_45162();

   default class08050 method_8392(int var1, int var2) {
      return this.method_8402(var1, var2, class00549.m, true);
   }

   default class08050 method_8500(class07209 var1) {
      return this.method_8392(class01296.N(var1.method_10263()), class01296.N(var1.method_10260()));
   }

   class05517 method_22385();

   default class08050 method_22342(int var1, int var2, class00549 var3) {
      return this.method_8402(var1, var2, var3, true);
   }

   @Nullable
   @Override
   default class07290 method_22338(int var1, int var2) {
      return this.method_8402(var1, var2, class00549.L, false);
   }

   int method_8594();

   @Override
   default int method_31605() {
      return this.method_8597().Z();
   }

   @Override
   default int method_23752(class07209 var1, class03202 var2) {
      return var2.getColor(this.i(var1).N(), var1.method_10263(), var1.method_10260());
   }

   @Override
   default class03556<class00780> method_16359(int var1, int var2, int var3) {
      class08050 class08050 = this.method_8402(class01146.i(var1), class01146.i(var3), class00549.R, false);
      return class08050 != null ? class08050.method_16359(var1, var2, var3) : this.method_22387(var1, var2, var3);
   }

   default class03556 getBiomeFabric(class07209 var1) {
      return this.i(var1);
   }
}
