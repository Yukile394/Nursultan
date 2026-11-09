package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03701(class08511 x, class08511 y, class08511 z, boolean uvLock) {
   public static final MapCodec<class03701> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class08511.field_57033.optionalFieldOf("x", class08511.field_57029).forGetter(class03701::y),
            class08511.field_57033.optionalFieldOf("y", class08511.field_57029).forGetter(class03701::L),
            class08511.field_57033.optionalFieldOf("z", class08511.field_57029).forGetter(class03701::u),
            Codec.BOOL.optionalFieldOf("uvlock", false).forGetter(class03701::i)
         )
         .apply(var0, class03701::new)
   );
   public static final class03701 y_const = new class03701(class08511.field_57029, class08511.field_57029, class08511.field_57029, false);

   public class03701 L(class08511 var1) {
      return new class03701(this.x, this.y, var1, this.uvLock);
   }

   public class08511 L() {
      return this.y;
   }

   public class03701(class08511 x, class08511 y, class08511 z, boolean uvLock) {
      super();
      this.x = x;
      this.y = y;
      this.z = z;
      this.uvLock = uvLock;
   }

   public boolean i() {
      return this.uvLock;
   }

   public class08511 u() {
      return this.z;
   }

   public class03701 y(class08511 var1) {
      return new class03701(this.x, var1, this.z, this.uvLock);
   }

   public class08511 y() {
      return this.x;
   }

   public class03701 N(boolean var1) {
      return new class03701(this.x, this.y, this.z, var1);
   }

   public class03701 N(class08511 var1) {
      return new class03701(var1, this.y, this.z, this.uvLock);
   }

   public class04673 N() {
      class08510 class08510 = class08510.N(class08511.N(this.x, this.y, this.z));
      return (class04673)(this.uvLock ? class08510.N() : class08510);
   }
}
