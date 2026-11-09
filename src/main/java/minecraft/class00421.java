package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class00421(Either<class08262, String> name, String objective) implements class04439 {
   public static final MapCodec<class00421> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.either(class08262.N, Codec.STRING).fieldOf("name").forGetter(class00421::y), Codec.STRING.fieldOf("objective").forGetter(class00421::L)
         )
         .apply(var0, class00421::new)
   );
   public static final MapCodec<class00421> y = N.fieldOf("score");

   public String L() {
      return this.objective;
   }

   public class00421(Either<class08262, String> name, String objective) {
      super();
      this.name = name;
      this.objective = objective;
   }

   @Override
   public String toString() {
      return "score{name='" + this.name + "', objective='" + this.objective + "'}";
   }

   public Either<class08262, String> y() {
      return this.name;
   }

   @Override
   public MapCodec<class00421> N() {
      return y;
   }

   private class05216 N(class01766 var1, class07701 var2) {
      class02796 class02796 = var2.W();
      if (class02796 != null) {
         class06394 class06394 = class02796.yB();
         class00518 class00518 = class06394.N(this.objective);
         if (class00518 != null) {
            class01788 class01788 = class06394.y(var1, class00518);
            if (class01788 != null) {
               return class01788.y(class00518.N(class01759.y));
            }
         }
      }

      return class00392.i();
   }

   @Override
   public class05216 N(@Nullable class07701 var1, @Nullable class07049 var2, int var3) throws CommandSyntaxException {
      if (var1 == null) {
         return class00392.i();
      } else {
         class01766 class01766 = this.N(var1);
         Object object = var2 != null && class01766.equals(class01766.Ni) ? var2 : class01766;
         return this.N((class01766)object, var1);
      }
   }

   private class01766 N(class07701 var1) throws CommandSyntaxException {
      Optional<class08262> optional = this.name.left();
      if (optional.isPresent()) {
         List<? extends class07049> list = optional.get().y().y(var1);
         if (!list.isEmpty()) {
            if (list.size() != 1) {
               throw class07680.N.create();
            } else {
               return list.getFirst();
            }
         } else {
            return class01766.N(optional.get().N());
         }
      } else {
         return class01766.N((String)this.name.right().orElseThrow());
      }
   }
}
