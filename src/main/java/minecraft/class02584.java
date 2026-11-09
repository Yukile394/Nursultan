package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public enum class02584 implements class05033 {
   field_52394("true"),
   field_52395("false"),
   field_52396("default");

   public static final Codec<class02584> field_64315 = Codec.either(Codec.BOOL, class05033.N(class02584::values))
      .xmap(var0 -> (class02584)var0.map(class02584::N, Function.identity()), var0 -> {
         return switch (var0) {
            case field_52394 -> Either.left(true);
            case field_52395 -> Either.left(false);
            case field_52396 -> Either.right(var0);
         };
      });
   private final String field_64316;

   private class02584(String var3) {
      this.field_64316 = var3;
   }

   public boolean y(boolean var1) {
      return switch (this) {
         case field_52394 -> true;
         case field_52395 -> false;
         default -> var1;
      };
   }

   public static class02584 N(boolean var0) {
      return var0 ? field_52394 : field_52395;
   }

   @Override
   public String method_15434() {
      return this.field_64316;
   }
}
