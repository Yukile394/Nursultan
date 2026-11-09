package minecraft;

public record class05576(class05946<?> referenced) implements class04480 {
   public class05576(class05946<?> referenced) {
      this.referenced = referenced;
   }

   public class05946<?> y() {
      return this.referenced;
   }

   @Override
   public String N() {
      return "Missing element " + this.referenced.N() + " of type " + this.referenced.y();
   }
}
