package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03674(class01894 modelLocation, class03701 modelState) implements class08856 {
   public static final MapCodec<class03674> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.fieldOf("model").forGetter(class03674::N), class03701.N.forGetter(class03674::y)).apply(var0, class03674::new)
   );
   public static final Codec<class03674> y = N.codec();

   public class03674 L(class08511 var1) {
      return this.N(this.modelState.L(var1));
   }

   public class03674(class01894 var1) {
      this(var1, class03701.y_const);
   }

   public class03674(class01894 modelLocation, class03701 modelState) {
      this.modelLocation = modelLocation;
      this.modelState = modelState;
   }

   public class03701 y() {
      return this.modelState;
   }

   public class03674 y(class08511 var1) {
      return this.N(this.modelState.y(var1));
   }

   public class03674 N(class01894 var1) {
      return new class03674(var1, this.modelState);
   }

   public class01894 N() {
      return this.modelLocation;
   }

   public class03674 N(boolean var1) {
      return this.N(this.modelState.N(var1));
   }

   @Override
   public class08877 N(class02028 var1) {
      return class08431.N(var1, this.modelLocation, this.modelState.N());
   }

   public class03674 N(class08511 var1) {
      return this.N(this.modelState.N(var1));
   }

   public class03674 N(class08503 var1) {
      return var1.apply(this);
   }

   public class03674 N(class03701 var1) {
      return new class03674(this.modelLocation, var1);
   }

   @Override
   public void method_62326(class08350 var1) {
      var1.markDependency(this.modelLocation);
   }
}
