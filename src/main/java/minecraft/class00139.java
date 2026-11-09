package minecraft;

record class00139<T>(class00150 sign, T value) {

   class00139(class00150 sign, T value) {
      this.sign = sign;
      this.value = (T)value;
   }

   public T y() {
      return this.value;
   }

   public class00150 N() {
      return this.sign;
   }
}
