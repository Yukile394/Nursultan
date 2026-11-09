package minecraft;

import com.google.gson.JsonElement;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public record class07903<Result>(class03529<? extends class07940<?, ? extends Result>> method, CompletableFuture<Result> resultFuture, long timeoutTime) {
   public long L() {
      return this.timeoutTime;
   }

   public class07903(class03529<? extends class07940<?, ? extends Result>> method, CompletableFuture<Result> resultFuture, long timeoutTime) {
      this.method = method;
      this.resultFuture = resultFuture;
      this.timeoutTime = timeoutTime;
   }

   public CompletableFuture<Result> y() {
      return this.resultFuture;
   }

   public boolean N(long var1) {
      return var1 > this.timeoutTime;
   }

   public void N(JsonElement var1) {
      try {
         Object object = this.method.N().N(var1);
         this.resultFuture.complete(Objects.requireNonNull((Result)object));
      } catch (Exception exception) {
         this.resultFuture.completeExceptionally(exception);
      }
   }

   public class03529<? extends class07940<?, ? extends Result>> N() {
      return this.method;
   }
}
