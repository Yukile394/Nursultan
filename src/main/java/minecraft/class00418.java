package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00418 implements class04439 {
   private static final Logger L = LogUtils.getLogger();
   public static final MapCodec<class00418> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.STRING.fieldOf("nbt").forGetter(class00418::y),
            Codec.BOOL.lenientOptionalFieldOf("interpret", false).forGetter(class00418::L),
            class03748.N.lenientOptionalFieldOf("separator").forGetter(class00418::u),
            class06623.N.forGetter(class00418::i)
         )
         .apply(var0, class00418::new)
   );
   private final boolean u;
   private final Optional<class00392> i;
   private final String R;
   private final class04457 M;
   @Nullable
   protected final class07793 y;

   public boolean L() {
      return this.u;
   }

   public class00418(String var1, boolean var2, Optional<class00392> var3, class04457 var4) {
      this(var1, N(var1), var2, var3, var4);
   }

   private class00418(String var1, @Nullable class07793 var2, boolean var3, Optional<class00392> var4, class04457 var5) {
      super();
      this.R = var1;
      this.y = var2;
      this.u = var3;
      this.i = var4;
      this.M = var5;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class00418 class00418
            && this.M.equals(class00418.M)
            && this.i.equals(class00418.i)
            && this.u == class00418.u
            && this.R.equals(class00418.R);
   }

   @Override
   public String toString() {
      return "nbt{" + this.M + ", interpreting=" + this.u + ", separator=" + this.i + "}";
   }

   @Override
   public int hashCode() {
      int ix = this.u ? 1 : 0;
      ix = 31 * ix + this.i.hashCode();
      ix = 31 * ix + this.R.hashCode();
      return 31 * ix + this.M.hashCode();
   }

   public class04457 i() {
      return this.M;
   }

   public Optional<class00392> u() {
      return this.i;
   }

   public String y() {
      return this.R;
   }

   @Override
   public class05216 N(@Nullable class07701 var1, @Nullable class07049 var2, int var3) throws CommandSyntaxException {
      if (var1 != null && this.y != null) {
         Stream stream = this.M.N(var1).flatMap(var1x -> {
            try {
               return this.y.N(var1x).stream();
            } catch (CommandSyntaxException commandsyntaxexception) {
               return Stream.empty();
            }
         });
         if (this.u) {
            class03519 class03519 = var1.t().N(class07713.N);
            class00392 class00392 = (class00392)DataFixUtils.orElse(class00390.N(var1, this.i, var2, var3), class00390.L);
            return stream.flatMap(var4x -> {
               try {
                  class00392 class00392x = (class00392)class03748.N.parse(class03519, var4x).getOrThrow();
                  return Stream.of(class00390.N(var1, class00392x, var2, var3));
               } catch (Exception exception) {
                  L.warn("Failed to parse component: {}", var4x, exception);
                  return Stream.of();
               }
            }).reduce((var1x, var2x) -> var1x.y(class00392).y(var2x)).orElseGet(class00392::i);
         } else {
            Stream stream1 = stream.map(class00418::N);
            return class00390.N(var1, this.i, var2, var3)
               .map(var1x -> stream1.map(class00392::y).reduce((var1xx, var2x) -> var1xx.y(var1x).y(var2x)).orElseGet(class00392::i))
               .orElseGet(() -> class00392.y(stream1.collect(Collectors.joining(", "))));
         }
      } else {
         return class00392.i();
      }
   }

   @Nullable
   private static class07793 N(String var0) {
      try {
         return new class07759().parse(new StringReader(var0));
      } catch (CommandSyntaxException commandsyntaxexception) {
         return null;
      }
   }

   private static String N(class07709 var0) {
      if (var0 instanceof class07707 class07707x) {
         class07707 class07707x = class07707x;

         try {
            return class07707x.U();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }
      } else {
         return var0.toString();
      }
   }

   @Override
   public MapCodec<class00418> N() {
      return N;
   }
}
