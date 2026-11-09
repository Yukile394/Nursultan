package minecraft;

import java.util.concurrent.CompletableFuture;

record class08639(class08361 texture, CompletableFuture<class08354> newContents) {

   class08639(class08361 texture, CompletableFuture<class08354> newContents) {
      this.texture = texture;
      this.newContents = newContents;
   }

   public CompletableFuture<class08354> y() {
      return this.newContents;
   }

   public class08361 N() {
      return this.texture;
   }
}
