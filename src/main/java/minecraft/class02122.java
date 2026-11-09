package minecraft;

record class02122(class02124 facing, int x, int y) {
   public int L() {
      return this.y;
   }

   class02122(class02124 facing, int x, int y) {
      super();
      this.facing = facing;
      this.x = x;
      this.y = y;
   }

   public int y() {
      return this.x;
   }

   public class02124 N() {
      return this.facing;
   }
}
