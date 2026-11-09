package minecraft;

record class05656(float scale, class08280 image, int offsetX, int offsetY, int width, int height, int advance, int ascent) implements class00947 {

   public class08280 L() {
      return this.image;
   }

   public int M() {
      return this.height;
   }

   class05656(float scale, class08280 image, int offsetX, int offsetY, int width, int height, int advance, int ascent) {
      super();
      this.scale = scale;
      this.image = image;
      this.offsetX = offsetX;
      this.offsetY = offsetY;
      this.width = width;
      this.height = height;
      this.advance = advance;
      this.ascent = ascent;
   }

   public int B() {
      return this.advance;
   }

   public int Z() {
      return this.ascent;
   }

   public int i() {
      return this.offsetY;
   }

   public int u() {
      return this.offsetX;
   }

   public float y() {
      return this.scale;
   }

   @Override
   public class07948 N(class00912 var1) {
      return var1.N(this.N(), new class05651(this));
   }

   @Override
   public class05247 N() {
      return class05247.N(this.advance);
   }

   public int R() {
      return this.width;
   }
}
