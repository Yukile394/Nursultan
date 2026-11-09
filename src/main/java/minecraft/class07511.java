package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class07511(class07209 pos, class06563 color, Optional<class00392> name) {
   public static final Codec<class07511> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class07209.field_25064.fieldOf("pos").forGetter(class07511::L),
            class06563.field_41600.lenientOptionalFieldOf("color", class06563.field_7952).forGetter(class07511::u),
            class03748.N.lenientOptionalFieldOf("name").forGetter(class07511::i)
         )
         .apply(var0, class07511::new)
   );

   public class07209 L() {
      return this.pos;
   }

   public class07511(class07209 pos, class06563 color, Optional<class00392> name) {
      super();
      this.pos = pos;
      this.color = color;
      this.name = name;
   }

   public Optional<class00392> i() {
      return this.name;
   }

   public class06563 u() {
      return this.color;
   }

   public String y() {
      return "banner-" + this.pos.method_10263() + "," + this.pos.method_10264() + "," + this.pos.method_10260();
   }

   @Nullable
   public static class07511 N(class07290 var0, class07209 var1) {
      if (var0.method_8321(var1) instanceof class00393 class00393) {
         class06563 class06563 = class00393.u();
         Optional optional = Optional.ofNullable(class00393.method_5797());
         return new class07511(var1, class06563, optional);
      } else {
         return null;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class03556<class02195> N() {
      return switch (this.color) {
         case field_7952 -> class00831.U;
         case field_7946 -> class00831.E;
         case field_7958 -> class00831.W;
         case field_7951 -> class00831.m;
         case field_7947 -> class00831.P;
         case field_7961 -> class00831.s;
         case field_7954 -> class00831.T;
         case field_7944 -> class00831.b;
         case field_7967 -> class00831.j;
         case field_7955 -> class00831.v;
         case field_7945 -> class00831.n;
         case field_7966 -> class00831.t;
         case field_7957 -> class00831.G;
         case field_7942 -> class00831.l;
         case field_7964 -> class00831.d;
         case field_7963 -> class00831.w;
      };
   }
}
