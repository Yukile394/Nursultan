package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import jerozgen.languagereload.config.Config;

public class class08666 {
   private static final class08683 N = new class08683();
   private static final class08683 y = new class08683();
   private static final class08683 L = new class08683();
   private CompletableFuture<class00077<class06584>> u = CompletableFuture.completedFuture(class00077.N());
   private CompletableFuture<class00077<class06584>> i = CompletableFuture.completedFuture(class00077.N());
   private CompletableFuture<class00077<class05287>> R = CompletableFuture.completedFuture(class00077.N());
   private final Map<class08683, Runnable> M = new IdentityHashMap<>();

   public class00077<class06584> L() {
      return this.i.join();
   }

   public class08666() {
      super();
   }

   public class00077<class06584> u() {
      return this.u.join();
   }

   public class00077<class05287> y() {
      return this.R.join();
   }

   private static List N(class06584 var0, class06591 var1, class08036 var2, class06497 var3, Operation var4) {
      List list = (List)var4.call(new Object[]{var0, var1, var2, var3});
      if (Config.getInstance() == null) {
         return list;
      } else if (!Config.getInstance().multilingualItemSearch) {
         return list;
      } else {
         class07018 class07018 = class07018.y();
         if (class07018 == null) {
            return list;
         } else {
            class08429 class08429 = class07018.languagereload_getTranslationStorage();
            if (class08429 == null) {
               return list;
            } else {
               ArrayList arraylist = new ArrayList(list);

               for (String s : Config.getInstance().fallbacks) {
                  class08429.languagereload_setTargetLanguage(s);
                  ((List)var4.call(new Object[]{var0, var1, var2, var3})).stream().map(class00392::getString).map(class00392::y).forEach(arraylist::add);
               }

               class08429.languagereload_setTargetLanguage(null);
               return arraylist;
            }
         }
      }
   }

   public void N(class01929 var1, List<class06584> var2) {
      this.N(
         y,
         () -> {
            class06591 class06591 = class06591.N(var1);
            class06524 class06524 = class06524.N.L();
            CompletableFuture<class00077<class06584>> completablefuture = this.u;
            this.u = CompletableFuture.supplyAsync(
               () -> new class08658<>(var2xxx -> N(Stream.of(var2xxx), class06591, class06524), var0x -> var0x.Z().i().map(class05946::N).stream(), var2),
               class07536.B()
            );
            completablefuture.cancel(true);
         }
      );
   }

   public void N() {
      Iterator<Runnable> iterator = this.M.values().iterator();

      while (iterator.hasNext()) {
         iterator.next().run();
      }
   }

   public void N(List<class06584> var1) {
      this.N(L, () -> {
         CompletableFuture<class00077<class06584>> completablefuture = this.i;
         this.i = CompletableFuture.supplyAsync(() -> new class00003<>(var0x -> var0x.z().map(class03530::y), var1), class07536.B());
         completablefuture.cancel(true);
      });
   }

   public void N(class01756 var1, class07299 var2) {
      this.N(
         N,
         () -> {
            List<class05287> list = var1.L();
            class01042 class01042 = var2.method_30349();
            class00751 class00751 = class01042.L(class04227.F);
            class06591 class06591 = class06591.N(class01042);
            class00311 class00311 = class00282.N(var2);
            class06524 class06524 = class06524.N;
            CompletableFuture<class00077<class05287>> completablefuture = this.R;
            this.R = CompletableFuture.supplyAsync(
               () -> new class08658<>(
                  var3xx -> N(var3xx.L().stream().flatMap(var1xxxx -> var1xxxx.N(class00311).stream()), class06591, class06524),
                  var2xxx -> var2xxx.L().stream().flatMap(var1xxxx -> var1xxxx.N(class00311).stream()).map(var1xxxx -> class00751.y(var1xxxx.B())),
                  list
               ),
               class07536.B()
            );
            completablefuture.cancel(true);
         }
      );
   }

   private static Stream<String> N(Stream<class06584> var0, class06591 var1, class06497 var2) {
      return var0.<class00392>flatMap(
            var2x -> N(
                  var2x,
                  var1,
                  null,
                  var2,
                  var0xx -> {
                     WrapOperationRuntime.checkArgumentCount(
                        var0xx, 4, "[net.minecraft.class_1799, net.minecraft.class_1792$class_9635, net.minecraft.class_1657, net.minecraft.class_1836]"
                     );
                     return ((class06584)var0xx[0]).N((class06591)var0xx[1], (class08036)var0xx[2], (class06497)var0xx[3]);
                  }
               )
               .stream()
         )
         .map(var0x -> class06541.N(var0x.getString()).trim())
         .filter(var0x -> !var0x.isEmpty());
   }

   private void N(class08683 var1, Runnable var2) {
      var2.run();
      this.M.put(var1, var2);
   }
}
