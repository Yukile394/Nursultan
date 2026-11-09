package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public abstract class class05248 {
   public static final Codec<class05248> i = class04206.NM.T().dispatch("element_type", class05248::N, class05267::codec);
   private static final class03556<class05483> N = class03556.N(new class05483(List.of()));
   @Nullable
   private volatile class05246 y;

   public class05246 M() {
      class05246 class05246 = this.y;
      if (class05246 == null) {
         throw new IllegalStateException();
      } else {
         return class05246;
      }
   }

   public class05248(class05246 var1) {
      super();
      this.y = var1;
   }

   public int B() {
      return 1;
   }

   public static Function<class05246, class04869> Z() {
      return var0 -> class04869.y;
   }

   public static Function<class05246, class04872> y(String var0) {
      return var1 -> new class04872(Either.left(class01894.N(var0)), N, var1, Optional.empty());
   }

   public static Function<class05246, class04881> y(List<Function<class05246, ? extends class05248>> var0) {
      return var1 -> new class04881(var0.stream().map(var1x -> (class05248)var1x.apply(var1)).collect(Collectors.toList()), var1);
   }

   public static Function<class05246, class04872> y(String var0, class03556<class05483> var1) {
      return var2 -> new class04872(Either.left(class01894.N(var0)), var1, var2, Optional.empty());
   }

   public abstract class00753 N(class01224 var1, class06993 var2);

   public abstract List<class01203> N(class01224 var1, class07209 var2, class06993 var3, class06069 var4);

   public abstract class05163 N(class01224 var1, class07209 var2, class06993 var3);

   public abstract class05267<?> N();

   public void N(class07284 var1, class01228 var2, class07209 var3, class06993 var4, class06069 var5, class05163 var6) {
   }

   public static Function<class05246, class05057> N(String var0, class03556<class05483> var1) {
      return var2 -> new class05057(Either.left(class01894.N(var0)), var1, var2, Optional.empty());
   }

   public static Function<class05246, class05057> N(String var0) {
      return var1 -> new class05057(Either.left(class01894.N(var0)), N, var1, Optional.empty());
   }

   public class05248 N(class05246 var1) {
      this.y = var1;
      return this;
   }

   public abstract boolean N(
      class01224 var1,
      class05974 var2,
      class05324 var3,
      class08088 var4,
      class07209 var5,
      class07209 var6,
      class06993 var7,
      class05163 var8,
      class06069 var9,
      class02610 var10,
      boolean var11
   );

   public static Function<class05246, class04861> N(class03556<class04336> var0) {
      return var1 -> new class04861(var0, var1);
   }

   public static Function<class05246, class04872> N(String var0, class03556<class05483> var1, class02610 var2) {
      return var3 -> new class04872(Either.left(class01894.N(var0)), var1, var3, Optional.of(var2));
   }

   public static Function<class05246, class04872> N(String var0, class02610 var1) {
      return var2 -> new class04872(Either.left(class01894.N(var0)), N, var2, Optional.of(var1));
   }

   protected static <E extends class05248> RecordCodecBuilder<E, class05246> R() {
      return class05246.field_24956.fieldOf("projection").forGetter(class05248::M);
   }
}
