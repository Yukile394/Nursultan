package minecraft;

import Nursultan.class10727;
import Nursultan.class10728;
import Nursultan.class10729;
import Nursultan.class10730;
import Nursultan.class10731;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.ArrayDeque;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.tuple.Pair;

public class class07209 extends class00753 {
   public static final Codec<class07209> field_25064 = Codec.INT_STREAM
      .comapFlatMap(
         var0 -> class07536.N(var0, 3).map(var0x -> new class07209(var0x[0], var0x[1], var0x[2])),
         var0 -> IntStream.of(var0.method_10263(), var0.method_10264(), var0.method_10260())
      )
      .stable();
   public static final class02362<ByteBuf, class07209> field_48404 = new class07226();
   public static final class07209 field_10980 = new class07209(0, 0, 0);
   public static final int field_54978 = 1 + class04995.M(class04995.L(30000000));
   public static final int field_10975 = 64 - 2 * field_54978;
   private static final long field_10976 = (1L << field_54978) - 1L;
   private static final long field_10974 = (1L << field_10975) - 1L;
   private static final long field_10973 = (1L << field_54978) - 1L;
   private static final int field_33083 = 0;
   private static final int field_10983 = field_10975;
   private static final int field_10981 = field_10975 + field_54978;
   public static final int field_54979 = (1 << field_54978) / 2 - 1;

   public class07209 method_33096(int var1) {
      return new class07209(this.method_10263(), var1, this.method_10260());
   }

   public class06889 method_46558() {
      return class06889.y(this);
   }

   public class07209 method_10084() {
      return new class07209(this.method_10263(), this.method_10264() + 1, this.method_10260());
   }

   public static class07209 method_49637(double var0, double var2, double var4) {
      return new class07209(class04995.N(var0), class04995.N(var2), class04995.N(var4));
   }

   public class06889 method_61082() {
      return class06889.L(this);
   }

   public static Stream<class07209> method_29715(class00734 var0) {
      return method_17962(class04995.N(var0.N), class04995.N(var0.y), class04995.N(var0.L), class04995.N(var0.u), class04995.N(var0.i), class04995.N(var0.R));
   }

   public class07209 method_10062() {
      return this;
   }

   public class07209(class00753 var1) {
      this(var1.method_10263(), var1.method_10264(), var1.method_10260());
   }

   public class07209(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public class07209 method_10087(int var1) {
      return new class07209(this.method_10263(), this.method_10264() - var1, this.method_10260());
   }

   public class07209 method_10077(int var1) {
      return new class07209(this.method_10263(), this.method_10264(), this.method_10260() + var1);
   }

   public class07209 method_10076(int var1) {
      return new class07209(this.method_10263(), this.method_10264(), this.method_10260() - var1);
   }

   public class07209 method_10089(int var1) {
      return new class07209(this.method_10263() + var1, this.method_10264(), this.method_10260());
   }

   public static Iterable<class07209> method_73160(class07209 var0, class07209 var1, class06889 var2) {
      return method_73158(var0.method_10263(), var0.method_10264(), var0.method_10260(), var1.method_10263(), var1.method_10264(), var1.method_10260(), var2);
   }

   public class07209 method_10088(int var1) {
      return new class07209(this.method_10263() - var1, this.method_10264(), this.method_10260());
   }

   public long method_10063() {
      return method_10064(this.method_10263(), this.method_10264(), this.method_10260());
   }

   public class07209 method_10074() {
      return new class07209(this.method_10263(), this.method_10264() - 1, this.method_10260());
   }

   public class07209 method_10086(int var1) {
      return new class07209(this.method_10263(), this.method_10264() + var1, this.method_10260());
   }

   public static class07209 method_49638(class00737 var0) {
      return method_49637(var0.N(), var0.y(), var0.L());
   }

   public class07209 method_10093(class07211 var1) {
      return new class07209(this.method_10263() + var1.P(), this.method_10264() + var1.s(), this.method_10260() + var1.T());
   }

   public static Iterable<class07209> method_62671(class00734 var0) {
      class07209 class07209x = method_49637(var0.N, var0.y, var0.L);
      class07209 class07209x = method_49637(var0.u, var0.i, var0.R);
      return method_10097(class07209x, class07209x);
   }

   public class07209 method_10067() {
      return new class07209(this.method_10263() - 1, this.method_10264(), this.method_10260());
   }

   public class07209 method_10095() {
      return new class07209(this.method_10263(), this.method_10264(), this.method_10260() - 1);
   }

   public static Iterable<class07209> method_73158(int var0, int var1, int var2, int var3, int var4, int var5, class06889 var6) {
      int i = Math.min(var0, var3);
      int j = Math.min(var1, var4);
      int k = Math.min(var2, var5);
      int l = Math.max(var0, var3);
      int i1 = Math.max(var1, var4);
      int j1 = Math.max(var2, var5);
      int k1 = l - i;
      int l1 = i1 - j;
      int i2 = j1 - k;
      int j2 = var6.M >= 0.0 ? i : l;
      int k2 = var6.B >= 0.0 ? j : i1;
      int l2 = var6.Z >= 0.0 ? k : j1;
      ImmutableList<class07185> immutablelist = class07211.y(var6);
      class07185 class07185xx = (class07185)immutablelist.get(0);
      class07185 class07185x = (class07185)immutablelist.get(1);
      class07185 class07185xx = (class07185)immutablelist.get(2);
      class07211 class07211x = var6.N(class07185xx) >= 0.0 ? class07185xx.u() : class07185xx.i();
      class07211 class07211x = var6.N(class07185x) >= 0.0 ? class07185x.u() : class07185x.i();
      class07211 class07211xx = var6.N(class07185xx) >= 0.0 ? class07185xx.u() : class07185xx.i();
      int i3 = class07185xx.N(k1, l1, i2);
      int j3 = class07185x.N(k1, l1, i2);
      int k3 = class07185xx.N(k1, l1, i2);
      return () -> new class10730(class07211x, class07211xx, class07211, j2, k2, l2, k3, j3, i3);
   }

   public class07209 method_10072() {
      return new class07209(this.method_10263(), this.method_10264(), this.method_10260() + 1);
   }

   public class07209 method_10078() {
      return new class07209(this.method_10263() + 1, this.method_10264(), this.method_10260());
   }

   public static Iterable<class07209> method_73159(class00734 var0, class06889 var1) {
      class06889 class06889x = var0.B();
      int i = class04995.N(class06889x.N());
      int j = class04995.N(class06889x.y());
      int k = class04995.N(class06889x.L());
      class06889 class06889x = var0.Z();
      int l = class04995.N(class06889x.N());
      int i1 = class04995.N(class06889x.y());
      int j1 = class04995.N(class06889x.L());
      return method_73158(i, j, k, l, i1, j1, var1);
   }

   public static long method_10091(long var0) {
      return var0 & -16L;
   }

   public static Stream<class07209> method_25998(class07209 var0, int var1, int var2, int var3) {
      return StreamSupport.stream(method_25996(var0, var1, var2, var3).spliterator(), false);
   }

   public static Stream<class07209> method_20437(class07209 var0, class07209 var1) {
      return StreamSupport.stream(method_10097(var0, var1).spliterator(), false);
   }

   public class07209 method_10075(class00753 var1) {
      return new class07209(
         this.method_10264() * var1.method_10260() - this.method_10260() * var1.method_10264(),
         this.method_10260() * var1.method_10263() - this.method_10263() * var1.method_10260(),
         this.method_10263() * var1.method_10264() - this.method_10264() * var1.method_10263()
      );
   }

   public static Iterable<class07209> method_10094(int var0, int var1, int var2, int var3, int var4, int var5) {
      int i = var3 - var0 + 1;
      int j = var4 - var1 + 1;
      int k = var5 - var2 + 1;
      return () -> new class10728(var0x, i, j, var0, var1, var2);
   }

   public static Stream<class07209> method_23627(class05163 var0) {
      return method_17962(
         Math.min(var0.B(), var0.U()),
         Math.min(var0.Z(), var0.E()),
         Math.min(var0.z(), var0.W()),
         Math.max(var0.B(), var0.U()),
         Math.max(var0.Z(), var0.E()),
         Math.max(var0.z(), var0.W())
      );
   }

   public static Stream<class07209> method_17962(int var0, int var1, int var2, int var3, int var4, int var5) {
      return StreamSupport.stream(method_10094(var0, var1, var2, var3, var4, var5).spliterator(), false);
   }

   public static int method_49925(class07209 var0, int var1, int var2, BiConsumer<class07209, Consumer<class07209>> var3, Function<class07209, class07192> var4) {
      ArrayDeque arraydeque = new ArrayDeque();
      LongOpenHashSet longopenhashset = new LongOpenHashSet();
      arraydeque.add(Pair.of(var0, 0));
      int i = 0;

      while (!arraydeque.isEmpty()) {
         Pair pair = (Pair)arraydeque.poll();
         class07209 class07209 = (class07209)pair.getLeft();
         int j = (Integer)pair.getRight();
         long k = class07209.method_10063();
         if (longopenhashset.add(k)) {
            class07192 class07192 = (class07192)var4.apply(class07209);
            if (class07192 != class07192.field_55166) {
               if (class07192 == class07192.field_55167) {
                  break;
               }

               if (++i >= var2) {
                  return i;
               }

               if (j < var1) {
                  var3.accept(class07209, var2x -> arraydeque.add(Pair.of(var2x, j + 1)));
               }
            }
         }
      }

      return i;
   }

   public static Iterable<class07218> method_30512(class07209 var0, int var1, class07211 var2, class07211 var3) {
      Validate.validState(var2.z() != var3.z(), "The two directions cannot be on the same axis", new Object[0]);
      return () -> new class10727(var2, var3, var0, var1);
   }

   public class07209 method_10079(class07211 var1, int var2) {
      return var2 == 0
         ? this
         : new class07209(this.method_10263() + var1.P() * var2, this.method_10264() + var1.s() * var2, this.method_10260() + var1.T() * var2);
   }

   public static class07209 method_58249(class07209 var0, class07209 var1) {
      return new class07209(
         Math.min(var0.method_10263(), var1.method_10263()),
         Math.min(var0.method_10264(), var1.method_10264()),
         Math.min(var0.method_10260(), var1.method_10260())
      );
   }

   public class07209 method_35830(int var1) {
      if (var1 == 1) {
         return this;
      } else {
         return var1 == 0 ? field_10980 : new class07209(this.method_10263() * var1, this.method_10264() * var1, this.method_10260() * var1);
      }
   }

   public static Iterable<class07209> method_34848(class06069 var0, int var1, class07209 var2, int var3) {
      return method_27156(
         var0,
         var1,
         var2.method_10263() - var3,
         var2.method_10264() - var3,
         var2.method_10260() - var3,
         var2.method_10263() + var3,
         var2.method_10264() + var3,
         var2.method_10260() + var3
      );
   }

   public static Iterable<class07209> method_10097(class07209 var0, class07209 var1) {
      return method_10094(
         Math.min(var0.method_10263(), var1.method_10263()),
         Math.min(var0.method_10264(), var1.method_10264()),
         Math.min(var0.method_10260(), var1.method_10260()),
         Math.max(var0.method_10263(), var1.method_10263()),
         Math.max(var0.method_10264(), var1.method_10264()),
         Math.max(var0.method_10260(), var1.method_10260())
      );
   }

   public static long method_10060(long var0, class07211 var2) {
      return method_10096(var0, var2.P(), var2.s(), var2.T());
   }

   public class07209 method_10069(int var1, int var2, int var3) {
      return var1 == 0 && var2 == 0 && var3 == 0 ? this : new class07209(this.method_10263() + var1, this.method_10264() + var2, this.method_10260() + var3);
   }

   public class07209 method_10059(class00753 var1) {
      return this.method_10069(-var1.method_10263(), -var1.method_10264(), -var1.method_10260());
   }

   public class07209 method_30513(class07185 var1, int var2) {
      if (var2 == 0) {
         return this;
      } else {
         int i = var1 == class07185.field_11048 ? var2 : 0;
         int j = var1 == class07185.field_11052 ? var2 : 0;
         int k = var1 == class07185.field_11051 ? var2 : 0;
         return new class07209(this.method_10263() + i, this.method_10264() + j, this.method_10260() + k);
      }
   }

   public class06889 method_60913(class06889 var1) {
      return new class06889(
         class04995.N(var1.M, (double)(this.method_10263() + 1.0E-5F), this.method_10263() + 1.0 - 1.0E-5F),
         class04995.N(var1.B, (double)(this.method_10264() + 1.0E-5F), this.method_10264() + 1.0 - 1.0E-5F),
         class04995.N(var1.Z, (double)(this.method_10260() + 1.0E-5F), this.method_10260() + 1.0 - 1.0E-5F)
      );
   }

   public class07218 method_25503() {
      return new class07218(this.method_10263(), this.method_10264(), this.method_10260());
   }

   public static long method_10096(long var0, int var2, int var3, int var4) {
      return method_10064(method_10061(var0) + var2, method_10071(var0) + var3, method_10083(var0) + var4);
   }

   public static int method_10071(long var0) {
      return (int)(var0 << 64 - field_10975 >> 64 - field_10975);
   }

   public static int method_10061(long var0) {
      return (int)(var0 << 64 - field_10981 - field_54978 >> 64 - field_54978);
   }

   @Deprecated
   public static Stream<class07209> method_51686(class07209 var0) {
      return Stream.of(var0, var0.method_10072(), var0.method_10078(), var0.method_10072().method_10078());
   }

   public static long method_10064(int var0, int var1, int var2) {
      long i = 0L;
      i |= (var0 & field_10976) << field_10981;
      i |= (var1 & field_10974) << 0;
      return i | (var2 & field_10973) << field_10983;
   }

   public static class07209 method_10092(long var0) {
      return new class07209(method_10061(var0), method_10071(var0), method_10083(var0));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class07209 method_10070(class06993 var1) {
      return switch (var1) {
         case field_11463 -> new class07209(-this.method_10260(), this.method_10264(), this.method_10263());
         case field_11464 -> new class07209(-this.method_10263(), this.method_10264(), -this.method_10260());
         case field_11465 -> new class07209(this.method_10260(), this.method_10264(), -this.method_10263());
         case field_11467 -> this;
      };
   }

   public static Iterable<class07209> method_25996(class07209 var0, int var1, int var2, int var3) {
      int i = var1 + var2 + var3;
      int j = var0.method_10263();
      int k = var0.method_10264();
      return () -> new class10729(var0x, i, var1, var2, var3, j, k);
   }

   public static Optional<class07209> method_25997(class07209 var0, int var1, int var2, Predicate<class07209> var3) {
      for (class07209 class07209 : method_25996(var0, var1, var2, var1)) {
         if (var3.test(class07209)) {
            return Optional.of(class07209);
         }
      }

      return Optional.empty();
   }

   public class07209 method_10081(class00753 var1) {
      return this.method_10069(var1.method_10263(), var1.method_10264(), var1.method_10260());
   }

   public static class07209 method_58250(class07209 var0, class07209 var1) {
      return new class07209(
         Math.max(var0.method_10263(), var1.method_10263()),
         Math.max(var0.method_10264(), var1.method_10264()),
         Math.max(var0.method_10260(), var1.method_10260())
      );
   }

   public static Iterable<class07209> method_27156(class06069 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int i = var5 - var2 + 1;
      int j = var6 - var3 + 1;
      int k = var7 - var4 + 1;
      return () -> new class10731(var1, var2, var0, i, var3, j, var4, k);
   }

   public static int method_10083(long var0) {
      return (int)(var0 << 64 - field_10983 - field_54978 >> 64 - field_54978);
   }
}
