package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

record class03342(class03371 type, String id, String name) {
   public static final MapCodec<class03342> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class03371.field_44571.fieldOf("type").forGetter(class03342::N),
            class06338.w.fieldOf("id").forGetter(class03342::y),
            Codec.STRING.fieldOf("name").forGetter(class03342::L)
         )
         .apply(var0, class03342::new)
   );

   public String L() {
      return this.name;
   }

   class03342(class03371 type, String id, String name) {
      super();
      this.type = type;
      this.id = id;
      this.name = name;
   }

   public String y() {
      return this.id;
   }

   public class03371 N() {
      return this.type;
   }
}
