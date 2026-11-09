package minecraft;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import net.fabricmc.fabric.impl.resource.FabricLifecycledResourceManager;
import net.fabricmc.fabric.impl.resource.ResourceLoaderImpl;
import org.jspecify.annotations.Nullable;

public class class06162<S> implements class06164 {
   private static final int L = 2;
   private static final int u = 2;
   private static final int i = 1;
   final CompletableFuture<class06244> N = new CompletableFuture<>();
   @Nullable
   private CompletableFuture<List<S>> R;
   final Set<class01081> y;
   private final int M;
   private final AtomicInteger B = new AtomicInteger();
   private final AtomicInteger Z = new AtomicInteger();
   private final AtomicInteger z = new AtomicInteger();
   private final AtomicInteger U = new AtomicInteger();

   protected class06162(List<class01081> var1) {
      super();
      this.M = var1.size();
      this.y = new HashSet<>(var1);
   }

   private static List y(List var0, class01089 var1) {
      return var1 instanceof FabricLifecycledResourceManager
         ? ResourceLoaderImpl.sort(((FabricLifecycledResourceManager)var1).fabric$getResourceType(), var0)
         : var0;
   }

   @Override
   public float y() {
      int ix = this.M - this.y.size();
      float f = N(this.Z.get(), this.U.get(), ix);
      float f1 = N(this.B.get(), this.z.get(), this.M);
      return f / f1;
   }

   public static class06164 y(class01089 var0, List<class01081> var1, Executor var2, Executor var3, CompletableFuture<class06244> var4) {
      class06162 class06162 = new class06162(var1);
      class06162.y(var2, var3, var0, var1, class06160.N, var4);
      return class06162;
   }

   protected void y(Executor var1, Executor var2, class01089 var3, List<class01081> var4, class06160<S> var5, CompletableFuture<?> var6) {
      this.R = this.N(var1, var2, var3, var4, var5, var6);
   }

   private static List N(List var0, class01089 var1) {
      return var1 instanceof FabricLifecycledResourceManager
         ? ResourceLoaderImpl.sort(((FabricLifecycledResourceManager)var1).fabric$getResourceType(), var0)
         : var0;
   }

   private static boolean N(boolean var0) {
      return var0 || ResourceLoaderImpl.DEBUG_PROFILE_RESOURCE_RELOADERS;
   }

   protected CompletableFuture<List<S>> N(Executor var1, Executor var2, class01089 var3, List<class01081> var4, class06160<S> var5, CompletableFuture<?> var6) {
      Executor executor = var2x -> {
         this.B.incrementAndGet();
         var1.execute(() -> {
            var2x.run();
            this.Z.incrementAndGet();
         });
      };
      Executor executor1 = var2x -> {
         this.z.incrementAndGet();
         var2.execute(() -> {
            var2x.run();
            this.U.incrementAndGet();
         });
      };
      this.B.incrementAndGet();
      var6.thenRun(this.Z::incrementAndGet);
      class01073 class01073 = new class01073(var3);
      var4.forEach(var1x -> var1x.prepareSharedState(class01073));
      CompletableFuture completablefuture = var6;
      ArrayList arraylist = new ArrayList();

      for (class01081 class01081 : var4) {
         class01080 class01080 = this.N(class01081, completablefuture, var2);
         CompletableFuture completablefuture1 = var5.create(class01073, class01080, class01081, executor, executor1);
         arraylist.add(completablefuture1);
         completablefuture = completablefuture1;
      }

      return class07536.u(arraylist);
   }

   private class01080 N(class01081 var1, CompletableFuture<?> var2, Executor var3) {
      return new class06157(this, var3, var1, var2);
   }

   @Override
   public CompletableFuture<?> N() {
      return Objects.requireNonNull(this.R, "not started");
   }

   private static int N(int var0, int var1, int var2) {
      return var0 * 2 + var1 * 2 + var2 * 1;
   }

   public static class06164 N(class01089 var0, List<class01081> var1, Executor var2, Executor var3, CompletableFuture<class06244> var4, boolean var5) {
      var5 = N(var5);
      return var5 ? class06144.N(var0, y(var1, var0), var2, var3, var4) : y(var0, N(var1, var0), var2, var3, var4);
   }
}
