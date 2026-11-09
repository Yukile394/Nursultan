package minecraft;

public record class05566(class05946<?> referenced) implements class04480 {
   public class05566(class05946<?> referenced) {
      this.referenced = referenced;
   }

   public class05946<?> y() {
      return this.referenced;
   }

   @Override
   public String N() {
      return "Reference to " + this.referenced.N() + " of type " + this.referenced.y() + " was used, but references are not allowed";
   }
}
