package minecraft;

record class04569<C, I extends class04573<C>>(float location, class04562<C, I> value, float derivative) {
   public float L() {
      return this.derivative;
   }

   class04569(float location, class04562<C, I> value, float derivative) {
      super();
      this.location = location;
      this.value = value;
      this.derivative = derivative;
   }

   public class04562<C, I> y() {
      return this.value;
   }

   public float N() {
      return this.location;
   }
}
