package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public final class class02686 extends class02689 {
   private static final class00392 i = class00392.L("component.profile.dynamic").N(class06541.field_1080);
   private final Either<String, UUID> R;

   class02686(Either<String, UUID> var1, class01653 var2) {
      super(class02689.N(var1.left(), var1.right(), PropertyMap.EMPTY), var2);
      this.R = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof class02686 class02686 && this.R.equals(class02686.R) && this.u.equals(class02686.u);
   }

   @Override
   public int hashCode() {
      int ix = 31 + this.R.hashCode();
      return 31 * ix + this.u.hashCode();
   }

   @Override
   public Optional<String> u() {
      return this.R.left();
   }

   @Override
   protected Either<GameProfile, class02677> N() {
      return Either.right(new class02677(this.R.left(), this.R.right(), PropertyMap.EMPTY));
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      var2.accept(i);
   }

   @Override
   public CompletableFuture<GameProfile> N(class00909 var1) {
      return CompletableFuture.supplyAsync(() -> var1.N(this.R).orElse(this.L), class07536.z());
   }
}
