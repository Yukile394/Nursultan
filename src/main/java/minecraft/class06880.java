package minecraft;

import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CompletableFuture;

public abstract class class06880 implements class07135 {
   private final class01996 field_53723;
   private final CompletableFuture<class01929> field_53724;

   public class06880(class01996 var1, CompletableFuture<class01929> var2) {
      super();
      this.field_53723 = var1;
      this.field_53724 = var2;
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      return this.field_53724.thenCompose(var2 -> {
         class01997 class01997x = this.field_53723.method_60917(class04227.yV);
         class01997 class01997x = this.field_53723.method_60917(class04227.yK);
         HashSet hashset = Sets.newHashSet();
         ArrayList arraylist = new ArrayList();
         class06872 class06872 = new class06872(this, hashset, arraylist, var1, var2, class01997x, class01997x);
         this.method_62766(var2, class06872).N();
         return CompletableFuture.allOf(arraylist.toArray(CompletableFuture[]::new));
      });
   }

   protected abstract class06903 method_62766(class01929 var1, class03719 var2);
}
