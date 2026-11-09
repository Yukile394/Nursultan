package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class class01177 implements class01190 {
   public static final MapCodec<class01177> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class01487.N.fieldOf("source_entity").forGetter(class01177::y), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter(var0x -> var0x.R)
         )
         .apply(var0, (var0x, var1) -> new class01177(Either.right(Either.left(var0x)), var1))
   );
   public static final class02362<ByteBuf, class01177> y = class02362.N(
      class02389.B, class01177::L, class02389.E, var0 -> var0.R, (var0, var1) -> new class01177(Either.right(Either.right(var0)), var1)
   );
   private Either<class07049, Either<UUID, Integer>> i;
   private final float R;

   private int L() {
      return (Integer)this.i.map(class07049::method_5628, var0 -> (Integer)var0.map(var0x -> {
         throw new IllegalStateException("Unable to get entityId from uuid");
      }, Function.identity()));
   }

   public class01177(class07049 var1, float var2) {
      this(Either.left(var1), var2);
   }

   private class01177(Either<class07049, Either<UUID, Integer>> var1, float var2) {
      super();
      this.i = var1;
      this.R = var2;
   }

   private void y(class07299 var1) {
      ((Optional)this.i
            .map(
               Optional::of,
               var1x -> Optional.ofNullable(
                  (class07049)var1x.map(var1xx -> var1 instanceof class04782 ? ((class04782)var1).method_66347(var1xx) : null, var1::method_8469)
               )
            ))
         .ifPresent(var1x -> this.i = Either.left(var1x));
   }

   public UUID y() {
      return (UUID)this.i.map(class07049::method_5667, var0 -> (UUID)var0.map(Function.identity(), var0x -> {
         throw new RuntimeException("Unable to get entityId from uuid");
      }));
   }

   @Override
   public Optional<class06889> N(class07299 var1) {
      if (this.i.left().isEmpty()) {
         this.y(var1);
      }

      return this.i.left().map(var1x -> var1x.method_73189().y(0.0, this.R, 0.0));
   }

   @Override
   public class01182<class01177> N() {
      return class01182.y;
   }
}
