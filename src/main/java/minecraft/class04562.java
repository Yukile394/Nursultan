package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.stream.IntStream;
import org.apache.commons.lang3.mutable.MutableObject;

public interface class04562<C, I extends class04573<C>> extends class04573<C> {
   static <C, I extends class04573<C>> class04562<C, I> N(float var0) {
      return new class04550<>(var0);
   }

   static <C, I extends class04573<C>> Codec<class04562<C, I>> N(Codec<I> var0) {
      MutableObject mutableobject = new MutableObject();
      Codec codec = RecordCodecBuilder.create(
         var1x -> var1x.group(
               Codec.FLOAT.fieldOf("location").forGetter(class04569::N),
               Codec.lazyInitialized(mutableobject).fieldOf("value").forGetter(class04569::y),
               Codec.FLOAT.fieldOf("derivative").forGetter(class04569::L)
            )
            .apply(var1x, (var0xx, var1xx, var2x) -> new class04569(var0xx, var1xx, var2x))
      );
      Codec codec1 = RecordCodecBuilder.create(
         var2x -> var2x.group(
               var0.fieldOf("coordinate").forGetter(class04564::u),
               class06338.y(codec.listOf())
                  .fieldOf("points")
                  .forGetter(
                     var0xx -> IntStream.range(0, var0xx.i().length)
                        .mapToObj(var1xx -> new class04569(var0xx.i()[var1xx], (class04562<C, I>)var0xx.R().get(var1xx), var0xx.M()[var1xx]))
                        .toList()
                  )
            )
            .apply(var2x, (var0xx, var1xx) -> {
               float[] afloat = new float[var1xx.size()];
               Builder builder = ImmutableList.builder();
               float[] afloat1 = new float[var1xx.size()];

               for (int i = 0; i < var1xx.size(); i++) {
                  class04569 class04569 = (class04569)var1xx.get(i);
                  afloat[i] = class04569.N();
                  builder.add(class04569.y());
                  afloat1[i] = class04569.L();
               }

               return class04564.N((I)var0xx, afloat, builder.build(), afloat1);
            })
      );
      mutableobject.setValue(
         Codec.either(Codec.FLOAT, codec1)
            .xmap(
               var0x -> (class04562)var0x.map(class04550::new, var0xx -> var0xx),
               var0x -> var0x instanceof class04550 ? Either.left(((class04550)var0x).u()) : Either.right((class04564)var0x)
            )
      );
      return (Codec<class04562<C, I>>)mutableobject.get();
   }

   class04562<C, I> N_48(class04567<I> var1);

   String N();

   static <C, I extends class04573<C>> class04571<C, I> N(I var0) {
      return new class04571<>((I)var0);
   }

   static <C, I extends class04573<C>> class04571<C, I> N(I var0, class04573<Float> var1) {
      return new class04571<>((I)var0, var1);
   }
}
