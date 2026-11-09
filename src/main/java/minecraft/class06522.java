package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06522<T extends class05857> implements class06514<T> {
   private final MapCodec<T> N;
   private final class02362<class04247, T> l;

   public class06522(class06492<T> var1) {
      super();
      this.N = RecordCodecBuilder.mapCodec(
         var1x -> var1x.group(class03762.field_40252.fieldOf("category").orElse(class03762.field_40251).forGetter(class05857::method_45441))
            .apply(var1x, var1::create)
      );
      this.l = class02362.N(class03762.field_48353, class05857::method_45441, var1::create);
   }

   @Override
   public class02362<class04247, T> y() {
      return this.l;
   }

   @Override
   public MapCodec<T> N() {
      return this.N;
   }
}
