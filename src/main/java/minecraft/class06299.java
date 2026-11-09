package minecraft;

import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class class06299 {
   private final class02857 N;
   private final Map<class01894, CompletableFuture<class06312>> y = Maps.newHashMap();

   public class06299(class02857 var1) {
      super();
      this.N = var1;
   }

   public CompletableFuture<class06304> N(class01894 var1, boolean var2) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream inputstream = this.N.u(var1);
            return (class06304)(var2 ? new class04965(class06322::new, inputstream) : new class06322(inputstream));
         } catch (IOException ioexception) {
            throw new CompletionException(ioexception);
         }
      }, class07536.z());
   }

   public void N() {
      this.y.values().forEach(var0 -> var0.thenAccept(class06312::y));
      this.y.clear();
   }

   public CompletableFuture<?> N(Collection<class00002> var1) {
      return CompletableFuture.allOf(var1.stream().map(var1x -> this.N(var1x.y())).toArray(CompletableFuture[]::new));
   }

   public CompletableFuture<class06312> N(class01894 var1) {
      return this.y.computeIfAbsent(var1, var1x -> CompletableFuture.supplyAsync(() -> {
         try {
            class06312 class06312;
            try (
               InputStream inputstream = this.N.u(var1x);
               class06322 class06322 = new class06322(inputstream);
            ) {
               ByteBuffer bytebuffer = class06322.y();
               class06312 = new class06312(bytebuffer, class06322.N());
            }

            return class06312;
         } catch (IOException ioexception) {
            throw new CompletionException(ioexception);
         }
      }, class07536.z()));
   }
}
