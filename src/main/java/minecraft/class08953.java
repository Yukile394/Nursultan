package minecraft;

public record class08953(class07284 level, class08960 block, class07209 pos, class08972 part) implements class08976 {
   @Override
   public class07209 L() {
      return this.pos;
   }

   @Override
   public void M() {
      this.block.N(this.level, this.pos, this.part.R());
   }

   public class08953(class07284 level, class08960 block, class07209 pos, class08972 part) {
      super();
      this.level = level;
      this.block = block;
      this.pos = pos;
      this.part = part;
   }

   public class07284 B() {
      return this.level;
   }

   public class08960 Z() {
      return this.block;
   }

   @Override
   public void i() {
      this.block.N(this.level, this.pos, this.part.u());
   }

   public class08972 z() {
      return this.part;
   }

   @Override
   public void u() {
      this.block.N(this.level, this.pos, this.part.L());
   }

   @Override
   public boolean y() {
      return this.part.y();
   }

   @Override
   public boolean N() {
      return true;
   }

   @Override
   public boolean N(class08972 var1) {
      return this.part.N(var1);
   }

   @Override
   public void R() {
      this.block.N(this.level, this.pos, this.part.i());
   }
}
