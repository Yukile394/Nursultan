package minecraft;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class class07098 implements class07135 {
   private final class01997 N;
   private final List<class02026> i;
   private final CompletableFuture<class01929> R;

   public class07098(class01996 var1, CompletableFuture<class01929> var2, List<class02026> var3) {
      super();
      this.N = var1.method_60917(class04227.yK);
      this.i = var3;
      this.R = var2;
   }

   @Override
   public String method_10321() {
      return "Advancements";
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      return this.R.thenCompose(var2 -> {
         HashSet hashset = new HashSet();
         ArrayList arraylist = new ArrayList();
         Consumer consumer = var5x -> {
            if (!hashset.add(var5x.N())) {
               throw new IllegalStateException("Duplicate advancement " + var5x.N());
            } else {
               Path path = this.N.N(var5x.N());
               arraylist.add(class07135.N(var1, var2, class07151.N, var5x.y(), path));
            }
         };
         Iterator<class02026> iterator = this.i.iterator();

         while (iterator.hasNext()) {
            iterator.next().N(var2, consumer);
         }

         return CompletableFuture.allOf(arraylist.toArray(CompletableFuture[]::new));
      });
   }
}
