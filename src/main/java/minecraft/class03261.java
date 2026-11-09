package minecraft;

import java.io.IOException;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

record class03261(class04224 baseImage, Supplier<IntUnaryOperator> palette, class01894 permutationLocation) implements class04214 {
   public Supplier<IntUnaryOperator> L() {
      return this.palette;
   }

   class03261(class04224 baseImage, Supplier<IntUnaryOperator> palette, class01894 permutationLocation) {
      super();
      this.baseImage = baseImage;
      this.palette = palette;
      this.permutationLocation = permutationLocation;
   }

   public class01894 u() {
      return this.permutationLocation;
   }

   public class04224 y() {
      return this.baseImage;
   }

   @Override
   public void N() {
      this.baseImage.y();
   }

   @Nullable
   @Override
   public class01991 method_52853(class01640 var1) {
      Object object;
      try {
         class08280 class08280 = this.baseImage.N().N(this.palette.get());
         return new class01991(this.permutationLocation, new class02002(class08280.N(), class08280.y()), class08280);
      } catch (IllegalArgumentException | IOException ioexception) {
         class03266.y.error("unable to apply palette to {}", this.permutationLocation, ioexception);
         object = null;
      } finally {
         this.baseImage.y();
      }

      return (class01991)object;
   }
}
