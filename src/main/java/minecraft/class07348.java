package minecraft;

import Nursultan.class09447;
import Nursultan.class10738;
import baritone.utils.accessor.IPalettedContainer;
import baritone.utils.accessor.IPalettedContainer.IData;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.Int2IntMap.Entry;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;
import net.caffeinemc.mods.lithium.common.world.chunk.CompactingPackedIntegerArray;
import net.caffeinemc.mods.lithium.common.world.chunk.LithiumHashPalette;
import net.caffeinemc.mods.lithium.common.world.section.RandomTickingSectionDataHelper.LithiumBlockCounter;
import net.caffeinemc.mods.sodium.client.world.BitStorageExtension;
import net.caffeinemc.mods.sodium.client.world.PalettedContainerROExtension;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07348<T> implements class03925<T>, class07342<T>, IPalettedContainer, PalettedContainerROExtension {
   private static final int N = 0;
   private volatile class07365<T> y;
   private final class01807<T> L;
   private class05559 u = new class05559("PalettedContainer");
   private static final MethodHandle i;
   private static final ThreadLocal R;
   private static final ThreadLocal M;

   @Override
   public int L() {
      return this.y.L().L();
   }

   public void L(int var1, int var2, int var3, T var4) {
      this.R();

      try {
         this.y(this.L.N(var1, var2, var3), (T)var4);
      } finally {
         this.M();
      }
   }

   public void M() {
   }

   public class07348(T var1, class01807<T> var2) {
      super();
      this.L = var2;
      this.y = this.N(null, 0);
      this.y.u().method_12291((T)var1, this);
      this.N(null);
   }

   private class07348(class07348<T> var1) {
      super();
      this.L = var1.L;
      this.y = var1.y.N();
      this.N(null);
   }

   private class07348(class01807<T> var1, class06617 var2, class04552 var3, class07340<T> var4) {
      super();
      this.L = var1;
      this.y = new class07365<>(var2, var3, var4);
      this.N(null);
   }

   static {
      Field field = null;

      for (Field field1 : class07348.class.getDeclaredFields()) {
         Class<?> oclass = field1.getType();
         if (IData.class.isAssignableFrom(oclass) && (field1.getModifiers() & 24) == 0 && !field1.isSynthetic()) {
            if (field != null) {
               throw new IllegalStateException("PalettedContainer has more than one Data field.");
            }

            field = field1;
         }
      }

      if (field == null) {
         throw new IllegalStateException("PalettedContainer has no Data field.");
      } else {
         MethodHandle methodhandle;
         try {
            methodhandle = MethodHandles.lookup().unreflectGetter(field);
         } catch (IllegalAccessException illegalaccessexception) {
            throw new IllegalStateException("PalettedContainer may not access its own field?!", illegalaccessexception);
         }

         MethodType methodtype = MethodType.methodType(IData.class, class07348.class);
         i = MethodHandles.explicitCastArguments(methodhandle, methodtype);
         R = ThreadLocal.withInitial(() -> new short[4096]);
         M = ThreadLocal.withInitial(() -> new short[64]);
      }
   }

   private IData Z() {
      try {
         return (IData)(Object)i.invoke((class07348)this);
      } catch (Throwable throwable) {
         throw (RuntimeException)N(throwable, RuntimeException.class);
      }
   }

   @Override
   public class07348<T> i() {
      return new class07348<>(this.y.u().method_12288(0), this.L);
   }

   @Override
   public class07348<T> sodium$copy() {
      return new class07348<>(this);
   }

   @Override
   public void y(class00667 var1) {
      this.R();

      try {
         this.y.N(var1, this.L.y());
      } finally {
         this.M();
      }
   }

   private void y(int var1, T var2) {
      int ix = this.y.u().method_12291((T)var2, this);
      this.y.L().y(var1, ix);
   }

   @Override
   public int y() {
      return this.y.N(this.L.y());
   }

   public static <T> Codec<class03925<T>> y(Codec<T> var0, class01807<T> var1, T var2) {
      class03945 class03945 = (var0x, var1x) -> N(var0x, var1x).map(var0xx -> var0xx);
      return N(var0, var1, var2, class03945);
   }

   public T y(int var1, int var2, int var3, T var4) {
      return this.N(this.L.N(var1, var2, var3), (T)var4);
   }

   private short[] y(int var1) {
      return switch (var1) {
         case 64 -> (short[])M.get();
         case 4096 -> (short[])R.get();
         default -> new short[var1];
      };
   }

   public void N(class07350 var1, CallbackInfo var2) {
      int ix = this.y.u().method_12197();
      if (ix <= 4096) {
         short[] ashort = new short[ix];
         this.y.L().N(var1x -> ashort[var1x]++);

         for (int j = 0; j < ashort.length; j++) {
            Object object = this.y.u().method_12288(j);
            if (object != null) {
               var1.accept(object, ashort[j]);
            }
         }

         var2.cancel();
      }
   }

   private IntConsumer N(IntConsumer var1, class07350 var2, Int2IntOpenHashMap var3) {
      if (var2 instanceof LithiumBlockCounter lithiumblockcounter) {
         class07340 class07340 = this.y.u();
         return new class10738(this, var1, lithiumblockcounter, var3, class07340);
      } else {
         return var1;
      }
   }

   public static <T> Codec<class07348<T>> N(Codec<T> var0, class01807<T> var1, T var2) {
      class03945 class03945 = class07348::N;
      return N(var0, var1, var2, class03945);
   }

   private static Throwable N(Throwable var0, Class var1) throws Throwable {
      throw var0;
   }

   public void N(CallbackInfo var1) {
      this.u = null;
   }

   @Override
   public class03936 N(class01807 var1) {
      this.R();
      LithiumHashPalette lithiumhashpalette = null;
      Optional optional = Optional.empty();
      List list = null;
      class07340 class07340 = this.y.u();
      class04552 class04552 = this.y.L();
      if (class04552 instanceof class03236 || class07340.method_12197() == 1) {
         list = List.of(class07340.method_12288(0));
      } else if (class07340 instanceof LithiumHashPalette lithiumhashpalette1) {
         lithiumhashpalette = lithiumhashpalette1;
      }

      if (list == null) {
         LithiumHashPalette lithiumhashpalette2 = new LithiumHashPalette(class04552.L());
         short[] ashort = this.y(var1.N());
         ((CompactingPackedIntegerArray)class04552).lithium$compact(this.y.u(), lithiumhashpalette2, ashort);
         class06617 class06617;
         if (lithiumhashpalette != null
            && lithiumhashpalette.method_12197() == lithiumhashpalette2.method_12197()
            && !(class06617 = var1.lithium$getConfigurationForPaletteSize(lithiumhashpalette.method_12197())).N()
            && class04552.L() == class06617.L()) {
            optional = this.N((long[])class04552.N().clone());
            list = lithiumhashpalette.getElements();
         } else {
            int ix = var1.lithium$getConfigurationForPaletteSize(lithiumhashpalette2.method_12197()).L();
            if (ix != 0) {
               class01198 class01198 = new class01198(ix, ashort.length);

               for (int j = 0; j < ashort.length; j++) {
                  class01198.y(j, ashort[j]);
               }

               optional = this.N(class01198.N());
            }

            list = lithiumhashpalette2.getElements();
         }
      }

      this.M();
      return new class03936(list, optional);
   }

   private Optional N(long[] var1) {
      return Optional.of(Arrays.stream(var1));
   }

   protected T N(int var1) {
      class07365 class07365 = this.y;
      return (T)class07365.u().method_12288(class07365.L().N(var1));
   }

   @Override
   public void N(Consumer<T> var1) {
      class07340 class07340 = this.y.u();
      IntArraySet intarrayset = new IntArraySet();
      this.y.L().N(intarrayset::add);
      intarrayset.forEach(var2x -> var1.accept(class07340.method_12288(var2x)));
   }

   public void N(class00667 var1) {
      this.R();

      try {
         byte b0 = var1.readByte();
         class07365 class07365 = this.N(this.y, b0);
         class07365.u().method_12289(var1, this.L.y());
         var1.L(class07365.L().N());
         this.y = class07365;
      } finally {
         this.M();
      }
   }

   public static <T> DataResult<class07348<T>> N(class01807<T> var0, class03936<T> var1) {
      List list = var1.N();
      int ix = var0.N();
      class06617 class06617 = var0.y(list.size());
      int j = class06617.L();
      if (var1.L() != -1 && j != var1.L()) {
         return DataResult.error(() -> "Invalid bit count, calculated " + j + ", but container declared " + var1.L());
      } else {
         Object object;
         class07340 class07340x;
         if (class06617.y() == 0) {
            class07340x = class06617.N(var0, list);
            object = new class03236(ix);
         } else {
            Optional<LongStream> optional = var1.y();
            if (optional.isEmpty()) {
               return DataResult.error(() -> "Missing values for non-zero storage");
            }

            long[] along = optional.get().toArray();

            try {
               if (!class06617.N() && class06617.y() == j) {
                  class07340x = class06617.N(var0, list);
                  object = new class01198(class06617.y(), ix, along);
               } else {
                  class00567 class00567 = new class00567(j, list);
                  class01198 class01198 = new class01198(j, ix, along);
                  class07340 class07340x = class06617.N(var0, list);
                  int[] aint = N(class01198, class00567, class07340x);
                  class07340x = class07340x;
                  object = new class01198(class06617.y(), ix, aint);
               }
            } catch (class09447 class09447) {
               return DataResult.error(() -> "Failed to read PalettedContainer: " + class09447.getMessage());
            }
         }

         return DataResult.success(new class07348(var0, class06617, (class04552)object, class07340x));
      }
   }

   private static <T> int[] N(class04552 var0, class07340<T> var1, class07340<T> var2) {
      int[] aint = new int[var0.y()];
      var0.N(aint);
      class07342 class07342 = class07342.N();
      int ix = -1;
      int j = -1;

      for (int k = 0; k < aint.length; k++) {
         int l = aint[k];
         if (l != ix) {
            ix = l;
            j = var2.method_12291(var1.method_12288(l), class07342);
         }

         aint[k] = j;
      }

      return aint;
   }

   private static <T, C extends class03925<T>> Codec<C> N(Codec<T> var0, class01807<T> var1, T var2, class03945<T, C> var3) {
      return RecordCodecBuilder.create(
            var2x -> var2x.group(
                  var0.mapResult(class06338.N(var2)).listOf().fieldOf("palette").forGetter(class03936::N),
                  Codec.LONG_STREAM.lenientOptionalFieldOf("data").forGetter(class03936::y)
               )
               .apply(var2x, class03936::new)
         )
         .comapFlatMap(var2x -> var3.read(var1, var2x), var1x -> var1x.N(var1));
   }

   private class07365<T> N(@Nullable class07365<T> var1, int var2) {
      class06617 class06617 = this.L.N(var2);
      if (var1 != null && class06617.equals(var1.y())) {
         return var1;
      } else {
         Object object = class06617.y() == 0 ? new class03236(this.L.N()) : new class01198(class06617.y(), this.L.N());
         class07340 class07340 = class06617.N(this.L, List.of());
         return new class07365<>(class06617, (class04552)object, class07340);
      }
   }

   public T N(int var1, int var2, int var3, T var4) {
      this.R();

      Object object;
      try {
         object = this.N(this.L.N(var1, var2, var3), (T)var4);
      } finally {
         this.M();
      }

      return (T)object;
   }

   private T N(int var1, T var2) {
      int ix = this.y.u().method_12291((T)var2, this);
      int j = this.y.L().N(var1, ix);
      return this.y.u().method_12288(j);
   }

   @Override
   public T N(int var1, int var2, int var3) {
      return this.N(this.L.N(var1, var2, var3));
   }

   @Override
   public boolean N(Predicate<T> var1) {
      return this.y.u().method_19525(var1);
   }

   @Override
   public void N(class07350<T> var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (this.y.u().method_12197() == 1) {
            var1.accept(this.y.u().method_12288(0), this.y.L().y());
         } else {
            Int2IntOpenHashMap int2intopenhashmap = new Int2IntOpenHashMap();
            class04552 class04552 = this.y.L();
            IntConsumer intconsumer = var1x -> int2intopenhashmap.addTo(var1x, 1);
            class04552.N(this.N(intconsumer, var1, int2intopenhashmap));
            int2intopenhashmap.int2IntEntrySet().forEach(var2x -> var1.accept(this.y.u().method_12288(var2x.getIntKey()), var2x.getIntValue()));
         }
      }
   }

   public void sodium$unpack(Object[] var1) {
      class01807 class01807 = Objects.requireNonNull(this.L);
      if (var1.length != class01807.N()) {
         throw new IllegalArgumentException("Array is wrong size");
      } else {
         class07365 class07365 = Objects.requireNonNull(this.y, "PalettedContainer must have data");
         ((BitStorageExtension)class07365.L()).sodium$unpack(var1, class07365.u());
      }
   }

   public void sodium$unpack(Object[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class01807 class01807 = Objects.requireNonNull(this.L);
      if (var1.length != class01807.N()) {
         throw new IllegalArgumentException("Array is wrong size");
      } else {
         class07365 class07365 = Objects.requireNonNull(this.y, "PalettedContainer must have data");
         class04552 class04552 = class07365.L();
         class07340 class07340 = class07365.u();

         for (int ix = var3; ix <= var6; ix++) {
            for (int j = var4; j <= var7; j++) {
               for (int k = var2; k <= var5; k++) {
                  int l = class01807.N(k, ix, j);
                  int i1 = class04552.N(l);
                  Object object = class07340.method_12288(i1);
                  var1[l] = object;
               }
            }
         }
      }
   }

   public void R() {
   }

   @Override
   public int onResize(int var1, T var2) {
      class07365 class07365x = this.y;
      class07365 class07365x = this.N(class07365x, var1);
      class07365x.N(class07365x.u(), class07365x.L());
      this.y = class07365x;
      return class07365x.u().method_12291(var2, class07342.N());
   }

   public class07340 getPalette() {
      return this.Z().getPalette();
   }

   public class04552 getStorage() {
      return this.Z().getStorage();
   }
}
