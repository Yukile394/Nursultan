package minecraft;

public record class02116(class03249 direction) implements class02089 {
   public class02116(class03249 direction) {
      this.direction = direction;
   }

   public class03249 y() {
      return this.direction;
   }

   @Override
   public class03249 N() {
      return this.direction.N() == class03287.field_41823 ? this.direction : class03249.field_41827;
   }
}
