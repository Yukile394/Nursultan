package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public abstract sealed class class02689 implements class02694 permits class02697, class02686 {
   private static final Codec<class02689> i = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.mapEither(class06338.e, class02677.i).forGetter(class02689::N), class01653.R.forGetter(class02689::L))
         .apply(var0, class02689::N)
   );
   public static final Codec<class02689> N = Codec.withAlternative(i, class06338.K, class02689::N);
   public static final class02362<ByteBuf, class02689> y = class02362.N(
      class02389.N(class02389.k, class02677.R), class02689::N, class01653.M, class02689::L, class02689::N
   );
   protected final GameProfile L;
   protected final class01653 u;

   public class01653 L() {
      return this.u;
   }

   public class02689(GameProfile var1, class01653 var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   public abstract Optional<String> u();

   public GameProfile y() {
      return this.L;
   }

   private static class02689 N(Either<GameProfile, class02677> var0, class01653 var1) {
      return (class02689)var0.map(
         var1x -> new class02697(Either.left(var1x), var1),
         var1x -> (class02689)(var1x.L().isEmpty() && var1x.y().isPresent() != var1x.N().isPresent()
            ? var1x.N().map(var1xx -> new class02686(Either.left(var1xx), var1)).orElseGet(() -> new class02686(Either.right(var1x.y().get()), var1))
            : new class02697(Either.right(var1x), var1))
      );
   }

   public static class02689 N(GameProfile var0) {
      return new class02697(Either.left(var0), class01653.i);
   }

   public static class02689 N(String var0) {
      return new class02686(Either.left(var0), class01653.i);
   }

   public static class02689 N(UUID var0) {
      return new class02686(Either.right(var0), class01653.i);
   }

   protected abstract Either<GameProfile, class02677> N();

   public abstract CompletableFuture<GameProfile> N(class00909 var1);

   static GameProfile N(Optional<String> var0, Optional<UUID> var1, PropertyMap var2) {
      String s = var0.orElse("");
      UUID uuid = var1.orElseGet(() -> var0.<UUID>map(class01487::N).orElse(class07536.R));
      return new GameProfile(uuid, s, var2);
   }
}
