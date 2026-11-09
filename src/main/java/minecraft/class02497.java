package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02497(class06953 wild, class06953 tame, class06953 angry) {
   public static final Codec<class02497> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06953.N.fieldOf("wild").forGetter(class02497::N),
            class06953.N.fieldOf("tame").forGetter(class02497::y),
            class06953.N.fieldOf("angry").forGetter(class02497::L)
         )
         .apply(var0, class02497::new)
   );

   public class06953 L() {
      return this.angry;
   }

   public class02497(class06953 wild, class06953 tame, class06953 angry) {
      super();
      this.wild = wild;
      this.tame = tame;
      this.angry = angry;
   }

   public class06953 y() {
      return this.tame;
   }

   public class06953 N() {
      return this.wild;
   }
}
