package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02540(
   class07126 particle,
   class02535 horizontalPosition,
   class02535 verticalPosition,
   class02517 horizontalVelocity,
   class02517 verticalVelocity,
   class06052 speed
) implements class02560 {
   public static final MapCodec<class02540> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class07107.yE.fieldOf("particle").forGetter(class02540::L),
            class02535.N.fieldOf("horizontal_position").forGetter(class02540::u),
            class02535.N.fieldOf("vertical_position").forGetter(class02540::i),
            class02517.N.fieldOf("horizontal_velocity").forGetter(class02540::R),
            class02517.N.fieldOf("vertical_velocity").forGetter(class02540::M),
            class06052.L.optionalFieldOf("speed", class06042.N).forGetter(class02540::B)
         )
         .apply(var0, class02540::new)
   );

   public class07126 L() {
      return this.particle;
   }

   public class02517 M() {
      return this.verticalVelocity;
   }

   public class02540(
      class07126 particle,
      class02535 horizontalPosition,
      class02535 verticalPosition,
      class02517 horizontalVelocity,
      class02517 verticalVelocity,
      class06052 speed
   ) {
      super();
      this.particle = particle;
      this.horizontalPosition = horizontalPosition;
      this.verticalPosition = verticalPosition;
      this.horizontalVelocity = horizontalVelocity;
      this.verticalVelocity = verticalVelocity;
      this.speed = speed;
   }

   public class06052 B() {
      return this.speed;
   }

   public class02535 i() {
      return this.verticalPosition;
   }

   public class02535 u() {
      return this.horizontalPosition;
   }

   public static class02535 y() {
      return new class02535(class02538.field_51724, 0.0F, 1.0F);
   }

   public static class02517 y(float var0) {
      return new class02517(var0, class06042.N);
   }

   @Override
   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5) {
      class06069 class06069 = var4.method_59922();
      class06889 class06889 = var4.method_60478();
      float f = var4.method_17681();
      float f1 = var4.method_17682();
      var1.method_65096(
         this.particle,
         this.horizontalPosition.N(var5.N(), var5.N(), f, class06069),
         this.verticalPosition.N(var5.y(), var5.y() + f1 / 2.0F, f1, class06069),
         this.horizontalPosition.N(var5.L(), var5.L(), f, class06069),
         0,
         this.horizontalVelocity.N(class06889.N(), class06069),
         this.verticalVelocity.N(class06889.y(), class06069),
         this.horizontalVelocity.N(class06889.L(), class06069),
         this.speed.N(class06069)
      );
   }

   public static class02517 N(class06052 var0) {
      return new class02517(0.0F, var0);
   }

   public static class02535 N(float var0) {
      return new class02535(class02538.field_51723, var0, 1.0F);
   }

   @Override
   public MapCodec<class02540> N() {
      return N;
   }

   public class02517 R() {
      return this.horizontalVelocity;
   }
}
