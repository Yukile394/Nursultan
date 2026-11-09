package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import org.apache.commons.lang3.tuple.Pair;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05011 implements class04657 {
   private static final long N = Duration.ofMillis(100L).toNanos();
   private static final Logger L = LogUtils.getLogger();
   private final List<String> u = Lists.newArrayList();
   private final LongList i = new LongArrayList();
   private final Map<String, class05025> R = Maps.newHashMap();
   private final IntSupplier M;
   private final LongSupplier B;
   private final long Z;
   private final int z;
   private String U = "";
   private boolean E;
   @Nullable
   private class05025 W;
   private final BooleanSupplier m;
   private final Set<Pair<String, class02253>> P = new ObjectArraySet();

   @Override
   public void L() {
      if (!this.E) {
         L.error("Cannot pop from profiler if profiler tick hasn't started - missing startTick()?");
      } else if (this.i.isEmpty()) {
         L.error("Tried to pop one too many times! Mismatched push() and pop()?");
      } else {
         long ix = class07536.u();
         long j = this.i.removeLong(this.i.size() - 1);
         this.u.removeLast();
         long k = ix - j;
         class05025 class05025 = this.R();
         class05025.L += k;
         class05025.u++;
         class05025.N = Math.max(class05025.N, k);
         class05025.y = Math.min(class05025.y, k);
         if (k > N && !this.m.getAsBoolean()) {
            L.warn("Something's taking too long! '{}' took aprox {} ms", LogUtils.defer(() -> class04681.y(this.U)), LogUtils.defer(() -> k / 1000000.0));
         }

         this.U = this.u.isEmpty() ? "" : this.u.getLast();
         this.W = null;
      }
   }

   public class05011(LongSupplier var1, IntSupplier var2, BooleanSupplier var3) {
      super();
      this.Z = var1.getAsLong();
      this.B = var1;
      this.z = var2.getAsInt();
      this.M = var2;
      this.m = var3;
   }

   @Override
   public Set<Pair<String, class02253>> i() {
      return this.P;
   }

   @Nullable
   @Override
   public class05025 u(String var1) {
      return this.R.get(var1);
   }

   @Override
   public class04681 u() {
      return new class04640(this.R, this.Z, this.z, this.B.getAsLong(), this.M.getAsInt());
   }

   @Override
   public void y() {
      if (!this.E) {
         L.error("Profiler tick already ended - missing startTick()?");
      } else {
         this.L();
         this.E = false;
         if (!this.U.isEmpty()) {
            L.error("Profiler tick ended before path was fully popped (remainder: '{}'). Mismatched push/pop?", LogUtils.defer(() -> class04681.y(this.U)));
         }
      }
   }

   @Override
   public void y(String var1) {
      this.L();
      this.N(var1);
   }

   @Override
   public void y(Supplier<String> var1) {
      this.L();
      this.N(var1);
   }

   @Override
   public void N() {
      if (this.E) {
         L.error("Profiler tick already started - missing endTick()?");
      } else {
         this.E = true;
         this.U = "";
         this.u.clear();
         this.N("root");
      }
   }

   @Override
   public void N(String var1, int var2) {
      this.R().i.addTo(var1, var2);
   }

   @Override
   public void N(Supplier<String> var1) {
      this.N((String)var1.get());
   }

   @Override
   public void N(String var1) {
      if (!this.E) {
         L.error("Cannot push '{}' to profiler if profiler tick hasn't started - missing startTick()?", var1);
      } else {
         if (!this.U.isEmpty()) {
            this.U = this.U + "\u001e";
         }

         this.U = this.U + var1;
         this.u.add(this.U);
         this.i.add(class07536.u());
         this.W = null;
      }
   }

   @Override
   public void N(Supplier<String> var1, int var2) {
      this.R().i.addTo((String)var1.get(), var2);
   }

   @Override
   public void N(class02253 var1) {
      this.P.add(Pair.of(this.U, var1));
   }

   private class05025 R() {
      if (this.W == null) {
         this.W = this.R.computeIfAbsent(this.U, var0 -> new class05025());
      }

      return this.W;
   }
}
