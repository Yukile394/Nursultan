package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class01612(class00392 description, class04548<class08735> supportedFormats) {
   private static final Codec<class01612> R = RecordCodecBuilder.create(
      var0 -> var0.group(class03748.N.fieldOf("description").forGetter(class01612::N))
         .apply(var0, var0x -> new class01612(var0x, new class04548<>(class08735.N(Integer.MAX_VALUE))))
   );
   public static final class02968<class01612> N = new class02968<>("pack", N(class01603.field_14188));
   public static final class02968<class01612> y = new class02968<>("pack", N(class01603.field_14190));
   public static final class02968<class01612> L = new class02968<>("pack", R);

   public class01612(class00392 description, class04548<class08735> supportedFormats) {
      this.description = description;
      this.supportedFormats = supportedFormats;
   }

   public class04548<class08735> y() {
      return this.supportedFormats;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static class02968<class01612> y(class01603 var0) {
      return switch (var0) {
         case field_14188 -> N;
         case field_14190 -> y;
      };
   }

   public class00392 N() {
      return this.description;
   }

   public static Codec<class01612> N(class01603 var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(class03748.N.fieldOf("description").forGetter(class01612::N), class08735.y(var0).forGetter(class01612::y))
            .apply(var1, class01612::new)
      );
   }
}
