package minecraft;

import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class class01994 {
   private static final Logger N = LogUtils.getLogger();
   private final class01894 y;
   private final int L;

   public class01994(class01894 var1, int var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   private Map<class01894, class08388> N(class08384<class01991> var1, int var2, int var3) {
      HashMap hashmap = new HashMap();
      var1.N((var4x, var5, var6, var7) -> hashmap.put(var4x.method_45816(), new class08388(this.y, var4x, var2, var3, var5, var6, var7)));
      return hashmap;
   }

   public CompletableFuture<class02008> N(class01089 var1, class01894 var2, int var3, Executor var4, Set<class02968<?>> var5) {
      class01640 class01640 = class01640.N(var5);
      return CompletableFuture.<List<class04235>>supplyAsync(() -> class04203.N(var1, var2).N(var1), var4)
         .thenCompose(var2x -> N(class01640, (List<class04235>)var2x, var4))
         .thenApply(var3x -> this.N((List<class01991>)var3x, var3, var4));
   }

   private static CompletableFuture<List<class01991>> N(class01640 var0, List<class04235> var1, Executor var2) {
      return class07536.L(var1.stream().map(var2x -> CompletableFuture.supplyAsync(() -> var2x.method_52853(var0), var2)).toList())
         .thenApply(var0x -> var0x.stream().filter(Objects::nonNull).toList());
   }

   private class02008 N(List<class01991> var1, int var2, Executor var3) {
      class02008 class02008;
      try (class08694 class08694 = class08700.N().L(() -> "stitch " + this.y)) {
         int i = this.L;
         int j = Integer.MAX_VALUE;
         int k = 1 << var2;

         for (class01991 class01991x : var1) {
            j = Math.min(j, Math.min(class01991x.method_45807(), class01991x.method_45815()));
            int l = Math.min(Integer.lowestOneBit(class01991x.method_45807()), Integer.lowestOneBit(class01991x.method_45815()));
            if (l < k) {
               N.warn(
                  "Texture {} with size {}x{} limits mip level from {} to {}",
                  new Object[]{class01991x.method_45816(), class01991x.method_45807(), class01991x.method_45815(), class04995.M(k), class04995.M(l)}
               );
               k = l;
            }
         }

         int j1 = Math.min(j, k);
         int k1 = class04995.M(j1);
         int l1;
         if (k1 < var2) {
            N.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", new Object[]{this.y, var2, k1, j1});
            l1 = k1;
         } else {
            l1 = var2;
         }

         class05630 class05630 = (class05630)class06202.Nq().i_7;
         int i1 = l1 != 0 && class05630.c().method_41753() == class06532.field_64665 ? class05630.e().method_41753() : 0;
         class08384 class08384 = new class08384(i, i, l1, i1);

         for (class01991 class01991x : var1) {
            class08384.N(class01991x);
         }

         try {
            class08384.L();
         } catch (class08383 class08383) {
            class07080 class07080 = class07080.N(class08383, "Stitching");
            class07074 class07074 = class07080.N("Stitcher");
            class07074.N(
               "Sprites",
               class08383.N()
                  .stream()
                  .map(var0 -> String.format(Locale.ROOT, "%s[%dx%d]", var0.method_45816(), var0.method_45807(), var0.method_45815()))
                  .collect(Collectors.joining(","))
            );
            class07074.N("Max Texture Size", i);
            throw new class07878(class07080);
         }

         int i2 = class08384.N();
         int j2 = class08384.y();
         Map map = this.N(class08384, i2, j2);
         class08388 class08388 = (class08388)map.get(class08923.L());
         CompletableFuture completablefuture = CompletableFuture.runAsync(() -> map.values().forEach(var1xx -> var1xx.method_45851().method_45808(l1)), var3);
         class02008 = new class02008(i2, j2, l1, class08388, map, completablefuture);
      }

      return class02008;
   }

   public static class01994 N(class08626 var0) {
      return new class01994(var0.i(), var0.R());
   }
}
