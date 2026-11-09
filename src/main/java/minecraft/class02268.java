package minecraft;

public record class02268(boolean required, class01090 defaultPosition, boolean fixedPosition) {
   public boolean L() {
      return this.fixedPosition;
   }

   public class02268(boolean required, class01090 defaultPosition, boolean fixedPosition) {
      this.required = required;
      this.defaultPosition = defaultPosition;
      this.fixedPosition = fixedPosition;
   }

   public class01090 y() {
      return this.defaultPosition;
   }

   public boolean N() {
      return this.required;
   }
}
