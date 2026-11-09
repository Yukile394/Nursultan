package minecraft;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class class07001 implements class07709 {
   private static final Logger L = LogUtils.getLogger();
   public static final Codec<class07001> N = Codec.PASSTHROUGH
      .comapFlatMap(
         var0 -> {
            class07709 class07709 = (class07709)var0.convert(class07713.N).getValue();
            return class07709 instanceof class07001 class07001
               ? DataResult.success(class07001 == ((Boolean)var0.getValue()) ? class07001.N() : class07001)
               : DataResult.error(() -> "Not a compound tag: " + class07709);
         },
         var0 -> new Dynamic(class07713.N, var0.N())
      );
   private static final int t = 48;
   private static final int G = 32;
   public static final class01424<class07001> y = new class07012();
   private final Map<String, class07709> l;
   private static final HashMap d = new HashMap();

   public Optional<Byte> L(String var1) {
      return this.j(var1).flatMap(class07709::s);
   }

   @Override
   public byte L() {
      return 10;
   }

   public Optional<Float> M(String var1) {
      return this.j(var1).flatMap(class07709::v);
   }

   public Set<Entry<String, class07709>> M() {
      return this.l.entrySet();
   }

   public Optional<class07741> P(String var1) {
      Object object = this.l.get(var1);
      return object instanceof class07741 ? Optional.of((class07741)object) : Optional.empty();
   }

   public Optional<Boolean> T(String var1) {
      return this.j(var1).flatMap(class07709::t);
   }

   public class07001() {
      HashMap hashmap = m();
      if (hashmap == null) {
         throw new NullPointerException("@Redirect constructor handler net/minecraft/class_2487::removeOldMapAlloc returned null for java.util.HashMap");
      } else {
         this(N(hashmap));
      }
   }

   public class07001(Map<String, class07709> var1) {
      super();
      this.l = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class07001 && Objects.equals(this.l, ((class07001)var1).l);
   }

   @Override
   public String toString() {
      class04818 class04818 = new class04818();
      class04818.N(this);
      return class04818.N();
   }

   @Override
   public int hashCode() {
      return this.l.hashCode();
   }

   public Optional<Double> B(String var1) {
      return this.j(var1).flatMap(class07709::n);
   }

   public Collection<class07709> B() {
      return this.l.values();
   }

   public Optional<String> Z(String var1) {
      return this.j(var1).flatMap(class07709::ah_);
   }

   public int Z() {
      return this.l.size();
   }

   public Set<String> i() {
      return this.l.keySet();
   }

   public Optional<Integer> i(String var1) {
      return this.j(var1).flatMap(class07709::b);
   }

   @Nullable
   public class07709 b(String var1) {
      return this.l.remove(var1);
   }

   public class07741 s(String var1) {
      return this.P(var1).orElseGet(class07741::new);
   }

   private static HashMap m() {
      return d;
   }

   public class07001 m(String var1) {
      return this.W(var1).orElseGet(class07001::new);
   }

   private Optional<class07709> j(String var1) {
      return Optional.ofNullable(this.l.get(var1));
   }

   public class07001 U() {
      return new class07001(new HashMap<>(this.l));
   }

   public Optional<int[]> U(String var1) {
      Object object = this.l.get(var1);
      return object instanceof class06995 ? Optional.of(((class06995)object).M()) : Optional.empty();
   }

   public boolean z() {
      return this.l.isEmpty();
   }

   public Optional<byte[]> z(String var1) {
      Object object = this.l.get(var1);
      return object instanceof class07029 ? Optional.of(((class07029)object).i()) : Optional.empty();
   }

   @Override
   public class01424<class07001> u() {
      return y;
   }

   public Optional<Short> u(String var1) {
      return this.j(var1).flatMap(class07709::T);
   }

   public double y(String var1, double var2) {
      Object object = this.l.get(var1);
      return object instanceof class07737 ? ((class07737)object).U() : var2;
   }

   public boolean y(String var1, boolean var2) {
      return this.y(var1, (byte)(var2 ? 1 : 0)) != 0;
   }

   public <T> void y(String var1, Codec<T> var2, @Nullable T var3) {
      if (var3 != null) {
         this.N(var1, var2, var3);
      }
   }

   public String y(String var1, String var2) {
      if (this.l.get(var1) instanceof class07707 class07707x) {
         class07707 class07707x = class07707x;

         try {
            return class07707x.U();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }
      } else {
         return var2;
      }
   }

   public <T> void y(String var1, Codec<T> var2, DynamicOps<class07709> var3, @Nullable T var4) {
      if (var4 != null) {
         this.N(var1, var2, var3, var4);
      }
   }

   public int y(String var1, int var2) {
      Object object = this.l.get(var1);
      return object instanceof class07737 ? ((class07737)object).B() : var2;
   }

   public short y(String var1, short var2) {
      Object object = this.l.get(var1);
      return object instanceof class07737 ? ((class07737)object).Z() : var2;
   }

   public byte y(String var1, byte var2) {
      Object object = this.l.get(var1);
      return object instanceof class07737 ? ((class07737)object).z() : var2;
   }

   public boolean y(String var1) {
      return this.l.containsKey(var1);
   }

   public float y(String var1, float var2) {
      Object object = this.l.get(var1);
      return object instanceof class07737 ? ((class07737)object).E() : var2;
   }

   public long y(String var1, long var2) {
      Object object = this.l.get(var1);
      return object instanceof class07737 ? ((class07737)object).M() : var2;
   }

   @Override
   public int y() {
      int i = 48;

      for (Entry entry : this.l.entrySet()) {
         i += 28 + 2 * ((String)entry.getKey()).length();
         i += 36;
         i += ((class07709)entry.getValue()).y();
      }

      return i;
   }

   public Optional<long[]> E(String var1) {
      Object object = this.l.get(var1);
      return object instanceof class07757 ? Optional.of(((class07757)object).M()) : Optional.empty();
   }

   public <T> Optional<T> N_15(String var1, Codec<T> var2) {
      return this.N(var1, var2, class07713.N);
   }

   public <T> void N(MapCodec<T> var1, DynamicOps<class07709> var2, T var3) {
      this.N((class07001)var1.encoder().encodeStart(var2, var3).getOrThrow());
   }

   public <T> Optional<T> N(String var1, Codec<T> var2, DynamicOps<class07709> var3) {
      class07709 class07709 = this.N(var1);
      return class07709 == null
         ? Optional.empty()
         : var2.parse(var3, class07709).resultOrPartial(var2x -> L.error("Failed to read field ({}={}): {}", new Object[]{var1, class07709, var2x}));
   }

   @Override
   public class03154 N(class03175 var1) {
      for (Entry entry : this.l.entrySet()) {
         class07709 class07709 = (class07709)entry.getValue();
         class01424<?> class01424 = class07709.u();
         class03153 class03153 = var1.N(class01424);
         switch (class03153) {
            case field_36251:
               return class03154.field_36255;
            case field_36250:
               return var1.y();
            case field_36249:
               break;
            default:
               class03153 = var1.N(class01424, (String)entry.getKey());
               switch (class03153) {
                  case field_36251:
                     return class03154.field_36255;
                  case field_36250:
                     return var1.y();
                  case field_36249:
                     break;
                  default:
                     class03154 class03154 = class07709.N(var1);
                     switch (class03154) {
                        case field_36255:
                           return class03154.field_36255;
                        case field_36254:
                           return var1.y();
                     }
               }
         }
      }

      return var1.y();
   }

   public <T> void N(String var1, Codec<T> var2, T var3) {
      this.N(var1, var2, class07713.N, var3);
   }

   public <T> void N(String var1, Codec<T> var2, DynamicOps<class07709> var3, T var4) {
      this.N(var1, (class07709)var2.encodeStart(var3, var4).getOrThrow());
   }

   public <T> void N(MapCodec<T> var1, T var2) {
      this.N(var1, class07713.N, var2);
   }

   private static Map N(Map var0) {
      return new Object2ObjectOpenHashMap();
   }

   @Override
   public void N(DataOutput var1) throws IOException {
      for (String s : this.l.keySet()) {
         class07709 class07709 = this.l.get(s);
         N(s, class07709, var1);
      }

      var1.writeByte(0);
   }

   public <T> Optional<T> N(MapCodec<T> var1) {
      return this.N(var1, class07713.N);
   }

   public <T> Optional<T> N(MapCodec<T> var1, DynamicOps<class07709> var2) {
      return var1.decode(var2, (MapLike)var2.getMap(this).getOrThrow()).resultOrPartial(var1x -> L.error("Failed to read value ({}): {}", this, var1x));
   }

   public void N(BiConsumer<String, class07709> var1) {
      this.l.forEach(var1);
   }

   public void N(String var1, byte[] var2) {
      this.l.put(var1, new class07029(var2));
   }

   public void N_67(String var1, String var2) {
      this.l.put(var1, class07707.N(var2));
   }

   public void N(String var1, double var2) {
      this.l.put(var1, class07019.N(var2));
   }

   public void N(String var1, float var2) {
      this.l.put(var1, class07009.N(var2));
   }

   public void N(String var1, long var2) {
      this.l.put(var1, class07729.N(var2));
   }

   @Nullable
   public class07709 N(String var1) {
      return this.l.get(var1);
   }

   public void N(String var1, boolean var2) {
      this.l.put(var1, class07037.N(var2));
   }

   public void N(String var1, long[] var2) {
      this.l.put(var1, new class07757(var2));
   }

   public void N(String var1, int[] var2) {
      this.l.put(var1, new class06995(var2));
   }

   @Nullable
   public class07709 N(String var1, class07709 var2) {
      return this.l.put(var1, var2);
   }

   private static void N(String var0, class07709 var1, DataOutput var2) throws IOException {
      var2.writeByte(var1.L());
      if (var1.L() != 0) {
         var2.writeUTF(var0);
         var1.N(var2);
      }
   }

   static class07709 N(class01424<?> var0, String var1, DataInput var2, class07726 var3) {
      try {
         return var0.L(var2, var3);
      } catch (IOException ioexception) {
         class07080 class07080 = class07080.N(ioexception, "Loading NBT data");
         class07074 class07074 = class07080.N("NBT Tag");
         class07074.N("Tag name", var1);
         class07074.N("Tag type", var0.N());
         throw new class03103(class07080);
      }
   }

   public class07001 N(class07001 var1) {
      for (String s : var1.l.keySet()) {
         class07709 class07709 = var1.l.get(s);
         if (class07709 instanceof class07001 class07001) {
            Object object = this.l.get(s);
            if (object instanceof class07001) {
               ((class07001)object).N(class07001);
               continue;
            }
         }

         this.N(s, class07709.N());
      }

      return this;
   }

   @Override
   public void N(class04836 var1) {
      var1.N(this);
   }

   public void N(String var1, int var2) {
      this.l.put(var1, class07720.N(var2));
   }

   public void N(String var1, byte var2) {
      this.l.put(var1, class07037.N(var2));
   }

   public void N(String var1, short var2) {
      this.l.put(var1, class07730.N(var2));
   }

   public class07001 N() {
      Object2ObjectOpenHashMap object2objectopenhashmap = new Object2ObjectOpenHashMap(Maps.transformValues(this.l, class07709::N));
      return new class07001(object2objectopenhashmap);
   }

   public Optional<class07001> W(String var1) {
      Object object = this.l.get(var1);
      return object instanceof class07001 ? Optional.of((class07001)object) : Optional.empty();
   }

   public Optional<Long> R(String var1) {
      return this.j(var1).flatMap(class07709::j);
   }

   @Override
   public Optional<class07001> ak_() {
      return Optional.of(this);
   }
}
