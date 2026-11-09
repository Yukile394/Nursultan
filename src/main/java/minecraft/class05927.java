package minecraft;

import baritone.api.utils.BlockOptionalMeta.ServerLevelStub;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class05927 {
   private final class04162 N;
   @Nullable
   private class06069 y;

   public class05927(class04162 var1) {
      super();
      this.N = var1;
   }

   public class05908 N(Optional<class01894> var1) {
      class04782 class04782 = this.N();
      class02796 class02796 = class04782.method_8503();
      class06069 class06069 = Optional.ofNullable(this.y).or(() -> var1.map(class04782::method_51836)).orElseGet(class04782::method_8409);
      return new class05908(this.N, class06069, this.N(class02796).N());
   }

   private class02331 N(class02796 var1) {
      if (var1 != null) {
         return var1.yd();
      } else {
         class04782 class04782 = this.N();
         return class04782 instanceof ServerLevelStub ? ((ServerLevelStub)class04782).holder() : null;
      }
   }

   public class04782 N() {
      return this.N.N();
   }

   public class05927 N(class06069 var1) {
      this.y = var1;
      return this;
   }

   public class05927 N(long var1) {
      if (var1 != 0L) {
         this.y = class06069.y(var1);
      }

      return this;
   }
}
