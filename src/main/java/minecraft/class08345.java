package minecraft;

public record class08345<T extends class08387>(T entry, int width, int height) {

   public int L() {
      return this.height;
   }

   public class08345(T entry, int width, int height) {
      super();
      this.entry = (T)entry;
      this.width = width;
      this.height = height;
   }

   public int y() {
      return this.width;
   }

   public T N() {
      return this.entry;
   }
}
