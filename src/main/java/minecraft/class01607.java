package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01607 implements class05974 {
   private static final Logger N = LogUtils.getLogger();
   private final class02248<class02236> y;
   private final class08050 L;
   private final class04782 u;
   private final long i;
   private final class05087 M;
   private final class06069 B;
   private final class07376 Z;
   private final class01628<class00891> z = new class01628<>(var1x -> this.method_8500(var1x).P());
   private final class01628<class04651> U = new class01628<>(var1x -> this.method_8500(var1x).s());
   private final class05517 E;
   private final class02237 W;
   @Nullable
   private Supplier<String> m;
   private final AtomicLong P = new AtomicLong();
   private static final class01894 s = class01894.y("worldgen_region_random");

   public class07321 L() {
      return this.L.R();
   }

   private void P(class07209 var1) {
      this.method_8500(var1).u(var1);
   }

   @Override
   public class01042 method_30349() {
      return this.u.method_30349();
   }

   @Override
   public boolean method_8608() {
      return false;
   }

   @Override
   public int method_31607() {
      return this.u.method_31607();
   }

   @Override
   public class00500 method_8320(class07209 var1) {
      return this.method_8392(class01296.N(var1.method_10263()), class01296.N(var1.method_10260())).method_8320(var1);
   }

   @Override
   public void method_32888(class03556<class01194> var1, class06889 var2, class01164 var3) {
   }

   @Nullable
   @Override
   public class02796 method_8503() {
      return this.u.method_8503();
   }

   @Override
   public class08057 method_8621() {
      return this.u.method_8621();
   }

   @Override
   public void method_8406(class07126 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   @Override
   public class04688 method_8316(class07209 var1) {
      return this.method_8500(var1).method_8316(var1);
   }

   @Override
   public boolean method_8649(class07049 var1) {
      int ix = class01296.N(var1.method_31477());
      int j = class01296.N(var1.method_31479());
      this.method_8392(ix, j).N(var1);
      return true;
   }

   @Override
   public List<class08036> method_18456() {
      return Collections.emptyList();
   }

   public class01607(class04782 var1, class02248<class02236> var2, class02237 var3, class08050 var4) {
      super();
      this.W = var3;
      this.y = var2;
      this.L = var4;
      this.u = var1;
      this.i = var1.method_8412();
      this.M = var1.method_8401();
      this.B = var1.method_14178().W().N(s).N(this.L.R().W());
      this.Z = var1.method_8597();
      this.E = new class05517(this, class05517.N(this.i));
   }

   @Override
   public boolean u(class07209 var1) {
      int ix = class01296.N(var1.method_10263());
      int j = class01296.N(var1.method_10260());
      class07321 class07321 = this.L();
      int k = Math.abs(class07321.B - ix);
      int l = Math.abs(class07321.Z - j);
      if (k <= this.W.u() && l <= this.W.u()) {
         return !this.L.d() || !this.L.w().method_31601(var1.method_10264());
      } else {
         class07536.y(
            "Detected setBlock in a far chunk ["
               + ix
               + ", "
               + j
               + "], pos: "
               + var1
               + ", status: "
               + this.W.N()
               + (this.m == null ? "" : ", currently generating: " + this.m.get())
         );
         return false;
      }
   }

   @Nullable
   @Override
   public class08036 N(double var1, double var3, double var5, double var7, @Nullable Predicate<class07049> var9) {
      return null;
   }

   @Override
   public boolean N(int var1, int var2) {
      return this.L.R().R(var1, var2) < this.W.y().y();
   }

   @Override
   public void N(@Nullable Supplier<String> var1) {
      this.m = var1;
   }

   public boolean N(class07321 var1, int var2) {
      return this.u.method_14178().L.y(var1, var2);
   }

   @Override
   public class03556<class00780> method_22387(int var1, int var2, int var3) {
      return this.u.method_22387(var1, var2, var3);
   }

   @Override
   public class07052 method_8404(class07209 var1) {
      if (!this.N(class01296.N(var1.method_10263()), class01296.N(var1.method_10260()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new class07052(this.u.y(), this.u.method_8532(), 0L, this.u.method_76332(var1));
      }
   }

   @Nullable
   @Override
   public class08050 method_8402(int var1, int var2, class00549 var3, boolean var4) {
      int ix = this.L.R().R(var1, var2);
      class00549 class00549 = ix >= this.W.y().y() ? null : this.W.y().N(ix);
      class02236 class02236;
      if (class00549 != null) {
         class02236 = this.y.N(var1, var2);
         if (var3.L(class00549)) {
            class08050 class08050 = class02236.N(class00549);
            if (class08050 != null) {
               return class08050;
            }
         }
      } else {
         class02236 = null;
      }

      class07080 class07080 = class07080.N(new IllegalStateException("Requested chunk unavailable during world generation"), "Exception generating new chunk");
      class07074 class07074 = class07080.N("Chunk request details");
      class07074.N("Requested chunk", String.format(Locale.ROOT, "%d, %d", var1, var2));
      class07074.N("Generating status", () -> this.W.N().R());
      class07074.N("Requested status", var3::R);
      class07074.N("Actual status", () -> class02236 == null ? "[out of cache bounds]" : class02236.T().R());
      class07074.N("Maximum allowed status", () -> class00549 == null ? "null" : class00549.R());
      class07074.N("Dependencies", this.W.y()::toString);
      class07074.N("Requested distance", ix);
      class07074.N("Generating chunk", this.L.R()::toString);
      throw new class07878(class07080);
   }

   @Override
   public int method_8615() {
      return this.u.method_8615();
   }

   @Override
   public class07376 method_8597() {
      return this.Z;
   }

   @Override
   public void method_8444(@Nullable class07049 var1, int var2, class07209 var3, int var4) {
   }

   @Override
   public float method_24852(class07211 var1, boolean var2) {
      return 1.0F;
   }

   @Deprecated
   @Override
   public class04782 method_8410() {
      return this.u;
   }

   @Override
   public long method_8412() {
      return this.i;
   }

   @Override
   public class04298<class00891> method_8397() {
      return this.z;
   }

   @Override
   public class00611 method_75598() {
      return class00611.N;
   }

   @Override
   public int method_8624(class07830 var1, int var2, int var3) {
      return this.method_8392(class01296.N(var2), class01296.N(var3)).N(var1, var2 & 15, var3 & 15) + 1;
   }

   @Override
   public class03767 method_45162() {
      return this.u.method_45162();
   }

   @Override
   public class05087 method_8401() {
      return this.M;
   }

   @Override
   public class08050 method_8392(int var1, int var2) {
      return this.method_22342(var1, var2, class00549.L);
   }

   @Override
   public class04298<class04651> method_8405() {
      return this.U;
   }

   @Override
   public class00558 method_8398() {
      return this.u.method_14178();
   }

   @Override
   public boolean method_30092(class07209 var1, class00500 var2, int var3, int var4) {
      if (!this.u(var1)) {
         return false;
      } else {
         class08050 class08050 = this.method_8500(var1);
         class00500 class00500 = class08050.N(var1, var2, var3);
         if (class00500 != null) {
            this.u.method_66016(var1, class00500, var2);
         }

         if (var2.k()) {
            if (class08050.E().u() == class00544.field_12807) {
               class00394 class00394 = ((class07190)var2.i()).N(var1, var2);
               if (class00394 != null) {
                  class08050.N(class00394);
               } else {
                  class08050.N(var1);
               }
            } else {
               class07001 class07001 = new class07001();
               class07001.N("x", var1.method_10263());
               class07001.N("y", var1.method_10264());
               class07001.N("z", var1.method_10260());
               class07001.N_67("id", "DUMMY");
               class08050.N(class07001);
            }
         } else if (class00500 != null && class00500.k()) {
            class08050.N(var1);
         }

         if (var2.E(this, var1) && (var3 & 16) == 0) {
            this.P(var1);
         }

         return true;
      }
   }

   @Override
   public boolean method_8650(class07209 var1, boolean var2) {
      return this.method_8652(var1, class00869.N.W(), 3);
   }

   @Override
   public List<class07049> method_8333(@Nullable class07049 var1, class00734 var2, @Nullable Predicate<? super class07049> var3) {
      return Collections.emptyList();
   }

   @Override
   public boolean method_30093(class07209 var1, boolean var2, @Nullable class07049 var3, int var4) {
      class00500 class00500 = this.method_8320(var1);
      if (class00500.P()) {
         return false;
      } else {
         if (var2) {
            class00394 class00394 = class00500.k() ? this.method_8321(var1) : null;
            class00891.N(class00500, (class07299)this.u, var1, class00394, var3, class06584.E);
         }

         return this.method_30092(var1, class00869.N.W(), 3, var4);
      }
   }

   @Nullable
   @Override
   public class00394 method_8321(class07209 var1) {
      class08050 class08050 = this.method_8500(var1);
      class00394 class00394 = class08050.method_8321(var1);
      if (class00394 != null) {
         return class00394;
      } else {
         class07001 class07001 = class08050.i(var1);
         class00500 class00500 = class08050.method_8320(var1);
         if (class07001 != null) {
            if ("DUMMY".equals(class07001.y("id", ""))) {
               if (!class00500.k()) {
                  return null;
               }

               class00394 = ((class07190)class00500.i()).N(var1, class00500);
            } else {
               class00394 = class00394.N(var1, class00500, class07001, this.u.method_30349());
            }

            if (class00394 != null) {
               class08050.N(class00394);
               return class00394;
            }
         }

         if (class00500.k()) {
            N.warn("Tried to access a block entity before it was created. {}", var1);
         }

         return null;
      }
   }

   @Override
   public void method_8396(@Nullable class07049 var1, class07209 var2, class04891 var3, class04911 var4, float var5, float var6) {
   }

   @Override
   public <T extends class07049> List<T> method_18023(class01128<class07049, T> var1, class00734 var2, Predicate<? super T> var3) {
      return Collections.emptyList();
   }

   @Override
   public class05795 method_22336() {
      return this.u.method_22336();
   }

   @Override
   public long method_39224() {
      return this.P.getAndIncrement();
   }

   @Override
   public class05517 method_22385() {
      return this.E;
   }

   @Override
   public boolean method_35237(class07209 var1, Predicate<class04688> var2) {
      return var2.test(this.method_8316(var1));
   }

   @Override
   public int method_8594() {
      return 0;
   }

   @Override
   public int method_31605() {
      return this.u.method_31605();
   }

   @Override
   public class06069 method_8409() {
      return this.B;
   }

   @Override
   public boolean method_16358(class07209 var1, Predicate<class00500> var2) {
      return var2.test(this.method_8320(var1));
   }
}
