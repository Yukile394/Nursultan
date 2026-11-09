package minecraft;

import com.mojang.datafixers.util.Either;

class class02398<B, L, R> implements class02362<B, Either<L, R>> {
   class02398(class02362 var1, class02362 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public void encode(B var1, Either<L, R> var2) {
      var2.ifLeft(var2x -> {
         var1.writeBoolean(true);
         var1x.encode((B)var1, var2x);
      }).ifRight(var2x -> {
         var1.writeBoolean(false);
         var1x.encode((B)var1, var2x);
      });
   }

   public Either<L, R> decode(B var1) {
      return var1.readBoolean() ? Either.left(this.N.decode((B)var1)) : Either.right(this.y.decode((B)var1));
   }
}
