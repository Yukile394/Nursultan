package minecraft;

import Nursultan.class10788;
import Nursultan.class10791;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07769 extends class06555 {
   private static final Logger U = LogUtils.getLogger();
   private static final int E = 128;
   private static final int W = 64;
   public static final int N = 4;
   public static final int y = 256;
   private static final String m = "frame-";
   public static final Codec<class07769> L = RecordCodecBuilder.create(
      var0 -> var0.group(
            class07299.field_25178.fieldOf("dimension").forGetter(var0x -> var0x.R),
            Codec.INT.fieldOf("xCenter").forGetter(var0x -> var0x.u),
            Codec.INT.fieldOf("zCenter").forGetter(var0x -> var0x.i),
            Codec.BYTE.optionalFieldOf("scale", (byte)0).forGetter(var0x -> var0x.M),
            Codec.BYTE_BUFFER.fieldOf("colors").forGetter(var0x -> ByteBuffer.wrap(var0x.B)),
            Codec.BOOL.optionalFieldOf("trackingPosition", true).forGetter(var0x -> var0x.P),
            Codec.BOOL.optionalFieldOf("unlimitedTracking", false).forGetter(var0x -> var0x.s),
            Codec.BOOL.optionalFieldOf("locked", false).forGetter(var0x -> var0x.Z),
            class07511.N.listOf().optionalFieldOf("banners", List.of()).forGetter(var0x -> List.copyOf(var0x.j.values())),
            class07326.N.listOf().optionalFieldOf("frames", List.of()).forGetter(var0x -> List.copyOf(var0x.v.values()))
         )
         .apply(var0, class07769::new)
   );
   public final int u;
   public final int i;
   public final class05946<class07299> R;
   private final boolean P;
   private final boolean s;
   public final byte M;
   public byte[] B = new byte[16384];
   public final boolean Z;
   private final List<class10791> T = Lists.newArrayList();
   private final Map<class08036, class10791> b = Maps.newHashMap();
   private final Map<String, class07511> j = Maps.newHashMap();
   public final Map<String, class00768> z = Maps.newLinkedHashMap();
   private final Map<String, class07326> v = Maps.newHashMap();
   private int n;

   public Collection<class07511> L() {
      return this.j.values();
   }

   private class07769(int var1, int var2, byte var3, boolean var4, boolean var5, boolean var6, class05946<class07299> var7) {
      super();
      this.M = var3;
      this.u = var1;
      this.i = var2;
      this.R = var7;
      this.P = var4;
      this.s = var5;
      this.Z = var6;
   }

   private class07769(
      class05946<class07299> var1,
      int var2,
      int var3,
      byte var4,
      ByteBuffer var5,
      boolean var6,
      boolean var7,
      boolean var8,
      List<class07511> var9,
      List<class07326> var10
   ) {
      this(var2, var3, (byte)class04995.N(var4, 0, 4), var6, var7, var8, var1);
      if (var5.array().length == 16384) {
         this.B = var5.array();
      }

      for (class07511 class07511 : var9) {
         this.j.put(class07511.y(), class07511);
         this.N(class07511.N(), null, class07511.y(), class07511.L().method_10263(), class07511.L().method_10260(), 180.0, class07511.i().orElse(null));
      }

      for (class07326 class07326 : var10) {
         this.v.put(class07326.N(), class07326);
         this.N(class00831.y, null, y(class07326.u()), class07326.y().method_10263(), class07326.y().method_10260(), class07326.L(), null);
      }
   }

   public Iterable<class00768> i() {
      return this.z.values();
   }

   public boolean u() {
      Iterator<class00768> iterator = this.z.values().iterator();

      while (iterator.hasNext()) {
         if (iterator.next().L().N().i()) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   private class03556<class02195> y(float var1, float var2) {
      short short1 = 320;
      if (Math.abs(var1) < 320.0F && Math.abs(var2) < 320.0F) {
         return class00831.M;
      } else {
         return this.s ? class00831.B : null;
      }
   }

   private static String y(int var0) {
      return "frame-" + var0;
   }

   private static boolean y(class08036 var0) {
      for (class07085 class07085 : class07085.values()) {
         if (class07085 != class07085.field_6173 && class07085 != class07085.field_6171 && var0.method_6118(class07085).N(class01226.LX)) {
            return true;
         }
      }

      return false;
   }

   public void y(int var1, int var2, byte var3) {
      this.B[var1 + var2 * 128] = var3;
      this.N(var1, var2);
   }

   @Nullable
   private Pair<class03556<class02195>, Byte> y(class03556<class02195> var1, @Nullable class07284 var2, double var3, float var5, float var6) {
      if (N(var5, var6)) {
         return Pair.of(var1, this.N(var2, var3));
      } else {
         class03556<class02195> class03556 = this.y(var5, var6);
         return class03556 == null ? null : Pair.of(class03556, (byte)0);
      }
   }

   public class07769 y() {
      return N(this.u, this.i, (byte)class04995.N(this.M + 1, 0, 4), this.P, this.s, this.R);
   }

   public static void N(class06584 var0, class07209 var1, String var2, class03556<class02195> var3) {
      class02685 class02685 = new class02685(var3, var1.method_10263(), var1.method_10260(), 180.0F);
      var0.N(class02484.C, class02719.N, var2x -> var2x.N(var2, class02685));
      if (((class02195)var3.N()).N()) {
         var0.N(class02484.A, new class02716(((class02195)var3.N()).u()));
      }
   }

   private static Predicate<class06584> N(class06584 var0) {
      class02265 class02265 = var0.method_58694(class02484.f);
      return var2 -> var2 == var0 ? true : var2.N(var0.B()) && Objects.equals(class02265, var2.method_58694(class02484.f));
   }

   private void N(String var1) {
      class00768 class00768 = this.z.remove(var1);
      if (class00768 != null && class00768.L().N().R()) {
         this.n--;
      }

      this.R();
   }

   public void N(class08036 var1, class06584 var2) {
      if (!this.b.containsKey(var1)) {
         class10791 var3 = new class10791(this, var1);
         this.b.put(var1, var3);
         this.T.add(var3);
      }

      Predicate<class06584> predicate = N(var2);
      if (!var1.method_31548().y(predicate)) {
         this.N(var1.method_74861());
      }

      int ix = 0;

      while (true) {
         List<class10791> list = this.T;
         Operation operation = var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 1, "[java.util.List]");
            return ((List)var0[0]).size();
         };
         LocalRefImpl localrefimpl = new LocalRefImpl();
         localrefimpl.init(var2);
         int jx = this.N(list, operation, localrefimpl);
         var2 = (class06584)localrefimpl.dispose();
         if (ix >= jx) {
            if (var2.o() && this.P) {
               class00679 class00679 = var2.q();
               class07209 class07209 = class00679.s();
               class07326 class07326 = this.v.get(class07326.N(class07209));
               if (class07326 != null && class00679.method_5628() != class07326.u() && this.v.containsKey(class07326.N())) {
                  this.N(y(class07326.u()));
               }

               class07326 class07326x = new class07326(class07209, class00679.method_5735().u() * 90, class00679.method_5628());
               this.N(
                  class00831.y,
                  var1.method_73183(),
                  y(class00679.method_5628()),
                  class07209.method_10263(),
                  class07209.method_10260(),
                  class00679.method_5735().u() * 90,
                  null
               );
               class07326 class07326xx = this.v.put(class07326x.N(), class07326x);
               if (!class07326x.equals(class07326xx)) {
                  this.method_80();
               }
            }

            class02719 class02719 = var2.a_(class02484.C, class02719.N);
            if (!this.z.keySet().containsAll(class02719.N().keySet())) {
               class02719.N().forEach((var2x, var3x) -> {
                  if (!this.z.containsKey(var2x)) {
                     this.N(var3x.N(), var1.method_73183(), var2x, var3x.y(), var3x.L(), var3x.u(), null);
                  }
               });
            }

            return;
         }

         list = this.T;
         operation = var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 2, "[java.util.List, int]");
            return ((List)var0[0]).get((Integer)var0[1]);
         };
         LocalRefImpl localrefimpl1 = new LocalRefImpl();
         LocalRefImpl localrefimpl2 = new LocalRefImpl();
         localrefimpl1.init(var1);
         localrefimpl2.init(var2);
         Object object = this.N(list, ix, operation, localrefimpl1, localrefimpl2);
         var2 = (class06584)localrefimpl2.dispose();
         var1 = (class08036)localrefimpl1.dispose();
         class10791 class10791 = (class10791)object;
         class08036 class08036 = class10791.N;
         String sx = class08036.method_74861();
         if (!class08036.method_31481() && (class08036.method_31548().y(predicate) || var2.o())) {
            if (!var2.o() && class08036.method_73183().method_27983() == this.R && this.P) {
               this.N(class00831.N, class08036.method_73183(), sx, class08036.method_23317(), class08036.method_23321(), class08036.method_36454(), null);
            }
         } else {
            this.b.remove(class08036);
            this.T.remove(class10791);
            this.N(sx);
         }

         if (!class08036.equals(var1) && y(class08036)) {
            this.N(sx);
         }

         ix++;
      }
   }

   private Object N(List var1, int var2, Operation var3, class08036 var4, class06584 var5) {
      return var5.o() ? Objects.requireNonNull(this.b.get(var4)) : var3.call(new Object[]{var1, var2});
   }

   private int N(List var1, Operation var2, LocalRef var3) {
      return this.N(var1, var2, (class06584)var3.get());
   }

   private Object N(List var1, int var2, Operation var3, LocalRef var4, LocalRef var5) {
      return this.N(var1, var2, var3, (class08036)var4.get(), (class06584)var5.get());
   }

   public static class08413<class07769> N(class02265 var0) {
      return new class08413<>(var0.N(), () -> {
         throw new IllegalStateException("Should never create an empty map saved data");
      }, L, class05715.field_45079);
   }

   public class07769 N() {
      class07769 class07769 = new class07769(this.u, this.i, this.M, this.P, this.s, true, this.R);
      class07769.j.putAll(this.j);
      class07769.z.putAll(this.z);
      class07769.n = this.n;
      System.arraycopy(this.B, 0, class07769.B, 0, this.B.length);
      return class07769;
   }

   public static class07769 N(byte var0, boolean var1, class05946<class07299> var2) {
      return new class07769(0, 0, var0, false, false, var1, var2);
   }

   public static class07769 N(double var0, double var2, byte var4, boolean var5, boolean var6, class05946<class07299> var7) {
      int ix = 128 * (1 << var4);
      int jx = class04995.N((var0 + 64.0) / ix);
      int k = class04995.N((var2 + 64.0) / ix);
      int l = jx * ix + ix / 2 - 64;
      int i1 = k * ix + ix / 2 - 64;
      return new class07769(l, i1, var4, var5, var6, false, var7);
   }

   private int N(List var1, Operation var2, class06584 var3) {
      return var3.o() ? 1 : (Integer)var2.call(new Object[]{var1});
   }

   public boolean N(class07284 var1, class07209 var2) {
      double d0 = var2.method_10263() + 0.5;
      double d1 = var2.method_10260() + 0.5;
      int ix = 1 << this.M;
      double d2 = (d0 - this.u) / ix;
      double d3 = (d1 - this.i) / ix;
      byte b0 = 63;
      if (d2 >= -63.0 && d3 >= -63.0 && d2 <= 63.0 && d3 <= 63.0) {
         class07511 class07511 = class07511.N(var1, var2);
         if (class07511 == null) {
            return false;
         }

         if (this.j.remove(class07511.y(), class07511)) {
            this.N(class07511.y());
            this.method_80();
            return true;
         }

         if (!this.N(256)) {
            this.j.put(class07511.y(), class07511);
            this.N(class07511.N(), var1, class07511.y(), d0, d1, 180.0, class07511.i().orElse(null));
            this.method_80();
            return true;
         }
      }

      return false;
   }

   public void N(class07290 var1, int var2, int var3) {
      Iterator<class07511> iterator = this.j.values().iterator();

      while (iterator.hasNext()) {
         class07511 class07511x = iterator.next();
         if (class07511x.L().method_10263() == var2 && class07511x.L().method_10260() == var3) {
            class07511 class07511x = class07511.N(var1, class07511x.L());
            if (!class07511x.equals(class07511x)) {
               iterator.remove();
               this.N(class07511x.y());
               this.method_80();
            }
         }
      }
   }

   private static boolean N(float var0, float var1) {
      byte b0 = 63;
      return var0 >= -63.0F && var1 >= -63.0F && var0 <= 63.0F && var1 <= 63.0F;
   }

   public void N(class07209 var1, int var2) {
      this.N(y(var2));
      this.v.remove(class07326.N(var1));
      this.method_80();
   }

   public boolean N(int var1, int var2, byte var3) {
      if (this.B[var1 + var2 * 128] != var3) {
         this.y(var1, var2, var3);
         return true;
      } else {
         return false;
      }
   }

   private static byte N(float var0) {
      byte b0 = 63;
      if (var0 <= -63.0F) {
         return -128;
      } else {
         return var0 >= 63.0F ? 127 : (byte)(var0 * 2.0F + 0.5);
      }
   }

   @Nullable
   public class00381<?> N(class02265 var1, class08036 var2) {
      class10791 class10791 = this.b.get(var2);
      return class10791 == null ? null : class10791.N(var1);
   }

   private void N(int var1, int var2) {
      this.method_80();
      Iterator<class10791> iterator = this.T.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(var1, var2);
      }
   }

   public class10791 N(class08036 var1) {
      class10791 class10791 = this.b.get(var1);
      if (class10791 == null) {
         class10791 = new class10791(this, var1);
         this.b.put(var1, class10791);
         this.T.add(class10791);
      }

      return class10791;
   }

   public boolean N(int var1) {
      return this.n >= var1;
   }

   private void N(class03556<class02195> var1, @Nullable class07284 var2, String var3, double var4, double var6, double var8, @Nullable class00392 var10) {
      int ix = 1 << this.M;
      float f = (float)(var4 - this.u) / ix;
      float f1 = (float)(var6 - this.i) / ix;
      class10788 class10788 = this.N(var1, var2, var8, f, f1);
      if (class10788 == null) {
         this.N(var3);
      } else {
         class00768 class00768x = new class00768(class10788.N(), class10788.y(), class10788.L(), class10788.u(), Optional.ofNullable(var10));
         class00768 class00768x = this.z.put(var3, class00768x);
         if (!class00768x.equals(class00768x)) {
            if (class00768x != null && class00768x.L().N().R()) {
               this.n--;
            }

            if (class10788.N().N().R()) {
               this.n++;
            }

            this.R();
         }
      }
   }

   private byte N(@Nullable class07284 var1, double var2) {
      if (this.R == class07299.field_25180 && var1 != null) {
         int ix = (int)(var1.N() / 10L);
         return (byte)(ix * ix * 34187121 + ix * 121 >> 15 & 15);
      } else {
         double d0 = var2 < 0.0 ? var2 - 8.0 : var2 + 8.0;
         return (byte)(d0 * 16.0 / 360.0);
      }
   }

   public void N(List<class00768> var1) {
      this.z.clear();
      this.n = 0;

      for (int ix = 0; ix < var1.size(); ix++) {
         class00768 class00768 = (class00768)var1.get(ix);
         this.z.put("icon-" + ix, class00768);
         if (class00768.L().N().R()) {
            this.n++;
         }
      }
   }

   @Nullable
   private class10788 N(class03556<class02195> var1, @Nullable class07284 var2, double var3, float var5, float var6) {
      byte b0 = N(var5);
      byte b1 = N(var6);
      if (var1.N(class00831.N)) {
         Pair<class03556<class02195>, Byte> pair = this.y(var1, var2, var3, var5, var6);
         return pair == null ? null : new class10788((class03556<class02195>)pair.getFirst(), b0, b1, (Byte)pair.getSecond());
      } else {
         return !N(var5, var6) && !this.s ? null : new class10788(var1, b0, b1, this.N(var2, var3));
      }
   }

   private void R() {
      this.T.forEach(class10791::y);
   }
}
