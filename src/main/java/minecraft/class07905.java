package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class07905<Params, Result>(class01894 name, class07931<Params, Result> contents) {
   public static final Codec<class07905<?, ?>> N = N();

   public class07931<Params, Result> L() {
      return this.contents;
   }

   public class07905(class01894 name, class07931<Params, Result> contents) {
      super();
      this.name = name;
      this.contents = contents;
   }

   public class01894 y() {
      return this.name;
   }

   public static <Params, Result> Codec<class07905<Params, Result>> N() {
      return RecordCodecBuilder.create(
         var0 -> var0.group(class01894.N.fieldOf("name").forGetter(class07905::y), class07931.N().forGetter(class07905::L)).apply(var0, class07905::new)
      );
   }
}
