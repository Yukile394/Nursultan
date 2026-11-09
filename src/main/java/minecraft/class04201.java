package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class04201(class01894 sprite, double x, double y, double width, double height) {
   public static final Codec<class04201> R = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01894.N.fieldOf("sprite").forGetter(class04201::N),
            Codec.DOUBLE.fieldOf("x").forGetter(class04201::y),
            Codec.DOUBLE.fieldOf("y").forGetter(class04201::L),
            Codec.DOUBLE.fieldOf("width").forGetter(class04201::u),
            Codec.DOUBLE.fieldOf("height").forGetter(class04201::i)
         )
         .apply(var0, class04201::new)
   );

   public double L() {
      return this.y;
   }

   public class04201(class01894 sprite, double x, double y, double width, double height) {
      this.sprite = sprite;
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
   }

   public double i() {
      return this.height;
   }

   public double u() {
      return this.width;
   }

   public double y() {
      return this.x;
   }

   public class01894 N() {
      return this.sprite;
   }
}
