package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public final class class02697 extends class02689 {
   public static final class02697 i = new class02697(Either.right(class02677.u), class01653.i);
   private final Either<GameProfile, class02677> R;

   class02697(Either<GameProfile, class02677> var1, class01653 var2) {
      super((GameProfile)var1.map(var0 -> var0, class02677::u), var2);
      this.R = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof class02697 class02697 && this.R.equals(class02697.R) && this.u.equals(class02697.u);
   }

   @Override
   public int hashCode() {
      int ix = 31 + this.R.hashCode();
      return 31 * ix + this.u.hashCode();
   }

   @Override
   public Optional<String> u() {
      return (Optional<String>)this.R.map(var0 -> Optional.of(var0.name()), var0 -> var0.N());
   }

   @Override
   public CompletableFuture<GameProfile> N(class00909 var1) {
      return CompletableFuture.completedFuture(this.L);
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
   }

   @Override
   protected Either<GameProfile, class02677> N() {
      return this.R;
   }
}
