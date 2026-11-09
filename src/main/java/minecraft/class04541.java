package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import org.jspecify.annotations.Nullable;

public class class04541 implements class04526 {
   public static final int N = 10;
   @Nullable
   private static Consumer<Path> y = null;
   private final Map<class04530, List<class04536>> L = new Object2ObjectOpenHashMap();
   private final class06007 u;
   private final Executor i;
   private final class04524 R;
   private final Consumer<class04681> M;
   private final Consumer<Path> B;
   private final class04555 Z;
   private final LongSupplier z;
   private final long U;
   private int E;
   private class04657 W;
   private volatile boolean m;
   private Set<class04530> P = ImmutableSet.of();

   @Override
   public void L() {
      this.M();
      this.P = this.Z.N(() -> this.W);
      Iterator<class04530> iterator = this.P.iterator();

      while (iterator.hasNext()) {
         iterator.next().N();
      }

      this.E++;
   }

   private void M() {
      if (!this.i()) {
         throw new IllegalStateException("Not started!");
      }
   }

   private class04541(class04555 var1, LongSupplier var2, Executor var3, class04524 var4, Consumer<class04681> var5, Consumer<Path> var6) {
      super();
      this.Z = var1;
      this.z = var2;
      this.u = new class06007(var2, () -> this.E, () -> false);
      this.i = var3;
      this.R = var4;
      this.M = var5;
      this.B = y == null ? var6 : var6.andThen(y);
      this.U = var2.getAsLong() + TimeUnit.NANOSECONDS.convert(10L, TimeUnit.SECONDS);
      this.W = new class05011(this.z, () -> this.E, () -> true);
      this.u.L();
   }

   @Override
   public boolean i() {
      return this.u.N();
   }

   @Override
   public void u() {
      this.M();
      if (this.E != 0) {
         for (class04530 class04530 : this.P) {
            class04530.N(this.E);
            if (class04530.M()) {
               class04536 class04536 = new class04536(Instant.now(), this.E, this.W.u());
               this.L.computeIfAbsent(class04530, var0 -> Lists.newArrayList()).add(class04536);
            }
         }

         if (!this.m && this.z.getAsLong() <= this.U) {
            this.W = new class05011(this.z, () -> this.E, () -> true);
         } else {
            this.m = false;
            class04681 class04681 = this.u.i();
            this.W = class04687.N;
            this.M.accept(class04681);
            this.N(class04681);
         }
      }
   }

   @Override
   public synchronized void y() {
      if (this.i()) {
         this.W = class04687.N;
         this.M.accept(class04645.N);
         this.N(this.P);
      }
   }

   private void N(class04681 var1) {
      HashSet hashset = new HashSet<>(this.P);
      this.i.execute(() -> {
         Path path = this.R.N(hashset, this.L, var1);
         this.N(hashset);
         this.B.accept(path);
      });
   }

   @Override
   public synchronized void N() {
      if (this.i()) {
         this.m = true;
      }
   }

   public static void N(Consumer<Path> var0) {
      y = var0;
   }

   public static class04541 N(class04555 var0, LongSupplier var1, Executor var2, class04524 var3, Consumer<class04681> var4, Consumer<Path> var5) {
      return new class04541(var0, var1, var2, var3, var4, var5);
   }

   private void N(Collection<class04530> var1) {
      Iterator iterator = var1.iterator();

      while (iterator.hasNext()) {
         ((class04530)iterator.next()).y();
      }

      this.L.clear();
      this.u.y();
   }

   @Override
   public class04643 R() {
      return class04643.N(this.u.u(), this.W);
   }
}
