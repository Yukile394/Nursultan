package Nursultan;

public record class11914(int width, int height, byte[] pixels) {

   public int L() {
      return this.width;
   }

   class11914(int width, int height, byte[] pixels) {
      this.width = width;
      this.height = height;
      this.pixels = pixels;
   }

   public byte[] y() {
      return this.pixels;
   }

   public int N() {
      return this.height;
   }
}
