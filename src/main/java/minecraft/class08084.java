package minecraft;

public record class08084<T extends Comparable<T>>(class08092<T> property, T value) {
   public class08084(class08092<T> property, T value) {
      super();
      if (!property.N().contains(value)) {
         throw new IllegalArgumentException("Value " + value + " does not belong to property " + property);
      } else {
         this.property = property;
         this.value = (T)value;
      }
   }

   @Override
   public String toString() {
      return this.property.R() + "=" + this.property.y(this.value);
   }

   public T y() {
      return this.value;
   }

   public class08092<T> N() {
      return this.property;
   }
}
