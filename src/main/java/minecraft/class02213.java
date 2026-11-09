package minecraft;

import com.mojang.datafixers.util.Either;
import java.net.URI;

public record class02213(Either<class02222, class00392> type, URI link) {

   public URI L() {
      return this.link;
   }

   public class02213(Either<class02222, class00392> type, URI link) {
      this.type = type;
      this.link = link;
   }

   public Either<class02222, class00392> y() {
      return this.type;
   }

   public static class02213 N(class02222 var0, URI var1) {
      return new class02213(Either.left(var0), var1);
   }

   public class00392 N() {
      return (class00392)this.type.map(class02222::N, var0 -> var0);
   }

   public static class02213 N(class00392 var0, URI var1) {
      return new class02213(Either.right(var0), var1);
   }
}
